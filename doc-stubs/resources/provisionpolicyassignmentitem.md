---
title: "ProvisionPolicyAssignmentItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# ProvisionPolicyAssignmentItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List ProvisionPolicyAssignmentItems](../api/provisionpolicyassignmentitem-list.md)|[ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) collection|Get a list of the [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) objects and their properties.|
|[Create ProvisionPolicyAssignmentItem](../api/provisionpolicyassignmentitem-create.md)|[ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md)|Create a new [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) object.|
|[Get ProvisionPolicyAssignmentItem](../api/provisionpolicyassignmentitem-get.md)|[ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md)|Read the properties and relationships of a [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) object.|
|[Update ProvisionPolicyAssignmentItem](../api/provisionpolicyassignmentitem-update.md)|[ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md)|Update the properties of a [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) object.|
|[Delete ProvisionPolicyAssignmentItem](../api/provisionpolicyassignmentitem-delete.md)|None|Deletes a [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|groupId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ProvisionPolicyAssignmentItem",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ProvisionPolicyAssignmentItem",
  "id": "String (identifier)",
  "groupId": "String"
}
```

