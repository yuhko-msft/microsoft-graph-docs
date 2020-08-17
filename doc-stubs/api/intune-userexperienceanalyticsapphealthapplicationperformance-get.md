---
title: "Get userExperienceAnalyticsAppHealthApplicationPerformance"
description: "Read the properties and relationships of a userExperienceAnalyticsAppHealthApplicationPerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get userExperienceAnalyticsAppHealthApplicationPerformance
Namespace: microsoft.graph

Read the properties and relationships of a [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformance/{userExperienceAnalyticsAppHealthApplicationPerformanceId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_userexperienceanalyticsapphealthapplicationperformance"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformance/{userExperienceAnalyticsAppHealthApplicationPerformanceId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance",
    "id": "8b096e1e-6e1e-8b09-1e6e-098b1e6e098b",
    "appName": "String",
    "appFriendlyName": "String",
    "appPublisher": "String",
    "activeDevices": "Integer",
    "totalAppUsageDuration": "Integer",
    "totalAppCrashes": "Integer",
    "totalAppHangs": "Integer",
    "meanTimeToFailure": "Integer",
    "appHealthScore": "Double",
    "appHealthStatus": "String",
    "allOrgsHealthScore": "Double",
    "allOrgsMeanTimeToFailure": "Integer",
    "tenantId": "String",
    "memaTimeGenerated": "String"
  }
}
```

