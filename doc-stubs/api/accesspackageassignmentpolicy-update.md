---
title: "Update accessPackageAssignmentPolicy"
description: "Update the properties of an accessPackageAssignmentPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
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
PATCH /identityGovernance/entitlementManagement/assignmentPolicies/{accessPackageAssignmentPolicyId}
PATCH /identityGovernance/entitlementManagement/assignments/{accessPackageAssignmentId}/assignmentPolicy
PATCH /identityGovernance/entitlementManagement/catalogs/{accessPackageCatalogId}/accessPackages/{accessPackageId}/assignmentPolicies/{accessPackageAssignmentPolicyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|allowedTargetScope|allowedTargetScope|**TODO: Add Description**. The possible values are: `notSpecified`, `specificDirectoryUsers`, `specificConnectedOrganizationUsers`, `specificDirectoryServicePrincipals`, `allMemberUsers`, `allDirectoryUsers`, `allDirectoryServicePrincipals`, `allConfiguredConnectedOrganizationUsers`, `allExternalUsers`, `unknownFutureValue`. Optional.|
|specificAllowedTargets|[Microsoft.IGAELM.EC.FrontEnd.ExternalModel.subjectSet](../resources/subjectset.md) collection|**TODO: Add Description** Optional.|
|expiration|[Microsoft.IGAELM.EC.FrontEnd.ExternalModel.expirationPattern](../resources/expirationpattern.md)|**TODO: Add Description** Optional.|
|requestorSettings|[Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentRequestorSettings](../resources/accesspackageassignmentrequestorsettings.md)|**TODO: Add Description** Optional.|
|requestApprovalSettings|[Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentApprovalSettings](../resources/accesspackageassignmentapprovalsettings.md)|**TODO: Add Description** Optional.|
|reviewSettings|[Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentReviewSettings](../resources/accesspackageassignmentreviewsettings.md)|**TODO: Add Description** Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|



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
PATCH https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/assignmentPolicies/{accessPackageAssignmentPolicyId}
Content-Type: application/json
Content-length: 677

{
  "@odata.type": "#microsoft.graph.accessPackageAssignmentPolicy",
  "displayName": "String",
  "description": "String",
  "allowedTargetScope": "String",
  "specificAllowedTargets": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ],
  "expiration": {
    "@odata.type": "microsoft.graph.expirationPattern"
  },
  "requestorSettings": {
    "@odata.type": "microsoft.graph.accessPackageAssignmentRequestorSettings"
  },
  "requestApprovalSettings": {
    "@odata.type": "microsoft.graph.accessPackageAssignmentApprovalSettings"
  },
  "reviewSettings": {
    "@odata.type": "microsoft.graph.accessPackageAssignmentReviewSettings"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
  "id": "87e1c7f7-c7f7-87e1-f7c7-e187f7c7e187",
  "displayName": "String",
  "description": "String",
  "allowedTargetScope": "String",
  "specificAllowedTargets": [
    {
      "@odata.type": "microsoft.graph.singleUser"
    }
  ],
  "expiration": {
    "@odata.type": "microsoft.graph.expirationPattern"
  },
  "requestorSettings": {
    "@odata.type": "microsoft.graph.accessPackageAssignmentRequestorSettings"
  },
  "requestApprovalSettings": {
    "@odata.type": "microsoft.graph.accessPackageAssignmentApprovalSettings"
  },
  "reviewSettings": {
    "@odata.type": "microsoft.graph.accessPackageAssignmentReviewSettings"
  },
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)"
}
```

