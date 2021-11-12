---
title: "dataConnector resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dataConnector resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.
This is an abstract type.


Inherits from [mutableEntity](../resources/industrydata-mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dataConnectors](../api/industrydata-dataconnector-list.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md) collection|Get a list of the [dataConnector](../resources/industrydata-dataconnector.md) objects and their properties.|
|[Create dataConnector](../api/industrydata-industrydatahub-post-dataconnectors.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md)|Create a new [dataConnector](../resources/industrydata-dataconnector.md) object.|
|[Get dataConnector](../api/industrydata-dataconnector-get.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md)|Read the properties and relationships of a [dataConnector](../resources/industrydata-dataconnector.md) object.|
|[Update dataConnector](../api/industrydata-dataconnector-update.md)|[microsoft.graph.industryData.dataConnector](../resources/industrydata-dataconnector.md)|Update the properties of a [dataConnector](../resources/industrydata-dataconnector.md) object.|
|[Delete dataConnector](../api/industrydata-dataconnector-delete.md)|None|Deletes a [dataConnector](../resources/industrydata-dataconnector.md) object.|
|[List sourceSystemDefinition](../api/industrydata-dataconnector-list-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/industrydata-dataconnector-post-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the data connector.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.dataConnector",
  "baseType": "microsoft.graph.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.dataConnector",
  "eTag": "String",
  "displayName": "String"
}
```

