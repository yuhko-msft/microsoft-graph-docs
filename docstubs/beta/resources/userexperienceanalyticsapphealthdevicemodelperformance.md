---
title: "userExperienceAnalyticsAppHealthDeviceModelPerformance resource type"
description: "The user experience analytics device model performance entity contains device model performance details."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userExperienceAnalyticsAppHealthDeviceModelPerformance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics device model performance entity contains device model performance details.

## Methods

| Method                                                                                                                                   | Return Type                                                                                                                    | Description                                                                                            |
| :--------------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------------------------- |
| [List userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-list.md)     | [userExperienceAnalyticsAppHealthDeviceModelPerformance](userExperienceAnalyticsAppHealthDeviceModelPerformance.md) collection | List properties and relationships of an userExperienceAnalyticsAppHealthDeviceModelPerformance object. |
| [Create userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-create.md) | [userExperienceAnalyticsAppHealthDeviceModelPerformance](userExperienceAnalyticsAppHealthDeviceModelPerformance.md)            | Create a new userExperienceAnalyticsAppHealthDeviceModelPerformance object.                            |
| [Get userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-get.md)       | [userExperienceAnalyticsAppHealthDeviceModelPerformance](userExperienceAnalyticsAppHealthDeviceModelPerformance.md)            | Read properties and relationships of an userExperienceAnalyticsAppHealthDeviceModelPerformance object. |
| [Update userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-update.md) | [userExperienceAnalyticsAppHealthDeviceModelPerformance](userExperienceAnalyticsAppHealthDeviceModelPerformance.md)            | Update the properties of an userExperienceAnalyticsAppHealthDeviceModelPerformance object.             |
| [Delete userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-delete.md) |                                                                                                                                | Delete an userExperienceAnalyticsAppHealthDeviceModelPerformance object.                               |

## Properties

| Property                   | Type   | Description                                                                                            |
| :------------------------- | :----- | :----------------------------------------------------------------------------------------------------- |
| activeDeviceCount          | Int32  | The number of active devices for the model. Valid values -2147483648 to 2147483647                     |
| deviceManufacturer         | String | The manufacturer name of the device.                                                                   |
| deviceModel                | String | The model name of the device.                                                                          |
| id                         | String | The unique identifier of the user experience analytics device model performance object. Read-only.     |
| meanTimeToFailureInMinutes | Int32  | The mean time to failure for the model device in minutes. Valid values -2147483648 to 2147483647       |
| modelAppHealthScore        | Double | The app health score of the device model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308 |
| modelAppHealthStatus       | String | The overall app health status of the device model.                                                     |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthDeviceModelPerformance",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDeviceModelPerformance",
  "activeDeviceCount": "Int32",
  "deviceManufacturer": "String",
  "deviceModel": "String",
  "id": "String (identifier)",
  "meanTimeToFailureInMinutes": "Int32",
  "modelAppHealthScore": "Double",
  "modelAppHealthStatus": "String"
}
```
