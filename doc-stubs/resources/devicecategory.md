---
title: "deviceCategory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCategory resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCategories](../api/devicecategory-list.md)|[deviceCategory](../resources/devicecategory.md) collection|Get a list of the [deviceCategory](../resources/devicecategory.md) objects and their properties.|
|[Create deviceCategory](../api/devicecategory-create.md)|[deviceCategory](../resources/devicecategory.md)|Create a new [deviceCategory](../resources/devicecategory.md) object.|
|[Get deviceCategory](../api/devicecategory-get.md)|[deviceCategory](../resources/devicecategory.md)|Read the properties and relationships of a [deviceCategory](../resources/devicecategory.md) object.|
|[Update deviceCategory](../api/devicecategory-update.md)|[deviceCategory](../resources/devicecategory.md)|Update the properties of a [deviceCategory](../resources/devicecategory.md) object.|
|[Delete deviceCategory](../api/devicecategory-delete.md)|None|Deletes a [deviceCategory](../resources/devicecategory.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Unique identifier for the device category. Read-only.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceCategory",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceCategory",
  "id": "String (identifier)"
}
```

