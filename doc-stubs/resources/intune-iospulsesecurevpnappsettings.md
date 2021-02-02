---
title: "iosPulseSecureVpnAppSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosPulseSecureVpnAppSettings resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [iosVpnAppSettings](../resources/iosvpnappsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|associatedDomains|String collection|**TODO: Add Description** Inherited from [iosVpnAppSettings](../resources/intune-iosvpnappsettings.md)|
|excludedDomains|String collection|**TODO: Add Description** Inherited from [iosVpnAppSettings](../resources/intune-iosvpnappsettings.md)|
|providerType|iosVpnProviderType|**TODO: Add Description**. Possible values are: `appProxy`, `packetTunnel`.|
|safariDomains|String collection|**TODO: Add Description** Inherited from [iosVpnAppSettings](../resources/intune-iosvpnappsettings.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosPulseSecureVpnAppSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosPulseSecureVpnAppSettings",
  "safariDomains": [
    "String"
  ],
  "associatedDomains": [
    "String"
  ],
  "excludedDomains": [
    "String"
  ],
  "providerType": "String"
}
```

