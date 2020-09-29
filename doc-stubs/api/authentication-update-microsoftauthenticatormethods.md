---
title: "Update microsoftAuthenticatorMethods"
description: "Update the properties of a microsoftAuthenticatorMethods object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update microsoftAuthenticatorMethods
Namespace: microsoft.graph

Update the properties of a microsoftAuthenticatorMethods object.

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
PATCH /user/authentication/microsoftAuthenticatorMethods
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftAuthenticatorAuthenticationMethod](../resources/microsoftauthenticatorauthenticationmethod.md) object.

The following table shows the properties that are required when you create the [microsoftAuthenticatorAuthenticationMethod](../resources/microsoftauthenticatorauthenticationmethod.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [authenticationMethod](../resources/authenticationmethod.md)|
|deviceName|String|**TODO: Add Description**|
|deviceTag|String|**TODO: Add Description**|
|phoneAppVersion|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [microsoftAuthenticatorAuthenticationMethod](../resources/microsoftauthenticatorauthenticationmethod.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_microsoftauthenticatormethods"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/user/authentication/microsoftAuthenticatorMethods
Content-Type: application/json
Content-length: 169

{
  "@odata.type": "#microsoft.graph.microsoftAuthenticatorAuthenticationMethod",
  "deviceName": "String",
  "deviceTag": "String",
  "phoneAppVersion": "String"
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
  "@odata.type": "#microsoft.graph.microsoftAuthenticatorAuthenticationMethod",
  "id": "db088011-8011-db08-1180-08db118008db",
  "deviceName": "String",
  "deviceTag": "String",
  "phoneAppVersion": "String"
}
```

