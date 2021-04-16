---
title: "userExperienceAnalyticsResourcePerformance resource type"
description: "The user experience analytics resource performance entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsResourcePerformance resource type

Namespace: microsoft.graph



The user experience analytics resource performance entity.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsResourcePerformances](../api/userexperienceanalyticsresourceperformance-list.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) collection|Get a list of the [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsResourcePerformance](../api/userexperienceanalyticsresourceperformance-create.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md)|Create a new [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) object.|
|[Get userExperienceAnalyticsResourcePerformance](../api/userexperienceanalyticsresourceperformance-get.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) object.|
|[Update userExperienceAnalyticsResourcePerformance](../api/userexperienceanalyticsresourceperformance-update.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md)|Update the properties of a [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) object.|
|[Delete userExperienceAnalyticsResourcePerformance](../api/userexperienceanalyticsresourceperformance-delete.md)|None|Deletes a [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) object.|
|[summarizeDeviceResourcePerformance](../api/userexperienceanalyticsresourceperformance-summarizedeviceresourceperformance.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|cpuSpikeTimePercentage|Double|CPU spike time in percentage. Valid values 0 to 100|
|cpuSpikeTimePercentageThreshold|Double|Threshold of cpuSpikeTimeScore. Valid values 0 to 100|
|cpuSpikeTimeScore|Int32|The user experience analytics device CPU spike time score. Valid values 0 to 100|
|deviceCount|Int64|User experience analytics summarized device count.|
|deviceId|String|The id of the device.|
|deviceName|String|The name of the device.|
|deviceResourcePerformanceScore|Int32|Resource performance score of a specific device. Valid values 0 to 100|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|manufacturer|String|The user experience analytics device manufacturer.|
|model|String|The user experience analytics device model.|
|ramSpikeTimePercentage|Double|RAM spike time in percentage. Valid values 0 to 100|
|ramSpikeTimePercentageThreshold|Double|Threshold of ramSpikeTimeScore. Valid values 0 to 100|
|ramSpikeTimeScore|Int32|The user experience analytics device RAM spike time score. Valid values 0 to 100|

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
  "cpuSpikeTimePercentage": "Double",
  "cpuSpikeTimePercentageThreshold": "Double",
  "cpuSpikeTimeScore": "Integer",
  "deviceCount": "Integer",
  "deviceId": "String",
  "deviceName": "String",
  "deviceResourcePerformanceScore": "Integer",
  "manufacturer": "String",
  "model": "String",
  "ramSpikeTimePercentage": "Double",
  "ramSpikeTimePercentageThreshold": "Double",
  "ramSpikeTimeScore": "Integer"
}
```

