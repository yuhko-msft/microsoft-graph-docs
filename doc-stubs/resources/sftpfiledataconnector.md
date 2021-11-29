---
title: "sftpFileDataConnector resource type"
description: "Representation of a way to connect to an sFTP data source."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sftpFileDataConnector resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Representation of a way to connect to an sFTP data source.


Inherits from [fileDataConnector](../resources/filedataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sftpFileDataConnectors](../api/sftpfiledataconnector-list.md)|[sftpFileDataConnector](../resources/sftpfiledataconnector.md) collection|Get a list of the [sftpFileDataConnector](../resources/sftpfiledataconnector.md) objects and their properties.|
|[Get sftpFileDataConnector](../api/sftpfiledataconnector-get.md)|[sftpFileDataConnector](../resources/sftpfiledataconnector.md)|Read the properties and relationships of a [sftpFileDataConnector](../resources/sftpfiledataconnector.md) object.|
|[Update sftpFileDataConnector](../api/sftpfiledataconnector-update.md)|[sftpFileDataConnector](../resources/sftpfiledataconnector.md)|Update the properties of a [sftpFileDataConnector](../resources/sftpfiledataconnector.md) object.|
|[Delete sftpFileDataConnector](../api/sftpfiledataconnector-delete.md)|None|Deletes a [sftpFileDataConnector](../resources/sftpfiledataconnector.md) object.|
|[List sourceSystemDefinition](../api/sftpfiledataconnector-list-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/sftpfiledataconnector-post-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|credential|[credential](../resources/credential.md)|Credential to connect to the SFTP server.|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|formatSettings|[fileFormatSettings](../resources/fileformatsettings.md)|File format settings|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|sftpAddress|String|Address of the SFTP server.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sftpFileDataConnector",
  "baseType": "microsoft.industryData.fileDataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sftpFileDataConnector",
  "id": "String (identifier)",
  "eTag": "String",
  "displayName": "String",
  "credential": {
    "@odata.type": "microsoft.graph.credential"
  },
  "sftpAddress": "String",
  "formatSettings": {
    "@odata.type": "microsoft.graph.fileFormatSettings"
  }
}
```

