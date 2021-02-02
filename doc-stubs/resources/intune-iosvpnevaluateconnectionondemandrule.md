---
title: "iosVpnEvaluateConnectionOnDemandRule resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnEvaluateConnectionOnDemandRule resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVpnOnDemandRule](../resources/iosvpnondemandrule.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dnsServerAddresses|String collection|**TODO: Add Description**|
|domainAction|vpnOnDemandRuleConnectionDomainAction|**TODO: Add Description**. Possible values are: `connectIfNeeded`, `neverConnect`.|
|domains|String collection|**TODO: Add Description**|
|probeUrl|String|**TODO: Add Description** Inherited from [iosVpnOnDemandRule](../resources/intune-iosvpnondemandrule.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosVpnEvaluateConnectionOnDemandRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVpnEvaluateConnectionOnDemandRule",
  "probeUrl": "String",
  "domainAction": "String",
  "domains": [
    "String"
  ],
  "dnsServerAddresses": [
    "String"
  ]
}
```

