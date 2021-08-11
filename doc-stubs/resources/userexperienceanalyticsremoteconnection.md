---
title: "userExperienceAnalyticsRemoteConnection resource type"
description: "The user experience analyte remote connection entity."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsRemoteConnection resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analyte remote connection entity.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsRemoteConnections](../api/userexperienceanalyticsremoteconnection-list.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) collection|Get a list of the [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) objects and their properties.|
|[Create userExperienceAnalyticsRemoteConnection](../api/userexperienceanalyticsremoteconnection-create.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md)|Create a new [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object.|
|[Get userExperienceAnalyticsRemoteConnection](../api/userexperienceanalyticsremoteconnection-get.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md)|Read the properties and relationships of a [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object.|
|[Update userExperienceAnalyticsRemoteConnection](../api/userexperienceanalyticsremoteconnection-update.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md)|Update the properties of a [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object.|
|[Delete userExperienceAnalyticsRemoteConnection](../api/userexperienceanalyticsremoteconnection-delete.md)|None|Deletes a [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object.|
|[summarizeDeviceRemoteConnection](../api/userexperienceanalyticsremoteconnection-summarizedeviceremoteconnection.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|cloudPcFailurePercentage|Double|The sign in failure percentage of Cloud PC Device. Valid values 0 to 100|
|cloudPcRoundTripTime|Double|The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|cloudPcSignInTime|Double|The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|coreBootTime|Double|The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|coreSignInTime|Double|The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|deviceCount|Int32|The count of remote connection. Valid values 0 to 2147483647|
|deviceId|String|The id of the device.|
|deviceName|String|The name of the device.|
|id|String|The unique identifier of the user experience analytics remote connection entity.|
|manufacturer|String|The user experience analytics manufacturer.|
|model|String|The user experience analytics device model.|
|remoteSignInTime|Double|The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|userPrincipalName|String|The user experience analytics userPrincipalName.|
|virtualNetwork|String|The user experience analytics virtual network.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsRemoteConnection",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsRemoteConnection",
  "id": "String (identifier)",
  "deviceId": "String",
  "deviceName": "String",
  "model": "String",
  "virtualNetwork": "String",
  "manufacturer": "String",
  "deviceCount": "Integer",
  "cloudPcRoundTripTime": "Double",
  "cloudPcSignInTime": "Double",
  "remoteSignInTime": "Double",
  "coreBootTime": "Double",
  "coreSignInTime": "Double",
  "cloudPcFailurePercentage": "Double",
  "userPrincipalName": "String"
}
```

