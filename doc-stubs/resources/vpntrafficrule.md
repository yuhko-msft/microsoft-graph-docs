---
title: "vpnTrafficRule resource type"
description: "VPN Traffic Rule definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vpnTrafficRule resource type

Namespace: microsoft.graph



VPN Traffic Rule definition.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appId|String|App identifier, if this traffic rule is triggered by an app.|
|appType|vpnTrafficRuleAppType|App type, if this traffic rule is triggered by an app. Possible values are: `none`, `desktop`, `universal`.|
|claims|String|Claims associated with this traffic rule.|
|localAddressRanges|[iPv4Range](../resources/ipv4range.md) collection|Local address range. This collection can contain a maximum of 500 elements.|
|localPortRanges|[numberRange](../resources/numberrange.md) collection|Local port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.|
|name|String|Name.|
|protocols|Int32|Protocols (0-255). Valid values 0 to 255|
|remoteAddressRanges|[iPv4Range](../resources/ipv4range.md) collection|Remote address range. This collection can contain a maximum of 500 elements.|
|remotePortRanges|[numberRange](../resources/numberrange.md) collection|Remote port range can be set only when protocol is either TCP or UDP (6 or 17). This collection can contain a maximum of 500 elements.|
|routingPolicyType|vpnTrafficRuleRoutingPolicyType|When app triggered, indicates whether to enable split tunneling along this route. Possible values are: `none`, `splitTunnel`, `forceTunnel`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.vpnTrafficRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vpnTrafficRule",
  "appId": "String",
  "appType": "String",
  "claims": "String",
  "localAddressRanges": [
    {
      "@odata.type": "microsoft.graph.iPv4Range"
    }
  ],
  "localPortRanges": [
    {
      "@odata.type": "microsoft.graph.numberRange"
    }
  ],
  "name": "String",
  "protocols": "Integer",
  "remoteAddressRanges": [
    {
      "@odata.type": "microsoft.graph.iPv4Range"
    }
  ],
  "remotePortRanges": [
    {
      "@odata.type": "microsoft.graph.numberRange"
    }
  ],
  "routingPolicyType": "String"
}
```

