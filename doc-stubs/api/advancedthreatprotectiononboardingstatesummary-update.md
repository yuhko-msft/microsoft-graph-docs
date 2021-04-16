---
title: "Update advancedThreatProtectionOnboardingStateSummary"
description: "Update the properties of an advancedThreatProtectionOnboardingStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update advancedThreatProtectionOnboardingStateSummary
Namespace: microsoft.graph



Update the properties of an [advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md) object.

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
PATCH /deviceManagement/advancedThreatProtectionOnboardingStateSummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md) object.

The following table shows the properties that are required when you update the [advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|compliantDeviceCount|Int32|Number of compliant devices|
|conflictDeviceCount|Int32|Number of conflict devices|
|errorDeviceCount|Int32|Number of error devices|
|nonCompliantDeviceCount|Int32|Number of NonCompliant devices|
|notApplicableDeviceCount|Int32|Number of not applicable devices|
|notAssignedDeviceCount|Int32|Number of not assigned devices|
|remediatedDeviceCount|Int32|Number of remediated devices|
|unknownDeviceCount|Int32|Number of unknown devices|



## Response

If successful, this method returns a `200 OK` response code and an updated [advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_advancedthreatprotectiononboardingstatesummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/advancedThreatProtectionOnboardingStateSummary
Content-Type: application/json
Content-length: 395

{
  "@odata.type": "#microsoft.graph.advancedThreatProtectionOnboardingStateSummary",
  "compliantDeviceCount": "Integer",
  "conflictDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "nonCompliantDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "notAssignedDeviceCount": "Integer",
  "remediatedDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
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
  "@odata.type": "#microsoft.graph.advancedThreatProtectionOnboardingStateSummary",
  "id": "cf589417-9417-cf58-1794-58cf179458cf",
  "compliantDeviceCount": "Integer",
  "conflictDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "nonCompliantDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "notAssignedDeviceCount": "Integer",
  "remediatedDeviceCount": "Integer",
  "unknownDeviceCount": "Integer"
}
```

