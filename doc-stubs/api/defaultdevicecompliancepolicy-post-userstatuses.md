---
title: "Create deviceComplianceUserStatus"
description: "Create a new deviceComplianceUserStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceComplianceUserStatus
Namespace: microsoft.graph



Create a new deviceComplianceUserStatus object.

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
POST /deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/userStatuses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) object.

The following table shows the properties that are required when you create the [deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|devicesCount|Int32|Devices count for that user.|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userDisplayName|String|User name of the DevicePolicyStatus.|
|userPrincipalName|String|UserPrincipalName.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceComplianceUserStatus](../resources/devicecomplianceuserstatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicecomplianceuserstatus_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/userStatuses
Content-Type: application/json
Content-length: 236

{
  "@odata.type": "#microsoft.graph.deviceComplianceUserStatus",
  "devicesCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "status": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceComplianceUserStatus"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceComplianceUserStatus",
  "id": "3d8ef606-f606-3d8e-06f6-8e3d06f68e3d",
  "devicesCount": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "status": "String",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

