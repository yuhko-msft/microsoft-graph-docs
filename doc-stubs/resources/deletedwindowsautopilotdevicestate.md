---
title: "deletedWindowsAutopilotDeviceState resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deletedWindowsAutopilotDeviceState resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deletionState|windowsAutopilotDeviceDeletionState|Device deletion state. Possible values are: `unknown`, `failed`, `accepted`, `error`.|
|deviceRegistrationId|String|ZTD Device Registration ID .|
|errorMessage|String|Device deletion error message.|
|serialNumber|String|Autopilot Device Serial Number|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deletedWindowsAutopilotDeviceState"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deletedWindowsAutopilotDeviceState",
  "deletionState": "String",
  "deviceRegistrationId": "String",
  "errorMessage": "String",
  "serialNumber": "String"
}
```

