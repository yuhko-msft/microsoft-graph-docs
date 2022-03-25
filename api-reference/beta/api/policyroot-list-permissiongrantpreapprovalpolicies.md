---
title: "List permissionGrantPreApprovalPolicies"
description: "Get the permissionGrantPreApprovalPolicy resources from the permissionGrantPreApprovalPolicies navigation property."
author: "yuhko-msft"
ms.localizationpriority: medium
ms.prod: "applications"
doc_type: apiPageType
---

# List permissionGrantPreApprovalPolicies
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the permissionGrantPreApprovalPolicy resources from the permissionGrantPreApprovalPolicies navigation property.

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
GET /policies/permissionGrantPreApprovalPolicies
```

## Optional query parameters
This method does not support the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [permissionGrantPreApprovalPolicy](../resources/permissiongrantpreapprovalpolicy.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_permissiongrantpreapprovalpolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta/policies/permissionGrantPreApprovalPolicies
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.permissionGrantPreApprovalPolicy)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.permissionGrantPreApprovalPolicy",
      "id": "93066ff9-3ce7-7dc8-f9d6-ed83206c528f",
      "deletedDateTime": "String (timestamp)",
      "conditions": [
        {
          "@odata.type": "microsoft.graph.preApprovalDetail"
        }
      ]
    }
  ]
}
```

