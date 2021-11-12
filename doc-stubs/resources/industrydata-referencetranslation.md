---
title: "referenceTranslation resource type"
description: "Base entity type for all entities that can be modified by the API client."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# referenceTranslation resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base entity type for all entities that can be modified by the API client.


Inherits from [mutableEntity](../resources/industrydata-mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List referenceTranslations](../api/industrydata-referencetranslation-list.md)|[microsoft.graph.industryData.referenceTranslation](../resources/industrydata-referencetranslation.md) collection|Get a list of the [referenceTranslation](../resources/industrydata-referencetranslation.md) objects and their properties.|
|[Create referenceTranslation](../api/industrydata-referencedefinition-post-translations.md)|[microsoft.graph.industryData.referenceTranslation](../resources/industrydata-referencetranslation.md)|Create a new [referenceTranslation](../resources/industrydata-referencetranslation.md) object.|
|[Get referenceTranslation](../api/industrydata-referencetranslation-get.md)|[microsoft.graph.industryData.referenceTranslation](../resources/industrydata-referencetranslation.md)|Read the properties and relationships of a [referenceTranslation](../resources/industrydata-referencetranslation.md) object.|
|[Update referenceTranslation](../api/industrydata-referencetranslation-update.md)|[microsoft.graph.industryData.referenceTranslation](../resources/industrydata-referencetranslation.md)|Update the properties of a [referenceTranslation](../resources/industrydata-referencetranslation.md) object.|
|[Delete referenceTranslation](../api/industrydata-referencetranslation-delete.md)|None|Deletes a [referenceTranslation](../resources/industrydata-referencetranslation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The time the translation was created.|
|displayName|String|The translated text.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|language|String|The language the translation represents. IETF language tag format.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.referenceTranslation",
  "baseType": "microsoft.graph.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.referenceTranslation",
  "eTag": "String",
  "createdDateTime": "String (timestamp)",
  "language": "String",
  "displayName": "String"
}
```

