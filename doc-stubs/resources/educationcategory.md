---
title: "educationCategory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationCategory resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationCategories](../api/educationcategory-list.md)|[educationCategory](../resources/educationcategory.md) collection|Get a list of the [educationCategory](../resources/educationcategory.md) objects and their properties.|
|[Create educationCategory](../api/educationcategory-create.md)|[educationCategory](../resources/educationcategory.md)|Create a new [educationCategory](../resources/educationcategory.md) object.|
|[Get educationCategory](../api/educationcategory-get.md)|[educationCategory](../resources/educationcategory.md)|Read the properties and relationships of an [educationCategory](../resources/educationcategory.md) object.|
|[Update educationCategory](../api/educationcategory-update.md)|[educationCategory](../resources/educationcategory.md)|Update the properties of an [educationCategory](../resources/educationcategory.md) object.|
|[Delete educationCategory](../api/educationcategory-delete.md)|None|Deletes an [educationCategory](../resources/educationcategory.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationCategory",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationCategory",
  "id": "String (identifier)",
  "displayName": "String"
}
```

