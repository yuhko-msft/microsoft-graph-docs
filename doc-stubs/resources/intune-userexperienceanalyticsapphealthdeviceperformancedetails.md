---
title: "userExperienceAnalyticsAppHealthDevicePerformanceDetails resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthDevicePerformanceDetails resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/intune-userexperienceanalyticsapphealthdeviceperformancedetails-list.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) collection|Get a list of the [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/intune-userexperienceanalyticsapphealthdeviceperformancedetails-create.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md)|Create a new [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) object.|
|[Get userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/intune-userexperienceanalyticsapphealthdeviceperformancedetails-get.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) object.|
|[Update userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/intune-userexperienceanalyticsapphealthdeviceperformancedetails-update.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md)|Update the properties of a [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) object.|
|[Delete userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/intune-userexperienceanalyticsapphealthdeviceperformancedetails-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appDisplayName|String|**TODO: Add Description**|
|appPublisher|String|**TODO: Add Description**|
|appVersion|String|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|eventDateTime|DateTimeOffset|**TODO: Add Description**|
|eventType|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

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
  "eventDateTime": "String (timestamp)",
  "eventType": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "deviceId": "String",
  "deviceDisplayName": "String"
}
```

