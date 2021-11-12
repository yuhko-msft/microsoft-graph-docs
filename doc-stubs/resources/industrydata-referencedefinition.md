---
title: "referenceDefinition resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# referenceDefinition resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [mutableEntity](../resources/industrydata-mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List referenceDefinitions](../api/industrydata-referencedefinition-list.md)|[microsoft.graph.industryData.referenceDefinition](../resources/industrydata-referencedefinition.md) collection|Get a list of the [referenceDefinition](../resources/industrydata-referencedefinition.md) objects and their properties.|
|[Create referenceDefinition](../api/industrydata-industrydatahub-post-referencedefinitions.md)|[microsoft.graph.industryData.referenceDefinition](../resources/industrydata-referencedefinition.md)|Create a new [referenceDefinition](../resources/industrydata-referencedefinition.md) object.|
|[Get referenceDefinition](../api/industrydata-referencedefinition-get.md)|[microsoft.graph.industryData.referenceDefinition](../resources/industrydata-referencedefinition.md)|Read the properties and relationships of a [referenceDefinition](../resources/industrydata-referencedefinition.md) object.|
|[Update referenceDefinition](../api/industrydata-referencedefinition-update.md)|[microsoft.graph.industryData.referenceDefinition](../resources/industrydata-referencedefinition.md)|Update the properties of a [referenceDefinition](../resources/industrydata-referencedefinition.md) object.|
|[Delete referenceDefinition](../api/industrydata-referencedefinition-delete.md)|None|Deletes a [referenceDefinition](../resources/industrydata-referencedefinition.md) object.|
|[localized](../api/industrydata-referencedefinition-localized.md)|[microsoft.graph.industryData.localizedReferenceDefinitionView](../resources/industrydata-localizedreferencedefinitionview.md) collection|Function to easily get a single localized version of a referenceDefinition.|
|[List translations](../api/industrydata-referencedefinition-list-translations.md)|[microsoft.graph.industryData.referenceTranslation](../resources/industrydata-referencetranslation.md) collection|Get the referenceTranslation resources from the translations navigation property.|
|[Create referenceTranslation](../api/industrydata-referencedefinition-post-translations.md)|[microsoft.graph.industryData.referenceTranslation](../resources/industrydata-referencetranslation.md)|Create a new referenceTranslation object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|Code value for the definition.  Must be unique within the referenceType.|
|createdDateTime|DateTimeOffset|Time the definition was created.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|namespace|String|Namespace for the definition.|
|referenceType|String|Type of for the definition. The set of definitions sharing a type form the value set for that type.|
|sortOrder|String|Ordering index to present the definitions within a type consistently in user interfaces.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|translations|[microsoft.graph.industryData.referenceTranslation](../resources/industrydata-referencetranslation.md) collection|The set of translations of the definition into human languages.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.referenceDefinition",
  "baseType": "microsoft.graph.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.referenceDefinition",
  "eTag": "String",
  "namespace": "String",
  "referenceType": "String",
  "code": "String",
  "createdDateTime": "String (timestamp)",
  "sortOrder": "String"
}
```

