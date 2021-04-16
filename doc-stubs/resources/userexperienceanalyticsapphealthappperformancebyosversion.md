---
title: "userExperienceAnalyticsAppHealthAppPerformanceByOSVersion resource type"
description: "The user experience analytics applicaiton performance entity contains app performance details by OS version."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthAppPerformanceByOSVersion resource type

Namespace: microsoft.graph



The user experience analytics applicaiton performance entity contains app performance details by OS version.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthAppPerformanceByOSVersions](../api/userexperienceanalyticsapphealthappperformancebyosversion-list.md)|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) collection|Get a list of the [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-create.md)|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md)|Create a new [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) object.|
|[Get userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-get.md)|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) object.|
|[Update userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-update.md)|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md)|Update the properties of a [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) object.|
|[Delete userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeDeviceCount|Int32|The number of devices where the app has been active. Valid values -2147483648 to 2147483647|
|appCrashCount|Int32|The number of crashes for the app. Valid values -2147483648 to 2147483647|
|appDisplayName|String|The friendly name of the application.|
|appName|String|The name of the application.|
|appPublisher|String|The publisher of the application.|
|appUsageDuration|Int32|The total usage time of the application in minutes. Valid values -2147483648 to 2147483647|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647|
|osBuildNumber|String|The os build number of the application.|
|osVersion|String|The os version of the application.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByOSVersion",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByOSVersion",
  "id": "String (identifier)",
  "activeDeviceCount": "Integer",
  "appCrashCount": "Integer",
  "appDisplayName": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Integer",
  "meanTimeToFailureInMinutes": "Integer",
  "osBuildNumber": "String",
  "osVersion": "String"
}
```

