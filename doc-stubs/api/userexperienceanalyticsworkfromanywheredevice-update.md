---
title: "Update userExperienceAnalyticsWorkFromAnywhereDevice"
description: "Update the properties of a userExperienceAnalyticsWorkFromAnywhereDevice object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsWorkFromAnywhereDevice
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /deviceManagement/userExperienceAnalyticsWorkFromAnywhereMetrics/{userExperienceAnalyticsWorkFromAnywhereMetricId}/metricDevices/{userExperienceAnalyticsWorkFromAnywhereDeviceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|autoPilotProfileAssigned|Boolean|The user experience analytics work from anywhere intune device's autopilotProfileAssigned.|
|autoPilotRegistered|Boolean|The user experience work from anywhere intune device's autopilotRegistered.|
|azureAdDeviceId|String|The user experience work from anywhere azure Ad device Id.|
|azureAdJoinType|String|The user experience work from anywhere device's azure Ad joinType.|
|azureAdRegistered|Boolean|The user experience work from anywhere device's azureAdRegistered.|
|deviceName|String|The work from anywhere device's name.|
|managedBy|String|The user experience work from anywhere management agent of the device.|
|manufacturer|String|The user experience work from anywhere device's manufacturer.|
|model|String|The user experience work from anywhere device's model.|
|osDescription|String|The user experience work from anywhere device's OS Description.|
|osVersion|String|The user experience work from anywhere device's OS Version.|
|ownership|String|The user experience work from anywhere device's ownership.|
|serialNumber|String|The user experience work from anywhere device's serial number.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsworkfromanywheredevice"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsWorkFromAnywhereMetrics/{userExperienceAnalyticsWorkFromAnywhereMetricId}/metricDevices/{userExperienceAnalyticsWorkFromAnywhereDeviceId}
Content-Type: application/json
Content-length: 480

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "autoPilotProfileAssigned": "Boolean",
  "autoPilotRegistered": "Boolean",
  "azureAdDeviceId": "String",
  "azureAdJoinType": "String",
  "azureAdRegistered": "Boolean",
  "deviceName": "String",
  "managedBy": "String",
  "manufacturer": "String",
  "model": "String",
  "osDescription": "String",
  "osVersion": "String",
  "ownership": "String",
  "serialNumber": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereDevice",
  "id": "3f2da242-a242-3f2d-42a2-2d3f42a22d3f",
  "autoPilotProfileAssigned": "Boolean",
  "autoPilotRegistered": "Boolean",
  "azureAdDeviceId": "String",
  "azureAdJoinType": "String",
  "azureAdRegistered": "Boolean",
  "deviceName": "String",
  "managedBy": "String",
  "manufacturer": "String",
  "model": "String",
  "osDescription": "String",
  "osVersion": "String",
  "ownership": "String",
  "serialNumber": "String"
}
```

