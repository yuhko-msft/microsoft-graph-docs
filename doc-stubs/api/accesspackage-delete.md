---
title: "Delete accessPackage"
description: "Deletes an accessPackage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Delete accessPackage
Namespace: microsoft.graph



Deletes an [accessPackage](../resources/accesspackage.md) object.

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
DELETE /identityGovernance/entitlementManagement/accessPackages/{accessPackageId}
DELETE /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage
DELETE /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackage
DELETE /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackage
DELETE /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageCatalog/accessPackages/{accessPackageId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "delete_accesspackage"
}
-->
``` http
DELETE https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackages/{accessPackageId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```

