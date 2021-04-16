---
title: "onPremisesAgentGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onPremisesAgentGroup resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onPremisesAgentGroups](../api/onpremisesagentgroup-list.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md) collection|Get a list of the [onPremisesAgentGroup](../resources/onpremisesagentgroup.md) objects and their properties.|
|[Create onPremisesAgentGroup](../api/onpremisesagentgroup-create.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md)|Create a new [onPremisesAgentGroup](../resources/onpremisesagentgroup.md) object.|
|[Get onPremisesAgentGroup](../api/onpremisesagentgroup-get.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md)|Read the properties and relationships of an [onPremisesAgentGroup](../resources/onpremisesagentgroup.md) object.|
|[Update onPremisesAgentGroup](../api/onpremisesagentgroup-update.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md)|Update the properties of an [onPremisesAgentGroup](../resources/onpremisesagentgroup.md) object.|
|[Delete onPremisesAgentGroup](../api/onpremisesagentgroup-delete.md)|None|Deletes an [onPremisesAgentGroup](../resources/onpremisesagentgroup.md) object.|
|[List agents](../api/onpremisesagentgroup-list-agents.md)|[onPremisesAgent](../resources/onpremisesagent.md) collection|Get the onPremisesAgent resources from the agents navigation property.|
|[Add onPremisesAgent](../api/onpremisesagentgroup-post-agents.md)|[onPremisesAgent](../resources/onpremisesagent.md)|Add agents by posting to the agents collection.|
|[List publishedResources](../api/onpremisesagentgroup-list-publishedresources.md)|[publishedResource](../resources/publishedresource.md) collection|Get the publishedResource resources from the publishedResources navigation property.|
|[Add publishedResource](../api/onpremisesagentgroup-post-publishedresources.md)|[publishedResource](../resources/publishedresource.md)|Add publishedResources by posting to the publishedResources collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isDefault|Boolean|**TODO: Add Description**|
|publishingType|onPremisesPublishingType|**TODO: Add Description**. Possible values are: `applicationProxy`, `exchangeOnline`, `authentication`, `provisioning`, `intunePfx`, `oflineDomainJoin`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|agents|[onPremisesAgent](../resources/onpremisesagent.md) collection|**TODO: Add Description**|
|publishedResources|[publishedResource](../resources/publishedresource.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.onPremisesAgentGroup",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onPremisesAgentGroup",
  "id": "String (identifier)",
  "displayName": "String",
  "isDefault": "Boolean",
  "publishingType": "String"
}
```

