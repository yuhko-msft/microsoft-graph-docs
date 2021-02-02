---
title: "iosF5AccessVpnConnectionSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosF5AccessVpnConnectionSettings resource type

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
|shareManagedDeviceIdWithClient|Boolean|**TODO: Add Description**|
|vendorConfigData|[keyValuePair](../resources/synchronization-keyvaluepair.md) collection|**TODO: Add Description** Inherited from [iosVpnBasicConnectionSettings](../resources/intune-iosvpnbasicconnectionsettings.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosF5AccessVpnConnectionSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosF5AccessVpnConnectionSettings",
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
  "shareManagedDeviceIdWithClient": "Boolean"
}
```

