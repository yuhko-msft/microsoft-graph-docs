---
title: "schedulingGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# schedulingGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [changeTrackedEntity](../resources/changetrackedentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List schedulingGroups](../api/schedulinggroup-list.md)|[schedulingGroup](../resources/schedulinggroup.md) collection|Get a list of the [schedulingGroup](../resources/schedulinggroup.md) objects and their properties.|
|[Create schedulingGroup](../api/schedulinggroup-create.md)|[schedulingGroup](../resources/schedulinggroup.md)|Create a new [schedulingGroup](../resources/schedulinggroup.md) object.|
|[Get schedulingGroup](../api/schedulinggroup-get.md)|[schedulingGroup](../resources/schedulinggroup.md)|Read the properties and relationships of a [schedulingGroup](../resources/schedulinggroup.md) object.|
|[Update schedulingGroup](../api/schedulinggroup-update.md)|[schedulingGroup](../resources/schedulinggroup.md)|Update the properties of a [schedulingGroup](../resources/schedulinggroup.md) object.|
|[Delete schedulingGroup](../api/schedulinggroup-delete.md)|None|Deletes a [schedulingGroup](../resources/schedulinggroup.md) object.|
|[stageForDeletion](../api/schedulinggroup-stagefordeletion.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|isActive|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md).|
|userIds|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.schedulingGroup",
  "baseType": "Microsoft.Teams.Shifts.changeTrackedEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.schedulingGroup",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "isActive": "Boolean",
  "userIds": [
    "String"
  ]
}
```

