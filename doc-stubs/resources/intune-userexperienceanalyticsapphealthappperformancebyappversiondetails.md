---
title: "userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails-list.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md) collection|Get a list of the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails-create.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md)|Create a new [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.|
|[Get userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails-get.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.|
|[Update userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails-update.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md)|Update the properties of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.|
|[Delete userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../api/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appCrashCount|Int32|**TODO: Add Description**|
|appDisplayName|String|**TODO: Add Description**|
|appName|String|**TODO: Add Description**|
|appPublisher|String|**TODO: Add Description**|
|appVersion|String|**TODO: Add Description**|
|deviceCountWithCrashes|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isLatestUsedVersion|Boolean|**TODO: Add Description**|
|isMostUsedVersion|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails",
  "id": "String (identifier)",
  "deviceCountWithCrashes": "Integer",
  "isMostUsedVersion": "Boolean",
  "isLatestUsedVersion": "Boolean",
  "appName": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "appCrashCount": "Integer"
}
```

