---
title: "Create permissionGrantPreApprovalPolicy"
description: "Create a new permissionGrantPreApprovalPolicy object."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: apiPageType
---

# Create permissionGrantPreApprovalPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object.

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
POST /policies/permissionGrantPreApprovalPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object.

You can specify the following properties when creating a **permissionGrantPreApprovalPolicy**.

|Property|Type|Description|
|:---|:---|:---|
|conditions|[preApprovalDetail](../resources/preapprovaldetail.md) collection| A list of conditions that are pre-approved in the policy. Required.|



## Response

If successful, this method returns a `201 Created` response code and a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_permissiongrantpreapprovalpolicy"
}
-->
``` http
POST /policies/permissionGrantPreApprovalPolicies
Content-Type: application/json

{
    "conditions": [
        {
            "scopeType": "chat",
            "scopeSensitivityLabels": {
                "@odata.type": "microsoft.graph.enumeratedScopeSensitivityLabels",
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
                "permissionType": "application",
                "resourceApplicationId": "{ id }",
                "permissionIds": [
                    "{ ids }"
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
  "truncated": true,
  "@odata.type": "microsoft.graph.permissionGrantPreApprovalPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

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

