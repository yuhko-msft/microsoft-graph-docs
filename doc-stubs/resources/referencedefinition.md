---
title: "referenceDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# referenceDefinition resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List referenceDefinitions](../api/referencedefinition-list.md)|[referenceDefinition](../resources/referencedefinition.md) collection|Get a list of the [referenceDefinition](../resources/referencedefinition.md) objects and their properties.|
|[Create referenceDefinition](../api/industrydatahub-post-referencedefinitions.md)|[referenceDefinition](../resources/referencedefinition.md)|Create a new [referenceDefinition](../resources/referencedefinition.md) object.|
|[Get referenceDefinition](../api/referencedefinition-get.md)|[referenceDefinition](../resources/referencedefinition.md)|Read the properties and relationships of a [referenceDefinition](../resources/referencedefinition.md) object.|
|[Update referenceDefinition](../api/referencedefinition-update.md)|[referenceDefinition](../resources/referencedefinition.md)|Update the properties of a [referenceDefinition](../resources/referencedefinition.md) object.|
|[Delete referenceDefinition](../api/referencedefinition-delete.md)|None|Deletes a [referenceDefinition](../resources/referencedefinition.md) object.|
|[localized](../api/referencedefinition-localized.md)|[localizedReferenceDefinitionView](../resources/localizedreferencedefinitionview.md) collection|**TODO: Add Description**|
|[List translations](../api/referencedefinition-list-translations.md)|[referenceTranslation](../resources/referencetranslation.md) collection|Get the referenceTranslation resources from the translations navigation property.|
|[Create referenceTranslation](../api/referencedefinition-post-translations.md)|[referenceTranslation](../resources/referencetranslation.md)|Create a new referenceTranslation object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md).|
|namespace|String|**TODO: Add Description**|
|referenceType|String|**TODO: Add Description**|
|sortOrder|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|translations|[referenceTranslation](../resources/referencetranslation.md) collection|**TODO: Add Description**|

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

