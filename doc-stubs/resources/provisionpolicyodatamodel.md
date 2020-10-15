---
title: "ProvisionPolicyODataModel resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# ProvisionPolicyODataModel resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List ProvisionPolicyODataModels](../api/provisionpolicyodatamodel-list.md)|[ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) collection|Get a list of the [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) objects and their properties.|
|[Create ProvisionPolicyODataModel](../api/provisionpolicyodatamodel-post-provisioningpolicies.md)|[ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md)|Create a new [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) object.|
|[Get ProvisionPolicyODataModel](../api/provisionpolicyodatamodel-get.md)|[ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md)|Read the properties and relationships of a [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) object.|
|[Update ProvisionPolicyODataModel](../api/provisionpolicyodatamodel-update.md)|[ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md)|Update the properties of a [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) object.|
|[Delete ProvisionPolicyODataModel](../api/provisionpolicyodatamodel-delete.md)|None|Deletes a [ProvisionPolicyODataModel](../resources/provisionpolicyodatamodel.md) object.|
|[List assignments](../api/provisionpolicyodatamodel-list-assignments.md)|[ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) collection|Get the ProvisionPolicyAssignmentItem resources from the assignments navigation property.|
|[Add assignments](../api/provisionpolicyodatamodel-post-assignments.md)|[ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md)|Add assignments by posting to the assignments collection.|
|[Remove assignments](../api/provisionpolicyodatamodel-delete-assignments.md)|None|Remove a [ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) object.|
|[List image](../api/provisionpolicyodatamodel-list-image.md)|[OsImage](../resources/osimage.md) collection|Get the OsImage resources from the image navigation property.|
|[Add image](../api/provisionpolicyodatamodel-post-image.md)|[OsImage](../resources/osimage.md)|Add image by posting to the image collection.|
|[Remove image](../api/provisionpolicyodatamodel-delete-image.md)|None|Remove an [OsImage](../resources/osimage.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|onPremisesConnectionId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[ProvisionPolicyAssignmentItem](../resources/provisionpolicyassignmentitem.md) collection|**TODO: Add Description**|
|image|[OsImage](../resources/osimage.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ProvisionPolicyODataModel",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ProvisionPolicyODataModel",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "onPremisesConnectionId": "String"
}
```

