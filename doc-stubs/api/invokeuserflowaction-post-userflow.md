---
title: "Add userFlow"
description: "Add userFlow by posting to the userFlow collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add userFlow
Namespace: microsoft.graph

Add userFlow by posting to the userFlow collection.

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
POST /identity/b2xUserFlows/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object.

The following table shows the properties that are required when you create the [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|
|userFlowType|userFlowType|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md). Possible values are: `signUp`, `signIn`, `signUpOrSignIn`, `passwordReset`, `profileUpdate`, `resourceOwner`, `unknownFutureValue`.|
|userFlowTypeVersion|Single|**TODO: Add Description** Inherited from [identityUserFlow](../resources/identityuserflow.md)|



## Response

If successful, this method returns a `204 No Content` response code and a [b2xIdentityUserFlow](../resources/b2xidentityuserflow.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_b2xidentityuserflow_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/identity/b2xUserFlows/$ref
Content-Type: application/json
Content-length: 140

{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.b2xIdentityUserFlow",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Cpim.Api.DataModels.b2xIdentityUserFlow"
}
-->
``` http
HTTP/1.1 204 No Content

Content-Type: application/json
{
  "@odata.type": "#Microsoft.Cpim.Api.DataModels.b2xIdentityUserFlow",
  "id": "29bcc26f-c26f-29bc-6fc2-bc296fc2bc29",
  "userFlowType": "String",
  "userFlowTypeVersion": "Single"
}
```

