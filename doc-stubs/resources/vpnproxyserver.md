---
title: "vpnProxyServer resource type"
description: "VPN Proxy Server."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vpnProxyServer resource type

Namespace: microsoft.graph



VPN Proxy Server.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|String|Address.|
|automaticConfigurationScriptUrl|String|Proxy's automatic configuration script url.|
|port|Int32|Port. Valid values 0 to 65535|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.vpnProxyServer"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vpnProxyServer",
  "address": "String",
  "automaticConfigurationScriptUrl": "String",
  "port": "Integer"
}
```

