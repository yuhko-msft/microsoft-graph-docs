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
|Delegated (work or school account)|Application.Read.All, Application.ReadWrite.All, Directory.Read.All, Directory.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Application.Read.All, Application.ReadWrite.All, Directory.Read.All, Directory.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /servicePrincipals/{servicePrincipalsId}/permissionGrantPreApprovalPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
Do not supply a request body for this method.



## Response

If successful, this method returns a `201 Created` response code and a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object in the response body.

## Examples


### Request
<!-- {
  "blockType": "request",
  "name": "create_permissiongrantpreapprovalpolicy_from_"
}
-->
``` http
GET https://graph.microsoft.com/beta/servicePrincipals/{id}/permissionGrantPreApprovalPolicies/{id}

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
  "id": "{id}",
  "conditions": [
    {
      "scopeType": "Group",
      "scopeSensitivityLabels": {
        "@odata.type": "microsoft.graph.enumeratedSensitivityLabels",
        "labelKind": "enumerated",
        "sensitivityLabels": [
          "{id}"
        ]
      },
      "permissions": {
        "@odata.type": "microsoft.graph.enumeratedPreApprovedPermissions",
        "permissionKind": "enumerated",
        "resourceApplicationId": "00000003-0000-0000-c000-000000000000",
        "permissionType": "application",
        "permissionids": [
          "{id}"
        ]
      }
    }
  ]
}
```

