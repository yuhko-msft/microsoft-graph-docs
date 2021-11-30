---
title: "azureDataLakeConnector resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# azureDataLakeConnector resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [fileDataConnector](../resources/filedataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List azureDataLakeConnectors](../api/azuredatalakeconnector-list.md)|[azureDataLakeConnector](../resources/azuredatalakeconnector.md) collection|Get a list of the [azureDataLakeConnector](../resources/azuredatalakeconnector.md) objects and their properties.|
|[Get azureDataLakeConnector](../api/azuredatalakeconnector-get.md)|[azureDataLakeConnector](../resources/azuredatalakeconnector.md)|Read the properties and relationships of an [azureDataLakeConnector](../resources/azuredatalakeconnector.md) object.|
|[Update azureDataLakeConnector](../api/azuredatalakeconnector-update.md)|[azureDataLakeConnector](../resources/azuredatalakeconnector.md)|Update the properties of an [azureDataLakeConnector](../resources/azuredatalakeconnector.md) object.|
|[Delete azureDataLakeConnector](../api/azuredatalakeconnector-delete.md)|None|Deletes an [azureDataLakeConnector](../resources/azuredatalakeconnector.md) object.|
|[getUploadSession](../api/azuredatalakeconnector-getuploadsession.md)|[fileUploadSession](../resources/fileuploadsession.md)|**TODO: Add Description**|
|[getUploadSession](../api/azuredatalakeconnector-getuploadsession.md)|[fileUploadSession](../resources/fileuploadsession.md)|Validate the data uploaded to the Azure Blob and clear the blob contents.|
|[validateUploadSession](../api/azuredatalakeconnector-validateuploadsession.md)|None|Validate the data uploaded to the Azure Blob and clear the blob contents.|
|[List sourceSystemDefinition](../api/azuredatalakeconnector-list-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/azuredatalakeconnector-post-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|formatSettings|[fileFormatSettings](../resources/fileformatsettings.md)|The file format settings for the dataconnector|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.azureDataLakeConnector",
  "baseType": "microsoft.industryData.fileDataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.azureDataLakeConnector",
  "eTag": "String",
  "displayName": "String",
  "formatSettings": {
    "@odata.type": "microsoft.graph.fileFormatSettings"
  }
}
```

