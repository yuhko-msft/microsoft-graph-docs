---
title: "familyMember resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# familyMember resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List familyMembers](../api/familymember-list.md)|[familyMember](../resources/familymember.md) collection|Get a list of the [familyMember](../resources/familymember.md) objects and their properties.|
|[Create familyMember](../api/familymember-create.md)|[familyMember](../resources/familymember.md)|Create a new [familyMember](../resources/familymember.md) object.|
|[Get familyMember](../api/familymember-get.md)|[familyMember](../resources/familymember.md)|Read the properties and relationships of a [familyMember](../resources/familymember.md) object.|
|[Update familyMember](../api/familymember-update.md)|[familyMember](../resources/familymember.md)|Update the properties of a [familyMember](../resources/familymember.md) object.|
|[Delete familyMember](../api/familymember-delete.md)|None|Deletes a [familyMember](../resources/familymember.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|joinedDateTime|DateTimeOffset|**TODO: Add Description**|
|netId|String|**TODO: Add Description**|
|role|familyRole|**TODO: Add Description**. Possible values are: `admin`, `user`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.familyMember",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.familyMember",
  "netId": "String",
  "role": "String",
  "joinedDateTime": "String (timestamp)"
}
```

