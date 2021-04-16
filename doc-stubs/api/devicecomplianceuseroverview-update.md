---
title: "Update deviceComplianceUserOverview"
description: "Update the properties of a deviceComplianceUserOverview object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceComplianceUserOverview
Namespace: microsoft.graph



Update the properties of a [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) object.

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
PATCH /deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/userStatusOverview
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) object.

The following table shows the properties that are required when you update the [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|configurationVersion|Int32|Version of the policy for that overview|
|conflictCount|Int32|Number of users in conflict|
|errorCount|Int32|Number of error Users|
|failedCount|Int32|Number of failed Users|
|lastUpdateDateTime|DateTimeOffset|Last update time|
|notApplicableCount|Int32|Number of not applicable users|
|pendingCount|Int32|Number of pending Users|
|successCount|Int32|Number of succeeded Users|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceComplianceUserOverview](../resources/devicecomplianceuseroverview.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicecomplianceuseroverview"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/userStatusOverview
Content-Type: application/json
Content-length: 339

{
  "@odata.type": "#microsoft.graph.deviceComplianceUserOverview",
  "configurationVersion": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "notApplicableCount": "Integer",
  "pendingCount": "Integer",
  "successCount": "Integer"
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
  "@odata.type": "#microsoft.graph.deviceComplianceUserOverview",
  "id": "800f2134-2134-800f-3421-0f8034210f80",
  "configurationVersion": "Integer",
  "conflictCount": "Integer",
  "errorCount": "Integer",
  "failedCount": "Integer",
  "lastUpdateDateTime": "String (timestamp)",
  "notApplicableCount": "Integer",
  "pendingCount": "Integer",
  "successCount": "Integer"
}
```

