---
title: "Update b2cIdentityUserFlow"
description: "Update the properties of a b2cIdentityUserFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update b2cIdentityUserFlow
Namespace: microsoft.graph

Update the properties of a [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object.

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
PATCH /identity/b2cUserFlows/{b2cIdentityUserFlowId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object.

The following table shows the properties that are required when you create the [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|
|userFlowType|userFlowType|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md). Possible values are: `signUp`, `signIn`, `signUpOrSignIn`, `passwordReset`, `profileUpdate`, `resourceOwner`, `unknownFutureValue`.|
|userFlowTypeVersion|Single|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|
|authenticationMethods|b2cAuthenticationMethods|**TODO: Add Description**. Possible values are: `emailWithPassword`, `userName`.|
|tokenClaimsConfiguration|[userFlowTokenClaimsConfiguration](../resources/userflowtokenclaimsconfiguration.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_b2cidentityuserflow"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/identity/b2cUserFlows/{b2cIdentityUserFlowId}
Content-Type: application/json
Content-length: 274

{
  "@odata.type": "#microsoft.graph.b2cIdentityUserFlow",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single",
  "authenticationMethods": "String",
  "tokenClaimsConfiguration": {
    "@odata.type": "microsoft.graph.userFlowTokenClaimsConfiguration"
  }
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
  "@odata.type": "#microsoft.graph.b2cIdentityUserFlow",
  "id": "bf2bca35-ca35-bf2b-35ca-2bbf35ca2bbf",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single",
  "authenticationMethods": "String",
  "tokenClaimsConfiguration": {
    "@odata.type": "microsoft.graph.userFlowTokenClaimsConfiguration"
  }
}
```

