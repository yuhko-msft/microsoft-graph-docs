---
title: "sftpFileDataConnector resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sftpFileDataConnector resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [fileDataConnector](../resources/industrydata-filedataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sftpFileDataConnectors](../api/industrydata-sftpfiledataconnector-list.md)|[microsoft.graph.industryData.sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md) collection|Get a list of the [sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md) objects and their properties.|
|[Get sftpFileDataConnector](../api/industrydata-sftpfiledataconnector-get.md)|[microsoft.graph.industryData.sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md)|Read the properties and relationships of a [sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md) object.|
|[Update sftpFileDataConnector](../api/industrydata-sftpfiledataconnector-update.md)|[microsoft.graph.industryData.sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md)|Update the properties of a [sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md) object.|
|[Delete sftpFileDataConnector](../api/industrydata-sftpfiledataconnector-delete.md)|None|Deletes a [sftpFileDataConnector](../resources/industrydata-sftpfiledataconnector.md) object.|
|[List sourceSystemDefinition](../api/industrydata-sftpfiledataconnector-list-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/industrydata-sftpfiledataconnector-post-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|credential|[microsoft.graph.industryData.credential](../resources/industrydata-credential.md)|Credential to connect to the SFTP server.|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/industrydata-dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|formatSettings|[microsoft.graph.industryData.fileFormatSettings](../resources/industrydata-fileformatsettings.md)|File format settings|
|sftpAddress|String|Address of the SFTP server.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.sftpFileDataConnector",
  "baseType": "microsoft.graph.industryData.fileDataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.sftpFileDataConnector",
  "eTag": "String",
  "displayName": "String",
  "credential": {
    "@odata.type": "microsoft.graph.industryData.credential"
  },
  "sftpAddress": "String",
  "formatSettings": {
    "@odata.type": "microsoft.graph.industryData.fileFormatSettings"
  }
}
```

