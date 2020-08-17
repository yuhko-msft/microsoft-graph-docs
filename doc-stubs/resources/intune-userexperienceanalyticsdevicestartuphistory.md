---
title: "userExperienceAnalyticsDeviceStartupHistory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDeviceStartupHistory resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDeviceStartupHistories](../api/intune-userexperienceanalyticsdevicestartuphistory-list.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/intune-userexperienceanalyticsdevicestartuphistory.md) collection|Get a list of the [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) objects and their properties.|
|[Create userExperienceAnalyticsDeviceStartupHistory](../api/intune-userexperienceanalyticsdevicestartuphistory-create.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/intune-userexperienceanalyticsdevicestartuphistory.md)|Create a new [userExperienceAnalyticsDeviceStartupHistory](../resources/intune-userexperienceanalyticsdevicestartuphistory.md) object.|
|[Get userExperienceAnalyticsDeviceStartupHistory](../api/intune-userexperienceanalyticsdevicestartuphistory-get.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/intune-userexperienceanalyticsdevicestartuphistory.md)|Read the properties and relationships of a [userExperienceAnalyticsDeviceStartupHistory](../resources/intune-userexperienceanalyticsdevicestartuphistory.md) object.|
|[Update userExperienceAnalyticsDeviceStartupHistory](../api/intune-userexperienceanalyticsdevicestartuphistory-update.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/intune-userexperienceanalyticsdevicestartuphistory.md)|Update the properties of a [userExperienceAnalyticsDeviceStartupHistory](../resources/intune-userexperienceanalyticsdevicestartuphistory.md) object.|
|[Delete userExperienceAnalyticsDeviceStartupHistory](../api/intune-userexperienceanalyticsdevicestartuphistory-delete.md)|None|Deletes a [userExperienceAnalyticsDeviceStartupHistory](../resources/intune-userexperienceanalyticsdevicestartuphistory.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|coreBootTimeInMs|Int32|**TODO: Add Description**|
|coreLoginTimeInMs|Int32|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|featureUpdateBootTimeInMs|Int32|**TODO: Add Description**|
|groupPolicyBootTimeInMs|Int32|**TODO: Add Description**|
|groupPolicyLoginTimeInMs|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isFeatureUpdate|Boolean|**TODO: Add Description**|
|isFirstLogin|Boolean|**TODO: Add Description**|
|operatingSystemVersion|String|**TODO: Add Description**|
|responsiveDesktopTimeInMs|Int32|**TODO: Add Description**|
|restartCategory|userExperienceAnalyticsOperatingSystemRestartCategory|**TODO: Add Description**. Possible values are: `unknown`, `restartWithUpdate`, `restartWithoutUpdate`, `blueScreen`, `shutdownWithUpdate`, `shutdownWithoutUpdate`.|
|startTime|DateTimeOffset|**TODO: Add Description**|
|totalBootTimeInMs|Int32|**TODO: Add Description**|
|totalLoginTimeInMs|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceStartupHistory",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupHistory",
  "id": "String (identifier)",
  "deviceId": "String",
  "startTime": "String (timestamp)",
  "coreBootTimeInMs": "Integer",
  "groupPolicyBootTimeInMs": "Integer",
  "featureUpdateBootTimeInMs": "Integer",
  "totalBootTimeInMs": "Integer",
  "groupPolicyLoginTimeInMs": "Integer",
  "coreLoginTimeInMs": "Integer",
  "responsiveDesktopTimeInMs": "Integer",
  "totalLoginTimeInMs": "Integer",
  "isFirstLogin": "Boolean",
  "isFeatureUpdate": "Boolean",
  "operatingSystemVersion": "String",
  "restartCategory": "String"
}
```

