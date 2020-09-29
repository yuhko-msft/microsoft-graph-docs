---
title: "Create softwareOathAuthenticationMethod"
description: "Create a new softwareOathAuthenticationMethod object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create softwareOathAuthenticationMethod
Namespace: microsoft.graph

Create a new [softwareOathAuthenticationMethod](../resources/softwareoathauthenticationmethod.md) object.

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
POST /user/authentication/oathMethods
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [softwareOathAuthenticationMethod](../resources/softwareoathauthenticationmethod.md) object.

The following table shows the properties that are required when you create the [softwareOathAuthenticationMethod](../resources/softwareoathauthenticationmethod.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [authenticationMethod](../resources/authenticationmethod.md)|
|secretKey|String|**TODO: Add Description**|
|timeIntervalInSeconds|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [softwareOathAuthenticationMethod](../resources/softwareoathauthenticationmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_softwareoathauthenticationmethod_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/user/authentication/oathMethods
Content-Type: application/json
Content-length: 154

{
  "@odata.type": "#microsoft.strongAuthentication.softwareOathAuthenticationMethod",
  "secretKey": "String",
  "timeIntervalInSeconds": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.strongAuthentication.softwareOathAuthenticationMethod"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.strongAuthentication.softwareOathAuthenticationMethod",
  "id": "e238d0fc-d0fc-e238-fcd0-38e2fcd038e2",
  "secretKey": "String",
  "timeIntervalInSeconds": "Integer"
}
```

