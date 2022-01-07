---
title: "policyRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# policyRoot resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List policyRoots](../api/policyroot-list.md)|[policyRoot](../resources/policyroot.md) collection|Get a list of the [policyRoot](../resources/policyroot.md) objects and their properties.|
|[Get policyRoot](../api/policyroot-get.md)|[policyRoot](../resources/policyroot.md)|Read the properties and relationships of a [policyRoot](../resources/policyroot.md) object.|
|[Update policyRoot](../api/policyroot-update.md)|[policyRoot](../resources/policyroot.md)|Update the properties of a [policyRoot](../resources/policyroot.md) object.|
|[Delete policyRoot](../api/policyroot-delete.md)|None|Deletes a [policyRoot](../resources/policyroot.md) object.|
|[List conditionalAccessPolicies](../api/policyroot-list-conditionalaccesspolicies.md)|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) collection|Get the conditionalAccessPolicy resources from the conditionalAccessPolicies navigation property.|
|[Create conditionalAccessPolicy](../api/policyroot-post-conditionalaccesspolicies.md)|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md)|Create a new conditionalAccessPolicy object.|
|[List identitySecurityDefaultsEnforcementPolicy](../api/policyroot-list-identitysecuritydefaultsenforcementpolicy.md)|[identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md) collection|Get the identitySecurityDefaultsEnforcementPolicy resources from the identitySecurityDefaultsEnforcementPolicy navigation property.|
|[Create identitySecurityDefaultsEnforcementPolicy](../api/policyroot-post-identitysecuritydefaultsenforcementpolicy.md)|[identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md)|Create a new identitySecurityDefaultsEnforcementPolicy object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|conditionalAccessPolicies|[conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) collection|**TODO: Add Description**|
|identitySecurityDefaultsEnforcementPolicy|[identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policyRoot",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.policyRoot"
}
```

