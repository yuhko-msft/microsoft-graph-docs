---
title: "userExperienceAnalyticsAppHealthApplicationPerformance resource type"
description: "The user experience analytics applicaiton performance entity contains app performance details."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userExperienceAnalyticsAppHealthApplicationPerformance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics applicaiton performance entity contains app performance details.

## Methods

| Method                                                                                                                                          | Return Type                                                                                                                           | Description                                                                                           |
| :---------------------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------ | :---------------------------------------------------------------------------------------------------- |
| [List userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-list.md)     | [userExperienceAnalyticsAppHealthApplicationPerformance](intune-userExperienceAnalyticsAppHealthApplicationPerformance.md) collection | List properties and relationships of a userExperienceAnalyticsAppHealthApplicationPerformance object. |
| [Create userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-create.md) | [userExperienceAnalyticsAppHealthApplicationPerformance](intune-userExperienceAnalyticsAppHealthApplicationPerformance.md)            | Create a new userExperienceAnalyticsAppHealthApplicationPerformance object.                           |
| [Get userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-get.md)       | [userExperienceAnalyticsAppHealthApplicationPerformance](intune-userExperienceAnalyticsAppHealthApplicationPerformance.md)            | Read properties and relationships of a userExperienceAnalyticsAppHealthApplicationPerformance object. |
| [Update userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-update.md) | [userExperienceAnalyticsAppHealthApplicationPerformance](intune-userExperienceAnalyticsAppHealthApplicationPerformance.md)            | Update the properties of a userExperienceAnalyticsAppHealthApplicationPerformance object.             |
| [Delete userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-delete.md) |                                                                                                                                       | Delete a userExperienceAnalyticsAppHealthApplicationPerformance object.                               |

## Properties

| Property                   | Type   | Description                                                                                                                       |
| :------------------------- | :----- | :-------------------------------------------------------------------------------------------------------------------------------- |
| activeDeviceCount          | Int32  | The number of devices where the app has been active. Valid values -2147483648 to 2147483647                                       |
| allOrgsHealthScore         | Double | The median health score of the application across all organizations. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 |
| appCrashCount              | Int32  | The number of crashes for the app. Valid values -2147483648 to 2147483647                                                         |
| appDisplayName             | String | The friendly name of the application.                                                                                             |
| appHangCount               | Int32  | The number of hangs for the app. Valid values -2147483648 to 2147483647                                                           |
| appHealthScore             | Double | The health score of the app. Valid values -1.79769313486232E+308 to 1.79769313486232E+308                                         |
| appHealthStatus            | String | The overall health status of the app.                                                                                             |
| appName                    | String | The name of the application.                                                                                                      |
| appPublisher               | String | The publisher of the application.                                                                                                 |
| appUsageDuration           | Int32  | The total usage time of the application in minutes. Valid values -2147483648 to 2147483647                                        |
| id                         | String | The unique identifier of the user experience analytics app performance object. Read-only.                                         |
| meanTimeToFailureInMinutes | Int32  | The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647                                           |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance",
  "activeDeviceCount": "Int32",
  "allOrgsHealthScore": "Double",
  "appCrashCount": "Int32",
  "appDisplayName": "String",
  "appHangCount": "Int32",
  "appHealthScore": "Double",
  "appHealthStatus": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Int32",
  "id": "String (identifier)",
  "meanTimeToFailureInMinutes": "Int32"
}
```
