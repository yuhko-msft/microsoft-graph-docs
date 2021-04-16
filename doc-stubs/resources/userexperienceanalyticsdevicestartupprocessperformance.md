---
title: "userExperienceAnalyticsDeviceStartupProcessPerformance resource type"
description: "The user experience analytics device startup process performance."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDeviceStartupProcessPerformance resource type

Namespace: microsoft.graph



The user experience analytics device startup process performance.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDeviceStartupProcessPerformances](../api/userexperienceanalyticsdevicestartupprocessperformance-list.md)|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) collection|Get a list of the [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsDeviceStartupProcessPerformance](../api/userexperienceanalyticsdevicestartupprocessperformance-create.md)|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md)|Create a new [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) object.|
|[Get userExperienceAnalyticsDeviceStartupProcessPerformance](../api/userexperienceanalyticsdevicestartupprocessperformance-get.md)|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) object.|
|[Update userExperienceAnalyticsDeviceStartupProcessPerformance](../api/userexperienceanalyticsdevicestartupprocessperformance-update.md)|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md)|Update the properties of a [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) object.|
|[Delete userExperienceAnalyticsDeviceStartupProcessPerformance](../api/userexperienceanalyticsdevicestartupprocessperformance-delete.md)|None|Deletes a [userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceCount|Int64|User experience analytics device startup process summarized count.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|medianImpactInMs|Int32|User experience analytics device startup process median impact in milliseconds.|
|processName|String|User experience analytics device startup process name.|
|productName|String|The user experience analytics device startup process product name.|
|publisher|String|The User experience analytics device startup process publisher.|
|totalImpactInMs|Int32|User experience analytics device startup process total impact in milliseconds.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceStartupProcessPerformance",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupProcessPerformance",
  "id": "String (identifier)",
  "deviceCount": "Integer",
  "medianImpactInMs": "Integer",
  "processName": "String",
  "productName": "String",
  "publisher": "String",
  "totalImpactInMs": "Integer"
}
```

