---
title: "identitySecurityDefaultsEnforcementPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# identitySecurityDefaultsEnforcementPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [policyBase](../resources/policybase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List identitySecurityDefaultsEnforcementPolicies](../api/identitysecuritydefaultsenforcementpolicy-list.md)|[identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md) collection|Get a list of the [identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md) objects and their properties.|
|[Create identitySecurityDefaultsEnforcementPolicy](../api/policyroot-post-identitysecuritydefaultsenforcementpolicy.md)|[identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md)|Create a new [identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md) object.|
|[Get identitySecurityDefaultsEnforcementPolicy](../api/identitysecuritydefaultsenforcementpolicy-get.md)|[identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md)|Read the properties and relationships of an [identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md) object.|
|[Update identitySecurityDefaultsEnforcementPolicy](../api/identitysecuritydefaultsenforcementpolicy-update.md)|[identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md)|Update the properties of an [identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md) object.|
|[Delete identitySecurityDefaultsEnforcementPolicy](../api/identitysecuritydefaultsenforcementpolicy-delete.md)|None|Deletes an [identitySecurityDefaultsEnforcementPolicy](../resources/identitysecuritydefaultsenforcementpolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|isEnabled|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.identitySecurityDefaultsEnforcementPolicy",
  "baseType": "Microsoft.IdentityProtectionServices.policyBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.identitySecurityDefaultsEnforcementPolicy",
  "isEnabled": "Boolean"
}
```

