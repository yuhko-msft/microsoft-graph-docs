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

| Property                 | Type   | Description                                                                                                                       |
| :----------------------- | :----- | :-------------------------------------------------------------------------------------------------------------------------------- |
| activeDevices            | Int32  | The number of devices where the app has been active. Valid values -2147483648 to 2147483647                                       |
| allOrgsHealthScore       | Double | The median health score of the application across all organizations. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 |
| allOrgsMeanTimeToFailure | Int32  | The median mean time to failure across all orgs for the app in minutes. Valid values -2147483648 to 2147483647                    |
| appFriendlyName          | String | The friendly name of the application.                                                                                             |
| appHealthScore           | Double | The health score of the app. Valid values -1.79769313486232E+308 to 1.79769313486232E+308                                         |
| appHealthStatus          | String | The overall health status of the app.                                                                                             |
| appName                  | String | The name of the application.                                                                                                      |
| appPublisher             | String | The publisher of the application.                                                                                                 |
| id                       | String | The unique identifier of the user experience analytics app performance object. Read-only.                                         |
| meanTimeToFailure        | Int32  | The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647                                           |
| memaTimeGenerated        | String | The time when aggregation was performed in MEMA.                                                                                  |
| tenantId                 | String | The id of the tenant associated with this app object.                                                                             |
| totalAppCrashes          | Int32  | The number of crashes for the app. Valid values -2147483648 to 2147483647                                                         |
| totalAppHangs            | Int32  | The number of hangs for the app. Valid values -2147483648 to 2147483647                                                           |
| totalAppUsageDuration    | Int32  | The total usage time of the application in minutes. Valid values -2147483648 to 2147483647                                        |

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
  "activeDevices": "Int32",
  "allOrgsHealthScore": "Double",
  "allOrgsMeanTimeToFailure": "Int32",
  "appFriendlyName": "String",
  "appHealthScore": "Double",
  "appHealthStatus": "String",
  "appName": "String",
  "appPublisher": "String",
  "id": "String (identifier)",
  "meanTimeToFailure": "Int32",
  "memaTimeGenerated": "String",
  "tenantId": "String",
  "totalAppCrashes": "Int32",
  "totalAppHangs": "Int32",
  "totalAppUsageDuration": "Int32"
}
```