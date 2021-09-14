---
author: SanjoyanM
title: Set, update or remove sensitivity label on a driveItem
description: "Set, update or remove sensitivity label on a driveItem."
---
# Set, update or remove sensitivity label on a driveItem

Sets, updates or removes a [sensitivitylabel](../resources/sensitivitylabel.md) on a [driveItem](../resources/driveitem.md) representing a file. Currently only supported on some file types.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](../concepts/permissions_reference.md).

|Permission type                        | Permissions (from least to most privileged) |
|:--------------------------------------|:------------------------------------------- |
|Delegated (work or school account)     | Files.ReadWrite.All, Sites.ReadWrite.All    |
|Delegated (personal Microsoft account) | Not supported.    					      |
|Application 							| Files.ReadWrite.All, Sites.ReadWrite.All 	  |

## HTTP request

```http
POST /drives/{drive-id}/items/{item-id}/setSensitivityLabel
```

## Request body

In the request body, provide a JSON object with the following parameters.

```json
{
  "id": "string",
  "assignmentMethod": [ "standard | privileged | auto"],
  "justificationText": "string",
  "actionSource": [ "defaultLabel | auto | manual | recommended"],
  "ifMatchLabelId": "string"
}
```

## Request body parameters

| Parameter name    | Value                       | Description                                                                                                                              |
|:------------------|:----------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------|
| id                | string                      | Id of the sensitivity label to apply, or null to remove the sensitivity label.                                                           |
| assignmentMethod  | sensitivityAssignmentMethod | The assignment method of the label on the document. Whether the assignment of the label was done automatically, standard or as a privileged operation (The equivalent to an administrator operation).                                                                            |
| justificationText | string                      | Justification text for audit purposes. Required when downgrading/removing label.                                                         |
| actionSource      | actionSource                | Indicates what triggered the setSensitivityLabel action, for audit purpose.                                                              |
| ifMatchLabelId    | string                      | Support compare and swap: apply the new label ('id') to the file if the existing label in the file is 'ifMatchLabelId'. In case 'ifMatchLabelId' is null, we ignore this validation.|

## [sensitivityAssignmentMethod  enumeration](/information-protection/develop/reference/mip-enums-and-structs#assignmentmethod-enum#assignmentmethod-enum)

Represents the various methods to assign a sensitivity label. This value is stored in files and defines if the label can be overwritten or not.

| Value               | Description
|:--------------------|:------------------------------------------------------------------
| standard            | Label assignment method is standard
| privileged          | Label assignment method is privileged
| auto                | Label assignment method is automatic
| unknownFutureValue  | Marker value for future compatibility.              

## [actionSource enumeration](/information-protection/develop/reference/mip-enums-and-structs#assignmentmethod-enum#actionsource-enum)

Defines what triggered the setSensitivityLabel action.

| Value               | Description
|:--------------------|:------------------------------------------------------------------
| defaultLabel        | Set by default in policy
| auto                | Set by policy conditions
| manual              | Selected manually by user
| recommended         | Set by user after label was recommended by policy conditions
| unknownFutureValue  | Marker value for future compatibility.

## Response

If successful, this method returns a `200 OK` response code and a [sensitivitylabel](../resources/sensitivitylabel.md) object in the response body.

## Example

This example updates label on the file.

### HTTP request

```http
POST /drives/{drive-id}/items/{item-id}/setSensitivityLabel
Content-Type: application/json

{
    "id": "5feba255-812e-446a-ac59-a7044ef827b5",
    "assignmentMethod": "standard",
    "justificationText": "Document contains sensitive information",
    "actionSource": "auto",
    "ifMatchLabelId": null
}
```

### Response

This returns an sensitivitylabel entity in response body:

```http
HTTP/1.1 200 OK
Content-Type: application/json
{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#oneDrive.sensitivityLabel",
    "id": "5feba255-812e-446a-ac59-a7044ef827b5",
    "name": "General",
    "assignmentMethod": "standard"
}
```

## Example

This example removes label on the file.

### HTTP request

```http
POST /drives/{drive-id}/items/{item-id}/setSensitivityLabel
Content-Type: application/json

{
    "justificationText": "Document does not contain sensitive information"
}
```

### Response

```http
HTTP/1.1 200 OK
Content-Type: application/json
{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#oneDrive.sensitivityLabel"
}
```
