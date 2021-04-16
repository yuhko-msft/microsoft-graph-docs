---
title: "windowsKioskLocalUser resource type"
description: "The class used to identify a local account for the kiosk configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsKioskLocalUser resource type

Namespace: microsoft.graph



The class used to identify a local account for the kiosk configuration


Inherits from [windowsKioskUser](../resources/windowskioskuser.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|userName|String|The local user that will be locked to this kiosk configuration|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsKioskLocalUser"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsKioskLocalUser",
  "userName": "String"
}
```

