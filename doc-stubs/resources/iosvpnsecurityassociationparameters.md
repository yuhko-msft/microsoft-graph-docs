---
title: "iosVpnSecurityAssociationParameters resource type"
description: "VPN Security Association Parameters"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnSecurityAssociationParameters resource type

Namespace: microsoft.graph



VPN Security Association Parameters

## Properties
|Property|Type|Description|
|:---|:---|:---|
|lifetimeInMinutes|Int32|Lifetime (minutes)|
|securityDiffieHellmanGroup|Int32|Diffie-Hellman Group|
|securityEncryptionAlgorithm|vpnEncryptionAlgorithmType|Encryption algorithm. Possible values are: `aes256`, `des`, `tripleDes`, `aes128`, `aes128Gcm`, `aes256Gcm`, `aes192`, `aes192Gcm`.|
|securityIntegrityAlgorithm|vpnIntegrityAlgorithmType|Integrity algorithm. Possible values are: `sha2_256`, `sha1_96`, `sha1_160`, `sha2_384`, `sha2_512`, `md5`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosVpnSecurityAssociationParameters"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVpnSecurityAssociationParameters",
  "lifetimeInMinutes": "Integer",
  "securityDiffieHellmanGroup": "Integer",
  "securityEncryptionAlgorithm": "String",
  "securityIntegrityAlgorithm": "String"
}
```

