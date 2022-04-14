---
title: "Get permissionGrantPreApprovalPolicy"
description: "Read the properties and relationships of a permissionGrantPreApprovalPolicy object."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: apiPageType
---

# Get permissionGrantPreApprovalPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|Policy.Read.PermissionGrant, Policy.ReadWrite.PermissionGrant|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Policy.Read.PermissionGrant, Policy.ReadWrite.PermissionGrant|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /policies/permissionGrantPreApprovalPolicies/{permissionGrantPreApprovalPolicyId}
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

If successful, this method returns a `200 OK` response code and a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_permissiongrantpreapprovalpolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta/policies/permissionGrantPreApprovalPolicies/{permissionGrantPreApprovalPolicyId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.permissionGrantPreApprovalPolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "id": "{permissionGrantPreApprovalPolicyId}",
  "conditions": [
    {
      "scopeType": "Group",
      "scopeSensitivityLabels": {
        "@odata.type": "microsoft.graph.enumeratedSensitivityLabels",
        "labelKind": "enumerated",
        "sensitivityLabels": [
          "{sensitivityLabelsId}"
        ]
      },
      "permissions": {
        "@odata.type": "microsoft.graph.enumeratedPreApprovedPermissions",
        "permissionKind": "enumerated",
        "permissionType": "application",
        "resourceApplicationId": "00000003-0000-0000-c000-000000000000",
        "permissionids": [
          "{permissionId}"
        ]
      }
    }
  ]
}
```

