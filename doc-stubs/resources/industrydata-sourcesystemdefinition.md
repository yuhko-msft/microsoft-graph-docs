---
title: "sourceSystemDefinition resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sourceSystemDefinition resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [mutableEntity](../resources/industrydata-mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sourceSystemDefinitions](../api/industrydata-sourcesystemdefinition-list.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) collection|Get a list of the [sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) objects and their properties.|
|[Create sourceSystemDefinition](../api/industrydata-industrydatahub-post-sourcesystems.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Create a new [sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) object.|
|[Get sourceSystemDefinition](../api/industrydata-sourcesystemdefinition-get.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Read the properties and relationships of a [sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) object.|
|[Update sourceSystemDefinition](../api/industrydata-sourcesystemdefinition-update.md)|[microsoft.graph.industryData.sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md)|Update the properties of a [sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) object.|
|[Delete sourceSystemDefinition](../api/industrydata-sourcesystemdefinition-delete.md)|None|Deletes a [sourceSystemDefinition](../resources/industrydata-sourcesystemdefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|directoryUserMatchingSettings|[microsoft.graph.industryData.directoryUserMatchAttributeSelection](../resources/industrydata-directoryusermatchattributeselection.md) collection|Settings for matching the user data from the source system with user data in Azure Active Directory.|
|displayName|String|Name of the source system.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|vendor|String|Name of the vendor who supplies the source system.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.sourceSystemDefinition",
  "baseType": "microsoft.graph.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.sourceSystemDefinition",
  "eTag": "String",
  "displayName": "String",
  "vendor": "String",
  "directoryUserMatchingSettings": [
    {
      "@odata.type": "microsoft.graph.industryData.directoryUserMatchAttributeSelection"
    }
  ]
}
```

