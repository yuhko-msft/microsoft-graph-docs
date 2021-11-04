---
title: "Get ipAddrOrRangeOrSubnet"
description: "Read the properties and relationships of an ipAddrOrRangeOrSubnet object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get ipAddrOrRangeOrSubnet
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
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
GET /ipAddrOrRangeOrSubnet
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

If successful, this method returns a `200 OK` response code and an [ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_ipaddrorrangeorsubnet"
}
-->
``` http
GET https://graph.microsoft.com/beta/ipAddrOrRangeOrSubnet
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.ipAddrOrRangeOrSubnet"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.ipAddrOrRangeOrSubnet",
    "id": "2adfc526-c526-2adf-26c5-df2a26c5df2a",
    "name": "String",
    "description": "String"
  }
}
```

