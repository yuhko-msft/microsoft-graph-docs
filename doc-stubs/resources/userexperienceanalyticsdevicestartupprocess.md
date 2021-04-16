---
title: "userExperienceAnalyticsDeviceStartupProcess resource type"
description: "The user experience analytics device startup process details."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDeviceStartupProcess resource type

Namespace: microsoft.graph



The user experience analytics device startup process details.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDeviceStartupProcesses](../api/userexperienceanalyticsdevicestartupprocess-list.md)|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) collection|Get a list of the [userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) objects and their properties.|
|[Create userExperienceAnalyticsDeviceStartupProcess](../api/userexperienceanalyticsdevicestartupprocess-create.md)|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md)|Create a new [userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) object.|
|[Get userExperienceAnalyticsDeviceStartupProcess](../api/userexperienceanalyticsdevicestartupprocess-get.md)|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md)|Read the properties and relationships of a [userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) object.|
|[Update userExperienceAnalyticsDeviceStartupProcess](../api/userexperienceanalyticsdevicestartupprocess-update.md)|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md)|Update the properties of a [userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) object.|
|[Delete userExperienceAnalyticsDeviceStartupProcess](../api/userexperienceanalyticsdevicestartupprocess-delete.md)|None|Deletes a [userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|managedDeviceId|String|The user experience analytics device id.|
|processName|String|User experience analytics device startup process name.|
|productName|String|The user experience analytics device startup process product name.|
|publisher|String|The User experience analytics device startup process publisher.|
|startupImpactInMs|Int32|User experience analytics device startup process impact in milliseconds.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceStartupProcess",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupProcess",
  "id": "String (identifier)",
  "managedDeviceId": "String",
  "processName": "String",
  "productName": "String",
  "publisher": "String",
  "startupImpactInMs": "Integer"
}
```

