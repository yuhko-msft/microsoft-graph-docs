---
title: "Update threads"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update threads

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a conversationThread object.

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

In the request body, supply JSON representation of the [conversationThread](../resources/-conversationthread.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a conversationThread object.

| Property              | Type                                              | Description |
| :-------------------- | :------------------------------------------------ | :---------- |
| ccRecipients          | [recipient](../resources/recipient.md) collection |             |
| hasAttachments        | Boolean                                           |             |
| id                    | String                                            | Read-only.  |
| isLocked              | Boolean                                           |             |
| lastDeliveredDateTime | DateTimeOffset                                    |             |
| preview               | String                                            |             |
| topic                 | String                                            |             |
| toRecipients          | [recipient](../resources/recipient.md) collection |             |
| uniqueSenders         | String collection                                 |             |

## Response

If successful, this method returns a `200 OK` response code and a conversationThread object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_threads"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 833

[
  {
    "@odata.type": "#microsoft.graph.conversationThread",
    "ccRecipients": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "hasAttachments": "Boolean",
    "id": "String(identifier)",
    "isLocked": "Boolean",
    "lastDeliveredDateTime": "DateTimeOffset",
    "preview": "String",
    "toRecipients": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "topic": "String",
    "uniqueSenders": [
      "String"
    ]
  }
]

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.conversationThread",
    "ccRecipients": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "hasAttachments": "Boolean",
    "id": "String(identifier)",
    "isLocked": "Boolean",
    "lastDeliveredDateTime": "DateTimeOffset",
    "preview": "String",
    "toRecipients": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "topic": "String",
    "uniqueSenders": [
      "String"
    ]
  }
]
}

```
