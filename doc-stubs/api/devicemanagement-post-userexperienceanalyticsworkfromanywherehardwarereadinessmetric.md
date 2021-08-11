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

Create a new userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric object.

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
POST /deviceManagement/userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier of the user experience analytics hardware readiness metric object.|
|totalDeviceCount|Int32|The count of total devices in an organization. Valid values -2147483648 to 2147483647|
|upgradeEligibleDeviceCount|Int32|The count of devices in an organization eligible for windows upgrade. Valid values -2147483648 to 2147483647|
|ramCheckFailedPercentage|Double|The percentage of devices for which RAM hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|storageCheckFailedPercentage|Double|The percentage of devices for which storage hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|processorCoreCountCheckFailedPercentage|Double|The percentage of devices for which processor hardware core count check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|processorSpeedCheckFailedPercentage|Double|The percentage of devices for which processor hardware speed check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|tpmCheckFailedPercentage|Double|The percentage of devices for which Trusted Platform Module (TPM) hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|secureBootCheckFailedPercentage|Double|The percentage of devices for which secure boot hardware check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|processorFamilyCheckFailedPercentage|Double|The percentage of devices for which processor hardware family check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|processor64BitCheckFailedPercentage|Double|The percentage of devices for which processor hardware 64-bit architecture check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|osCheckFailedPercentage|Double|The percentage of devices for which OS check has failed. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric](../resources/userexperienceanalyticsworkfromanywherehardwarereadinessmetric.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsworkfromanywherehardwarereadinessmetric_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric
Content-Type: application/json
Content-length: 628

{
  "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric",
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
  "@odata.type": "microsoft.management.services.api.userExperienceAnalyticsWorkFromAnywhereHardwareReadinessMetric"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

