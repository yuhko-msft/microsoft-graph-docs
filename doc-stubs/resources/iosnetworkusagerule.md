---
title: "iosNetworkUsageRule resource type"
description: "Network Usage Rules allow enterprises to specify how managed apps use networks, such as cellular data networks."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosNetworkUsageRule resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Network Usage Rules allow enterprises to specify how managed apps use networks, such as cellular data networks.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|cellularDataBlocked|Boolean|If set to true, corresponding managed apps will not be allowed to use cellular data at any time.|
|cellularDataBlockWhenRoaming|Boolean|If set to true, corresponding managed apps will not be allowed to use cellular data when roaming.|
|managedApps|[appListItem](../resources/applistitem.md) collection|Information about the managed apps that this rule is going to apply to. This collection can contain a maximum of 500 elements.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosNetworkUsageRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosNetworkUsageRule",
  "cellularDataBlocked": "Boolean",
  "cellularDataBlockWhenRoaming": "Boolean",
  "managedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ]
}
```

