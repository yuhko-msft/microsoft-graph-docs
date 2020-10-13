---
title: "userExperienceAnalyticsAppHealthDevicePerformanceDetails resource type"
description: "The user experience analytics device performance entity contains device performance details."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userExperienceAnalyticsAppHealthDevicePerformanceDetails resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics device performance entity contains device performance details.

## Methods

| Method                                                                                                                                       | Return Type                                                                                                                        | Description                                                                                              |
| :------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------- |
| [List userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-list.md)     | [userExperienceAnalyticsAppHealthDevicePerformanceDetails](userExperienceAnalyticsAppHealthDevicePerformanceDetails.md) collection | List properties and relationships of an userExperienceAnalyticsAppHealthDevicePerformanceDetails object. |
| [Create userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-create.md) | [userExperienceAnalyticsAppHealthDevicePerformanceDetails](userExperienceAnalyticsAppHealthDevicePerformanceDetails.md)            | Create a new userExperienceAnalyticsAppHealthDevicePerformanceDetails object.                            |
| [Get userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-get.md)       | [userExperienceAnalyticsAppHealthDevicePerformanceDetails](userExperienceAnalyticsAppHealthDevicePerformanceDetails.md)            | Read properties and relationships of an userExperienceAnalyticsAppHealthDevicePerformanceDetails object. |
| [Update userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-update.md) | [userExperienceAnalyticsAppHealthDevicePerformanceDetails](userExperienceAnalyticsAppHealthDevicePerformanceDetails.md)            | Update the properties of an userExperienceAnalyticsAppHealthDevicePerformanceDetails object.             |
| [Delete userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-delete.md) |                                                                                                                                    | Delete an userExperienceAnalyticsAppHealthDevicePerformanceDetails object.                               |

## Properties

| Property          | Type           | Description                                                                                  |
| :---------------- | :------------- | :------------------------------------------------------------------------------------------- |
| appDisplayName    | String         | The friendly name of the application for which the event occurred.                           |
| deviceDisplayName | String         | The name of the device.                                                                      |
| deviceId          | String         | The id of the device.                                                                        |
| eventDateTime     | DateTimeOffset | The time the event occurred.                                                                 |
| eventType         | String         | The type of the event.                                                                       |
| id                | String         | The unique identifier of the user experience analytics device performance object. Read-only. |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "appDisplayName": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "eventDateTime": "DateTimeOffset",
  "eventType": "String",
  "id": "String (identifier)"
}
```
