---
title: "userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId resource type"
description: "The user experience analytics application performance entity contains app performance by app version device id."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics application performance entity contains app performance by app version device id.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIds](../api/userexperienceanalyticsapphealthappperformancebyappversiondeviceid-list.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) collection|Get a list of the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/userexperienceanalyticsapphealthappperformancebyappversiondeviceid-create.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md)|Create a new [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.|
|[Get userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/userexperienceanalyticsapphealthappperformancebyappversiondeviceid-get.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.|
|[Update userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/userexperienceanalyticsapphealthappperformancebyappversiondeviceid-update.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md)|Update the properties of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.|
|[Delete userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../api/userexperienceanalyticsapphealthappperformancebyappversiondeviceid-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appCrashCount|Int32|The number of crashes for the app. Valid values -2147483648 to 2147483647|
|appDisplayName|String|The friendly name of the application.|
|appName|String|The name of the application.|
|appPublisher|String|The publisher of the application.|
|appVersion|String|The version of the application.|
|deviceDisplayName|String|The name of the device.|
|deviceId|String|The id of the device.|
|id|String|The unique identifier of the user experience analytics app performance object.|
|processedDateTime|DateTimeOffset|The date and time when the statistics were last computed.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId",
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

