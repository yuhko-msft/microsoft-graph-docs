---
title: "apiDataConnector resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# apiDataConnector resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [dataConnector](../resources/industrydata-dataconnector.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List apiDataConnectors](../api/industrydata-apidataconnector-list.md)|[microsoft.graph.industryData.apiDataConnector](../resources/industrydata-apidataconnector.md) collection|Get a list of the [apiDataConnector](../resources/industrydata-apidataconnector.md) objects and their properties.|
|[Get apiDataConnector](../api/industrydata-apidataconnector-get.md)|[microsoft.graph.industryData.apiDataConnector](../resources/industrydata-apidataconnector.md)|Read the properties and relationships of an [apiDataConnector](../resources/industrydata-apidataconnector.md) object.|
|[Update apiDataConnector](../api/industrydata-apidataconnector-update.md)|[microsoft.graph.industryData.apiDataConnector](../resources/industrydata-apidataconnector.md)|Update the properties of an [apiDataConnector](../resources/industrydata-apidataconnector.md) object.|
|[Delete apiDataConnector](../api/industrydata-apidataconnector-delete.md)|None|Deletes an [apiDataConnector](../resources/industrydata-apidataconnector.md) object.|
|[List sourceSystemDefinition](../api/industrydata-apidataconnector-list-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|Get the sourceSystemDefinition resources from the sourceSystem navigation property.|
|[Add sourceSystemDefinition](../api/industrydata-apidataconnector-post-sourcesystem.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Add sourceSystem by posting to the sourceSystem collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|credential|[microsoft.graph.industryData.credential](../resources/industrydata-credential.md)|A credential to use to connect to the API.|
|displayName|String|Name of the data connector. Inherited from [dataConnector](../resources/industrydata-dataconnector.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|systemContract|systemContract|API contracts for external systems the industryDataHub can connect to. The possible values are: `educationPowerSchool`, `educationGenericOneRoster1_1`, `educationGenericOneRoster1_2`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sourceSystem|[sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|The sourceSystemDefinition this connector is connected to. Inherited from [dataConnector](../resources/dataconnector.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.apiDataConnector",
  "baseType": "microsoft.graph.industryData.dataConnector",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.apiDataConnector",
  "eTag": "String",
  "displayName": "String",
  "systemContract": "String",
  "credential": {
    "@odata.type": "microsoft.graph.industryData.credential"
  }
}
```

