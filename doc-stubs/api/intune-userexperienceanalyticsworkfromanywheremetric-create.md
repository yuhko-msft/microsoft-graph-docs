---
title: "Create userExperienceAnalyticsWorkFromAnywhereMetric"
description: "Create a new userExperienceAnalyticsWorkFromAnywhereMetric object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsWorkFromAnywhereMetric
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md) object.

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
POST /deviceManagement/userExperienceAnalyticsWorkFromAnywhereMetrics
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsworkfromanywheremetric_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsWorkFromAnywhereMetrics
Content-Type: application/json
Content-length: 87

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereMetric"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereMetric"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereMetric",
  "id": "ddb90f4b-0f4b-ddb9-4b0f-b9dd4b0fb9dd"
}
```

