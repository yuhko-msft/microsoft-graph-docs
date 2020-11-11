---
title: "Get privateLinkResourcePolicy"
description: "Read the properties and relationships of a privateLinkResourcePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get privateLinkResourcePolicy
Namespace: microsoft.graph

Read the properties and relationships of a [privateLinkResourcePolicy](../resources/privatelinkresourcepolicy.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /privateLinkResourcePolicy
GET /policyRoot/privateLinkResourcePolicies/{privateLinkResourcePolicyId}
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

If successful, this method returns a `200 OK` response code and a [privateLinkResourcePolicy](../resources/privatelinkresourcepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_privatelinkresourcepolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta/privateLinkResourcePolicy
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.privateLinkResourcePolicy"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#Microsoft.DirectoryServices.privateLinkResourcePolicy",
    "id": "b31487c5-87c5-b314-c587-14b3c58714b3",
    "externalPrivateLinkId": "String",
    "tenantApprovals": [
      {
        "@odata.type": "microsoft.graph.tenantApprovals"
      }
    ]
  }
}
```

