---
title: "macOSFirewallApplication resource type"
description: "Represents an app in the list of macOS firewall applications"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSFirewallApplication resource type

Namespace: microsoft.graph



Represents an app in the list of macOS firewall applications

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowsIncomingConnections|Boolean|Whether or not incoming connections are allowed.|
|bundleId|String|BundleId of the application.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOSFirewallApplication"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSFirewallApplication",
  "allowsIncomingConnections": "Boolean",
  "bundleId": "String"
}
```

