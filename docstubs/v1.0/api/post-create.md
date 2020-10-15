---
title: "Create post"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create post

Namespace: microsoft.graph

Create a new post object.

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

In the request body, supply JSON representation of the [post](../resources/-post.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a post object.

| Property             | Type                                              | Description |
| :------------------- | :------------------------------------------------ | :---------- |
| body                 | [itemBody](../resources/itembody.md)              |             |
| conversationId       | String                                            |             |
| conversationThreadId | String                                            |             |
| from                 | [recipient](../resources/recipient.md)            |             |
| hasAttachments       | Boolean                                           |             |
| newParticipants      | [recipient](../resources/recipient.md) collection |             |
| receivedDateTime     | DateTimeOffset                                    |             |
| sender               | [recipient](../resources/recipient.md)            |             |

## Response

If successful, this method returns a `201 Created` response code and a post object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_post"
}
-->

```http
POST https://graph.microsoft.com/v1.0/groups/{id}/threads/{id}/posts/{id}

Content-Type: application/json
Content-Length: 1117

{
  "@odata.type": "#microsoft.graph.post",
  "body": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "conversationId": "String",
  "conversationThreadId": "String",
  "createdDateTime": "DateTimeOffset",
  "from": {
    "@odata.type": "#microsoft.graph.recipient",
    "emailAddress": {
      "@odata.type": "#microsoft.graph.emailAddress",
      "address": "String",
      "name": "String"
    }
  },
  "hasAttachments": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "newParticipants": [
    {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    }
  ],
  "receivedDateTime": "DateTimeOffset",
  "sender": {
    "@odata.type": "#microsoft.graph.recipient",
    "emailAddress": {
      "@odata.type": "#microsoft.graph.emailAddress",
      "address": "String",
      "name": "String"
    }
  }
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.post"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.post",
  "body": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "conversationId": "String",
  "conversationThreadId": "String",
  "createdDateTime": "DateTimeOffset",
  "from": {
    "@odata.type": "#microsoft.graph.recipient",
    "emailAddress": {
      "@odata.type": "#microsoft.graph.emailAddress",
      "address": "String",
      "name": "String"
    }
  },
  "hasAttachments": "Boolean",
  "id": "String(identifier)",
  "lastModifiedDateTime": "DateTimeOffset",
  "newParticipants": [
    {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    }
  ],
  "receivedDateTime": "DateTimeOffset",
  "sender": {
    "@odata.type": "#microsoft.graph.recipient",
    "emailAddress": {
      "@odata.type": "#microsoft.graph.emailAddress",
      "address": "String",
      "name": "String"
    }
  }
}
}

```
