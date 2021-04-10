---
title: "userExperienceAnalyticsDeviceScores resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDeviceScores resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDeviceScores](../api/intune-userexperienceanalyticsdevicescores-list.md)|[userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md) collection|Get a list of the [userExperienceAnalyticsDeviceScores](../resources/userexperienceanalyticsdevicescores.md) objects and their properties.|
|[Create userExperienceAnalyticsDeviceScores](../api/intune-userexperienceanalyticsdevicescores-create.md)|[userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md)|Create a new [userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md) object.|
|[Get userExperienceAnalyticsDeviceScores](../api/intune-userexperienceanalyticsdevicescores-get.md)|[userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md)|Read the properties and relationships of a [userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md) object.|
|[Update userExperienceAnalyticsDeviceScores](../api/intune-userexperienceanalyticsdevicescores-update.md)|[userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md)|Update the properties of a [userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md) object.|
|[Delete userExperienceAnalyticsDeviceScores](../api/intune-userexperienceanalyticsdevicescores-delete.md)|None|Deletes a [userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appReliabilityScore|Double|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|endpointAnalyticsScore|Double|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|manufacturer|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|startupPerformanceScore|Double|**TODO: Add Description**|

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
  "deviceName": "String",
  "model": "String",
  "manufacturer": "String",
  "endpointAnalyticsScore": "Double",
  "startupPerformanceScore": "Double",
  "appReliabilityScore": "Double"
}
```

