---
title: "educationOutcome resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationOutcome resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationOutcomes](../api/educationoutcome-list.md)|[educationOutcome](../resources/educationoutcome.md) collection|Get a list of the [educationOutcome](../resources/educationoutcome.md) objects and their properties.|
|[Create educationOutcome](../api/educationoutcome-create.md)|[educationOutcome](../resources/educationoutcome.md)|Create a new [educationOutcome](../resources/educationoutcome.md) object.|
|[Get educationOutcome](../api/educationoutcome-get.md)|[educationOutcome](../resources/educationoutcome.md)|Read the properties and relationships of an [educationOutcome](../resources/educationoutcome.md) object.|
|[Update educationOutcome](../api/educationoutcome-update.md)|[educationOutcome](../resources/educationoutcome.md)|Update the properties of an [educationOutcome](../resources/educationoutcome.md) object.|
|[Delete educationOutcome](../api/educationoutcome-delete.md)|None|Deletes an [educationOutcome](../resources/educationoutcome.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationOutcome",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationOutcome",
  "id": "String (identifier)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)"
}
```

