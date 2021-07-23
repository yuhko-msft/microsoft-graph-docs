---
title: "Create userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric"
description: "Create a new userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.

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
POST ** Collection URI for microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|totalDeviceCount|Int32|**TODO: Add Description**|
|upgradeEligibleDeviceCount|Int32|**TODO: Add Description**|
|ramCheckFailedPercentage|Double|**TODO: Add Description**|
|storageCheckFailedPercentage|Double|**TODO: Add Description**|
|processorCoreCountCheckFailedPercentage|Double|**TODO: Add Description**|
|processorSpeedCheckFailedPercentage|Double|**TODO: Add Description**|
|tpmCheckFailedPercentage|Double|**TODO: Add Description**|
|secureBootCheckFailedPercentage|Double|**TODO: Add Description**|
|processorFamilyCheckFailedPercentage|Double|**TODO: Add Description**|
|processor64BitCheckFailedPercentage|Double|**TODO: Add Description**|
|osCheckFailedPercentage|Double|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/intune-userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsworkfromanywherehardwarereadinessmetric_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric not found
Content-Type: application/json
Content-length: 610

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric",
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
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric",
  "id": "a421eed5-eed5-a421-d5ee-21a4d5ee21a4",
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
```

