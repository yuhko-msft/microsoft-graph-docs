---
title: "vpnServer resource type"
description: "VPN Server definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vpnServer resource type

Namespace: microsoft.graph



VPN Server definition.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|String|Address (IP address, FQDN or URL)|
|description|String|Description.|
|isDefaultServer|Boolean|Default server.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.vpnServer"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vpnServer",
  "address": "String",
  "description": "String",
  "isDefaultServer": "Boolean"
}
```

