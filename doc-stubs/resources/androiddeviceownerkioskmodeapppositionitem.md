---
title: "androidDeviceOwnerKioskModeAppPositionItem resource type"
description: "An item in the list of app positions that sets the order of items on the Managed Home Screen"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceOwnerKioskModeAppPositionItem resource type

Namespace: microsoft.graph



An item in the list of app positions that sets the order of items on the Managed Home Screen

## Properties
|Property|Type|Description|
|:---|:---|:---|
|item|[androidDeviceOwnerKioskModeHomeScreenItem](../resources/androiddeviceownerkioskmodehomescreenitem.md)|Item to be arranged|
|position|Int32|Position of the item on the grid. Valid values 0 to 9999999|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeAppPositionItem"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerKioskModeAppPositionItem",
  "item": {
    "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeHomeScreenItem"
  },
  "position": "Integer"
}
```

