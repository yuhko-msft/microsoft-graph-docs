---
title: "userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric resource type"
description: "The user experience analytics hardware readiness entity contains account level information about hardware blockers for windows upgrade."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics hardware readiness entity contains account level information about hardware blockers for windows upgrade.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetrics](../api/userexperienceanalyticsworkfromanywherehardwarereadinessmetric-list.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) collection|Get a list of the [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) objects and their properties.|
|[Create userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/userexperienceanalyticsworkfromanywherehardwarereadinessmetric-create.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|Create a new [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.|
|[Get userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/userexperienceanalyticsworkfromanywherehardwarereadinessmetric-get.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.|
|[Update userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/userexperienceanalyticsworkfromanywherehardwarereadinessmetric-update.md)|[userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md)|Update the properties of a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.|
|[Delete userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../api/userexperienceanalyticsworkfromanywherehardwarereadinessmetric-delete.md)|None|Deletes a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier of the user experience analytics hardware readiness metric object.|
|osCheckFailedPercentage|Double|The percentage of devices for which OS check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|processor64BitCheckFailedPercentage|Double|The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|processorCoreCountCheckFailedPercentage|Double|The percentage of devices for which processor hardware core count check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|processorFamilyCheckFailedPercentage|Double|The percentage of devices for which processor hardware family check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|processorSpeedCheckFailedPercentage|Double|The percentage of devices for which processor hardware speed check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|ramCheckFailedPercentage|Double|The percentage of devices for which RAM hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|secureBootCheckFailedPercentage|Double|The percentage of devices for which secure boot hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|storageCheckFailedPercentage|Double|The percentage of devices for which storage hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|totalDeviceCount|Int32|The count of total devices in an organization. Valid values -2147483648 to 2147483647|
|tpmCheckFailedPercentage|Double|The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|upgradeEligibleDeviceCount|Int32|The count of devices in an organization eligible for windows upgrade. Valid values -2147483648 to 2147483647|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric",
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

