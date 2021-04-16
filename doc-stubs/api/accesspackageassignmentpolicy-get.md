---
title: "Get accessPackageAssignmentPolicy"
description: "Read the properties and relationships of an accessPackageAssignmentPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get accessPackageAssignmentPolicy
Namespace: microsoft.graph



Read the properties and relationships of an [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object.

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
GET /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}
GET /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackageAssignmentPolicy
GET /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_accesspackageassignmentpolicy"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.accessPackageAssignmentPolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.accessPackageAssignmentPolicy",
    "id": "2f66d0a0-d0a0-2f66-a0d0-662fa0d0662f",
    "accessPackageId": "String",
    "accessReviewSettings": {
      "@odata.type": "microsoft.graph.assignmentReviewSettings"
    },
    "canExtend": "Boolean",
    "createdBy": "String",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "durationInDays": "Integer",
    "expirationDateTime": "String (timestamp)",
    "modifiedBy": "String",
    "modifiedDateTime": "String (timestamp)",
    "questions": [
      {
        "@odata.type": "microsoft.graph.accessPackageMultipleChoiceQuestion"
      }
    ],
    "requestApprovalSettings": {
      "@odata.type": "microsoft.graph.approvalSettings"
    },
    "requestorSettings": {
      "@odata.type": "microsoft.graph.requestorSettings"
    }
  }
}
```

