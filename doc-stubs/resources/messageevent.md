---
title: "messageEvent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# messageEvent resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List messageEvents](../api/messageevent-list.md)|[messageEvent](../resources/messageevent.md) collection|Get a list of the [messageEvent](../resources/messageevent.md) objects and their properties.|
|[Create messageEvent](../api/messageevent-post-messageevents.md)|[messageEvent](../resources/messageevent.md)|Create a new [messageEvent](../resources/messageevent.md) object.|
|[Get messageEvent](../api/messageevent-get.md)|[messageEvent](../resources/messageevent.md)|Read the properties and relationships of a [messageEvent](../resources/messageevent.md) object.|
|[Update messageEvent](../api/messageevent-update.md)|[messageEvent](../resources/messageevent.md)|Update the properties of a [messageEvent](../resources/messageevent.md) object.|
|[Delete messageEvent](../api/messageevent-delete.md)|None|Deletes a [messageEvent](../resources/messageevent.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|eventType|messageEventType|**TODO: Add Description**. Possible values are: `received`, `sent`, `delivered`, `failed`, `processingFailed`, `distributionGroupExpanded`, `submitted`, `delayed`, `redirected`, `resolved`, `dropped`, `recipientsAdded`, `malwareDetected`, `malwareDetectedInMessage`, `malwareDetectedInAttachment`, `ttZapped`, `ttDelivered`, `spamDetected`, `transportRuleTriggered`, `dlpRuleTriggered`, `journaled`, `unknownFutureValue`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

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
  "@odata.type": "#microsoft.graph.messageEvent",
  "id": "String (identifier)",
  "dateTime": "String (timestamp)",
  "eventType": "String",
  "description": "String"
}
```

