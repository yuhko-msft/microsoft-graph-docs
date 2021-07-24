---
title: "userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetrics](../api/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric-list.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) collection|Get a list of the [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) objects and their properties.|
|[Create userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric-create.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|Create a new [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.|
|[Get userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric-get.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.|
|[Update userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric-update.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|Update the properties of a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.|
|[Delete userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric-delete.md)|None|Deletes a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|osCheckFailedPercentage|Double|**TODO: Add Description**|
|processor64BitCheckFailedPercentage|Double|**TODO: Add Description**|
|processorCoreCountCheckFailedPercentage|Double|**TODO: Add Description**|
|processorFamilyCheckFailedPercentage|Double|**TODO: Add Description**|
|processorSpeedCheckFailedPercentage|Double|**TODO: Add Description**|
|ramCheckFailedPercentage|Double|**TODO: Add Description**|
|secureBootCheckFailedPercentage|Double|**TODO: Add Description**|
|storageCheckFailedPercentage|Double|**TODO: Add Description**|
|totalDeviceCount|Int32|**TODO: Add Description**|
|tpmCheckFailedPercentage|Double|**TODO: Add Description**|
|upgradeEligibleDeviceCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric",
  "id": "String (identifier)",
  "totalDeviceCount": "Integer",
  "upgradeEligibleDeviceCount": "Integer",
  "ramCheckFailedPercentage": "Double",
  "storageCheckFailedPercentage": "Double",
  "processorCoreCountCheckFailedPercentage": "Double",
  "processorSpeedCheckFailedPercentage": "Double",
  "tpmCheckFailedPercentage": "Double",
  "secureBootCheckFailedPercentage": "Double",
  "processorFamilyCheckFailedPercentage": "Double",
  "processor64BitCheckFailedPercentage": "Double",
  "osCheckFailedPercentage": "Double"
}
```

