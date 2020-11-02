---
title: "scopedRoleMembership resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# scopedRoleMembership resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List scopedRoleMemberships](../api/administrativeunit-list-scopedrolemembers.md)|[scopedRoleMembership](../resources/scopedrolemembership.md) collection|Get the scopedRoleMembership resources from the scopedRoleMembers navigation property.|
|[Create scopedRoleMembership](../api/administrativeunit-post-scopedrolemembers.md)|[scopedRoleMembership](../resources/scopedrolemembership.md)|Create a new scopedRoleMembership object.|
|[Update scopedRoleMembership](../api/administrativeunit-update-scopedrolemembers.md)|[scopedRoleMembership](../resources/scopedrolemembership.md)|Update the properties of a scopedRoleMembers object.|
|[Get scopedRoleMembership](../api/administrativeunit-get-scopedrolemembership.md)|[scopedRoleMembership](../resources/scopedrolemembership.md)|Read the properties and relationships of a [scopedRoleMembership](../resources/scopedrolemembership.md) object.|
|[Delete scopedRoleMembership](../api/administrativeunit-delete-scopedrolemembers.md)|None|Delete a [scopedRoleMembership](../resources/scopedrolemembership.md) object.|
|[List scopedRoleMemberships](../api/scopedrolemembership-list.md)|[scopedRoleMembership](../resources/scopedrolemembership.md) collection|Get a list of the [scopedRoleMembership](../resources/scopedrolemembership.md) objects and their properties.|
|[Create scopedRoleMembership](../api/scopedrolemembership-post-scopedrolememberships.md)|[scopedRoleMembership](../resources/scopedrolemembership.md)|Create a new [scopedRoleMembership](../resources/scopedrolemembership.md) object.|
|[Get scopedRoleMembership](../api/scopedrolemembership-get.md)|[scopedRoleMembership](../resources/scopedrolemembership.md)|Read the properties and relationships of a [scopedRoleMembership](../resources/scopedrolemembership.md) object.|
|[Update scopedRoleMembership](../api/scopedrolemembership-update.md)|[scopedRoleMembership](../resources/scopedrolemembership.md)|Update the properties of a [scopedRoleMembership](../resources/scopedrolemembership.md) object.|
|[Delete scopedRoleMembership](../api/scopedrolemembership-delete.md)|None|Deletes a [scopedRoleMembership](../resources/scopedrolemembership.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|administrativeUnitId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|roleId|String|**TODO: Add Description**|
|roleMemberInfo|[identity](../resources/identity.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.scopedRoleMembership",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.scopedRoleMembership",
  "id": "String (identifier)",
  "roleId": "String",
  "administrativeUnitId": "String",
  "roleMemberInfo": {
    "@odata.type": "microsoft.graph.identity"
  }
}
```

