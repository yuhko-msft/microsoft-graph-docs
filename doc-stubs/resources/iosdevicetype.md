---
title: "iosDeviceType resource type"
description: "Contains properties of the possible iOS device types the mobile app can run on."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosDeviceType resource type

Namespace: microsoft.graph

Contains properties of the possible iOS device types the mobile app can run on.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|iPad|Boolean|Whether the app should run on iPads.|
|iPhoneAndIPod|Boolean|Whether the app should run on iPhones and iPods.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosDeviceType"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosDeviceType",
  "iPad": "Boolean",
  "iPhoneAndIPod": "Boolean"
}
```

