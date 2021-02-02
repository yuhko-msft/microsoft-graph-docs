---
title: "iosVpnIKEv2SecurityAssociationParameters resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVpnIKEv2SecurityAssociationParameters resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|diffieHellmanGroup|Int32|**TODO: Add Description**|
|encryptionAlgorithm|iosVpnEncryptionAlgorithmType|**TODO: Add Description**. Possible values are: `aes256`, `des`, `tripleDes`, `aes128`, `aes128Gcm`, `aes256Gcm`, `chaCha20Poly1305`.|
|integrityAlgorithm|iosVpnIntegrityAlgorithmType|**TODO: Add Description**. Possible values are: `sha2_256`, `sha1_96`, `sha1_160`, `sha2_384`, `sha2_512`.|
|lifetimeInMinutes|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosVpnIKEv2SecurityAssociationParameters"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVpnIKEv2SecurityAssociationParameters",
  "diffieHellmanGroup": "Integer",
  "encryptionAlgorithm": "String",
  "integrityAlgorithm": "String",
  "lifetimeInMinutes": "Integer"
}
```

