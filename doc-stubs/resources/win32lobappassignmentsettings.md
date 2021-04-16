---
title: "win32LobAppAssignmentSettings resource type"
description: "Contains properties used to assign an Win32 LOB mobile app to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppAssignmentSettings resource type

Namespace: microsoft.graph



Contains properties used to assign an Win32 LOB mobile app to a group.


Inherits from [mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deliveryOptimizationPriority|win32LobAppDeliveryOptimizationPriority|The delivery optimization priority for this app assignment. This setting is not supported in National Cloud environments. Possible values are: `notConfigured`, `foreground`.|
|installTimeSettings|[mobileAppInstallTimeSettings](../resources/mobileappinstalltimesettings.md)|The install time settings to apply for this app assignment.|
|notifications|win32LobAppNotification|The notification status for this app assignment. Possible values are: `showAll`, `showReboot`, `hideAll`.|
|restartSettings|[win32LobAppRestartSettings](../resources/win32lobapprestartsettings.md)|The reboot settings to apply for this app assignment.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppAssignmentSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppAssignmentSettings",
  "deliveryOptimizationPriority": "String",
  "installTimeSettings": {
    "@odata.type": "microsoft.graph.mobileAppInstallTimeSettings"
  },
  "notifications": "String",
  "restartSettings": {
    "@odata.type": "microsoft.graph.win32LobAppRestartSettings"
  }
}
```

