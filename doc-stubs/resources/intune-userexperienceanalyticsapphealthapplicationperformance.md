---
title: "userExperienceAnalyticsAppHealthApplicationPerformance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthApplicationPerformance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthApplicationPerformances](../api/intune-userexperienceanalyticsapphealthapplicationperformance-list.md)|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) collection|Get a list of the [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/userexperienceanalyticsapphealthapplicationperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-create.md)|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md)|Create a new [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object.|
|[Get userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-get.md)|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object.|
|[Update userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-update.md)|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md)|Update the properties of a [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object.|
|[Delete userExperienceAnalyticsAppHealthApplicationPerformance](../api/intune-userexperienceanalyticsapphealthapplicationperformance-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeDevices|Int32|**TODO: Add Description**|
|allOrgsHealthScore|Double|**TODO: Add Description**|
|allOrgsMeanTimeToFailure|Int32|**TODO: Add Description**|
|appFriendlyName|String|**TODO: Add Description**|
|appHealthScore|Double|**TODO: Add Description**|
|appHealthStatus|String|**TODO: Add Description**|
|appName|String|**TODO: Add Description**|
|appPublisher|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|meanTimeToFailure|Int32|**TODO: Add Description**|
|memaTimeGenerated|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|totalAppCrashes|Int32|**TODO: Add Description**|
|totalAppHangs|Int32|**TODO: Add Description**|
|totalAppUsageDuration|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance",
  "id": "String (identifier)",
  "appName": "String",
  "appFriendlyName": "String",
  "appPublisher": "String",
  "activeDevices": "Integer",
  "totalAppUsageDuration": "Integer",
  "totalAppCrashes": "Integer",
  "totalAppHangs": "Integer",
  "meanTimeToFailure": "Integer",
  "appHealthScore": "Double",
  "appHealthStatus": "String",
  "allOrgsHealthScore": "Double",
  "allOrgsMeanTimeToFailure": "Integer",
  "tenantId": "String",
  "memaTimeGenerated": "String"
}
```

