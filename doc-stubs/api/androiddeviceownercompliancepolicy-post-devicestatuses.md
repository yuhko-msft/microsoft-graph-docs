---
title: "Create deviceComplianceDeviceStatus"
description: "Create a new deviceComplianceDeviceStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceComplianceDeviceStatus
Namespace: microsoft.graph



Create a new deviceComplianceDeviceStatus object.

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
POST /deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/deviceStatuses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) object.

The following table shows the properties that are required when you create the [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|The DateTime when device compliance grace period expires|
|deviceDisplayName|String|Device name of the DevicePolicyStatus.|
|deviceModel|String|The device model that is being reported|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|platform|Int32|Platform of the device that is being reported|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userName|String|The User Name that is being reported|
|userPrincipalName|String|UserPrincipalName.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceComplianceDeviceStatus](../resources/devicecompliancedevicestatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicecompliancedevicestatus_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/deviceStatuses
Content-Type: application/json
Content-length: 357

{
  "@odata.type": "#microsoft.graph.deviceComplianceDeviceStatus",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "deviceDisplayName": "String",
  "deviceModel": "String",
  "lastReportedDateTime": "String (timestamp)",
  "platform": "Integer",
  "status": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceComplianceDeviceStatus"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceComplianceDeviceStatus",
  "id": "b9c3daef-daef-b9c3-efda-c3b9efdac3b9",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "deviceDisplayName": "String",
  "deviceModel": "String",
  "lastReportedDateTime": "String (timestamp)",
  "platform": "Integer",
  "status": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

