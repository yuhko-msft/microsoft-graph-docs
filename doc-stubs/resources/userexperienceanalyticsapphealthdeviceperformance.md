---
title: "userExperienceAnalyticsAppHealthDevicePerformance resource type"
description: "The user experience analytics device performance entity contains device performance details."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthDevicePerformance resource type

Namespace: microsoft.graph



The user experience analytics device performance entity contains device performance details.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthDevicePerformances](../api/userexperienceanalyticsapphealthdeviceperformance-list.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) collection|Get a list of the [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthDevicePerformance](../api/userexperienceanalyticsapphealthdeviceperformance-create.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md)|Create a new [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) object.|
|[Get userExperienceAnalyticsAppHealthDevicePerformance](../api/userexperienceanalyticsapphealthdeviceperformance-get.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) object.|
|[Update userExperienceAnalyticsAppHealthDevicePerformance](../api/userexperienceanalyticsapphealthdeviceperformance-update.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md)|Update the properties of a [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) object.|
|[Delete userExperienceAnalyticsAppHealthDevicePerformance](../api/userexperienceanalyticsapphealthdeviceperformance-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appCrashCount|Int32|The number of app crashes for the device. Valid values -2147483648 to 2147483647|
|appHangCount|Int32|The number of app hangs for the device. Valid values -2147483648 to 2147483647|
|crashedAppCount|Int32|The number of distinct app crashes for the device. Valid values -2147483648 to 2147483647|
|deviceAppHealthScore|Double|The app health score of the device. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|deviceAppHealthStatus|String|The overall app health status of the device.|
|deviceDisplayName|String|The name of the device.|
|deviceId|String|The id of the device.|
|deviceManufacturer|String|The manufacturer name of the device.|
|deviceModel|String|The model name of the device.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the device in minutes. Valid values -2147483648 to 2147483647|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformance",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformance",
  "id": "String (identifier)",
  "appCrashCount": "Integer",
  "appHangCount": "Integer",
  "crashedAppCount": "Integer",
  "deviceAppHealthScore": "Double",
  "deviceAppHealthStatus": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "deviceManufacturer": "String",
  "deviceModel": "String",
  "meanTimeToFailureInMinutes": "Integer"
}
```

