---
title: "userPFXCertificate resource type"
description: "Entity that encapsulates all information required for a user's PFX certificates."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userPFXCertificate resource type

Namespace: microsoft.graph



Entity that encapsulates all information required for a user's PFX certificates.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userPFXCertificates](../api/userpfxcertificate-list.md)|[userPFXCertificate](../resources/userpfxcertificate.md) collection|Get a list of the [userPFXCertificate](../resources/userpfxcertificate.md) objects and their properties.|
|[Create userPFXCertificate](../api/userpfxcertificate-create.md)|[userPFXCertificate](../resources/userpfxcertificate.md)|Create a new [userPFXCertificate](../resources/userpfxcertificate.md) object.|
|[Get userPFXCertificate](../api/userpfxcertificate-get.md)|[userPFXCertificate](../resources/userpfxcertificate.md)|Read the properties and relationships of a [userPFXCertificate](../resources/userpfxcertificate.md) object.|
|[Update userPFXCertificate](../api/userpfxcertificate-update.md)|[userPFXCertificate](../resources/userpfxcertificate.md)|Update the properties of a [userPFXCertificate](../resources/userpfxcertificate.md) object.|
|[Delete userPFXCertificate](../api/userpfxcertificate-delete.md)|None|Deletes a [userPFXCertificate](../resources/userpfxcertificate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Date/time when this PFX certificate was imported.|
|encryptedPfxBlob|Binary|Encrypted PFX blob.|
|encryptedPfxPassword|String|Encrypted PFX password.|
|expirationDateTime|DateTimeOffset|Certificate's validity expiration date/time.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intendedPurpose|userPfxIntendedPurpose|Certificate's intended purpose from the point-of-view of deployment. Possible values are: `unassigned`, `smimeEncryption`, `smimeSigning`, `vpn`, `wifi`.|
|keyName|String|Name of the key (within the provider) used to encrypt the blob.|
|lastModifiedDateTime|DateTimeOffset|Date/time when this PFX certificate was last modified.|
|paddingScheme|userPfxPaddingScheme|Padding scheme used by the provider during encryption/decryption. Possible values are: `none`, `pkcs1`, `oaepSha1`, `oaepSha256`, `oaepSha384`, `oaepSha512`.|
|providerName|String|Crypto provider used to encrypt this blob.|
|startDateTime|DateTimeOffset|Certificate's validity start date/time.|
|thumbprint|String|SHA-1 thumbprint of the PFX certificate.|
|userPrincipalName|String|User Principal Name of the PFX certificate.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userPFXCertificate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userPFXCertificate",
  "id": "String (identifier)",
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

