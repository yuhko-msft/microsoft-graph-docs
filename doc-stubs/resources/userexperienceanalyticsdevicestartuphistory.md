---
title: "userExperienceAnalyticsDeviceStartupHistory resource type"
description: "The user experience analytics device startup history entity contains device boot performance history details."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsDeviceStartupHistory resource type

Namespace: microsoft.graph



The user experience analytics device startup history entity contains device boot performance history details.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsDeviceStartupHistories](../api/userexperienceanalyticsdevicestartuphistory-list.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) collection|Get a list of the [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) objects and their properties.|
|[Create userExperienceAnalyticsDeviceStartupHistory](../api/userexperienceanalyticsdevicestartuphistory-create.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md)|Create a new [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object.|
|[Get userExperienceAnalyticsDeviceStartupHistory](../api/userexperienceanalyticsdevicestartuphistory-get.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md)|Read the properties and relationships of a [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object.|
|[Update userExperienceAnalyticsDeviceStartupHistory](../api/userexperienceanalyticsdevicestartuphistory-update.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md)|Update the properties of a [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object.|
|[Delete userExperienceAnalyticsDeviceStartupHistory](../api/userexperienceanalyticsdevicestartuphistory-delete.md)|None|Deletes a [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|coreBootTimeInMs|Int32|The user experience analytics device core boot time in milliseconds.|
|coreLoginTimeInMs|Int32|The user experience analytics device core login time in milliseconds.|
|deviceId|String|The user experience analytics device id.|
|featureUpdateBootTimeInMs|Int32|The user experience analytics device feature update time in milliseconds.|
|groupPolicyBootTimeInMs|Int32|The User experience analytics Device group policy boot time in milliseconds.|
|groupPolicyLoginTimeInMs|Int32|The User experience analytics Device group policy login time in milliseconds.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isFeatureUpdate|Boolean|The user experience analytics device boot record is a feature update.|
|isFirstLogin|Boolean|The user experience analytics device first login.|
|operatingSystemVersion|String|The user experience analytics device boot record's operating system version.|
|responsiveDesktopTimeInMs|Int32|The user experience analytics responsive desktop time in milliseconds.|
|restartCategory|userExperienceAnalyticsOperatingSystemRestartCategory|OS restart category. Possible values are: `unknown`, `restartWithUpdate`, `restartWithoutUpdate`, `blueScreen`, `shutdownWithUpdate`, `shutdownWithoutUpdate`, `longPowerButtonPress`, `bootError`, `update`.|
|restartFaultBucket|String|OS restart fault bucket. The fault bucket is used to find additional information about a system crash.|
|restartStopCode|String|OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason.|
|startTime|DateTimeOffset|The user experience analytics device boot start time.|
|totalBootTimeInMs|Int32|The user experience analytics device total boot time in milliseconds.|
|totalLoginTimeInMs|Int32|The user experience analytics device total login time in milliseconds.|

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
  "coreBootTimeInMs": "Integer",
  "coreLoginTimeInMs": "Integer",
  "deviceId": "String",
  "featureUpdateBootTimeInMs": "Integer",
  "groupPolicyBootTimeInMs": "Integer",
  "groupPolicyLoginTimeInMs": "Integer",
  "isFeatureUpdate": "Boolean",
  "isFirstLogin": "Boolean",
  "operatingSystemVersion": "String",
  "responsiveDesktopTimeInMs": "Integer",
  "restartCategory": "String",
  "restartFaultBucket": "String",
  "restartStopCode": "String",
  "startTime": "String (timestamp)",
  "totalBootTimeInMs": "Integer",
  "totalLoginTimeInMs": "Integer"
}
```

