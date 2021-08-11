---
title: "Create userExperienceAnalyticsScoreHistory"
description: "Create a new userExperienceAnalyticsScoreHistory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsScoreHistory
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) object.

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
POST /deviceManagement/userExperienceAnalyticsScoreHistory
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier of the user experience analytics device startup process.|
|startupDateTime|DateTimeOffset|The user experience analytics device startup date time.|
|overallScore|Int32|User experience analytics overall score. Score will be in the range 0-100, 100 is the ideal score. Valid values 0 to 100|
|startupScore|Int32|User experience analytics device startup score. Score will be in the range 0-100, 100 is the ideal score.|
|coreBootScore|Int32|The user experience analytics device core boot score. Score will be in the range 0-100, 100 is the ideal score.|
|coreSigninScore|Int32|The User experience analytics device core sign-in score. Score will be in the range 0-100, 100 is the ideal score.|
|recommendedSoftwareScore|Int32|The User experience analytics device core sign-in score. Score will be in the range 0-100, 100 is the ideal score.|
|appHealthOverallScore|Int32|The User experience analytics app health overall score.|
|startupTotalDevices|Int32|The total device count of the user experience analytics category startup performance.|
|recommendedSoftwareTotalDevices|Int32|The total device count of the user experience analytics category recommended software.|
|appHealthTotalDevices|Int32|The total device count of the user experience analytics category app health.|
|restartScore|Int32|Restart score. Score will be in the range 0-100, 100 is the ideal score, 0 indicates excessive restarts. Valid values 0 to 9999999|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsscorehistory_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsScoreHistory
Content-Type: application/json
Content-length: 499

{
  "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsScoreHistory",
  "startupDateTime": "String (timestamp)",
  "overallScore": "Integer",
  "startupScore": "Integer",
  "coreBootScore": "Integer",
  "coreSigninScore": "Integer",
  "recommendedSoftwareScore": "Integer",
  "appHealthOverallScore": "Integer",
  "startupTotalDevices": "Integer",
  "recommendedSoftwareTotalDevices": "Integer",
  "appHealthTotalDevices": "Integer",
  "restartScore": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.userExperienceAnalyticsScoreHistory"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsScoreHistory",
  "id": "8e1ca7af-a7af-8e1c-afa7-1c8eafa71c8e",
  "startupDateTime": "String (timestamp)",
  "overallScore": "Integer",
  "startupScore": "Integer",
  "coreBootScore": "Integer",
  "coreSigninScore": "Integer",
  "recommendedSoftwareScore": "Integer",
  "appHealthOverallScore": "Integer",
  "startupTotalDevices": "Integer",
  "recommendedSoftwareTotalDevices": "Integer",
  "appHealthTotalDevices": "Integer",
  "restartScore": "Integer"
}
```

