---
title: "Update userExperienceAnalyticsAppHealthApplicationPerformance"
description: "Update the properties of a userExperienceAnalyticsAppHealthApplicationPerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsAppHealthApplicationPerformance
Namespace: microsoft.graph

Update the properties of a [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformance/{userExperienceAnalyticsAppHealthApplicationPerformanceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appName|String|**TODO: Add Description**|
|appFriendlyName|String|**TODO: Add Description**|
|appPublisher|String|**TODO: Add Description**|
|activeDevices|Int32|**TODO: Add Description**|
|totalAppUsageDuration|Int32|**TODO: Add Description**|
|totalAppCrashes|Int32|**TODO: Add Description**|
|totalAppHangs|Int32|**TODO: Add Description**|
|meanTimeToFailure|Int32|**TODO: Add Description**|
|appHealthScore|Double|**TODO: Add Description**|
|appHealthStatus|String|**TODO: Add Description**|
|allOrgsHealthScore|Double|**TODO: Add Description**|
|allOrgsMeanTimeToFailure|Int32|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|memaTimeGenerated|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsAppHealthApplicationPerformance](../resources/intune-userexperienceanalyticsapphealthapplicationperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsapphealthapplicationperformance"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformance/{userExperienceAnalyticsAppHealthApplicationPerformanceId}
Content-Type: application/json
Content-length: 549

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthApplicationPerformance",
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
```

