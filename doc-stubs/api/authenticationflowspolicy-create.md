---
title: "Create authenticationFlowsPolicy"
description: "Create a new authenticationFlowsPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create authenticationFlowsPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [authenticationFlowsPolicy](../resources/authenticationflowspolicy.md) object.

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
POST ** Collection URI for microsoft.graph.authenticationFlowsPolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [authenticationFlowsPolicy](../resources/authenticationflowspolicy.md) object.

The following table shows the properties that are required when you create the [authenticationFlowsPolicy](../resources/authenticationflowspolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|selfServiceSignUp|[selfServiceSignUpAuthenticationFlowConfiguration](../resources/selfservicesignupauthenticationflowconfiguration.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [authenticationFlowsPolicy](../resources/authenticationflowspolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_authenticationflowspolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.authenticationFlowsPolicy not found
Content-Type: application/json
Content-length: 242

{
  "@odata.type": "#microsoft.graph.authenticationFlowsPolicy",
  "description": "String",
  "displayName": "String",
  "selfServiceSignUp": {
    "@odata.type": "microsoft.graph.selfServiceSignUpAuthenticationFlowConfiguration"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.authenticationFlowsPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.authenticationFlowsPolicy",
  "id": "ca946e5b-6e5b-ca94-5b6e-94ca5b6e94ca",
  "description": "String",
  "displayName": "String",
  "selfServiceSignUp": {
    "@odata.type": "microsoft.graph.selfServiceSignUpAuthenticationFlowConfiguration"
  }
}
```

