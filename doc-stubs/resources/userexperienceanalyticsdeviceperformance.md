---
title: "userExperienceAnalyticsDevicePerformance resource type"
description: "The user experience analytics device performance entity contains device boot performance details."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDevicePerformance resource type

Namespace: microsoft.graph



The user experience analytics device performance entity contains device boot performance details.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDevicePerformances](../api/userexperienceanalyticsdeviceperformance-list.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) collection|Get a list of the [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsDevicePerformance](../api/userexperienceanalyticsdeviceperformance-create.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md)|Create a new [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) object.|
|[Get userExperienceAnalyticsDevicePerformance](../api/userexperienceanalyticsdeviceperformance-get.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) object.|
|[Update userExperienceAnalyticsDevicePerformance](../api/userexperienceanalyticsdeviceperformance-update.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md)|Update the properties of a [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) object.|
|[Delete userExperienceAnalyticsDevicePerformance](../api/userexperienceanalyticsdeviceperformance-delete.md)|None|Deletes a [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) object.|
|[summarizeDevicePerformanceDevices](../api/userexperienceanalyticsdeviceperformance-summarizedeviceperformancedevices.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|averageBlueScreens|Double|Average (mean) number of Blue Screens per device in the last 14 days. Valid values 0 to 9999999|
|averageRestarts|Double|Average (mean) number of Restarts per device in the last 14 days. Valid values 0 to 9999999|
|blueScreenCount|Int32|Number of Blue Screens in the last 14 days. Valid values 0 to 9999999|
|bootScore|Int32|The user experience analytics device boot score.|
|coreBootTimeInMs|Int32|The user experience analytics device core boot time in milliseconds.|
|coreLoginTimeInMs|Int32|The user experience analytics device core login time in milliseconds.|
|deviceCount|Int64|User experience analytics summarized device count.|
|deviceName|String|The user experience analytics device name.|
|diskType|diskType|The user experience analytics device disk type. Possible values are: `unkown`, `hdd`, `ssd`.|
|groupPolicyBootTimeInMs|Int32|The user experience analytics device group policy boot time in milliseconds.|
|groupPolicyLoginTimeInMs|Int32|The user experience analytics device group policy login time in milliseconds.|
|healthStatus|userExperienceAnalyticsHealthState|The health state of the user experience analytics device. Possible values are: `unknown`, `insufficientData`, `needsAttention`, `meetingGoals`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|loginScore|Int32|The user experience analytics device login score.|
|manufacturer|String|The user experience analytics device manufacturer.|
|model|String|The user experience analytics device model.|
|operatingSystemVersion|String|The user experience analytics device Operating System version.|
|responsiveDesktopTimeInMs|Int32|The user experience analytics responsive desktop time in milliseconds.|
|restartCount|Int32|Number of Restarts in the last 14 days. Valid values 0 to 9999999|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDevicePerformance",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDevicePerformance",
  "id": "String (identifier)",
  "averageBlueScreens": "Double",
  "averageRestarts": "Double",
  "blueScreenCount": "Integer",
  "bootScore": "Integer",
  "coreBootTimeInMs": "Integer",
  "coreLoginTimeInMs": "Integer",
  "deviceCount": "Integer",
  "deviceName": "String",
  "diskType": "String",
  "groupPolicyBootTimeInMs": "Integer",
  "groupPolicyLoginTimeInMs": "Integer",
  "healthStatus": "String",
  "loginScore": "Integer",
  "manufacturer": "String",
  "model": "String",
  "operatingSystemVersion": "String",
  "responsiveDesktopTimeInMs": "Integer",
  "restartCount": "Integer"
}
```

