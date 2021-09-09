---
title: "messageRecipient resource type"
description: "Represents a recipient of a message"
author: "rsuven"
ms.localizationpriority: Normal
ms.prod: ""
doc_type: resourcePageType
---

# messageRecipient resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents a recipient of a message.

Inherits from [entity](../resources/entity.md).

## Methods
None.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Random ID for this recipient (not a unique key).|
|recipientEmail|String|Recipient email address.|
|deliveryStatus|[messageStatus](enums.md#messagestatus-values)|Message delivery status. Possible values are: `gettingStatus`, `pending`, `failed`, `delivered`, `expanded`, `quarantined`, `filteredAsSpam`.|
|events|[messageEvent](../resources/messageevent.md) collection|details of events during delivery of a mail message to a recipient.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.messageRecipient",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "id": "String (identifier)",
  "recipientEmail": "String",
  "deliveryStatus": "String",
  "events": [{"@odata.type": "microsoft.graph.messageEvent"}]
}
```
