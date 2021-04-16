---
title: "windowsKioskSingleWin32App resource type"
description: "The class used to identify the single app configuration for the kiosk win32 configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsKioskSingleWin32App resource type

Namespace: microsoft.graph



The class used to identify the single app configuration for the kiosk win32 configuration


Inherits from [windowsKioskAppConfiguration](../resources/windowskioskappconfiguration.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|win32App|[windowsKioskWin32App](../resources/windowskioskwin32app.md)|This is the win32 app that will be available to launch use while in Kiosk Mode|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsKioskSingleWin32App"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsKioskSingleWin32App",
  "win32App": {
    "@odata.type": "microsoft.graph.windowsKioskWin32App"
  }
}
```

