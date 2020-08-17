---
title: "Add userExperienceAnalyticsMetric"
description: "Add userExperienceAnalyticsMetric by posting to the userExperienceAnalyticsMetric collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add userExperienceAnalyticsMetric
Namespace: microsoft.graph

Add userExperienceAnalyticsMetric by posting to the userExperienceAnalyticsMetric collection.

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
POST /deviceManagement/userExperienceAnalyticsRegressionSummary/modelRegression/$ref
POST /deviceManagement/userExperienceAnalyticsRegressionSummary/manufacturerRegression/$ref
POST /deviceManagement/userExperienceAnalyticsRegressionSummary/operatingSystemRegression/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|Double|**TODO: Add Description**|
|unit|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsmetric_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsRegressionSummary/modelRegression/$ref
Content-Type: application/json
Content-length: 114

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsMetric",
  "value": "Double",
  "unit": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsMetric"
}
-->
``` http
HTTP/1.1 204 No Content

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsMetric",
  "id": "32eef750-f750-32ee-50f7-ee3250f7ee32",
  "value": "Double",
  "unit": "String"
}
```

