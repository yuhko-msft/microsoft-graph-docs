---
title: "iosCustomVpnConnectionSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosCustomVpnConnectionSettings resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVpnBasicConnectionSettings](../resources/iosvpnbasicconnectionsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|[resourceAccessAuthenticationMethod](../resources/intune-resourceaccessauthenticationmethod.md)|**TODO: Add Description** Inherited from [iosVpnBasicConnectionSettings](../resources/intune-iosvpnbasicconnectionsettings.md)|
|disableOnDemandUserOverride|Boolean|**TODO: Add Description** Inherited from [iosVpnBasicConnectionSettings](../resources/intune-iosvpnbasicconnectionsettings.md)|
|enableSplitTunneling|Boolean|**TODO: Add Description** Inherited from [iosVpnBasicConnectionSettings](../resources/intune-iosvpnbasicconnectionsettings.md)|
|onDemandRules|[iosVpnOnDemandRule](../resources/intune-iosvpnondemandrule.md) collection|**TODO: Add Description** Inherited from [iosVpnBasicConnectionSettings](../resources/intune-iosvpnbasicconnectionsettings.md)|
|remoteAddress|String|**TODO: Add Description** Inherited from [iosVpnBasicConnectionSettings](../resources/intune-iosvpnbasicconnectionsettings.md)|
|vendorConfigData|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [iosVpnBasicConnectionSettings](../resources/intune-iosvpnbasicconnectionsettings.md)|
|vpnSubType|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosCustomVpnConnectionSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosCustomVpnConnectionSettings",
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
  ],
  "vpnSubType": "String"
}
```

