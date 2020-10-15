---
title: "userExperienceAnalyticsMetricHistory resource type"
description: "The user experience analytics metric history."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userExperienceAnalyticsMetricHistory resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics metric history.

## Methods

| Method                                                                                                                             | Return Type                                                                                       | Description                                                                                             |
| :--------------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------ | :------------------------------------------------------------------------------------------------------ |
| [List userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-list.md)                            | [userExperienceAnalyticsMetricHistory](intune-userExperienceAnalyticsMetricHistory.md) collection | List properties and relationships of a userExperienceAnalyticsMetricHistory object.                     |
| [Create userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-create.md)                        | [userExperienceAnalyticsMetricHistory](intune-userExperienceAnalyticsMetricHistory.md)            | Create a new userExperienceAnalyticsMetricHistory object.                                               |
| [Get userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-get.md)                              | [userExperienceAnalyticsMetricHistory](intune-userExperienceAnalyticsMetricHistory.md)            | Read properties and relationships of a userExperienceAnalyticsMetricHistory object.                     |
| [Update userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-update.md)                        | [userExperienceAnalyticsMetricHistory](intune-userExperienceAnalyticsMetricHistory.md)            | Update the properties of a userExperienceAnalyticsMetricHistory object.                                 |
| [Delete userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-delete.md)                        |                                                                                                   | Delete a userExperienceAnalyticsMetricHistory object.                                                   |
| [List userExperienceAnalyticsMetric](../api/intune-userexperienceanalyticsmetrichistory-list-userexperienceanalyticsmetric.md)     | [userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md)             | Get the userExperienceAnalyticsMetric objects from a userExperienceAnalyticsMetric navigation property. |
| [Add userExperienceAnalyticsMetric](../api/intune-userexperienceanalyticsmetrichistory-post-userexperienceanalyticsmetric.md)      | [userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md)             | Add userExperienceAnalyticsMetric by posting to the userExperienceAnalyticsMetric collection.           |
| [Get userExperienceAnalyticsMetric](../api/intune-userexperienceanalyticsmetrichistory-get-userexperienceanalyticsmetric.md)       | [userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md)             | Read the properties and relationships of a userExperienceAnalyticsMetric object.                        |
| [Update userExperienceAnalyticsMetric](../api/intune-userexperienceanalyticsmetrichistory-update-userexperienceanalyticsmetric.md) | [userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md)             | Update the properties of a userExperienceAnalyticsMetric object.                                        |
| [Remove userExperienceAnalyticsMetric](../api/intune-userexperienceanalyticsmetrichistory-delete-userexperienceanalyticsmetric.md) |                                                                                                   | Remove a userExperienceAnalyticsMetric object.                                                          |

## Properties

| Property       | Type           | Description                                                                       |
| :------------- | :------------- | :-------------------------------------------------------------------------------- |
| id             | String         | The unique identifier of the user experience analytics metric history. Read-only. |
| metricDateTime | DateTimeOffset | The user experience analytics metric date time.                                   |

## Relationships

| Relationship                  | Type                                                                           | Description                       |
| :---------------------------- | :----------------------------------------------------------------------------- | :-------------------------------- |
| userExperienceAnalyticsMetric | [userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md) | User experience analytics metric. |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsMetricHistory",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsMetricHistory",
  "id": "String (identifier)",
  "metricDateTime": "DateTimeOffset"
}
```
