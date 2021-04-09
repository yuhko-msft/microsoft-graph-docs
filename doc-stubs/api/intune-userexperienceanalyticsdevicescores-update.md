---
title: "Update userExperienceAnalyticsDeviceScores"
description: "Update the properties of a userExperienceAnalyticsDeviceScores object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsDeviceScores
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsDeviceScores/{userExperienceAnalyticsDeviceScoresId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceName|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|endpointAnalyticsScore|Double|**TODO: Add Description**|
|startupPerformanceScore|Double|**TODO: Add Description**|
|appReliabilityScore|Double|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsDeviceScores](../resources/intune-userexperienceanalyticsdevicescores.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsdevicescores"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsDeviceScores/{userExperienceAnalyticsDeviceScoresId}
Content-Type: application/json
Content-length: 270

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceScores",
  "deviceName": "String",
  "model": "String",
  "manufacturer": "String",
  "endpointAnalyticsScore": "Double",
  "startupPerformanceScore": "Double",
  "appReliabilityScore": "Double"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceScores",
  "id": "a41000d3-00d3-a410-d300-10a4d30010a4",
  "deviceName": "String",
  "model": "String",
  "manufacturer": "String",
  "endpointAnalyticsScore": "Double",
  "startupPerformanceScore": "Double",
  "appReliabilityScore": "Double"
}
```

