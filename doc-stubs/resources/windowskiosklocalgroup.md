---
title: "windowsKioskLocalGroup resource type"
description: "The class used to identify a local group for the kiosk configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsKioskLocalGroup resource type

Namespace: microsoft.graph



The class used to identify a local group for the kiosk configuration


Inherits from [windowsKioskUser](../resources/windowskioskuser.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|groupName|String|The name of the local group that will be locked to this kiosk configuration|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsKioskLocalGroup"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsKioskLocalGroup",
  "groupName": "String"
}
```

