---
title: "cryptographySuite resource type"
description: "VPN Security Association Parameters"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cryptographySuite resource type

Namespace: microsoft.graph



VPN Security Association Parameters

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationTransformConstants|authenticationTransformConstant|Authentication Transform Constants. Possible values are: `md5_96`, `sha1_96`, `sha_256_128`, `aes128Gcm`, `aes192Gcm`, `aes256Gcm`.|
|cipherTransformConstants|vpnEncryptionAlgorithmType|Cipher Transform Constants. Possible values are: `aes256`, `des`, `tripleDes`, `aes128`, `aes128Gcm`, `aes256Gcm`, `aes192`, `aes192Gcm`.|
|dhGroup|diffieHellmanGroup|Diffie Hellman Group. Possible values are: `group1`, `group2`, `group14`, `ecp256`, `ecp384`, `group24`.|
|encryptionMethod|vpnEncryptionAlgorithmType|Encryption Method. Possible values are: `aes256`, `des`, `tripleDes`, `aes128`, `aes128Gcm`, `aes256Gcm`, `aes192`, `aes192Gcm`.|
|integrityCheckMethod|vpnIntegrityAlgorithmType|Integrity Check Method. Possible values are: `sha2_256`, `sha1_96`, `sha1_160`, `sha2_384`, `sha2_512`, `md5`.|
|pfsGroup|perfectForwardSecrecyGroup|Perfect Forward Secrecy Group. Possible values are: `pfs1`, `pfs2`, `pfs2048`, `ecp256`, `ecp384`, `pfsMM`, `pfs24`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.cryptographySuite"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cryptographySuite",
  "authenticationTransformConstants": "String",
  "cipherTransformConstants": "String",
  "dhGroup": "String",
  "encryptionMethod": "String",
  "integrityCheckMethod": "String",
  "pfsGroup": "String"
}
```

