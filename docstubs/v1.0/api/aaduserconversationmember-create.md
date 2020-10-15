---
title: "Create aadUserConversationMember"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create aadUserConversationMember

Namespace: microsoft.graph

Create a new aadUserConversationMember object.

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

In the request body, supply JSON representation of the [aadUserConversationMember](../resources/-aaduserconversationmember.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an aadUserConversationMember object.

| Property | Type   | Description |
| :------- | :----- | :---------- |
| email    | String |             |
| userId   | String |             |

## Response

If successful, this method returns a `201 Created` response code and an aadUserConversationMember object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_aaduserconversationmember"
}
-->

```http
POST https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 174

{
  "@odata.type": "#microsoft.graph.aadUserConversationMember",
  "displayName": "String",
  "email": "String",
  "roles": [
    "String"
  ],
  "userId": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.aadUserConversationMember"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.aadUserConversationMember",
  "displayName": "String",
  "email": "String",
  "id": "String(identifier)",
  "roles": [
    "String"
  ],
  "userId": "String"
}
}

```
