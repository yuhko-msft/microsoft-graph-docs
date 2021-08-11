---
title: "userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails resource type"
description: "The user experience analytics application performance entity contains app performance by app version details."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics application performance entity contains app performance by app version details.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/userexperienceanalyticsapphealthappperformancebyappversiondetails-list.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) collection|Get a list of the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/userexperienceanalyticsapphealthappperformancebyappversiondetails-create.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md)|Create a new [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.|
|[Get userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/userexperienceanalyticsapphealthappperformancebyappversiondetails-get.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.|
|[Update userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/userexperienceanalyticsapphealthappperformancebyappversiondetails-update.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md)|Update the properties of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.|
|[Delete userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/userexperienceanalyticsapphealthappperformancebyappversiondetails-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appCrashCount|Int32|The number of crashes for the app. Valid values -2147483648 to 2147483647|
|appDisplayName|String|The friendly name of the application.|
|appName|String|The name of the application.|
|appPublisher|String|The publisher of the application.|
|appVersion|String|The version of the application.|
|deviceCountWithCrashes|Int32|The total number of devices that have reported one or more application crashes for this application and version. Valid values -2147483648 to 2147483647|
|id|String|The unique identifier of the user experience analytics app performance object.|
|isLatestUsedVersion|Boolean|Is the version of application the latest version for that app that is in use.|
|isMostUsedVersion|Boolean|Is the version of application the most used version for that app.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails",
  "id": "String (identifier)",
  "deviceCountWithCrashes": "Integer",
  "isMostUsedVersion": "Boolean",
  "isLatestUsedVersion": "Boolean",
  "appName": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "appCrashCount": "Integer"
}
```

