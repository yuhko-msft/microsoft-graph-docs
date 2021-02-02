---
title: "iosVpnDomainOnDemandRule resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnDomainOnDemandRule resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVpnOnDemandRule](../resources/iosvpnondemandrule.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|vpnOnDemandRuleConnectionAction|**TODO: Add Description**. Possible values are: `connect`, `evaluateConnection`, `ignore`, `disconnect`.|
|domains|String collection|**TODO: Add Description**|
|probeUrl|String|**TODO: Add Description** Inherited from [iosVpnOnDemandRule](../resources/intune-iosvpnondemandrule.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosVpnDomainOnDemandRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVpnDomainOnDemandRule",
  "probeUrl": "String",
  "action": "String",
  "domains": [
    "String"
  ]
}
```

