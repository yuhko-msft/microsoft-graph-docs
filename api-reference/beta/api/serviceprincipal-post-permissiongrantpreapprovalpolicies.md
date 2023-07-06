---
title: "servicePrincipal: Assign permissionGrantPreApprovalPolicy"
description: "Assign a permissionGrantPreApprovalPolicy to servicePrincipal."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: apiPageType
---

# ServicePrincipal: Assign permissionGrantPreApprovalPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Assign a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object to [servicePrincipal](../resources/serviceprincipal.md).

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
POST /servicePrincipals/{id}/permissionGrantPreApprovalPolicies/$ref
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
|conditions|[preApprovalDetail](../resources/preapprovaldetail.md) collection|A list of conditions that tenant admin has pre-approved for the given service principal. Optional. Optional.|



## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_permissiongrantpreapprovalpolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/servicePrincipals/{{ servicePrincipal id }}/permissionGrantPreApprovalPolicies/$ref
Content-Type: application/json

{
    "@odata.id": "https://graph.microsoft.com/beta/policies/permissionGrantPreApprovalPolicies/{{ permissionGrantPreApprovalPolicies id }}"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response"
} -->
``` http
HTTP/1.1 204 No Content
```

