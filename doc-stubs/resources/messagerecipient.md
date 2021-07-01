---
title: "messageRecipient resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# messageRecipient resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List messageRecipients](../api/messagerecipient-list.md)|[messageRecipient](../resources/messagerecipient.md) collection|Get a list of the [messageRecipient](../resources/messagerecipient.md) objects and their properties.|
|[Create messageRecipient](../api/messagerecipient-post-messagerecipients.md)|[messageRecipient](../resources/messagerecipient.md)|Create a new [messageRecipient](../resources/messagerecipient.md) object.|
|[Get messageRecipient](../api/messagerecipient-get.md)|[messageRecipient](../resources/messagerecipient.md)|Read the properties and relationships of a [messageRecipient](../resources/messagerecipient.md) object.|
|[Update messageRecipient](../api/messagerecipient-update.md)|[messageRecipient](../resources/messagerecipient.md)|Update the properties of a [messageRecipient](../resources/messagerecipient.md) object.|
|[Delete messageRecipient](../api/messagerecipient-delete.md)|None|Deletes a [messageRecipient](../resources/messagerecipient.md) object.|
|[List events](../api/messagerecipient-list-events.md)|[messageEvent](../resources/messageevent.md) collection|Get the messageEvent resources from the events navigation property.|
|[Create messageEvent](../api/messagerecipient-post-events.md)|[messageEvent](../resources/messageevent.md)|Create a new messageEvent object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deliveryStatus|messageStatus|**TODO: Add Description**. Possible values are: `gettingStatus`, `pending`, `failed`, `delivered`, `expanded`, `quarantined`, `filteredAsSpam`, `unknownFutureValue`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|recipientEmail|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|events|[messageEvent](../resources/messageevent.md) collection|**TODO: Add Description**|

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
  "@odata.type": "#microsoft.graph.messageRecipient",
  "id": "String (identifier)",
  "recipientEmail": "String",
  "deliveryStatus": "String"
}
```

