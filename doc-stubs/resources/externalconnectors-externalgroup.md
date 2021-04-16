---
title: "externalGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# externalGroup resource type

Namespace: microsoft.graph.externalConnectors



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List externalGroups](../api/externalgroup-list.md)|[externalGroup](../resources/externalconnectors-externalgroup.md) collection|Get a list of the [externalGroup](../resources/externalgroup.md) objects and their properties.|
|[Create externalGroup](../api/externalconnectors-externalgroup-create.md)|[externalGroup](../resources/externalconnectors-externalgroup.md)|Create a new [externalGroup](../resources/externalconnectors-externalgroup.md) object.|
|[Get externalGroup](../api/externalconnectors-externalgroup-get.md)|[externalGroup](../resources/externalconnectors-externalgroup.md)|Read the properties and relationships of an [externalGroup](../resources/externalconnectors-externalgroup.md) object.|
|[Update externalGroup](../api/externalconnectors-externalgroup-update.md)|[externalGroup](../resources/externalconnectors-externalgroup.md)|Update the properties of an [externalGroup](../resources/externalconnectors-externalgroup.md) object.|
|[Delete externalGroup](../api/externalconnectors-externalgroup-delete.md)|None|Deletes an [externalGroup](../resources/externalconnectors-externalgroup.md) object.|
|[List members](../api/externalconnectors-externalgroup-list-members.md)|[externalGroupMember](../resources/externalconnectors-externalgroupmember.md) collection|Get the externalGroupMember resources from the members navigation property.|
|[Create externalGroupMember](../api/externalconnectors-externalgroup-post-members.md)|[externalGroupMember](../resources/externalconnectors-externalgroupmember.md)|Create a new externalGroupMember object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/externalconnectors-entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|members|[externalGroupMember](../resources/externalconnectors-externalgroupmember.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.externalConnectors.externalGroup",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.externalConnectors.externalGroup",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String"
}
```

