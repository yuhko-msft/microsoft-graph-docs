---
title: "messageRulePredicates resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# messageRulePredicates resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property               | Type                                              | Description |
| :--------------------- | :------------------------------------------------ | :---------- |
| bodyContains           | String collection                                 |             |
| bodyOrSubjectContains  | String collection                                 |             |
| categories             | String collection                                 |             |
| fromAddresses          | [recipient](../resources/recipient.md) collection |             |
| hasAttachments         | Boolean                                           |             |
| headerContains         | String collection                                 |             |
| importance             | String                                            |             |
| isApprovalRequest      | Boolean                                           |             |
| isAutomaticForward     | Boolean                                           |             |
| isAutomaticReply       | Boolean                                           |             |
| isEncrypted            | Boolean                                           |             |
| isMeetingRequest       | Boolean                                           |             |
| isMeetingResponse      | Boolean                                           |             |
| isNonDeliveryReport    | Boolean                                           |             |
| isPermissionControlled | Boolean                                           |             |
| isReadReceipt          | Boolean                                           |             |
| isSigned               | Boolean                                           |             |
| isVoicemail            | Boolean                                           |             |
| messageActionFlag      | String                                            |             |
| notSentToMe            | Boolean                                           |             |
| recipientContains      | String collection                                 |             |
| senderContains         | String collection                                 |             |
| sensitivity            | String                                            |             |
| sentCcMe               | Boolean                                           |             |
| sentOnlyToMe           | Boolean                                           |             |
| sentToAddresses        | [recipient](../resources/recipient.md) collection |             |
| sentToMe               | Boolean                                           |             |
| sentToOrCcMe           | Boolean                                           |             |
| subjectContains        | String collection                                 |             |
| withinSizeRange        | [sizeRange](../resources/sizerange.md)            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.messageRulePredicates",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.messageRulePredicates",
  "bodyContains": ["String"],
  "bodyOrSubjectContains": ["String"],
  "categories": ["String"],
  "fromAddresses": [{"@odata.type": "microsoft.graph.recipient"}],
  "hasAttachments": "Boolean",
  "headerContains": ["String"],
  "importance": "low | normal | high",
  "isApprovalRequest": "Boolean",
  "isAutomaticForward": "Boolean",
  "isAutomaticReply": "Boolean",
  "isEncrypted": "Boolean",
  "isMeetingRequest": "Boolean",
  "isMeetingResponse": "Boolean",
  "isNonDeliveryReport": "Boolean",
  "isPermissionControlled": "Boolean",
  "isReadReceipt": "Boolean",
  "isSigned": "Boolean",
  "isVoicemail": "Boolean",
  "messageActionFlag": "any | call | doNotForward | followUp | fyi | forward | noResponseNecessary | read | reply | replyToAll | review",
  "notSentToMe": "Boolean",
  "recipientContains": ["String"],
  "senderContains": ["String"],
  "sensitivity": "normal | personal | private | confidential",
  "sentCcMe": "Boolean",
  "sentOnlyToMe": "Boolean",
  "sentToAddresses": [{"@odata.type": "microsoft.graph.recipient"}],
  "sentToMe": "Boolean",
  "sentToOrCcMe": "Boolean",
  "subjectContains": ["String"],
  "withinSizeRange": {"@odata.type": "microsoft.graph.sizeRange"}
}
```
