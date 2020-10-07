---
title: "userExperienceAnalyticsAppHealthAppPerformanceByOSVersion resource type"
description: "The user experience analytics applicaiton performance entity contains app performance details by OS version."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userExperienceAnalyticsAppHealthAppPerformanceByOSVersion resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics applicaiton performance entity contains app performance details by OS version.

## Methods

| Method                                                                                                                                         | Return Type                                                                                                                          | Description                                                                                               |
| :--------------------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------- |
| [List userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-list.md)     | [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](userExperienceAnalyticsAppHealthAppPerformanceByOSVersion.md) collection | List properties and relationships of an userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object. |
| [Create userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-create.md) | [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](userExperienceAnalyticsAppHealthAppPerformanceByOSVersion.md)            | Create a new userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object.                            |
| [Get userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-get.md)       | [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](userExperienceAnalyticsAppHealthAppPerformanceByOSVersion.md)            | Read properties and relationships of an userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object. |
| [Update userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-update.md) | [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](userExperienceAnalyticsAppHealthAppPerformanceByOSVersion.md)            | Update the properties of an userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object.             |
| [Delete userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/userexperienceanalyticsapphealthappperformancebyosversion-delete.md) |                                                                                                                                      | Delete an userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object.                               |

## Properties

| Property                   | Type   | Description                                                                                       |
| :------------------------- | :----- | :------------------------------------------------------------------------------------------------ |
| activeDeviceCount          | Int32  | The number of devices where the app has been active. Valid values -2147483648 to 2147483647       |
| appCrashCount              | Int32  | The number of crashes for the app. Valid values -2147483648 to 2147483647                         |
| appDisplayName             | String | The friendly name of the application.                                                             |
| appName                    | String | The name of the application.                                                                      |
| appPublisher               | String | The publisher of the application.                                                                 |
| appUsageDuration           | Int32  | The total usage time of the application in minutes. Valid values -2147483648 to 2147483647        |
| id                         | String | The unique identifier of the user experience analytics app version performance object. Read-only. |
| meanTimeToFailureInMinutes | Int32  | The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647           |
| osBuildNumber              | String | The os build number of the application.                                                           |
| osVersion                  | String | The os version of the application.                                                                |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByOSVersion",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByOSVersion",
  "activeDeviceCount": "Int32",
  "appCrashCount": "Int32",
  "appDisplayName": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Int32",
  "id": "String (identifier)",
  "meanTimeToFailureInMinutes": "Int32",
  "osBuildNumber": "String",
  "osVersion": "String"
}
```