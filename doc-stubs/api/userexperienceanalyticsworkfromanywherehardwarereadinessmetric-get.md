---
title: "Get userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric"
description: "Read the properties and relationships of a userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.

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
GET /deviceManagement/userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
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

If successful, this method returns a `200 OK` response code and a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_userexperienceanalyticsworkfromanywherehardwarereadinessmetric"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric",
    "id": "d935bcb7-bcb7-d935-b7bc-35d9b7bc35d9",
    "totalDeviceCount": "Integer",
    "upgradeEligibleDeviceCount": "Integer",
    "ramCheckFailedPercentage": "Double",
    "storageCheckFailedPercentage": "Double",
    "processorCoreCountCheckFailedPercentage": "Double",
    "processorSpeedCheckFailedPercentage": "Double",
    "tpmCheckFailedPercentage": "Double",
    "secureBootCheckFailedPercentage": "Double",
    "processorFamilyCheckFailedPercentage": "Double",
    "processor64BitCheckFailedPercentage": "Double",
    "osCheckFailedPercentage": "Double"
  }
}
```

