---
title: "fileDataConnector resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileDataConnector resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.
This is an abstract type.


Inherits from [dataConnector](../resources/industrydata-dataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fileDataConnectors](../api/industrydata-filedataconnector-list.md)|[microsoft.graph.industryData.fileDataConnector](../resources/industrydata-filedataconnector.md) collection|Get a list of the [fileDataConnector](../resources/industrydata-filedataconnector.md) objects and their properties.|
|[Create fileDataConnector](../api/industrydata-incomingfileflow-post-filedataconnector.md)|[microsoft.graph.industryData.fileDataConnector](../resources/industrydata-filedataconnector.md)|Create a new [fileDataConnector](../resources/industrydata-filedataconnector.md) object.|
|[Get fileDataConnector](../api/industrydata-filedataconnector-get.md)|[microsoft.graph.industryData.fileDataConnector](../resources/industrydata-filedataconnector.md)|Read the properties and relationships of a [fileDataConnector](../resources/industrydata-filedataconnector.md) object.|
|[Update fileDataConnector](../api/industrydata-filedataconnector-update.md)|[microsoft.graph.industryData.fileDataConnector](../resources/industrydata-filedataconnector.md)|Update the properties of a [fileDataConnector](../resources/industrydata-filedataconnector.md) object.|
|[Delete fileDataConnector](../api/industrydata-filedataconnector-delete.md)|None|Deletes a [fileDataConnector](../resources/industrydata-filedataconnector.md) object.|
|[List sourceSystemDefinition](../api/industrydata-filedataconnector-list-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/industrydata-filedataconnector-post-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/industrydata-dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.fileDataConnector",
  "baseType": "microsoft.graph.industryData.dataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.fileDataConnector",
  "eTag": "String",
  "displayName": "String"
}
```

