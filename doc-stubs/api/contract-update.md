---
title: "Update contract"
description: "Update the properties of a contract object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update contract
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [contract](../resources/contract.md) object.

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
PATCH /contract
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [contract](../resources/contract.md) object.

The following table shows the properties that are required when you update the [contract](../resources/contract.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|Contract name.|
|display|[display](../resources/display.md)|**TODO: Add Description**|
|input|[input](../resources/input.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [contract](../resources/contract.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_contract"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/contract
Content-Type: application/json
Content-length: 182

{
  "@odata.type": "#microsoft.graph.contract",
  "display": {
    "@odata.type": "microsoft.graph.display"
  },
  "input": {
    "@odata.type": "microsoft.graph.input"
  }
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
  "@odata.type": "#microsoft.graph.contract",
  "id": "a7cde550-e550-a7cd-50e5-cda750e5cda7",
  "display": {
    "@odata.type": "microsoft.graph.display"
  },
  "input": {
    "@odata.type": "microsoft.graph.input"
  }
}
```

