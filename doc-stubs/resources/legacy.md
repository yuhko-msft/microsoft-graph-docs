---
title: "legacy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# legacy resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List legacies](../api/legacy-list.md)|[legacy](../resources/legacy.md) collection|Get a list of the [legacy](../resources/legacy.md) objects and their properties.|
|[Create legacy](../api/legacy-create.md)|[legacy](../resources/legacy.md)|Create a new [legacy](../resources/legacy.md) object.|
|[Get legacy](../api/legacy-get.md)|[legacy](../resources/legacy.md)|Read the properties and relationships of a [legacy](../resources/legacy.md) object.|
|[Update legacy](../api/legacy-update.md)|[legacy](../resources/legacy.md)|Update the properties of a [legacy](../resources/legacy.md) object.|
|[Delete legacy](../api/legacy-delete.md)|None|Deletes a [legacy](../resources/legacy.md) object.|
|[List policies](../api/legacy-list-policies.md)|[policy](../resources/policy.md) collection|Get the policy resources from the policies navigation property.|
|[Create policies](../api/legacy-post-policies.md)|[policy](../resources/policy.md)|Create a new policy object.|
|[Get policies](../api/legacy-get-policy.md)|[policy](../resources/policy.md)|Read the properties and relationships of a [policy](../resources/policy.md) object.|
|[Update policies](../api/legacy-update-policies.md)|[policy](../resources/policy.md)|Update the properties of a policies object.|
|[Delete policies](../api/legacy-delete-policies.md)|None|Delete a [policy](../resources/policy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|policies|[policy](../resources/policy.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.legacy",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.legacy"
}
```

