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
|conditions|[preApprovalDetail](../resources/preapprovaldetail.md) collection| A list of conditions that tenant admin has pre-approved for the given service principal.	Required.|



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
POST https://graph.microsoft.com/beta/policies/permissionGrantPreApprovalPolicies
Content-Type: application/json
Content-length: 215

{
  "@odata.type": "#microsoft.graph.permissionGrantPreApprovalPolicy",
  "conditions": [
    {
      "@odata.type": "microsoft.graph.preApprovalDetail"
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
  "@odata.type": "#microsoft.graph.permissionGrantPreApprovalPolicy",
  "id": "{id}",
  "conditions": [
    {
      "@odata.type": "microsoft.graph.preApprovalDetail"
    }
  ]
}
```

