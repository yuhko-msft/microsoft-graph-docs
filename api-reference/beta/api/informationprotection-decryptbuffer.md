---
title: "informationProtection: decryptBuffer"
description: "Decrypt data that has been encrypted with information protection."
author: "libarson"
localization_priority: Normal
ms.prod: "microsoft-identity-platform"
doc_type: apiPageType
---

# informationProtection: decryptBuffer
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Take in the [bufferEncryptionResult](../resources/bufferencryptionresult.md) containing the encrypted buffer and publishing license returned by the [encryptBuffer](informationprotection-encryptbuffer.md) API. Rights-management conditions will be checked using the publishing license to see if the user requesting to decrypt has the proper access permissions. If decryption is allowed, decrypt the buffer and return the plaintext result as an [bufferDecryptionResult](../resources/bufferdecryptionresult.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from least to most privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     | Not supported.                              |
| Delegated (personal Microsoft account) | Not supported.                              |
| Application                            | **TODO: Provide applicable permissions.**   |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /informationProtection/decryptBuffer
POST /me/informationProtection/decryptBuffer
POST /users/{usersId}/informationProtection/decryptBuffer
```

## Request headers
| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

| Parameter         | Type   | Description               |
| :---------------- | :----- | :------------------------ |
| encryptedBuffer   | Binary | Provides the base64 encoded encrypted buffer to be decrypted. |
| publishingLicense | Binary | Provides the rights-management information associated with the data including owner, encrypted content key, template associated with the label ID, and more. For more details on the publishing license, go here: https://docs.microsoft.com/en-us/openspecs/windows_protocols/ms-rmsod/0af175ee-d54d-4d70-b169-b0ade1ab9bf4#gt_3b0362d9-f209-48d2-afd0-0c0f6531a7d1 |



## Response

If successful, this action returns a `200 OK` response code and a [bufferDecryptionResult](../resources/bufferdecryptionresult.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "informationprotection_decryptbuffer"
}
-->
``` http
POST https://graph.microsoft.com/beta/informationProtection/decryptBuffer

Content-Type: application/json
Content-length: 69

{
  "encryptedBuffer": "Binary",
  "publishingLicense": "Binary"
}
```


### Response

The following is an example of the response.

**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.bufferDecryptionResult"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "microsoft.graph.bufferDecryptionResult"
  }
}
```

