---
title: "Unassign a permissionGrantPreApprovalPolicy from a servicePrincipal"
description: "Unassign a permissionGrantPreApprovalPolicy from servicePrincipal."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: apiPageType
---

# Unassign a permissionGrantPreApprovalPolicy from a servicePrincipal
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Unassign a [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) object from a [servicePrincipal](../resources/serviceprincipal.md).

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|Application.ReadWrite.All and Policy.ReadWrite.PermissionGrant|
|Delegated (personal Microsoft account)|Not supported.|
|Application|Application.ReadWrite.All and Policy.ReadWrite.PermissionGrant|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
DELETE /servicePrincipals/{{ servicePrincipal id }}/permissionGrantPreApprovalPolicies/{{ policy id }}/$ref
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
  "name": "create_permissiongrantpreapprovalpolicy_from_"
}
-->
``` http
DELETE https://graph.microsoft.com/beta/servicePrincipals/{{ servicePrincipal id }}/permissionGrantPreApprovalPolicies/{{ policy id }}/$ref
```


### Response
<!-- {
  "blockType": "response"
} -->
``` http
HTTP/1.1 204 No Content
```

