---
title: "referenceDefinition resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# referenceDefinition resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List referenceDefinitions](../api/referencedefinition-list.md)|[referenceDefinition](../resources/referencedefinition.md) collection|Get a list of the [referenceDefinition](../resources/referencedefinition.md) objects and their properties.|
|[Create referenceDefinition](../api/industrydatahub-post-referencedefinitions.md)|[referenceDefinition](../resources/referencedefinition.md)|Create a new [referenceDefinition](../resources/referencedefinition.md) object.|
|[Get referenceDefinition](../api/referencedefinition-get.md)|[referenceDefinition](../resources/referencedefinition.md)|Read the properties and relationships of a [referenceDefinition](../resources/referencedefinition.md) object.|
|[Update referenceDefinition](../api/referencedefinition-update.md)|[referenceDefinition](../resources/referencedefinition.md)|Update the properties of a [referenceDefinition](../resources/referencedefinition.md) object.|
|[Delete referenceDefinition](../api/referencedefinition-delete.md)|None|Deletes a [referenceDefinition](../resources/referencedefinition.md) object.|
|[localized](../api/referencedefinition-localized.md)|[localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md) collection|Function to easily get a single localized version of a referenceDefinition.|
|[List translations](../api/referencedefinition-list-translations.md)|[referenceTranslation](../resources/referencetranslation.md) collection|Get the referenceTranslation resources from the translations navigation property.|
|[Create referenceTranslation](../api/referencedefinition-post-translations.md)|[referenceTranslation](../resources/referencetranslation.md)|Create a new referenceTranslation object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|Code value for the definition.  Must be unique within the referenceType.|
|createdDateTime|DateTimeOffset|Time the definition was created.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|namespace|String|Namespace for the definition.|
|referenceType|String|Type of for the definition. The set of definitions sharing a type form the value set for that type.|
|sortOrder|String|Ordering index to present the definitions within a type consistently in user interfaces.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|translations|[referenceTranslation](../resources/referencetranslation.md) collection|The set of translations of the definition into human languages.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.referenceDefinition",
  "baseType": "microsoft.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.referenceDefinition",
  "eTag": "String",
  "namespace": "String",
  "referenceType": "String",
  "code": "String",
  "createdDateTime": "String (timestamp)",
  "sortOrder": "String"
}
```

