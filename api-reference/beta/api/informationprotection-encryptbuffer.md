---
title: "informationProtection: encryptBuffer"
description: "Encrypt data with a specified label."
author: "libarson"
localization_priority: Normal
ms.prod: "microsoft-identity-platform"
doc_type: apiPageType
---

# informationProtection: encryptBuffer
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Take in a buffer of plaintext to be encrypted according to the access permissions specificed in the label associated with the data. Return the result as a [bufferEncryptionResult](../resources/bufferencryptionresult.md) object that contains the encrypted data and publishing license. The encrypted data can be decrypted using the [decryptBuffer](informationprotection-decryptbuffer.md) API.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)| Not supported.|
|Delegated (personal Microsoft account)| Not supported.|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /informationProtection/encryptBuffer
POST /me/informationProtection/encryptBuffer
POST /users/{usersId}/informationProtection/encryptBuffer
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
|buffer|Binary| Provides the data to be encrypted. |
|labelId|Guid| Provides the label ID used to specify how to encrypt the data and determine which users will have access. Additional details for the labelId in Microsoft Graph can be found here: https://docs.microsoft.com/en-us/graph/api/resources/informationprotectionlabel?view=graph-rest-beta |



## Response

If successful, this action returns a `200 OK` response code and a [bufferEncryptionResult](../resources/bufferencryptionresult.md) in the response body.

## Examples

The following is an example of how to call this API.

### Request
<!-- {
  "blockType": "request",
  "name": "informationprotection_encryptbuffer"
}
-->
``` http
POST https://graph.microsoft.com/beta/informationProtection/encryptBuffer

Content-Type: application/json
Content-length: 48

{
  "buffer": "Binary",
  "labelId": "Guid"
}
```


### Response

The following is an example of a response.

**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.bufferEncryptionResult"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "microsoft.graph.bufferEncryptionResult"
  }
}
```

