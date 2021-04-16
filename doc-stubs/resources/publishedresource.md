---
title: "publishedResource resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# publishedResource resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List publishedResources](../api/publishedresource-list.md)|[publishedResource](../resources/publishedresource.md) collection|Get a list of the [publishedResource](../resources/publishedresource.md) objects and their properties.|
|[Create publishedResource](../api/publishedresource-create.md)|[publishedResource](../resources/publishedresource.md)|Create a new [publishedResource](../resources/publishedresource.md) object.|
|[Get publishedResource](../api/publishedresource-get.md)|[publishedResource](../resources/publishedresource.md)|Read the properties and relationships of a [publishedResource](../resources/publishedresource.md) object.|
|[Update publishedResource](../api/publishedresource-update.md)|[publishedResource](../resources/publishedresource.md)|Update the properties of a [publishedResource](../resources/publishedresource.md) object.|
|[Delete publishedResource](../api/publishedresource-delete.md)|None|Deletes a [publishedResource](../resources/publishedresource.md) object.|
|[List agentGroups](../api/publishedresource-list-agentgroups.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md) collection|Get the onPremisesAgentGroup resources from the agentGroups navigation property.|
|[Add onPremisesAgentGroup](../api/publishedresource-post-agentgroups.md)|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md)|Add agentGroups by posting to the agentGroups collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|publishingType|onPremisesPublishingType|**TODO: Add Description**. Possible values are: `applicationProxy`, `exchangeOnline`, `authentication`, `provisioning`, `intunePfx`, `oflineDomainJoin`, `unknownFutureValue`.|
|resourceName|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|agentGroups|[onPremisesAgentGroup](../resources/onpremisesagentgroup.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.publishedResource",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.publishedResource",
  "id": "String (identifier)",
  "displayName": "String",
  "publishingType": "String",
  "resourceName": "String"
}
```

