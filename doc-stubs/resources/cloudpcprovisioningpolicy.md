---
title: "cloudPcProvisioningPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPcProvisioningPolicy resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPcProvisioningPolicies](../api/cloudpcprovisioningpolicy-list.md)|[cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) collection|Get a list of the [cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) objects and their properties.|
|[Create cloudPcProvisioningPolicy](../api/cloudpcprovisioningpolicy-create.md)|[cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md)|Create a new [cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) object.|
|[Get cloudPcProvisioningPolicy](../api/cloudpcprovisioningpolicy-get.md)|[cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md)|Read the properties and relationships of a [cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) object.|
|[Update cloudPcProvisioningPolicy](../api/cloudpcprovisioningpolicy-update.md)|[cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md)|Update the properties of a [cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) object.|
|[Delete cloudPcProvisioningPolicy](../api/cloudpcprovisioningpolicy-delete.md)|None|Deletes a [cloudPcProvisioningPolicy](../resources/cloudpcprovisioningpolicy.md) object.|
|[assign](../api/cloudpcprovisioningpolicy-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/cloudpcprovisioningpolicy-list-assignments.md)|[cloudPcProvisioningPolicyAssignment](../resources/cloudpcprovisioningpolicyassignment.md) collection|Get the cloudPcProvisioningPolicyAssignment resources from the assignments navigation property.|
|[Create cloudPcProvisioningPolicyAssignment](../api/cloudpcprovisioningpolicy-post-assignments.md)|[cloudPcProvisioningPolicyAssignment](../resources/cloudpcprovisioningpolicyassignment.md)|Create a new cloudPcProvisioningPolicyAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|imageDisplayName|String|**TODO: Add Description**|
|imageId|String|**TODO: Add Description**|
|imageType|cloudPcProvisioningPolicyImageType|**TODO: Add Description**. Possible values are: `gallery`, `custom`.|
|onPremisesConnectionId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[cloudPcProvisioningPolicyAssignment](../resources/cloudpcprovisioningpolicyassignment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPcProvisioningPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcProvisioningPolicy",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "imageDisplayName": "String",
  "imageId": "String",
  "imageType": "String",
  "onPremisesConnectionId": "String"
}
```

