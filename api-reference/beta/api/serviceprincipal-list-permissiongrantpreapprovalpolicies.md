---
title: "Retrieve permissionGrantPreApprovalPolicy from serviceprincipal"
description: "Retrieve the permissionGrantPreApprovalPolicy object from serviceprincipal."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: apiPageType
---

# servicePrincipal: List permissionGrantPreApprovalPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Retrieve the [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object of the [servicePrincipal](../resources/serviceprincipal.md).

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
GET /servicePrincipals/{id}/permissionGrantPreApprovalPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
Do not supply a request body for this method.



## Response

If successful, this method returns a `200 OK` response code and a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object in the response body.

## Examples


### Request
<!-- {
  "blockType": "request",
  "name": "serviceprincipal_get_permissionGrantPreApprovalPolicies"
}
-->
``` http
GET /servicePrincipals/{id}/permissionGrantPreApprovalPolicies/{id}

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
Content-type: application/json

{
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#policies/permissionGrantPreApprovalPolicies/$entity",
    "id": "{ id }",
    "deletedDateTime": null,
    "conditions": [
        {
            "scopeType": "chat",
            "sensitivityLabels": {
                "@odata.type": "#microsoft.graph.enumeratedScopeSensitivityLabels",
                "labelKind": "enumerated",
                "sensitivityLabels": [
                    "{ ids }"
                ]
            },
            "permissions": {
                "@odata.type": "#microsoft.graph.allPreApprovedPermissions",
                "permissionKind": "all",
                "permissionType": "application"
            }
        },
        {
            "scopeType": "group",
            "sensitivityLabels": {
                "@odata.type": "#microsoft.graph.allScopeSensitivityLabels",
                "labelKind": "all"
            },
            "permissions": {
                "@odata.type": "#microsoft.graph.enumeratedPreApprovedPermissions",
                "permissionKind": "enumerated",
                "resourceApplicationId": "{ id }",
                "permissionIds": [
                    "{ ids }"
                ],
                "permissionType": "application"
            }
        }
    ]
}
```

