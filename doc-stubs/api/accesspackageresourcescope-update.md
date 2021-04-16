---
title: "Update accessPackageResourceScope"
description: "Update the properties of an accessPackageResourceScope object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update accessPackageResourceScope
Namespace: microsoft.graph



Update the properties of an [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object.

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
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageCatalog/accessPackageResourceScopes/{accessPackageResourceScopeId}
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageResourceRoleScopes/{accessPackageResourceRoleScopeId}/accessPackageResourceScope
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentRequests/{accessPackageAssignmentRequestId}/accessPackageAssignment/accessPackageAssignmentResourceRoles/{accessPackageAssignmentResourceRoleId}/accessPackageResourceScope
PATCH /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageCatalog/accessPackageResourceRoles/{accessPackageResourceRoleId}/accessPackageResource/accessPackageResourceScopes/{accessPackageResourceScopeId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object.

The following table shows the properties that are required when you update the [accessPackageResourceScope](../resources/accesspackageresourcescope.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isRootScope|Boolean|**TODO: Add Description**|
|originId|String|**TODO: Add Description**|
|originSystem|String|**TODO: Add Description**|
|roleOriginId|String|**TODO: Add Description**|
|url|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [accessPackageResourceScope](../resources/accesspackageresourcescope.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_accesspackageresourcescope"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageCatalog/accessPackageResourceScopes/{accessPackageResourceScopeId}
Content-Type: application/json
Content-length: 256

{
  "@odata.type": "#microsoft.graph.accessPackageResourceScope",
  "description": "String",
  "displayName": "String",
  "isRootScope": "Boolean",
  "originId": "String",
  "originSystem": "String",
  "roleOriginId": "String",
  "url": "String"
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
  "@odata.type": "#microsoft.graph.accessPackageResourceScope",
  "id": "c0a0e9f4-e9f4-c0a0-f4e9-a0c0f4e9a0c0",
  "description": "String",
  "displayName": "String",
  "isRootScope": "Boolean",
  "originId": "String",
  "originSystem": "String",
  "roleOriginId": "String",
  "url": "String"
}
```

