---
title: "userExperienceAnalyticsDeviceScores resource type"
description: "The user experience analytics device scores entity consolidates the various endpoint analytics scores."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDeviceScores resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics device scores entity consolidates the various endpoint analytics scores.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDeviceScores](../api/userexperienceanalyticsdevicescores-list.md)|[userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) collection|Get a list of the [userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) objects and their properties.|
|[Create userExperienceAnalyticsDeviceScores](../api/userexperienceanalyticsdevicescores-create.md)|[userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md)|Create a new [userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) object.|
|[Get userExperienceAnalyticsDeviceScores](../api/userexperienceanalyticsdevicescores-get.md)|[userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md)|Read the properties and relationships of a [userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) object.|
|[Update userExperienceAnalyticsDeviceScores](../api/userexperienceanalyticsdevicescores-update.md)|[userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md)|Update the properties of a [userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) object.|
|[Delete userExperienceAnalyticsDeviceScores](../api/userexperienceanalyticsdevicescores-delete.md)|None|Deletes a [userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appReliabilityScore|Double|The user experience analytics device app reliability score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|deviceName|String|The user experience analytics device name.|
|endpointAnalyticsScore|Double|The user experience analytics device score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|manufacturer|String|The user experience analytics device manufacturer.|
|model|String|The user experience analytics device model.|
|startupPerformanceScore|Double|The user experience analytics device startup performance score. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceScores",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceScores",
  "id": "String (identifier)",
  "appReliabilityScore": "Double",
  "deviceName": "String",
  "endpointAnalyticsScore": "Double",
  "manufacturer": "String",
  "model": "String",
  "startupPerformanceScore": "Double"
}
```

