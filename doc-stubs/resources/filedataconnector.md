---
title: "fileDataConnector resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileDataConnector resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [dataConnector](../resources/dataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fileDataConnectors](../api/filedataconnector-list.md)|[fileDataConnector](../resources/filedataconnector.md) collection|Get a list of the [fileDataConnector](../resources/filedataconnector.md) objects and their properties.|
|[Create fileDataConnector](../api/incomingfileflow-post-filedataconnector.md)|[fileDataConnector](../resources/filedataconnector.md)|Create a new [fileDataConnector](../resources/filedataconnector.md) object.|
|[Get fileDataConnector](../api/filedataconnector-get.md)|[fileDataConnector](../resources/filedataconnector.md)|Read the properties and relationships of a [fileDataConnector](../resources/filedataconnector.md) object.|
|[Update fileDataConnector](../api/filedataconnector-update.md)|[fileDataConnector](../resources/filedataconnector.md)|Update the properties of a [fileDataConnector](../resources/filedataconnector.md) object.|
|[Delete fileDataConnector](../api/filedataconnector-delete.md)|None|Deletes a [fileDataConnector](../resources/filedataconnector.md) object.|
|[List sourceSystemDefinition](../api/filedataconnector-list-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/filedataconnector-post-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [dataConnector](../resources/dataconnector.md).|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|**TODO: Add Description** Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileDataConnector",
  "baseType": "microsoft.industryData.dataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileDataConnector",
  "eTag": "String",
  "displayName": "String"
}
```

