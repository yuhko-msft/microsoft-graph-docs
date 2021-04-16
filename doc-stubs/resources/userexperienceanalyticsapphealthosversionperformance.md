---
title: "userExperienceAnalyticsAppHealthOSVersionPerformance resource type"
description: "The user experience analytics device OS version performance entity contains OS version performance details."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsAppHealthOSVersionPerformance resource type

Namespace: microsoft.graph



The user experience analytics device OS version performance entity contains OS version performance details.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsAppHealthOSVersionPerformances](../api/userexperienceanalyticsapphealthosversionperformance-list.md)|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) collection|Get a list of the [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) objects and their properties.|
|[Create userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-create.md)|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md)|Create a new [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) object.|
|[Get userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-get.md)|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md)|Read the properties and relationships of a [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) object.|
|[Update userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-update.md)|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md)|Update the properties of a [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) object.|
|[Delete userExperienceAnalyticsAppHealthOSVersionPerformance](../api/userexperienceanalyticsapphealthosversionperformance-delete.md)|None|Deletes a [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeDeviceCount|Int32|The number of active devices for the OS version. Valid values -2147483648 to 2147483647|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the OS version in minutes. Valid values -2147483648 to 2147483647|
|osBuildNumber|String|The OS build number installed on the device.|
|osVersion|String|The OS version installed on the device.|
|osVersionAppHealthScore|Double|The app health score of the OS version. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|osVersionAppHealthStatus|String|The overall app health status of the OS version.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthOSVersionPerformance",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthOSVersionPerformance",
  "id": "String (identifier)",
  "activeDeviceCount": "Integer",
  "meanTimeToFailureInMinutes": "Integer",
  "osBuildNumber": "String",
  "osVersion": "String",
  "osVersionAppHealthScore": "Double",
  "osVersionAppHealthStatus": "String"
}
```

