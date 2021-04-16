---
title: "vpnDnsRule resource type"
description: "VPN DNS Rule definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vpnDnsRule resource type

Namespace: microsoft.graph



VPN DNS Rule definition.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|autoTrigger|Boolean|Automatically connect to the VPN when the device connects to this domain: Default False.|
|name|String|Name.|
|persistent|Boolean|Keep this rule active even when the VPN is not connected: Default False|
|proxyServerUri|String|Proxy Server Uri.|
|servers|String collection|Servers.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.vpnDnsRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vpnDnsRule",
  "autoTrigger": "Boolean",
  "name": "String",
  "persistent": "Boolean",
  "proxyServerUri": "String",
  "servers": [
    "String"
  ]
}
```

