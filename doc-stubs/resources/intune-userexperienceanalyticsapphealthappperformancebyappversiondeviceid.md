---
title: "userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIds](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid-list.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) collection|Get a list of the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid-create.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md)|Create a new [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.|
|[Get userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid-get.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.|
|[Update userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid-update.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md)|Update the properties of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.|
|[Delete userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appCrashCount|Int32|**TODO: Add Description**|
|appDisplayName|String|**TODO: Add Description**|
|appName|String|**TODO: Add Description**|
|appPublisher|String|**TODO: Add Description**|
|appVersion|String|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|processedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId",
  "id": "String (identifier)",
  "deviceId": "String",
  "deviceDisplayName": "String",
  "processedDateTime": "String (timestamp)",
  "appName": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "appCrashCount": "Integer"
}
```

