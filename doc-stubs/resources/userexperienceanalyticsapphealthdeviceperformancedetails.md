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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics device performance entity contains device performance details.

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
|appPublisher|String|The publisher of the application.|
|appVersion|String|The version of the application.|
|deviceDisplayName|String|The name of the device.|
|deviceId|String|The id of the device.|
|eventDateTime|DateTimeOffset|The time the event occurred.|
|eventType|String|The type of the event.|
|id|String|The unique identifier of the user experience analytics device performance object.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "id": "String (identifier)",
  "eventDateTime": "String (timestamp)",
  "eventType": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "deviceId": "String",
  "deviceDisplayName": "String"
}
```

