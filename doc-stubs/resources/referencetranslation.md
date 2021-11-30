---
title: "referenceTranslation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# referenceTranslation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List referenceTranslations](../api/referencetranslation-list.md)|[referenceTranslation](../resources/referencetranslation.md) collection|Get a list of the [referenceTranslation](../resources/referencetranslation.md) objects and their properties.|
|[Create referenceTranslation](../api/referencedefinition-post-translations.md)|[referenceTranslation](../resources/referencetranslation.md)|Create a new [referenceTranslation](../resources/referencetranslation.md) object.|
|[Get referenceTranslation](../api/referencetranslation-get.md)|[referenceTranslation](../resources/referencetranslation.md)|Read the properties and relationships of a [referenceTranslation](../resources/referencetranslation.md) object.|
|[Update referenceTranslation](../api/referencetranslation-update.md)|[referenceTranslation](../resources/referencetranslation.md)|Update the properties of a [referenceTranslation](../resources/referencetranslation.md) object.|
|[Delete referenceTranslation](../api/referencetranslation-delete.md)|None|Deletes a [referenceTranslation](../resources/referencetranslation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|eTag|String|**TODO: Add Description** Inherited from [mutableEntity](../resources/mutableentity.md).|
|language|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.referenceTranslation",
  "baseType": "microsoft.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.referenceTranslation",
  "eTag": "String",
  "createdDateTime": "String (timestamp)",
  "language": "String",
  "displayName": "String"
}
```

