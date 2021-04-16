---
title: "taxGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# taxGroup resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List taxGroups](../api/taxgroup-list.md)|[taxGroup](../resources/taxgroup.md) collection|Get a list of the [taxGroup](../resources/taxgroup.md) objects and their properties.|
|[Create taxGroup](../api/taxgroup-create.md)|[taxGroup](../resources/taxgroup.md)|Create a new [taxGroup](../resources/taxgroup.md) object.|
|[Get taxGroup](../api/taxgroup-get.md)|[taxGroup](../resources/taxgroup.md)|Read the properties and relationships of a [taxGroup](../resources/taxgroup.md) object.|
|[Update taxGroup](../api/taxgroup-update.md)|[taxGroup](../resources/taxgroup.md)|Update the properties of a [taxGroup](../resources/taxgroup.md) object.|
|[Delete taxGroup](../api/taxgroup-delete.md)|None|Deletes a [taxGroup](../resources/taxgroup.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|taxType|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.taxGroup",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.taxGroup",
  "id": "String (identifier)",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "taxType": "String"
}
```

