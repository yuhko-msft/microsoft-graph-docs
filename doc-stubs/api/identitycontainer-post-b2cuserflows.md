---
title: "Create b2cIdentityUserFlow"
description: "Create a new b2cIdentityUserFlow object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create b2cIdentityUserFlow
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object.

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
POST /identity/b2cUserFlows
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object.

You can specify the following properties when creating a **b2cIdentityUserFlow**.

|Property|Type|Description|
|:---|:---|:---|
|userFlowType|userFlowType|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md). The possible values are: `signUp`, `signIn`, `signUpOrSignIn`, `passwordReset`, `profileUpdate`, `resourceOwner`, `unknownFutureValue`. Required.|
|userFlowTypeVersion|Single|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md). Required.|
|apiConnectorConfiguration|[userFlowApiConnectorConfiguration](../resources/userflowapiconnectorconfiguration.md)|**TODO: Add Description** Optional.|
|authenticationMethods|b2cAuthenticationMethods|**TODO: Add Description**. The possible values are: `emailWithPassword`, `userName`, `phoneWithOneTimePassword`. Optional.|
|defaultLanguageTag|String|**TODO: Add Description** Optional.|
|isConditionalAccessEnforced|Boolean|**TODO: Add Description** Required.|
|isJavaScriptEnabled|Boolean|**TODO: Add Description** Required.|
|isLanguageCustomizationEnabled|Boolean|**TODO: Add Description** Required.|
|multifactorAuthenticationConfiguration|[userFlowMultifactorAuthenticationConfiguration](../resources/userflowmultifactorauthenticationconfiguration.md)|**TODO: Add Description** Optional.|
|singleSignOnSessionConfiguration|[userFlowSingleSignOnSessionConfiguration](../resources/userflowsinglesignonsessionconfiguration.md)|**TODO: Add Description** Optional.|
|tokenClaimsConfiguration|[userFlowTokenClaimsConfiguration](../resources/userflowtokenclaimsconfiguration.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `201 Created` response code and a [b2cIdentityUserFlow](../resources/b2cidentityuserflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_b2cidentityuserflow_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/identity/b2cUserFlows
Content-Type: application/json
Content-length: 815

{
  "@odata.type": "#microsoft.graph.b2cIdentityUserFlow",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single",
  "apiConnectorConfiguration": {
    "@odata.type": "microsoft.graph.userFlowApiConnectorConfiguration"
  },
  "authenticationMethods": "String",
  "defaultLanguageTag": "String",
  "isConditionalAccessEnforced": "Boolean",
  "isJavaScriptEnabled": "Boolean",
  "isLanguageCustomizationEnabled": "Boolean",
  "multifactorAuthenticationConfiguration": {
    "@odata.type": "microsoft.graph.userFlowMultifactorAuthenticationConfiguration"
  },
  "singleSignOnSessionConfiguration": {
    "@odata.type": "microsoft.graph.userFlowSingleSignOnSessionConfiguration"
  },
  "tokenClaimsConfiguration": {
    "@odata.type": "microsoft.graph.userFlowTokenClaimsConfiguration"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.b2cIdentityUserFlow"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.b2cIdentityUserFlow",
  "id": "b4552d46-2d46-b455-462d-55b4462d55b4",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single",
  "apiConnectorConfiguration": {
    "@odata.type": "microsoft.graph.userFlowApiConnectorConfiguration"
  },
  "authenticationMethods": "String",
  "defaultLanguageTag": "String",
  "isConditionalAccessEnforced": "Boolean",
  "isJavaScriptEnabled": "Boolean",
  "isLanguageCustomizationEnabled": "Boolean",
  "multifactorAuthenticationConfiguration": {
    "@odata.type": "microsoft.graph.userFlowMultifactorAuthenticationConfiguration"
  },
  "singleSignOnSessionConfiguration": {
    "@odata.type": "microsoft.graph.userFlowSingleSignOnSessionConfiguration"
  },
  "tokenClaimsConfiguration": {
    "@odata.type": "microsoft.graph.userFlowTokenClaimsConfiguration"
  }
}
```

