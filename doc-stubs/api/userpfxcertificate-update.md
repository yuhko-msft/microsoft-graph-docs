---
title: "Update userPFXCertificate"
description: "Update the properties of a userPFXCertificate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userPFXCertificate
Namespace: microsoft.graph



Update the properties of a [userPFXCertificate](../resources/userpfxcertificate.md) object.

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
PATCH /deviceManagement/userPfxCertificates/{userPFXCertificateId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userPFXCertificate](../resources/userpfxcertificate.md) object.

The following table shows the properties that are required when you update the [userPFXCertificate](../resources/userpfxcertificate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Date/time when this PFX certificate was imported.|
|encryptedPfxBlob|Binary|Encrypted PFX blob.|
|encryptedPfxPassword|String|Encrypted PFX password.|
|expirationDateTime|DateTimeOffset|Certificate's validity expiration date/time.|
|intendedPurpose|userPfxIntendedPurpose|Certificate's intended purpose from the point-of-view of deployment. Possible values are: `unassigned`, `smimeEncryption`, `smimeSigning`, `vpn`, `wifi`.|
|keyName|String|Name of the key (within the provider) used to encrypt the blob.|
|lastModifiedDateTime|DateTimeOffset|Date/time when this PFX certificate was last modified.|
|paddingScheme|userPfxPaddingScheme|Padding scheme used by the provider during encryption/decryption. Possible values are: `none`, `pkcs1`, `oaepSha1`, `oaepSha256`, `oaepSha384`, `oaepSha512`.|
|providerName|String|Crypto provider used to encrypt this blob.|
|startDateTime|DateTimeOffset|Certificate's validity start date/time.|
|thumbprint|String|SHA-1 thumbprint of the PFX certificate.|
|userPrincipalName|String|User Principal Name of the PFX certificate.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userPFXCertificate](../resources/userpfxcertificate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userpfxcertificate"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/userPfxCertificates/{userPFXCertificateId}
Content-Type: application/json
Content-length: 395

{
  "@odata.type": "#microsoft.graph.userPFXCertificate",
  "encryptedPfxBlob": "Binary",
  "encryptedPfxPassword": "String",
  "expirationDateTime": "String (timestamp)",
  "intendedPurpose": "String",
  "keyName": "String",
  "paddingScheme": "String",
  "providerName": "String",
  "startDateTime": "String (timestamp)",
  "thumbprint": "String",
  "userPrincipalName": "String"
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
  "@odata.type": "#microsoft.graph.userPFXCertificate",
  "id": "888e832a-832a-888e-2a83-8e882a838e88",
  "createdDateTime": "String (timestamp)",
  "encryptedPfxBlob": "Binary",
  "encryptedPfxPassword": "String",
  "expirationDateTime": "String (timestamp)",
  "intendedPurpose": "String",
  "keyName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "paddingScheme": "String",
  "providerName": "String",
  "startDateTime": "String (timestamp)",
  "thumbprint": "String",
  "userPrincipalName": "String"
}
```

