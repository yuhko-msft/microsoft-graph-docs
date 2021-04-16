---
title: "teamworkTag resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkTag resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamworkTags](../api/teamworktag-list.md)|[teamworkTag](../resources/teamworktag.md) collection|Get a list of the [teamworkTag](../resources/teamworktag.md) objects and their properties.|
|[Create teamworkTag](../api/teamworktag-create.md)|[teamworkTag](../resources/teamworktag.md)|Create a new [teamworkTag](../resources/teamworktag.md) object.|
|[Get teamworkTag](../api/teamworktag-get.md)|[teamworkTag](../resources/teamworktag.md)|Read the properties and relationships of a [teamworkTag](../resources/teamworktag.md) object.|
|[Update teamworkTag](../api/teamworktag-update.md)|[teamworkTag](../resources/teamworktag.md)|Update the properties of a [teamworkTag](../resources/teamworktag.md) object.|
|[Delete teamworkTag](../api/teamworktag-delete.md)|None|Deletes a [teamworkTag](../resources/teamworktag.md) object.|
|[List members](../api/teamworktag-list-members.md)|[teamworkTagMember](../resources/teamworktagmember.md) collection|Get the teamworkTagMember resources from the members navigation property.|
|[Create teamworkTagMember](../api/teamworktag-post-members.md)|[teamworkTagMember](../resources/teamworktagmember.md)|Create a new teamworkTagMember object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|memberCount|Int32|**TODO: Add Description**|
|tagType|teamworkTagType|**TODO: Add Description**. Possible values are: `standard`.|
|teamId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|members|[teamworkTagMember](../resources/teamworktagmember.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamworkTag",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkTag",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "memberCount": "Integer",
  "tagType": "String",
  "teamId": "String"
}
```

