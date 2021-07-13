---
title: "externalGroupMember resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# externalGroupMember resource type

Namespace: microsoft.graph.externalConnectors

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/externalconnectors-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List externalGroupMembers](../api/externalconnectors-externalgroupmember-list.md)|[microsoft.graph.externalConnectors.externalGroupMember](../resources/externalconnectors-externalgroupmember.md) collection|Get a list of the [externalGroupMember](../resources/externalconnectors-externalgroupmember.md) objects and their properties.|
|[Create externalGroupMember](../api/externalconnectors-externalgroupmember-create.md)|[microsoft.graph.externalConnectors.externalGroupMember](../resources/externalconnectors-externalgroupmember.md)|Create a new [externalGroupMember](../resources/externalconnectors-externalgroupmember.md) object.|
|[Get externalGroupMember](../api/externalconnectors-externalgroupmember-get.md)|[microsoft.graph.externalConnectors.externalGroupMember](../resources/externalconnectors-externalgroupmember.md)|Read the properties and relationships of an [externalGroupMember](../resources/externalconnectors-externalgroupmember.md) object.|
|[Update externalGroupMember](../api/externalconnectors-externalgroupmember-update.md)|[microsoft.graph.externalConnectors.externalGroupMember](../resources/externalconnectors-externalgroupmember.md)|Update the properties of an [externalGroupMember](../resources/externalconnectors-externalgroupmember.md) object.|
|[Delete externalGroupMember](../api/externalconnectors-externalgroupmember-delete.md)|None|Deletes an [externalGroupMember](../resources/externalconnectors-externalgroupmember.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/externalconnectors-entity.md).|
|identitySource|identitySourceType|**TODO: Add Description**. Possible values are: `azureActiveDirectory`, `external`, `unknownFutureValue`.|
|type|externalGroupMemberType|**TODO: Add Description**. Possible values are: `user`, `group`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.externalConnectors.externalGroupMember",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.externalConnectors.externalGroupMember",
  "id": "String (identifier)",
  "identitySource": "String",
  "type": "String"
}
```

