---
title: "userExperienceAnalyticsAppHealthAppPerformanceByAppVersion resource type"
description: "The user experience analytics applicaiton performance entity contains app performance details by app version."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userExperienceAnalyticsAppHealthAppPerformanceByAppVersion resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics applicaiton performance entity contains app performance details by app version.

## Methods

| Method                                                                                                                                           | Return Type                                                                                                                            | Description                                                                                                |
| :----------------------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------------------- |
| [List userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-list.md)     | [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](userExperienceAnalyticsAppHealthAppPerformanceByAppVersion.md) collection | List properties and relationships of an userExperienceAnalyticsAppHealthAppPerformanceByAppVersion object. |
| [Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-create.md) | [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](userExperienceAnalyticsAppHealthAppPerformanceByAppVersion.md)            | Create a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersion object.                            |
| [Get userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-get.md)       | [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](userExperienceAnalyticsAppHealthAppPerformanceByAppVersion.md)            | Read properties and relationships of an userExperienceAnalyticsAppHealthAppPerformanceByAppVersion object. |
| [Update userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-update.md) | [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](userExperienceAnalyticsAppHealthAppPerformanceByAppVersion.md)            | Update the properties of an userExperienceAnalyticsAppHealthAppPerformanceByAppVersion object.             |
| [Delete userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/userexperienceanalyticsapphealthappperformancebyappversion-delete.md) |                                                                                                                                        | Delete an userExperienceAnalyticsAppHealthAppPerformanceByAppVersion object.                               |

## Properties

| Property                   | Type   | Description                                                                                |
| :------------------------- | :----- | :----------------------------------------------------------------------------------------- |
| appCrashCount              | Int32  | The number of crashes for the app. Valid values -2147483648 to 2147483647                  |
| appDisplayName             | String | The friendly name of the application.                                                      |
| appName                    | String | The name of the application.                                                               |
| appPublisher               | String | The publisher of the application.                                                          |
| appUsageDuration           | Int32  | The total usage time of the application in minutes. Valid values -2147483648 to 2147483647 |
| appVersion                 | String | The version of the application.                                                            |
| id                         | String | The unique identifier of the user experience analytics app performance object. Read-only.  |
| meanTimeToFailureInMinutes | Int32  | The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647    |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersion",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersion",
  "appCrashCount": "Int32",
  "appDisplayName": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Int32",
  "appVersion": "String",
  "id": "String (identifier)",
  "meanTimeToFailureInMinutes": "Int32"
}
```