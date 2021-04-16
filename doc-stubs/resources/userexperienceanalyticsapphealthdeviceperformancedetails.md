---
title: "userExperienceAnalyticsAppHealthDevicePerformanceDetails resource type"
description: "The user experience analytics device performance entity contains device performance details."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthDevicePerformanceDetails resource type

Namespace: microsoft.graph



The user experience analytics device performance entity contains device performance details.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-list.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) collection|Get a list of the [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-create.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md)|Create a new [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) object.|
|[Get userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-get.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) object.|
|[Update userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-update.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md)|Update the properties of a [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) object.|
|[Delete userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/userexperienceanalyticsapphealthdeviceperformancedetails-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appDisplayName|String|The friendly name of the application for which the event occurred.|
|deviceDisplayName|String|The name of the device.|
|deviceId|String|The id of the device.|
|eventDateTime|DateTimeOffset|The time the event occurred.|
|eventType|String|The type of the event.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "id": "String (identifier)",
  "appDisplayName": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "eventDateTime": "String (timestamp)",
  "eventType": "String"
}
```

