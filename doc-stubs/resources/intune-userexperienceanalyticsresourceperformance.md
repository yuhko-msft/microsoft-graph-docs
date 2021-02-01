---
title: "userExperienceAnalyticsResourcePerformance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsResourcePerformance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsResourcePerformances](../api/intune-userexperienceanalyticsresourceperformance-list.md)|[userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md) collection|Get a list of the [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsResourcePerformance](../api/intune-userexperienceanalyticsresourceperformance-create.md)|[userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md)|Create a new [userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md) object.|
|[Get userExperienceAnalyticsResourcePerformance](../api/intune-userexperienceanalyticsresourceperformance-get.md)|[userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md) object.|
|[Update userExperienceAnalyticsResourcePerformance](../api/intune-userexperienceanalyticsresourceperformance-update.md)|[userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md)|Update the properties of a [userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md) object.|
|[Delete userExperienceAnalyticsResourcePerformance](../api/intune-userexperienceanalyticsresourceperformance-delete.md)|None|Deletes a [userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md) object.|
|[summarizeDeviceResourcePerformance](../api/intune-userexperienceanalyticsresourceperformance-summarizedeviceresourceperformance.md)|[userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|cpuSpikeTimePercentage|Double|**TODO: Add Description**|
|cpuSpikeTimePercentageThreshold|Double|**TODO: Add Description**|
|cpuSpikeTimeScore|Int32|**TODO: Add Description**|
|deviceCount|Int64|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|deviceResourcePerformanceScore|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|manufacturer|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|ramSpikeTimePercentage|Double|**TODO: Add Description**|
|ramSpikeTimePercentageThreshold|Double|**TODO: Add Description**|
|ramSpikeTimeScore|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsResourcePerformance",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsResourcePerformance",
  "id": "String (identifier)",
  "deviceId": "String",
  "deviceName": "String",
  "model": "String",
  "deviceCount": "Integer",
  "manufacturer": "String",
  "cpuSpikeTimePercentage": "Double",
  "ramSpikeTimePercentage": "Double",
  "cpuSpikeTimeScore": "Integer",
  "cpuSpikeTimePercentageThreshold": "Double",
  "ramSpikeTimeScore": "Integer",
  "ramSpikeTimePercentageThreshold": "Double",
  "deviceResourcePerformanceScore": "Integer"
}
```

