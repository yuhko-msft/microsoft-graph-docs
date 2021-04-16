---
title: "userExperienceAnalyticsAutopilotDevicesSummary resource type"
description: "The user experience analytics summary of Devices not windows autopilot ready."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAutopilotDevicesSummary resource type

Namespace: microsoft.graph



The user experience analytics summary of Devices not windows autopilot ready.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|devicesNotAutopilotRegistered|Int32|The count of intune devices that are not autopilot registerd.|
|devicesWithoutAutopilotProfileAssigned|Int32|The count of intune devices not autopilot profile assigned.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAutopilotDevicesSummary"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAutopilotDevicesSummary",
  "devicesNotAutopilotRegistered": "Integer",
  "devicesWithoutAutopilotProfileAssigned": "Integer"
}
```

