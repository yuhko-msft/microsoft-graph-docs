---
title: "win32LobAppRestartSettings resource type"
description: "Contains properties describing restart coordination following an app installation."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppRestartSettings resource type

Namespace: microsoft.graph

Contains properties describing restart coordination following an app installation.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|countdownDisplayBeforeRestartInMinutes|Int32|The number of minutes before the restart time to display the countdown dialog for pending restarts.|
|gracePeriodInMinutes|Int32|The number of minutes to wait before restarting the device after an app installation.|
|restartNotificationSnoozeDurationInMinutes|Int32|The number of minutes to snooze the restart notification dialog when the snooze button is selected.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppRestartSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppRestartSettings",
  "gracePeriodInMinutes": "Integer",
  "countdownDisplayBeforeRestartInMinutes": "Integer",
  "restartNotificationSnoozeDurationInMinutes": "Integer"
}
```

