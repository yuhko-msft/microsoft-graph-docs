---
title: "azureDataLakeConnector resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# azureDataLakeConnector resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [fileDataConnector](../resources/industrydata-filedataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List azureDataLakeConnectors](../api/industrydata-azuredatalakeconnector-list.md)|[microsoft.graph.industryData.azureDataLakeConnector](../resources/industrydata-azuredatalakeconnector.md) collection|Get a list of the [azureDataLakeConnector](../resources/industrydata-azuredatalakeconnector.md) objects and their properties.|
|[Get azureDataLakeConnector](../api/industrydata-azuredatalakeconnector-get.md)|[microsoft.graph.industryData.azureDataLakeConnector](../resources/industrydata-azuredatalakeconnector.md)|Read the properties and relationships of an [azureDataLakeConnector](../resources/industrydata-azuredatalakeconnector.md) object.|
|[Update azureDataLakeConnector](../api/industrydata-azuredatalakeconnector-update.md)|[microsoft.graph.industryData.azureDataLakeConnector](../resources/industrydata-azuredatalakeconnector.md)|Update the properties of an [azureDataLakeConnector](../resources/industrydata-azuredatalakeconnector.md) object.|
|[Delete azureDataLakeConnector](../api/industrydata-azuredatalakeconnector-delete.md)|None|Deletes an [azureDataLakeConnector](../resources/industrydata-azuredatalakeconnector.md) object.|
|[getUploadSession](../api/industrydata-azuredatalakeconnector-getuploadsession.md)|[microsoft.graph.industryData.fileUploadSession](../resources/industrydata-fileuploadsession.md)|**TODO: Add Description**|
|[getUploadSession](../api/industrydata-azuredatalakeconnector-getuploadsession.md)|[microsoft.graph.industryData.fileUploadSession](../resources/industrydata-fileuploadsession.md)|Validate the data uploaded to the Azure Blob and clear the blob contents.|
|[validateUploadSession](../api/industrydata-azuredatalakeconnector-validateuploadsession.md)|None|Validate the data uploaded to the Azure Blob and clear the blob contents.|
|[List sourceSystemDefinition](../api/industrydata-azuredatalakeconnector-list-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/industrydata-azuredatalakeconnector-post-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/industrydata-dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|formatSettings|[microsoft.graph.industryData.fileFormatSettings](../resources/industrydata-fileformatsettings.md)|The file format settings for the dataconnector|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.azureDataLakeConnector",
  "baseType": "microsoft.graph.industryData.fileDataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.azureDataLakeConnector",
  "eTag": "String",
  "displayName": "String",
  "formatSettings": {
    "@odata.type": "microsoft.graph.industryData.fileFormatSettings"
  }
}
```

