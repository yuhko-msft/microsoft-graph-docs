---
title: "userExperienceAnalyticsAppHealthAppPerformanceByAppVersion resource type"
description: "The user experience analytics applicaiton performance entity contains app performance details by app version."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthAppPerformanceByAppVersion resource type

Namespace: microsoft.graph



The user experience analytics applicaiton performance entity contains app performance details by app version.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthAppPerformanceByAppVersions](../api/userexperienceanalyticsapphealthappperformancebyappversion-list.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) collection|Get a list of the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-create.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md)|Create a new [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) object.|
|[Get userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-get.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) object.|
|[Update userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-update.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md)|Update the properties of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) object.|
|[Delete userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appCrashCount|Int32|The number of crashes for the app. Valid values -2147483648 to 2147483647|
|appDisplayName|String|The friendly name of the application.|
|appName|String|The name of the application.|
|appPublisher|String|The publisher of the application.|
|appUsageDuration|Int32|The total usage time of the application in minutes. Valid values -2147483648 to 2147483647|
|appVersion|String|The version of the application.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersion",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersion",
  "id": "String (identifier)",
  "appCrashCount": "Integer",
  "appDisplayName": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Integer",
  "appVersion": "String",
  "meanTimeToFailureInMinutes": "Integer"
}
```

