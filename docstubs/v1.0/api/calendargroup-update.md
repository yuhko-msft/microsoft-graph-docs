---
title: "Update calendarGroup"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update calendarGroup

Namespace: microsoft.graph

Update the properties of a calendarGroup object.

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

In the request body, supply JSON representation of the [calendarGroup](../resources/-calendargroup.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a calendarGroup object.

| Property  | Type   | Description |
| :-------- | :----- | :---------- |
| changeKey | String |             |
| classId   | Guid   |             |
| id        | String | Read-only.  |
| name      | String |             |

## Response

If successful, this method returns a `200 OK` response code and a calendarGroup object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_calendargroup"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0/users/{id}/calendarGroups/{id}

Content-Type: application/json
Content-Length: 124

{
  "@odata.type": "#microsoft.graph.calendarGroup",
  "changeKey": "String",
  "classId": "Guid",
  "name": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.calendarGroup"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.calendarGroup",
  "changeKey": "String",
  "classId": "Guid",
  "id": "String(identifier)",
  "name": "String"
}
}

```
