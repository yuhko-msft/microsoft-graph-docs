---
title: "Update userExperienceAnalyticsModelScores"
description: "Update the properties of a userExperienceAnalyticsModelScores object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsModelScores
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [userExperienceAnalyticsModelScores](../resources/intune-userexperienceanalyticsmodelscores.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsModelScores/{userExperienceAnalyticsModelScoresId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsModelScores](../resources/intune-userexperienceanalyticsmodelscores.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsModelScores](../resources/intune-userexperienceanalyticsmodelscores.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|model|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|modelDeviceCount|Int64|**TODO: Add Description**|
|endpointAnalyticsScore|Double|**TODO: Add Description**|
|startupPerformanceScore|Double|**TODO: Add Description**|
|appReliabilityScore|Double|**TODO: Add Description**|
|healthStatus|userExperienceAnalyticsHealthState|**TODO: Add Description**. Possible values are: `unknown`, `insufficientData`, `needsAttention`, `meetingGoals`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsModelScores](../resources/intune-userexperienceanalyticsmodelscores.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsmodelscores"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsModelScores/{userExperienceAnalyticsModelScoresId}
Content-Type: application/json
Content-length: 305

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsModelScores",
  "model": "String",
  "manufacturer": "String",
  "modelDeviceCount": "Integer",
  "endpointAnalyticsScore": "Double",
  "startupPerformanceScore": "Double",
  "appReliabilityScore": "Double",
  "healthStatus": "String"
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
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsModelScores",
  "id": "563dbe93-be93-563d-93be-3d5693be3d56",
  "model": "String",
  "manufacturer": "String",
  "modelDeviceCount": "Integer",
  "endpointAnalyticsScore": "Double",
  "startupPerformanceScore": "Double",
  "appReliabilityScore": "Double",
  "healthStatus": "String"
}
```

