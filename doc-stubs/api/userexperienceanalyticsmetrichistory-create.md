---
title: "Create userExperienceAnalyticsMetricHistory"
description: "Create a new userExperienceAnalyticsMetricHistory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsMetricHistory
Namespace: microsoft.graph



Create a new [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) object.

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
POST /deviceManagement/userExperienceAnalyticsMetricHistory
POST /deviceManagement/userExperienceAnalyticsDeviceMetricHistory
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceId|String|The user experience analytics device id.|
|metricDateTime|DateTimeOffset|The user experience analytics metric date time.|
|metricType|String|The user experience analytics metric type.|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsmetrichistory_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsMetricHistory
Content-Type: application/json
Content-length: 173

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsMetricHistory",
  "deviceId": "String",
  "metricDateTime": "String (timestamp)",
  "metricType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsMetricHistory"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsMetricHistory",
  "id": "086f8edb-8edb-086f-db8e-6f08db8e6f08",
  "deviceId": "String",
  "metricDateTime": "String (timestamp)",
  "metricType": "String"
}
```

