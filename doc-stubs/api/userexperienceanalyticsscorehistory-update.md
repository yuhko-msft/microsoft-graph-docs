---
title: "Update userExperienceAnalyticsScoreHistory"
description: "Update the properties of a userExperienceAnalyticsScoreHistory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsScoreHistory
Namespace: microsoft.graph



Update the properties of a [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsScoreHistory/{userExperienceAnalyticsScoreHistoryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|coreBootScore|Int32|The user experience analytics device core boot score. Score will be in the range 0-100, 100 is the ideal score.|
|coreSigninScore|Int32|The User experience analytics device core sign-in score. Score will be in the range 0-100, 100 is the ideal score.|
|recommendedSoftwareScore|Int32|The User experience analytics device core sign-in score. Score will be in the range 0-100, 100 is the ideal score.|
|restartScore|Int32|Restart score. Score will be in the range 0-100, 100 is the ideal score, 0 indicates excessive restarts. Valid values 0 to 9999999|
|startupDateTime|DateTimeOffset|The user experience analytics device startup date time.|
|startupScore|Int32|User experience analytics device startup score. Score will be in the range 0-100, 100 is the ideal score.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsscorehistory"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsScoreHistory/{userExperienceAnalyticsScoreHistoryId}
Content-Type: application/json
Content-length: 287

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsScoreHistory",
  "coreBootScore": "Integer",
  "coreSigninScore": "Integer",
  "recommendedSoftwareScore": "Integer",
  "restartScore": "Integer",
  "startupDateTime": "String (timestamp)",
  "startupScore": "Integer"
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
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsScoreHistory",
  "id": "446ef65b-f65b-446e-5bf6-6e445bf66e44",
  "coreBootScore": "Integer",
  "coreSigninScore": "Integer",
  "recommendedSoftwareScore": "Integer",
  "restartScore": "Integer",
  "startupDateTime": "String (timestamp)",
  "startupScore": "Integer"
}
```

