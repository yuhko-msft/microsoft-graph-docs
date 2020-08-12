---
title: "outlookCategory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outlookCategory resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List masterCategories](../api/outlookuser-list-mastercategories.md)|[outlookCategory](../resources/outlookcategory.md) collection|Get the outlookCategories from the masterCategories navigation property.|
|[Create masterCategories](../api/outlookuser-post-mastercategories.md)|[outlookCategory](../resources/outlookcategory.md)|Create a new masterCategories object.|
|[Update masterCategories](../api/outlookuser-update-mastercategories.md)|[outlookCategory](../resources/outlookcategory.md)|Update the properties of a masterCategories object.|
|[Get masterCategories](../api/outlookuser-get-outlookcategory.md)|[outlookCategory](../resources/outlookcategory.md)|Read the properties and relationships of an [outlookCategory](../resources/outlookcategory.md) object.|
|[Delete masterCategories](../api/outlookuser-delete-mastercategories.md)|None|Delete an [outlookCategory](../resources/outlookcategory.md) object.|
|[List outlookCategories](../api/outlookcategory-list.md)|[outlookCategory](../resources/outlookcategory.md) collection|Get a list of the [outlookCategory](../resources/outlookcategory.md) objects and their properties.|
|[Create outlookCategory](../api/outlookcategory-create.md)|[outlookCategory](../resources/outlookcategory.md)|Create a new [outlookCategory](../resources/outlookcategory.md) object.|
|[Get outlookCategory](../api/outlookcategory-get.md)|[outlookCategory](../resources/outlookcategory.md)|Read the properties and relationships of an [outlookCategory](../resources/outlookcategory.md) object.|
|[Update outlookCategory](../api/outlookcategory-update.md)|[outlookCategory](../resources/outlookcategory.md)|Update the properties of an [outlookCategory](../resources/outlookcategory.md) object.|
|[Delete outlookCategory](../api/outlookcategory-delete.md)|None|Deletes an [outlookCategory](../resources/outlookcategory.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|color|categoryColor|**TODO: Add Description**. Possible values are: `preset0`, `preset1`, `preset2`, `preset3`, `preset4`, `preset5`, `preset6`, `preset7`, `preset8`, `preset9`, `preset10`, `preset11`, `preset12`, `preset13`, `preset14`, `preset15`, `preset16`, `preset17`, `preset18`, `preset19`, `preset20`, `preset21`, `preset22`, `preset23`, `preset24`, `none`.|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookCategory",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.outlookCategory",
  "id": "String (identifier)",
  "displayName": "String",
  "color": "String"
}
```

