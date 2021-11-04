---
title: "url resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# url resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [filteringRuleSingleDestination](../resources/filteringrulesingledestination.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List urls](../api/url-list.md)|[url](../resources/url.md) collection|Get a list of the [url](../resources/url.md) objects and their properties.|
|[Get url](../api/url-get.md)|[url](../resources/url.md)|Read the properties and relationships of an [url](../resources/url.md) object.|
|[Update url](../api/url-update.md)|[url](../resources/url.md)|Update the properties of an [url](../resources/url.md) object.|
|[Delete url](../api/url-delete.md)|None|Deletes an [url](../resources/url.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|id|Guid|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.url",
  "baseType": "microsoft.graph.filteringRuleSingleDestination",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.url",
  "id": "String (identifier)",
  "name": "String",
  "description": "String"
}
```

