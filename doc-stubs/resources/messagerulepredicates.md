---
title: "messageRulePredicates resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# messageRulePredicates resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bodyContains|String collection|**TODO: Add Description**|
|bodyOrSubjectContains|String collection|**TODO: Add Description**|
|categories|String collection|**TODO: Add Description**|
|fromAddresses|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|headerContains|String collection|**TODO: Add Description**|
|importance|importance|**TODO: Add Description**. Possible values are: `low`, `normal`, `high`.|
|isApprovalRequest|Boolean|**TODO: Add Description**|
|isAutomaticForward|Boolean|**TODO: Add Description**|
|isAutomaticReply|Boolean|**TODO: Add Description**|
|isEncrypted|Boolean|**TODO: Add Description**|
|isMeetingRequest|Boolean|**TODO: Add Description**|
|isMeetingResponse|Boolean|**TODO: Add Description**|
|isNonDeliveryReport|Boolean|**TODO: Add Description**|
|isPermissionControlled|Boolean|**TODO: Add Description**|
|isReadReceipt|Boolean|**TODO: Add Description**|
|isSigned|Boolean|**TODO: Add Description**|
|isVoicemail|Boolean|**TODO: Add Description**|
|messageActionFlag|messageActionFlag|**TODO: Add Description**. Possible values are: `any`, `call`, `doNotForward`, `followUp`, `fyi`, `forward`, `noResponseNecessary`, `read`, `reply`, `replyToAll`, `review`.|
|notSentToMe|Boolean|**TODO: Add Description**|
|recipientContains|String collection|**TODO: Add Description**|
|senderContains|String collection|**TODO: Add Description**|
|sensitivity|sensitivity|**TODO: Add Description**. Possible values are: `normal`, `personal`, `private`, `confidential`.|
|sentCcMe|Boolean|**TODO: Add Description**|
|sentOnlyToMe|Boolean|**TODO: Add Description**|
|sentToAddresses|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|sentToMe|Boolean|**TODO: Add Description**|
|sentToOrCcMe|Boolean|**TODO: Add Description**|
|subjectContains|String collection|**TODO: Add Description**|
|withinSizeRange|[sizeRange](../resources/sizerange.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.messageRulePredicates"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.messageRulePredicates",
  "bodyContains": [
    "String"
  ],
  "bodyOrSubjectContains": [
    "String"
  ],
  "categories": [
    "String"
  ],
  "fromAddresses": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "hasAttachments": "Boolean",
  "headerContains": [
    "String"
  ],
  "importance": "String",
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
  "messageActionFlag": "String",
  "notSentToMe": "Boolean",
  "recipientContains": [
    "String"
  ],
  "senderContains": [
    "String"
  ],
  "sensitivity": "String",
  "sentCcMe": "Boolean",
  "sentOnlyToMe": "Boolean",
  "sentToAddresses": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "sentToMe": "Boolean",
  "sentToOrCcMe": "Boolean",
  "subjectContains": [
    "String"
  ],
  "withinSizeRange": {
    "@odata.type": "microsoft.graph.sizeRange"
  }
}
```

