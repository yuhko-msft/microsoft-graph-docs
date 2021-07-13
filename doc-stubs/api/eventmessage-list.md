---
title: "List eventMessages"
description: "Get a list of the eventMessage objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List eventMessages
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [eventMessage](../resources/eventmessage.md) objects and their properties.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
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
GET ** Collection URI for microsoft.graph.eventMessage not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [eventMessage](../resources/eventmessage.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_eventmessage"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.eventMessage not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.eventMessage)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.eventMessage",
      "id": "e23f7570-7570-e23f-7075-3fe270753fe2",
      "categories": [
        "String"
      ],
      "changeKey": "String",
      "createdDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "bccRecipients": [
        {
          "@odata.type": "microsoft.graph.recipient"
        }
      ],
      "body": {
        "@odata.type": "microsoft.graph.itemBody"
      },
      "bodyPreview": "String",
      "ccRecipients": [
        {
          "@odata.type": "microsoft.graph.recipient"
        }
      ],
      "conversationId": "String",
      "conversationIndex": "Binary",
      "flag": {
        "@odata.type": "microsoft.graph.followupFlag"
      },
      "from": {
        "@odata.type": "microsoft.graph.recipient"
      },
      "hasAttachments": "Boolean",
      "importance": "String",
      "inferenceClassification": "String",
      "internetMessageHeaders": [
        {
          "@odata.type": "microsoft.graph.internetMessageHeader"
        }
      ],
      "internetMessageId": "String",
      "isDeliveryReceiptRequested": "Boolean",
      "isDraft": "Boolean",
      "isRead": "Boolean",
      "isReadReceiptRequested": "Boolean",
      "mentionsPreview": {
        "@odata.type": "microsoft.graph.mentionsPreview"
      },
      "parentFolderId": "String",
      "receivedDateTime": "String (timestamp)",
      "replyTo": [
        {
          "@odata.type": "microsoft.graph.recipient"
        }
      ],
      "sender": {
        "@odata.type": "microsoft.graph.recipient"
      },
      "sentDateTime": "String (timestamp)",
      "subject": "String",
      "toRecipients": [
        {
          "@odata.type": "microsoft.graph.recipient"
        }
      ],
      "uniqueBody": {
        "@odata.type": "microsoft.graph.itemBody"
      },
      "unsubscribeData": [
        "String"
      ],
      "unsubscribeEnabled": "Boolean",
      "webLink": "String",
      "endDateTime": {
        "@odata.type": "microsoft.graph.dateTimeTimeZone"
      },
      "isAllDay": "Boolean",
      "isDelegated": "Boolean",
      "isOutOfDate": "Boolean",
      "location": {
        "@odata.type": "microsoft.graph.location"
      },
      "meetingMessageType": "String",
      "recurrence": {
        "@odata.type": "microsoft.graph.patternedRecurrence"
      },
      "startDateTime": {
        "@odata.type": "microsoft.graph.dateTimeTimeZone"
      },
      "type": "String"
    }
  ]
}
```

