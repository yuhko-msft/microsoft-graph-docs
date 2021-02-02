---
title: "iosVpnBasicConnectionSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnBasicConnectionSettings resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVpnConnectionSettings](../resources/iosvpnconnectionsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|[resourceAccessAuthenticationMethod](../resources/intune-resourceaccessauthenticationmethod.md)|**TODO: Add Description**|
|disableOnDemandUserOverride|Boolean|**TODO: Add Description**|
|enableSplitTunneling|Boolean|**TODO: Add Description**|
|onDemandRules|[iosVpnOnDemandRule](../resources/intune-iosvpnondemandrule.md) collection|**TODO: Add Description**|
|remoteAddress|String|**TODO: Add Description**|
|vendorConfigData|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosVpnBasicConnectionSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVpnBasicConnectionSettings",
  "authenticationMethod": {
    "@odata.type": "microsoft.graph.resourceAccessAuthenticationMethod"
  },
  "disableOnDemandUserOverride": "Boolean",
  "enableSplitTunneling": "Boolean",
  "onDemandRules": [
    {
      "@odata.type": "microsoft.graph.iosVpnSsidOnDemandRule"
    }
  ],
  "remoteAddress": "String",
  "vendorConfigData": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ]
}
```

