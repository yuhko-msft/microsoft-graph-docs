---
title: "Update outlookTaskGroup"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update outlookTaskGroup

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an outlookTaskGroup object.

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

In the request body, supply JSON representation of the [outlookTaskGroup](../resources/-outlooktaskgroup.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an outlookTaskGroup object.

| Property       | Type    | Description |
| :------------- | :------ | :---------- |
| changeKey      | String  |             |
| groupKey       | Guid    |             |
| id             | String  | Read-only.  |
| isDefaultGroup | Boolean |             |
| name           | String  |             |

## Response

If successful, this method returns a `200 OK` response code and an outlookTaskGroup object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_outlooktaskgroup"
}
-->

```http
PATCH https://graph.microsoft.com/beta/users/{id}/outlook/taskGroups/{id}

Content-Type: application/json
Content-Length: 160

{
  "@odata.type": "#microsoft.graph.outlookTaskGroup",
  "changeKey": "String",
  "groupKey": "Guid",
  "isDefaultGroup": "Boolean",
  "name": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.outlookTaskGroup"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.outlookTaskGroup",
  "changeKey": "String",
  "groupKey": "Guid",
  "id": "String(identifier)",
  "isDefaultGroup": "Boolean",
  "name": "String"
}
}

```
