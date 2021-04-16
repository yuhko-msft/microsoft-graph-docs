---
title: "Create deviceManagementAutopilotPolicyStatusDetail"
description: "Create a new deviceManagementAutopilotPolicyStatusDetail object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceManagementAutopilotPolicyStatusDetail
Namespace: microsoft.graph



Create a new [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) object.

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
POST /deviceManagement/autopilotEvents/{deviceManagementAutopilotEventId}/policyStatusDetails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) object.

The following table shows the properties that are required when you create the [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|complianceStatus|deviceManagementAutopilotPolicyComplianceStatus|The policy compliance status. Possible values are: `unknown`, `compliant`, `installed`, `notCompliant`, `notInstalled`, `error`.|
|displayName|String|The friendly name of the policy.|
|errorCode|Int32|The errorode associated with the compliance or enforcement status of the policy. Error code for enforcement status takes precedence if it exists.|
|lastReportedDateTime|DateTimeOffset|Timestamp of the reported policy status|
|policyType|deviceManagementAutopilotPolicyType|The type of policy. Possible values are: `unknown`, `application`, `appModel`, `configurationPolicy`.|
|trackedOnEnrollmentStatus|Boolean|Indicates if this prolicy was tracked as part of the autopilot bootstrap enrollment sync session|



## Response

If successful, this method returns a `201 Created` response code and a [deviceManagementAutopilotPolicyStatusDetail](../resources/devicemanagementautopilotpolicystatusdetail.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementautopilotpolicystatusdetail_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/autopilotEvents/{deviceManagementAutopilotEventId}/policyStatusDetails
Content-Type: application/json
Content-length: 292

{
  "@odata.type": "#microsoft.graph.deviceManagementAutopilotPolicyStatusDetail",
  "complianceStatus": "String",
  "displayName": "String",
  "errorCode": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "policyType": "String",
  "trackedOnEnrollmentStatus": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementAutopilotPolicyStatusDetail"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagementAutopilotPolicyStatusDetail",
  "id": "79eebfab-bfab-79ee-abbf-ee79abbfee79",
  "complianceStatus": "String",
  "displayName": "String",
  "errorCode": "Integer",
  "lastReportedDateTime": "String (timestamp)",
  "policyType": "String",
  "trackedOnEnrollmentStatus": "Boolean"
}
```

