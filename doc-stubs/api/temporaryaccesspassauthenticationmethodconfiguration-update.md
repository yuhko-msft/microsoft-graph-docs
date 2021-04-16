---
title: "Update temporaryAccessPassAuthenticationMethodConfiguration"
description: "Update the properties of a temporaryAccessPassAuthenticationMethodConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update temporaryAccessPassAuthenticationMethodConfiguration
Namespace: microsoft.graph



Update the properties of a [temporaryAccessPassAuthenticationMethodConfiguration](../resources/temporaryaccesspassauthenticationmethodconfiguration.md) object.

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
PATCH /temporaryAccessPassAuthenticationMethodConfiguration
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [temporaryAccessPassAuthenticationMethodConfiguration](../resources/temporaryaccesspassauthenticationmethodconfiguration.md) object.

The following table shows the properties that are required when you update the [temporaryAccessPassAuthenticationMethodConfiguration](../resources/temporaryaccesspassauthenticationmethodconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|state|authenticationMethodState|**TODO: Add Description** Inherited from [authenticationMethodConfiguration](../resources/authenticationmethodconfiguration.md). Possible values are: `enabled`, `disabled`.|
|defaultLength|Int32|**TODO: Add Description**|
|defaultLifetimeInMinutes|Int32|**TODO: Add Description**|
|isUsableOnce|Boolean|**TODO: Add Description**|
|maximumLifetimeInMinutes|Int32|**TODO: Add Description**|
|minimumLifetimeInMinutes|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [temporaryAccessPassAuthenticationMethodConfiguration](../resources/temporaryaccesspassauthenticationmethodconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_temporaryaccesspassauthenticationmethodconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/temporaryAccessPassAuthenticationMethodConfiguration
Content-Type: application/json
Content-length: 303

{
  "@odata.type": "#microsoft.graph.temporaryAccessPassAuthenticationMethodConfiguration",
  "state": "String",
  "defaultLength": "Integer",
  "defaultLifetimeInMinutes": "Integer",
  "isUsableOnce": "Boolean",
  "maximumLifetimeInMinutes": "Integer",
  "minimumLifetimeInMinutes": "Integer"
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
  "@odata.type": "#microsoft.graph.temporaryAccessPassAuthenticationMethodConfiguration",
  "id": "0b6e21cf-21cf-0b6e-cf21-6e0bcf216e0b",
  "state": "String",
  "defaultLength": "Integer",
  "defaultLifetimeInMinutes": "Integer",
  "isUsableOnce": "Boolean",
  "maximumLifetimeInMinutes": "Integer",
  "minimumLifetimeInMinutes": "Integer"
}
```

