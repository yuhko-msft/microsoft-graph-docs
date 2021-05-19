---
title: "household resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# household resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List households](../api/household-list.md)|[household](../resources/household.md) collection|Get a list of the [household](../resources/household.md) objects and their properties.|
|[Create household](../api/household-create.md)|[household](../resources/household.md)|Create a new [household](../resources/household.md) object.|
|[Get household](../api/household-get.md)|[household](../resources/household.md)|Read the properties and relationships of a [household](../resources/household.md) object.|
|[Update household](../api/household-update.md)|[household](../resources/household.md)|Update the properties of a [household](../resources/household.md) object.|
|[Delete household](../api/household-delete.md)|None|Deletes a [household](../resources/household.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|netId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.household",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.household",
  "netId": "String"
}
```

