---
title: "user: revokeLocalGrant"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# user: revokeLocalGrant
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /me/revokeLocalGrant
POST /users/{usersId}/revokeLocalGrant
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|IDP|String|**TODO: Add Description**|
|memberId|String|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a String in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "user_revokelocalgrant"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/revokeLocalGrant

Content-Type: application/json
Content-length: 48

{
  "IDP": "String",
  "memberId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Edm.String"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": "String"
}
```

