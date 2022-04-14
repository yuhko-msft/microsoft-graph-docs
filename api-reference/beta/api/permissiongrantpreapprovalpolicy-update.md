---
title: "Update permissionGrantPreApprovalPolicy"
description: "Update the properties of a permissionGrantPreApprovalPolicy object."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: apiPageType
---

# Update permissionGrantPreApprovalPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|Policy.ReadWrite.PermissionGrant|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Policy.ReadWrite.PermissionGrant|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /policies/permissionGrantPreApprovalPolicies/{permissionGrantPreApprovalPolicyId}
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
|conditions|[preApprovalDetail](../resources/preapprovaldetail.md) collection| A list of conditions that tenant admin has pre-approved for the given service principal.	Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_permissiongrantpreapprovalpolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/policies/permissionGrantPreApprovalPolicies/{permissionGrantPreApprovalPolicyId}
Content-Type: application/json
Content-length: 215

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


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```

