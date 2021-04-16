---
title: "Create deviceCompliancePolicyAssignment"
description: "Create a new deviceCompliancePolicyAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceCompliancePolicyAssignment
Namespace: microsoft.graph



Create a new deviceCompliancePolicyAssignment object.

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
POST /deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/assignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) object.

The following table shows the properties that are required when you create the [deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|source|deviceAndAppManagementAssignmentSource|The assignment source for the device compliance policy, direct or parcel/policySet. Possible values are: `direct`, `policySets`.|
|sourceId|String|The identifier of the source of the assignment.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|Target for the compliance policy assignment.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicecompliancepolicyassignment_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/deviceCompliancePolicies/{deviceCompliancePolicyId}/assignments
Content-Type: application/json
Content-length: 220

{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyAssignment",
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceCompliancePolicyAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyAssignment",
  "id": "6f7b4a8d-4a8d-6f7b-8d4a-7b6f8d4a7b6f",
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

