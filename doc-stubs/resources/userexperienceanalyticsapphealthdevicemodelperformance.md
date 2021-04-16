---
title: "userExperienceAnalyticsAppHealthDeviceModelPerformance resource type"
description: "The user experience analytics device model performance entity contains device model performance details."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthDeviceModelPerformance resource type

Namespace: microsoft.graph



The user experience analytics device model performance entity contains device model performance details.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthDeviceModelPerformances](../api/userexperienceanalyticsapphealthdevicemodelperformance-list.md)|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) collection|Get a list of the [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-create.md)|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md)|Create a new [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) object.|
|[Get userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-get.md)|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) object.|
|[Update userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-update.md)|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md)|Update the properties of a [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) object.|
|[Delete userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/userexperienceanalyticsapphealthdevicemodelperformance-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeDeviceCount|Int32|The number of active devices for the model. Valid values -2147483648 to 2147483647|
|deviceManufacturer|String|The manufacturer name of the device.|
|deviceModel|String|The model name of the device.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the model device in minutes. Valid values -2147483648 to 2147483647|
|modelAppHealthScore|Double|The app health score of the device model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|modelAppHealthStatus|String|The overall app health status of the device model.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthDeviceModelPerformance",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDeviceModelPerformance",
  "id": "String (identifier)",
  "activeDeviceCount": "Integer",
  "deviceManufacturer": "String",
  "deviceModel": "String",
  "meanTimeToFailureInMinutes": "Integer",
  "modelAppHealthScore": "Double",
  "modelAppHealthStatus": "String"
}
```

