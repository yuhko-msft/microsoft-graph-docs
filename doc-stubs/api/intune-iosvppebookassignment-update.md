---
title: "Update iosVppEBookAssignment"
description: "Update the properties of an iosVppEBookAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosVppEBookAssignment
Namespace: microsoft.graph

Update the properties of an [iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /iosVppEBookAssignment
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md) object.

The following table shows the properties that are required when you create the [iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/intune-deviceandappmanagementassignmenttarget.md)|**TODO: Add Description** Inherited from [managedEBookAssignment](../resources/intune-managedebookassignment.md)|
|installIntent|installIntent|**TODO: Add Description** Inherited from [managedEBookAssignment](../resources/intune-managedebookassignment.md). Possible values are: `available`, `required`, `uninstall`, `availableWithoutEnrollment`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosvppebookassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/iosVppEBookAssignment
Content-Type: application/json
Content-length: 191

{
  "@odata.type": "#microsoft.graph.iosVppEBookAssignment",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  },
  "installIntent": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.iosVppEBookAssignment",
  "id": "dbf344c3-44c3-dbf3-c344-f3dbc344f3db",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  },
  "installIntent": "String"
}
```

