---
title: "Update ipAddrOrRangeOrSubnet"
description: "Update the properties of an ipAddrOrRangeOrSubnet object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update ipAddrOrRangeOrSubnet
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) object.

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
PATCH /ipAddrOrRangeOrSubnet
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
|name|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|
|description|String|**TODO: Add Description** Inherited from [configurationBase](../resources/configurationbase.md). Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [ipAddrOrRangeOrSubnet](../resources/ipaddrorrangeorsubnet.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_ipaddrorrangeorsubnet"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/ipAddrOrRangeOrSubnet
Content-Type: application/json
Content-length: 112

{
  "@odata.type": "#microsoft.graph.ipAddrOrRangeOrSubnet",
  "name": "String",
  "description": "String"
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.ipAddrOrRangeOrSubnet",
  "id": "2adfc526-c526-2adf-26c5-df2a26c5df2a",
  "name": "String",
  "description": "String"
}
```

