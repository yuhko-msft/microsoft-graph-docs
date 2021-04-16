---
title: "Update accessPackageAssignment"
description: "Update the properties of an accessPackageAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update accessPackageAssignment
Namespace: microsoft.graph



Update the properties of an [accessPackageAssignment](../resources/accesspackageassignment.md) object.

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
PATCH /identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignmentId}
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackageAssignmentResourceRoles/{accessPackageAssignmentResourceRoleId}/accessPackageAssignments/{accessPackageAssignmentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageAssignment](../resources/accesspackageassignment.md) object.

The following table shows the properties that are required when you update the [accessPackageAssignment](../resources/accesspackageassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessPackageId|String|**TODO: Add Description**|
|assignmentPolicyId|String|**TODO: Add Description**|
|assignmentState|String|**TODO: Add Description**|
|assignmentStatus|String|**TODO: Add Description**|
|catalogId|String|**TODO: Add Description**|
|expiredDateTime|DateTimeOffset|**TODO: Add Description**|
|isExtended|Boolean|**TODO: Add Description**|
|schedule|[requestSchedule](../resources/requestschedule.md)|**TODO: Add Description**|
|targetId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [accessPackageAssignment](../resources/accesspackageassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_accesspackageassignment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageAssignments/{accessPackageAssignmentId}
Content-Type: application/json
Content-length: 397

{
  "@odata.type": "#microsoft.graph.accessPackageAssignment",
  "accessPackageId": "String",
  "assignmentPolicyId": "String",
  "assignmentState": "String",
  "assignmentStatus": "String",
  "catalogId": "String",
  "expiredDateTime": "String (timestamp)",
  "isExtended": "Boolean",
  "schedule": {
    "@odata.type": "microsoft.graph.requestSchedule"
  },
  "targetId": "String"
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
  "@odata.type": "#microsoft.graph.accessPackageAssignment",
  "id": "133d2fdd-2fdd-133d-dd2f-3d13dd2f3d13",
  "accessPackageId": "String",
  "assignmentPolicyId": "String",
  "assignmentState": "String",
  "assignmentStatus": "String",
  "catalogId": "String",
  "expiredDateTime": "String (timestamp)",
  "isExtended": "Boolean",
  "schedule": {
    "@odata.type": "microsoft.graph.requestSchedule"
  },
  "targetId": "String"
}
```

