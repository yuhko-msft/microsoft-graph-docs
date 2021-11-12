---
title: "schoolDataSyncDataConnector resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# schoolDataSyncDataConnector resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [fileDataConnector](../resources/industrydata-filedataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List schoolDataSyncDataConnectors](../api/industrydata-schooldatasyncdataconnector-list.md)|[microsoft.graph.industryData.schoolDataSyncDataConnector](../resources/industrydata-schooldatasyncdataconnector.md) collection|Get a list of the [schoolDataSyncDataConnector](../resources/industrydata-schooldatasyncdataconnector.md) objects and their properties.|
|[Get schoolDataSyncDataConnector](../api/industrydata-schooldatasyncdataconnector-get.md)|[microsoft.graph.industryData.schoolDataSyncDataConnector](../resources/industrydata-schooldatasyncdataconnector.md)|Read the properties and relationships of a [schoolDataSyncDataConnector](../resources/industrydata-schooldatasyncdataconnector.md) object.|
|[Update schoolDataSyncDataConnector](../api/industrydata-schooldatasyncdataconnector-update.md)|[microsoft.graph.industryData.schoolDataSyncDataConnector](../resources/industrydata-schooldatasyncdataconnector.md)|Update the properties of a [schoolDataSyncDataConnector](../resources/industrydata-schooldatasyncdataconnector.md) object.|
|[Delete schoolDataSyncDataConnector](../api/industrydata-schooldatasyncdataconnector-delete.md)|None|Deletes a [schoolDataSyncDataConnector](../resources/industrydata-schooldatasyncdataconnector.md) object.|
|[List sourceSystemDefinition](../api/industrydata-schooldatasyncdataconnector-list-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/industrydata-schooldatasyncdataconnector-post-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/industrydata-dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|formatSettings|[microsoft.graph.industryData.fileFormatSettings](../resources/industrydata-fileformatsettings.md) collection|The file format settings for the dataconnector|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.schoolDataSyncDataConnector",
  "baseType": "microsoft.graph.industryData.fileDataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.schoolDataSyncDataConnector",
  "eTag": "String",
  "displayName": "String",
  "formatSettings": [
    {
      "@odata.type": "microsoft.graph.industryData.fileFormatSettings"
    }
  ]
}
```

