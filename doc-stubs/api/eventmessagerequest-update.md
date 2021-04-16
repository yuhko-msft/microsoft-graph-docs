---
title: "Update eventMessageRequest"
description: "Update the properties of an eventMessageRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update eventMessageRequest
Namespace: microsoft.graph



Update the properties of an [eventMessageRequest](../resources/eventmessagerequest.md) object.

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
PATCH ** Entity URI for microsoft.graph.eventMessageRequest not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [eventMessageRequest](../resources/eventmessagerequest.md) object.

The following table shows the properties that are required when you update the [eventMessageRequest](../resources/eventmessagerequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|bccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|bodyPreview|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|ccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|conversationId|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|conversationIndex|Binary|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|flag|[followupFlag](../resources/followupflag.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|from|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|hasAttachments|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|importance|importance|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `low`, `normal`, `high`.|
|inferenceClassification|inferenceClassificationType|**TODO: Add Description** Inherited from [message](../resources/message.md). Possible values are: `focused`, `other`.|
|internetMessageHeaders|[internetMessageHeader](../resources/internetmessageheader.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|internetMessageId|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|isDeliveryReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|isDraft|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|isRead|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|isReadReceiptRequested|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|mentionsPreview|[mentionsPreview](../resources/mentionspreview.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|parentFolderId|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|receivedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|replyTo|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|sender|[recipient](../resources/recipient.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|sentDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|subject|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|toRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|uniqueBody|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|unsubscribeData|String collection|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|unsubscribeEnabled|Boolean|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|webLink|String|**TODO: Add Description** Inherited from [message](../resources/message.md)|
|endDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|isAllDay|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|isDelegated|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|isOutOfDate|Boolean|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|location|[location](../resources/location.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|meetingMessageType|meetingMessageType|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md). Possible values are: `none`, `meetingRequest`, `meetingCancelled`, `meetingAccepted`, `meetingTentativelyAccepted`, `meetingDeclined`.|
|recurrence|[patternedRecurrence](../resources/patternedrecurrence.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|startDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md)|
|type|eventType|**TODO: Add Description** Inherited from [eventMessage](../resources/eventmessage.md). Possible values are: `singleInstance`, `occurrence`, `exception`, `seriesMaster`.|
|allowNewTimeProposals|Boolean|**TODO: Add Description**|
|previousEndDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|previousLocation|[location](../resources/location.md)|**TODO: Add Description**|
|previousStartDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|responseRequested|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [eventMessageRequest](../resources/eventmessagerequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_eventmessagerequest"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.eventMessageRequest not found
Content-Type: application/json
Content-length: 2420

{
  "@odata.type": "#microsoft.graph.eventMessageRequest",
  "categories": [
    "String"
  ],
  "changeKey": "String",
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
  "type": "String",
  "allowNewTimeProposals": "Boolean",
  "previousEndDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "previousLocation": {
    "@odata.type": "microsoft.graph.location"
  },
  "previousStartDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "responseRequested": "Boolean"
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
  "@odata.type": "#microsoft.graph.eventMessageRequest",
  "id": "014d1b46-1b46-014d-461b-4d01461b4d01",
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
  "type": "String",
  "allowNewTimeProposals": "Boolean",
  "previousEndDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "previousLocation": {
    "@odata.type": "microsoft.graph.location"
  },
  "previousStartDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "responseRequested": "Boolean"
}
```

