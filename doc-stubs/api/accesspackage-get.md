---
title: "Get accessPackage"
description: "Read the properties and relationships of an accessPackage object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get accessPackage
Namespace: microsoft.graph



Read the properties and relationships of an [accessPackage](../resources/accesspackage.md) object.

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
GET /identityGovernance/entitlementManagement/accessPackages/{accessPackageId}
GET /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage
GET /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackage
GET /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackage
GET /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageCatalog/accessPackages/{accessPackageId}
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

If successful, this method returns a `200 OK` response code and an [accessPackage](../resources/accesspackage.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_accesspackage"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackages/{accessPackageId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.accessPackage"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.accessPackage",
    "id": "d16961bf-61bf-d169-bf61-69d1bf6169d1",
    "catalogId": "String",
    "createdBy": "String",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "isHidden": "Boolean",
    "isRoleScopesVisible": "Boolean",
    "modifiedBy": "String",
    "modifiedDateTime": "String (timestamp)"
  }
}
```

