---
title: "userExperienceAnalyticsAppHealthOSVersionPerformance resource type"
description: "The user experience analytics device OS version performance entity contains OS version performance details."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userExperienceAnalyticsAppHealthOSVersionPerformance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics device OS version performance entity contains OS version performance details.

## Methods

| Method                                                                                                                               | Return Type                                                                                                                | Description                                                                                          |
| :----------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------------- |
| [List userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-list.md)     | [userExperienceAnalyticsAppHealthOSVersionPerformance](userExperienceAnalyticsAppHealthOSVersionPerformance.md) collection | List properties and relationships of an userExperienceAnalyticsAppHealthOSVersionPerformance object. |
| [Create userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-create.md) | [userExperienceAnalyticsAppHealthOSVersionPerformance](userExperienceAnalyticsAppHealthOSVersionPerformance.md)            | Create a new userExperienceAnalyticsAppHealthOSVersionPerformance object.                            |
| [Get userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-get.md)       | [userExperienceAnalyticsAppHealthOSVersionPerformance](userExperienceAnalyticsAppHealthOSVersionPerformance.md)            | Read properties and relationships of an userExperienceAnalyticsAppHealthOSVersionPerformance object. |
| [Update userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-update.md) | [userExperienceAnalyticsAppHealthOSVersionPerformance](userExperienceAnalyticsAppHealthOSVersionPerformance.md)            | Update the properties of an userExperienceAnalyticsAppHealthOSVersionPerformance object.             |
| [Delete userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-delete.md) |                                                                                                                            | Delete an userExperienceAnalyticsAppHealthOSVersionPerformance object.                               |

## Properties

| Property                   | Type   | Description                                                                                          |
| :------------------------- | :----- | :--------------------------------------------------------------------------------------------------- |
| activeDeviceCount          | Int32  | The number of active devices for the OS version. Valid values -2147483648 to 2147483647              |
| id                         | String | The unique identifier of the user experience analytics OS version performance object. Read-only.     |
| meanTimeToFailureInMinutes | Int32  | The mean time to failure for the OS version in minutes. Valid values -2147483648 to 2147483647       |
| osBuildNumber              | String | The OS build number installed on the device.                                                         |
| osVersion                  | String | The OS version installed on the device.                                                              |
| osVersionAppHealthScore    | Double | The app health score of the OS version. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 |
| osVersionAppHealthStatus   | String | The overall app health status of the OS version.                                                     |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthOSVersionPerformance",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthOSVersionPerformance",
  "activeDeviceCount": "Int32",
  "id": "String (identifier)",
  "meanTimeToFailureInMinutes": "Int32",
  "osBuildNumber": "String",
  "osVersion": "String",
  "osVersionAppHealthScore": "Double",
  "osVersionAppHealthStatus": "String"
}
```
