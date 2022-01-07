---
title: "namedLocation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# namedLocation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List namedLocations](../api/namedlocation-list.md)|[namedLocation](../resources/namedlocation.md) collection|Get a list of the [namedLocation](../resources/namedlocation.md) objects and their properties.|
|[Create namedLocation](../api/conditionalaccessroot-post-namedlocations.md)|[namedLocation](../resources/namedlocation.md)|Create a new [namedLocation](../resources/namedlocation.md) object.|
|[Get namedLocation](../api/namedlocation-get.md)|[namedLocation](../resources/namedlocation.md)|Read the properties and relationships of a [namedLocation](../resources/namedlocation.md) object.|
|[Update namedLocation](../api/namedlocation-update.md)|[namedLocation](../resources/namedlocation.md)|Update the properties of a [namedLocation](../resources/namedlocation.md) object.|
|[Delete namedLocation](../api/namedlocation-delete.md)|None|Deletes a [namedLocation](../resources/namedlocation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.namedLocation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.namedLocation",
  "id": "String (identifier)",
  "displayName": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)"
}
```

