---
title: "windowsAutopilotSettings resource type"
description: "The windowsAutopilotSettings resource represents a Windows Autopilot Account to sync data with Windows device data sync service."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsAutopilotSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The windowsAutopilotSettings resource represents a Windows Autopilot Account to sync data with Windows device data sync service.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsAutopilotSettings](../api/windowsautopilotsettings-list.md)|[windowsAutopilotSettings](../resources/windowsautopilotsettings.md) collection|Get a list of the [windowsAutopilotSettings](../resources/windowsautopilotsettings.md) objects and their properties.|
|[Create windowsAutopilotSettings](../api/windowsautopilotsettings-create.md)|[windowsAutopilotSettings](../resources/windowsautopilotsettings.md)|Create a new [windowsAutopilotSettings](../resources/windowsautopilotsettings.md) object.|
|[Get windowsAutopilotSettings](../api/windowsautopilotsettings-get.md)|[windowsAutopilotSettings](../resources/windowsautopilotsettings.md)|Read the properties and relationships of a [windowsAutopilotSettings](../resources/windowsautopilotsettings.md) object.|
|[Update windowsAutopilotSettings](../api/windowsautopilotsettings-update.md)|[windowsAutopilotSettings](../resources/windowsautopilotsettings.md)|Update the properties of a [windowsAutopilotSettings](../resources/windowsautopilotsettings.md) object.|
|[Delete windowsAutopilotSettings](../api/windowsautopilotsettings-delete.md)|None|Deletes a [windowsAutopilotSettings](../resources/windowsautopilotsettings.md) object.|
|[sync](../api/windowsautopilotsettings-sync.md)|None|Initiates a sync of all AutoPilot registered devices from Store for Business and other portals. If the sync successful, this action returns a 204 No Content response code. If a sync is already in progress, the action returns a 409 Conflict response code. If this sync action is called within 10 minutes of the previous sync, the action returns a 429 Too Many Requests response code.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastManualSyncTriggerDateTime|DateTimeOffset|Last data sync date time with DDS service.|
|lastSyncDateTime|DateTimeOffset|Last data sync date time with DDS service.|
|syncStatus|windowsAutopilotSyncStatus|Indicates the status of sync with Device data sync (DDS) service. Possible values are: `unknown`, `inProgress`, `completed`, `failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsAutopilotSettings",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsAutopilotSettings",
  "id": "String (identifier)",
  "lastManualSyncTriggerDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "syncStatus": "String"
}
```

