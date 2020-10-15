---
title: "Update appRoleAssignment"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update appRoleAssignment

Namespace: microsoft.graph

Update the properties of an appRoleAssignment object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [appRoleAssignment](../resources/-approleassignment.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an appRoleAssignment object.

| Property             | Type           | Description |
| :------------------- | :------------- | :---------- |
| appRoleId            | Guid           |             |
| createdDateTime      | DateTimeOffset |             |
| principalDisplayName | String         |             |
| principalId          | Guid           |             |
| principalType        | String         |             |
| resourceDisplayName  | String         |             |
| resourceId           | Guid           |             |

## Response

If successful, this method returns a `200 OK` response code and an appRoleAssignment object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_approleassignment"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/me/appRoleAssignments/{id}

Content-Type: application/json
Content-Length: 317

{
  "@odata.type": "#microsoft.graph.appRoleAssignment",
  "appRoleId": "Guid",
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "principalDisplayName": "String",
  "principalId": "Guid",
  "principalType": "String",
  "resourceDisplayName": "String",
  "resourceId": "Guid"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.appRoleAssignment"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.appRoleAssignment",
  "appRoleId": "Guid",
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "id": "String(identifier)",
  "principalDisplayName": "String",
  "principalId": "Guid",
  "principalType": "String",
  "resourceDisplayName": "String",
  "resourceId": "Guid"
}
}

```
