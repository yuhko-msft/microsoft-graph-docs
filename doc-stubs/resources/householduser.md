---
title: "householdUser resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# householdUser resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List householdUsers](../api/householduser-list.md)|[householdUser](../resources/householduser.md) collection|Get a list of the [householdUser](../resources/householduser.md) objects and their properties.|
|[Create householdUser](../api/householduser-create.md)|[householdUser](../resources/householduser.md)|Create a new [householdUser](../resources/householduser.md) object.|
|[Get householdUser](../api/householduser-get.md)|[householdUser](../resources/householduser.md)|Read the properties and relationships of a [householdUser](../resources/householduser.md) object.|
|[Update householdUser](../api/householduser-update.md)|[householdUser](../resources/householduser.md)|Update the properties of a [householdUser](../resources/householduser.md) object.|
|[Delete householdUser](../api/householduser-delete.md)|None|Deletes a [householdUser](../resources/householduser.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|netId|String|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.householdUser",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.householdUser",
  "netId": "String",
  "displayName": "String",
  "givenName": "String",
  "surname": "String"
}
```

