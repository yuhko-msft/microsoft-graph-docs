---
title: "Create advancedThreatProtectionOnboardingStateSummary"
description: "Create a new advancedThreatProtectionOnboardingStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create advancedThreatProtectionOnboardingStateSummary
Namespace: microsoft.graph



Create a new [advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md) object.

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
POST ** Collection URI for microsoft.graph.advancedThreatProtectionOnboardingStateSummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md) object.

The following table shows the properties that are required when you create the [advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md).

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

If successful, this method returns a `201 Created` response code and an [advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_advancedthreatprotectiononboardingstatesummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.advancedThreatProtectionOnboardingStateSummary not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.advancedThreatProtectionOnboardingStateSummary"
}
-->
``` http
HTTP/1.1 201 Created
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

