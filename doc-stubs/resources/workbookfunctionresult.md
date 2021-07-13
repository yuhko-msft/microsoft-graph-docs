---
title: "workbookFunctionResult resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookFunctionResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookFunctionResults](../api/workbookfunctionresult-list.md)|[workbookFunctionResult](../resources/workbookfunctionresult.md) collection|Get a list of the [workbookFunctionResult](../resources/workbookfunctionresult.md) objects and their properties.|
|[Create workbookFunctionResult](../api/workbookfunctionresult-create.md)|[workbookFunctionResult](../resources/workbookfunctionresult.md)|Create a new [workbookFunctionResult](../resources/workbookfunctionresult.md) object.|
|[Get workbookFunctionResult](../api/workbookfunctionresult-get.md)|[workbookFunctionResult](../resources/workbookfunctionresult.md)|Read the properties and relationships of a [workbookFunctionResult](../resources/workbookfunctionresult.md) object.|
|[Update workbookFunctionResult](../api/workbookfunctionresult-update.md)|[workbookFunctionResult](../resources/workbookfunctionresult.md)|Update the properties of a [workbookFunctionResult](../resources/workbookfunctionresult.md) object.|
|[Delete workbookFunctionResult](../api/workbookfunctionresult-delete.md)|None|Deletes a [workbookFunctionResult](../resources/workbookfunctionresult.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|error|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|value|[Json](../resources/json.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookFunctionResult",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookFunctionResult",
  "id": "String (identifier)",
  "error": "String",
  "value": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```

