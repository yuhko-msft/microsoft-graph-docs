---
title: "schoolDataSyncDataConnector resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# schoolDataSyncDataConnector resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [fileDataConnector](../resources/filedataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List schoolDataSyncDataConnectors](../api/schooldatasyncdataconnector-list.md)|[schoolDataSyncDataConnector](../resources/schooldatasyncdataconnector.md) collection|Get a list of the [schoolDataSyncDataConnector](../resources/schooldatasyncdataconnector.md) objects and their properties.|
|[Get schoolDataSyncDataConnector](../api/schooldatasyncdataconnector-get.md)|[schoolDataSyncDataConnector](../resources/schooldatasyncdataconnector.md)|Read the properties and relationships of a [schoolDataSyncDataConnector](../resources/schooldatasyncdataconnector.md) object.|
|[Update schoolDataSyncDataConnector](../api/schooldatasyncdataconnector-update.md)|[schoolDataSyncDataConnector](../resources/schooldatasyncdataconnector.md)|Update the properties of a [schoolDataSyncDataConnector](../resources/schooldatasyncdataconnector.md) object.|
|[Delete schoolDataSyncDataConnector](../api/schooldatasyncdataconnector-delete.md)|None|Deletes a [schoolDataSyncDataConnector](../resources/schooldatasyncdataconnector.md) object.|
|[List sourceSystemDefinition](../api/schooldatasyncdataconnector-list-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/schooldatasyncdataconnector-post-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|formatSettings|[fileFormatSettings](../resources/fileformatsettings.md) collection|The file format settings for the dataconnector|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.schoolDataSyncDataConnector",
  "baseType": "microsoft.industryData.fileDataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.schoolDataSyncDataConnector",
  "eTag": "String",
  "displayName": "String",
  "formatSettings": [
    {
      "@odata.type": "microsoft.graph.fileFormatSettings"
    }
  ]
}
```

