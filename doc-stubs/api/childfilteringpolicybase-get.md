---
title: "Get childFilteringPolicyBase"
description: "Read the properties and relationships of a childFilteringPolicyBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get childFilteringPolicyBase
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [childFilteringPolicyBase](../resources/childfilteringpolicybase.md) object.

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
GET /childFilteringPolicyBase
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

If successful, this method returns a `200 OK` response code and a [childFilteringPolicyBase](../resources/childfilteringpolicybase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_childfilteringpolicybase"
}
-->
``` http
GET https://graph.microsoft.com/beta/childFilteringPolicyBase
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.childFilteringPolicyBase"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.childFilteringPolicyBase",
    "id": "cfb9ba2c-ba2c-cfb9-2cba-b9cf2cbab9cf",
    "name": "String",
    "description": "String",
    "priority": "Integer",
    "action": "String",
    "state": "String",
    "loggingState": "String"
  }
}
```

