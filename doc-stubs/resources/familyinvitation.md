---
title: "familyInvitation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# familyInvitation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List familyInvitations](../api/familyinvitation-list.md)|[familyInvitation](../resources/familyinvitation.md) collection|Get a list of the [familyInvitation](../resources/familyinvitation.md) objects and their properties.|
|[Create familyInvitation](../api/familyinvitation-create.md)|[familyInvitation](../resources/familyinvitation.md)|Create a new [familyInvitation](../resources/familyinvitation.md) object.|
|[Get familyInvitation](../api/familyinvitation-get.md)|[familyInvitation](../resources/familyinvitation.md)|Read the properties and relationships of a [familyInvitation](../resources/familyinvitation.md) object.|
|[Update familyInvitation](../api/familyinvitation-update.md)|[familyInvitation](../resources/familyinvitation.md)|Update the properties of a [familyInvitation](../resources/familyinvitation.md) object.|
|[Delete familyInvitation](../api/familyinvitation-delete.md)|None|Deletes a [familyInvitation](../resources/familyinvitation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|email|String|**TODO: Add Description**|
|invitedDateTime|DateTimeOffset|**TODO: Add Description**|
|phone|String|**TODO: Add Description**|
|role|familyRole|**TODO: Add Description**. Possible values are: `admin`, `user`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.familyInvitation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.familyInvitation",
  "role": "String",
  "invitedDateTime": "String (timestamp)",
  "email": "String",
  "phone": "String"
}
```

