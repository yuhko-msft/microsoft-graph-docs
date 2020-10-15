---
title: "eventmessagerequest : copy"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# eventmessagerequest : copy

Namespace: microsoft.graph

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

In the request body, supply JSON representation of the parameters.

<!-- Actions and Functions -->

The following table shows the parameters that can be used with this method.

| Parameter     | Type   | Description |
| :------------ | :----- | :---------- |
| DestinationId | String |             |

<!-- CRUD Methods -->

## Response

If successful, this method returns a `200 Ok` response code and a message object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "eventmessagerequest_copy"
}
-->

```http
POST https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 3048

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

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.message"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": {
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
}

```
