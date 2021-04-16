---
title: "Update accessPackageAssignmentPolicy"
description: "Update the properties of an accessPackageAssignmentPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update accessPackageAssignmentPolicy
Namespace: microsoft.graph



Update the properties of an [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object.

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
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackageAssignmentPolicy
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object.

The following table shows the properties that are required when you update the [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessPackageId|String|**TODO: Add Description**|
|accessReviewSettings|[assignmentReviewSettings](../resources/assignmentreviewsettings.md)|**TODO: Add Description**|
|canExtend|Boolean|**TODO: Add Description**|
|createdBy|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|durationInDays|Int32|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|modifiedBy|String|**TODO: Add Description**|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|questions|[accessPackageQuestion](../resources/accesspackagequestion.md) collection|**TODO: Add Description**|
|requestApprovalSettings|[approvalSettings](../resources/approvalsettings.md)|**TODO: Add Description**|
|requestorSettings|[requestorSettings](../resources/requestorsettings.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_accesspackageassignmentpolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}
Content-Type: application/json
Content-length: 711

{
  "@odata.type": "#microsoft.graph.accessPackageAssignmentPolicy",
  "accessPackageId": "String",
  "accessReviewSettings": {
    "@odata.type": "microsoft.graph.assignmentReviewSettings"
  },
  "canExtend": "Boolean",
  "createdBy": "String",
  "description": "String",
  "displayName": "String",
  "durationInDays": "Integer",
  "expirationDateTime": "String (timestamp)",
  "modifiedBy": "String",
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
```

