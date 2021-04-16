---
title: "specifiedCaptiveNetworkPlugins resource type"
description: "Specifies all the Captive network plugins allowed during the IKEv2 AlwaysOn VPN connection"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# specifiedCaptiveNetworkPlugins resource type

Namespace: microsoft.graph



Specifies all the Captive network plugins allowed during the IKEv2 AlwaysOn VPN connection

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedBundleIdentifiers|String collection|Address of the IKEv2 server. Must be a FQDN, UserFQDN, network address, or ASN1DN|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.specifiedCaptiveNetworkPlugins"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.specifiedCaptiveNetworkPlugins",
  "allowedBundleIdentifiers": [
    "String"
  ]
}
```

