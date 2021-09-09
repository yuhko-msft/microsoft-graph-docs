---
title: "messageEvent resource type"
description: "Represents details of an event during delivery of a mail message to a recipient"
author: "rsuven"
ms.localizationpriority: Normal
ms.prod: ""
doc_type: resourcePageType
---

# messageEvent resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents details of an event during delivery of a mail message to a recipient.

Inherits from [entity](../resources/entity.md).

## Methods
None.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Random ID for this event (not a unique key).|
|dateTime|DateTimeOffset|Time of the event in UTC.|
|eventType|[messageEventType](enums.md#messageeventtype-values)|Event type. Possible values are: `received`, `sent`, `delivered`, `failed`, `processingFailed`, `distributionGroupExpanded`, `submitted`, `delayed`, `redirected`, `resolved`, `dropped`, `recipientsAdded`, `malwareDetected`, `malwareDetectedInMessage`, `malwareDetectedInAttachment`, `ttZapped`, `ttDelivered`, `spamDetected`, `transportRuleTriggered`, `dlpRuleTriggered`, `journaled`.|
|description|String|Detailed information on the event.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.messageEvent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "id": "String (identifier)",
  "dateTime": "String (timestamp)",
  "eventType": "String",
  "description": "String"
}
```
