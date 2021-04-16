---
title: "List accessPackageResourceScopes"
description: "Get the accessPackageResourceScope resources from the accessPackageResourceScopes navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List accessPackageResourceScopes
Namespace: microsoft.graph



Get the accessPackageResourceScope resources from the accessPackageResourceScopes navigation property.

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
GET /identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageCatalog/accessPackageResourceRoles/{accessPackageResourceRoleId}/accessPackageResource/accessPackageResourceScopes
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

If successful, this method returns a `200 OK` response code and a collection of [accessPackageResourceScope](../resources/accesspackageresourcescope.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_accesspackageresourcescope"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageAssignmentPolicies/{accessPackageAssignmentPolicyId}/accessPackage/accessPackageCatalog/accessPackageResourceRoles/{accessPackageResourceRoleId}/accessPackageResource/accessPackageResourceScopes
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.accessPackageResourceScope)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

