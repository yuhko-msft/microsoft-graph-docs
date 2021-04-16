---
title: "userExperienceAnalyticsWorkFromAnywhereDevicesSummary resource type"
description: "The user experience analytics Work From Anywhere metrics devices summary."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereDevicesSummary resource type

Namespace: microsoft.graph



The user experience analytics Work From Anywhere metrics devices summary.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|autopilotDevicesSummary|[userExperienceAnalyticsAutopilotDevicesSummary](../resources/userexperienceanalyticsautopilotdevicessummary.md)|The value of work from anywhere autopilot devices summary.|
|cloudManagementDevicesSummary|[userExperienceAnalyticsCloudManagementDevicesSummary](../resources/userexperienceanalyticscloudmanagementdevicessummary.md)|The user experience work from anywhere Cloud management devices summary.|
|windows10DevicesSummary|[userExperienceAnalyticsWindows10DevicesSummary](../resources/userexperienceanalyticswindows10devicessummary.md)|The user experience analytics work from anywhere Windows 10 devices summary.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevicesSummary"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevicesSummary",
  "autopilotDevicesSummary": {
    "@odata.type": "microsoft.graph.userExperienceAnalyticsAutopilotDevicesSummary"
  },
  "cloudManagementDevicesSummary": {
    "@odata.type": "microsoft.graph.userExperienceAnalyticsCloudManagementDevicesSummary"
  },
  "windows10DevicesSummary": {
    "@odata.type": "microsoft.graph.userExperienceAnalyticsWindows10DevicesSummary"
  }
}
```

