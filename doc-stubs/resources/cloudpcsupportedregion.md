---
title: "cloudPcSupportedRegion resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPcSupportedRegion resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPcSupportedRegions](../api/cloudpcsupportedregion-list.md)|[cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md) collection|Get a list of the [cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md) objects and their properties.|
|[Create cloudPcSupportedRegion](../api/cloudpcsupportedregion-create.md)|[cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md)|Create a new [cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md) object.|
|[Get cloudPcSupportedRegion](../api/cloudpcsupportedregion-get.md)|[cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md)|Read the properties and relationships of a [cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md) object.|
|[Update cloudPcSupportedRegion](../api/cloudpcsupportedregion-update.md)|[cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md)|Update the properties of a [cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md) object.|
|[Delete cloudPcSupportedRegion](../api/cloudpcsupportedregion-delete.md)|None|Deletes a [cloudPcSupportedRegion](../resources/cloudpcsupportedregion.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPcSupportedRegion",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcSupportedRegion",
  "id": "String (identifier)",
  "displayName": "String"
}
```

