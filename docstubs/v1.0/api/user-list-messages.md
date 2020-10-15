---
title: "List messages"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# List messages

Namespace: microsoft.graph

Get the message objects from a messages navigation property.

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

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 Ok` response code and a message object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_messages"
}
-->

```http
GET https://graph.microsoft.com/v1.0

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
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": [
  {
    "@odata.type": "#microsoft.graph.message",
    "bccRecipients": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "body": {
      "@odata.type": "#microsoft.graph.itemBody",
      "content": "String",
      "contentType": "String"
    },
    "bodyPreview": "String",
    "categories": [
      "String"
    ],
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
    "changeKey": "String",
    "conversationId": "String",
    "conversationIndex": "Binary",
    "createdDateTime": "DateTimeOffset",
    "flag": {
      "@odata.type": "#microsoft.graph.followupFlag",
      "completedDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      },
      "dueDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      },
      "flagStatus": "String",
      "startDateTime": {
        "@odata.type": "#microsoft.graph.dateTimeTimeZone",
        "dateTime": "String",
        "timeZone": "String"
      }
    },
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
    "importance": "String",
    "inferenceClassification": "String",
    "internetMessageHeaders": [
      {
        "@odata.type": "#microsoft.graph.internetMessageHeader",
        "name": "String",
        "value": "String"
      }
    ],
    "internetMessageId": "String",
    "isDeliveryReceiptRequested": "Boolean",
    "isDraft": "Boolean",
    "isRead": "Boolean",
    "isReadReceiptRequested": "Boolean",
    "lastModifiedDateTime": "DateTimeOffset",
    "parentFolderId": "String",
    "receivedDateTime": "DateTimeOffset",
    "replyTo": [
      {
        "@odata.type": "#microsoft.graph.recipient",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        }
      }
    ],
    "sender": {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    },
    "sentDateTime": "DateTimeOffset",
    "subject": "String",
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
    "uniqueBody": {
      "@odata.type": "#microsoft.graph.itemBody",
      "content": "String",
      "contentType": "String"
    },
    "webLink": "String"
  }
]
}

```
