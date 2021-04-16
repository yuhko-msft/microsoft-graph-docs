---
title: "countryRegion resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# countryRegion resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List countryRegions](../api/countryregion-list.md)|[countryRegion](../resources/countryregion.md) collection|Get a list of the [countryRegion](../resources/countryregion.md) objects and their properties.|
|[Create countryRegion](../api/countryregion-create.md)|[countryRegion](../resources/countryregion.md)|Create a new [countryRegion](../resources/countryregion.md) object.|
|[Get countryRegion](../api/countryregion-get.md)|[countryRegion](../resources/countryregion.md)|Read the properties and relationships of a [countryRegion](../resources/countryregion.md) object.|
|[Update countryRegion](../api/countryregion-update.md)|[countryRegion](../resources/countryregion.md)|Update the properties of a [countryRegion](../resources/countryregion.md) object.|
|[Delete countryRegion](../api/countryregion-delete.md)|None|Deletes a [countryRegion](../resources/countryregion.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|addressFormat|String|**TODO: Add Description**|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.countryRegion",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.countryRegion",
  "id": "String (identifier)",
  "addressFormat": "String",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

