---
title: "office365ActivationCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365ActivationCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365ActivationCounts](../api/office365activationcounts-list.md)|[office365ActivationCounts](../resources/office365activationcounts.md) collection|Get a list of the [office365ActivationCounts](../resources/office365activationcounts.md) objects and their properties.|
|[Create office365ActivationCounts](../api/office365activationcounts-create.md)|[office365ActivationCounts](../resources/office365activationcounts.md)|Create a new [office365ActivationCounts](../resources/office365activationcounts.md) object.|
|[Get office365ActivationCounts](../api/office365activationcounts-get.md)|[office365ActivationCounts](../resources/office365activationcounts.md)|Read the properties and relationships of an [office365ActivationCounts](../resources/office365activationcounts.md) object.|
|[Update office365ActivationCounts](../api/office365activationcounts-update.md)|[office365ActivationCounts](../resources/office365activationcounts.md)|Update the properties of an [office365ActivationCounts](../resources/office365activationcounts.md) object.|
|[Delete office365ActivationCounts](../api/office365activationcounts-delete.md)|None|Deletes an [office365ActivationCounts](../resources/office365activationcounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|android|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|ios|Int64|**TODO: Add Description**|
|mac|Int64|**TODO: Add Description**|
|productType|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|windows|Int64|**TODO: Add Description**|
|windows10Mobile|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365ActivationCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365ActivationCounts",
  "id": "String (identifier)",
  "android": "Integer",
  "ios": "Integer",
  "mac": "Integer",
  "productType": "String",
  "reportRefreshDate": "Date",
  "windows": "Integer",
  "windows10Mobile": "Integer"
}
```

