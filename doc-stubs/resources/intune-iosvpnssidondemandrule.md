---
title: "iosVpnSsidOnDemandRule resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnSsidOnDemandRule resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVpnOnDemandRule](../resources/iosvpnondemandrule.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|vpnOnDemandRuleConnectionAction|**TODO: Add Description**. Possible values are: `connect`, `evaluateConnection`, `ignore`, `disconnect`.|
|probeUrl|String|**TODO: Add Description** Inherited from [iosVpnOnDemandRule](../resources/intune-iosvpnondemandrule.md)|
|ssiDs|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosVpnSsidOnDemandRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVpnSsidOnDemandRule",
  "probeUrl": "String",
  "action": "String",
  "ssiDs": [
    "String"
  ]
}
```

