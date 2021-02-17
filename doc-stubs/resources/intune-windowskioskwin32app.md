---
title: "windowsKioskWin32App resource type"
description: "KioskModeApp v4 for Win32 app support"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsKioskWin32App resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

KioskModeApp v4 for Win32 app support


Inherits from [windowsKioskAppBase](../resources/windowskioskappbase.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appType|windowsKioskAppType|The app type Inherited from [windowsKioskAppBase](../resources/intune-windowskioskappbase.md). Possible values are: `unknown`, `store`, `desktop`, `aumId`.|
|autoLaunch|Boolean|Allow the app to be auto-launched in multi-app kiosk mode Inherited from [windowsKioskAppBase](../resources/intune-windowskioskappbase.md)|
|classicAppPath|String|This is the classicapppath to be used by v4 Win32 app while in Kiosk Mode|
|edgeKiosk|String|Edge kiosk (url) for Edge kiosk mode|
|edgeKioskIdleTimeoutMinutes|Int32|Edge kiosk idle timeout in minutes for Edge kiosk mode. Valid values 0 to 1440|
|edgeKioskType|windowsEdgeKioskType|Edge kiosk type for Edge kiosk mode. Possible values are: `publicBrowsing`, `fullScreen`.|
|edgeNoFirstRun|Boolean|Edge first run flag for Edge kiosk mode|
|name|String|Represents the friendly name of an app Inherited from [windowsKioskAppBase](../resources/intune-windowskioskappbase.md)|
|startLayoutTileSize|windowsAppStartLayoutTileSize|The app tile size for the start layout Inherited from [windowsKioskAppBase](../resources/intune-windowskioskappbase.md). Possible values are: `hidden`, `small`, `medium`, `wide`, `large`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsKioskWin32App"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsKioskWin32App",
  "startLayoutTileSize": "String",
  "name": "String",
  "appType": "String",
  "autoLaunch": "Boolean",
  "classicAppPath": "String",
  "edgeNoFirstRun": "Boolean",
  "edgeKioskIdleTimeoutMinutes": "Integer",
  "edgeKioskType": "String",
  "edgeKiosk": "String"
}
```

