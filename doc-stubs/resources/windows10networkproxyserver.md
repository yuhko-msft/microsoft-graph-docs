---
title: "windows10NetworkProxyServer resource type"
description: "Network Proxy Server Policy."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10NetworkProxyServer resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Network Proxy Server Policy.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|String|Address to the proxy server. Specify an address in |
|exceptions|String collection|Addresses that should not use the proxy server. The system will not use the proxy server for addresses beginning with what is specified in this node.|
|useForLocalAddresses|Boolean|Specifies whether the proxy server should be used for local (intranet) addresses.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windows10NetworkProxyServer"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10NetworkProxyServer",
  "address": "String",
  "exceptions": [
    "String"
  ],
  "useForLocalAddresses": "Boolean"
}
```

