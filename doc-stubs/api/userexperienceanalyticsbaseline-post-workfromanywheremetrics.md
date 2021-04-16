---
title: "Add userExperienceAnalyticsCategory"
description: "Add workFromAnywhereMetrics by posting to the workFromAnywhereMetrics collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add userExperienceAnalyticsCategory
Namespace: microsoft.graph



Add workFromAnywhereMetrics by posting to the workFromAnywhereMetrics collection.

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
POST /deviceManagement/userExperienceAnalyticsBaselines/{userExperienceAnalyticsBaselineId}/workFromAnywhereMetrics/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|insights|[userExperienceAnalyticsInsight](../resources/userexperienceanalyticsinsight.md) collection|The insights for the user experience analytics category.|
|overallScore|Int32|The overall score of the user experience analytics category.|
|state|userExperienceAnalyticsHealthState|The current health state of the user experience analytics category. Possible values are: `unknown`, `insufficientData`, `needsAttention`, `meetingGoals`.|
|totalDevices|Int32|The total device count of the user experience analytics category.|



## Response

If successful, this method returns a `204 No Content` response code and a [userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticscategory_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsBaselines/{userExperienceAnalyticsBaselineId}/workFromAnywhereMetrics/$ref
Content-Type: application/json
Content-length: 263

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsCategory",
  "insights": [
    {
      "@odata.type": "microsoft.graph.userExperienceAnalyticsInsight"
    }
  ],
  "overallScore": "Integer",
  "state": "String",
  "totalDevices": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsCategory"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsCategory",
  "id": "fea35520-5520-fea3-2055-a3fe2055a3fe",
  "insights": [
    {
      "@odata.type": "microsoft.graph.userExperienceAnalyticsInsight"
    }
  ],
  "overallScore": "Integer",
  "state": "String",
  "totalDevices": "Integer"
}
```

