---
title: "apiDataConnector resource type"
description: "Representation of a way to connect to an API-based data source."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# apiDataConnector resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Representation of a way to connect to an API-based data source.


Inherits from [dataConnector](../resources/dataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List apiDataConnectors](../api/apidataconnector-list.md)|[apiDataConnector](../resources/apidataconnector.md) collection|Get a list of the [apiDataConnector](../resources/apidataconnector.md) objects and their properties.|
|[Get apiDataConnector](../api/apidataconnector-get.md)|[apiDataConnector](../resources/apidataconnector.md)|Read the properties and relationships of an [apiDataConnector](../resources/apidataconnector.md) object.|
|[Update apiDataConnector](../api/apidataconnector-update.md)|[apiDataConnector](../resources/apidataconnector.md)|Update the properties of an [apiDataConnector](../resources/apidataconnector.md) object.|
|[Delete apiDataConnector](../api/apidataconnector-delete.md)|None|Deletes an [apiDataConnector](../resources/apidataconnector.md) object.|
|[List sourceSystemDefinition](../api/apidataconnector-list-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/apidataconnector-post-sourcesystem.md)|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|credential|[credential](../resources/credential.md)|A credential to use to connect to the API.|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|systemContract|systemContract|API contracts for external systems the industryDataHub can connect to. The possible values are: `educationPowerSchool`, `educationGenericOneRoster1_1`, `educationGenericOneRoster1_2`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.apiDataConnector",
  "baseType": "microsoft.industryData.dataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.apiDataConnector",
  "id": "String (identifier)",
  "eTag": "String",
  "displayName": "String",
  "systemContract": "String",
  "credential": {
    "@odata.type": "microsoft.graph.credential"
  }
}
```

