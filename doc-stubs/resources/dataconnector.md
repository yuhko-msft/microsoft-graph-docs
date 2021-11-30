---
title: "dataConnector resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dataConnector resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dataConnectors](../api/dataconnector-list.md)|[dataConnector](../resources/dataconnector.md) collection|Get a list of the [dataConnector](../resources/dataconnector.md) objects and their properties.|
|[Create dataConnector](../api/industrydatahub-post-dataconnectors.md)|[dataConnector](../resources/dataconnector.md)|Create a new [dataConnector](../resources/dataconnector.md) object.|
|[Get dataConnector](../api/dataconnector-get.md)|[dataConnector](../resources/dataconnector.md)|Read the properties and relationships of a [dataConnector](../resources/dataconnector.md) object.|
|[Update dataConnector](../api/dataconnector-update.md)|[dataConnector](../resources/dataconnector.md)|Update the properties of a [dataConnector](../resources/dataconnector.md) object.|
|[Delete dataConnector](../api/dataconnector-delete.md)|None|Deletes a [dataConnector](../resources/dataconnector.md) object.|
|[List sourceSystemDefinition](../api/dataconnector-list-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/dataconnector-post-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dataConnector",
  "baseType": "microsoft.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dataConnector",
  "eTag": "String",
  "displayName": "String"
}
```

