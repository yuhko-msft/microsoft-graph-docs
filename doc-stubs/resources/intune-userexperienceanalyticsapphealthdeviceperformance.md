---
title: "userExperienceAnalyticsAppHealthDevicePerformance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthDevicePerformance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthDevicePerformances](../api/intune-userexperienceanalyticsapphealthdeviceperformance-list.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) collection|Get a list of the [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthDevicePerformance](../api/intune-userexperienceanalyticsapphealthdeviceperformance-create.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md)|Create a new [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) object.|
|[Get userExperienceAnalyticsAppHealthDevicePerformance](../api/intune-userexperienceanalyticsapphealthdeviceperformance-get.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) object.|
|[Update userExperienceAnalyticsAppHealthDevicePerformance](../api/intune-userexperienceanalyticsapphealthdeviceperformance-update.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md)|Update the properties of a [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) object.|
|[Delete userExperienceAnalyticsAppHealthDevicePerformance](../api/intune-userexperienceanalyticsapphealthdeviceperformance-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appCrashCount|Int32|**TODO: Add Description**|
|appHangCount|Int32|**TODO: Add Description**|
|crashedAppCount|Int32|**TODO: Add Description**|
|deviceAppHealthScore|Double|**TODO: Add Description**|
|deviceAppHealthStatus|String|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|deviceManufacturer|String|**TODO: Add Description**|
|deviceModel|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|meanTimeToFailureInMinutes|Int32|**TODO: Add Description**|
|processedDateTime|DateTimeOffset|**TODO: Add Description**|

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
  "deviceModel": "String",
  "deviceManufacturer": "String",
  "appCrashCount": "Integer",
  "crashedAppCount": "Integer",
  "appHangCount": "Integer",
  "processedDateTime": "String (timestamp)",
  "meanTimeToFailureInMinutes": "Integer",
  "deviceAppHealthScore": "Double",
  "deviceAppHealthStatus": "String",
  "deviceId": "String",
  "deviceDisplayName": "String"
}
```

