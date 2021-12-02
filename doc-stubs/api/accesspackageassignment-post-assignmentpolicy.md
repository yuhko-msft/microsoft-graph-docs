---
title: "Add accessPackageAssignmentPolicy"
description: "Add assignmentPolicy by posting to the assignmentPolicy collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add accessPackageAssignmentPolicy
Namespace: microsoft.graph



Add assignmentPolicy by posting to the assignmentPolicy collection.

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
POST /identityGovernance/entitlementManagement/assignments/{accessPackageAssignmentId}/assignmentPolicy/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object.

You can specify the following properties when creating an **accessPackageAssignmentPolicy**.

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

If successful, this method returns a `204 No Content` response code and an [accessPackageAssignmentPolicy](../resources/accesspackageassignmentpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_accesspackageassignmentpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/assignments/{accessPackageAssignmentId}/assignmentPolicy/$ref
Content-Type: application/json
Content-length: 704

{
  "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentPolicy",
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
  "truncated": true,
  "@odata.type": "Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentPolicy"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageAssignmentPolicy",
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

