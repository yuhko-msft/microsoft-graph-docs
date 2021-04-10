---
title: "Update identityUserFlow"
description: "Update the properties of an identityUserFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update identityUserFlow
Namespace: microsoft.graph



Update the properties of an [identityUserFlow](../resources/identityuserflow.md) object.

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
PATCH /identityUserFlow
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [identityUserFlow](../resources/identityuserflow.md) object.

The following table shows the properties that are required when you update the [identityUserFlow](../resources/identityuserflow.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|userFlowType|userFlowType|**TODO: Add Description**. Possible values are: `signUp`, `signIn`, `signUpOrSignIn`, `passwordReset`, `profileUpdate`, `resourceOwner`, `unknownFutureValue`.|
|userFlowTypeVersion|Single|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [identityUserFlow](../resources/identityuserflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_identityuserflow"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/identityUserFlow
Content-Type: application/json
Content-length: 123

{
  "@odata.type": "#microsoft.graph.identityUserFlow",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.identityUserFlow",
  "id": "bede1e4e-1e4e-bede-4e1e-debe4e1edebe",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single"
}
```

