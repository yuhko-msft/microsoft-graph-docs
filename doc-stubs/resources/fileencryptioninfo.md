---
title: "fileEncryptionInfo resource type"
description: "Contains properties for file encryption information for the content version of a line of business app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileEncryptionInfo resource type

Namespace: microsoft.graph

Contains properties for file encryption information for the content version of a line of business app.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|encryptionKey|Binary|The key used to encrypt the file content.|
|fileDigest|Binary|The file digest prior to encryption.|
|fileDigestAlgorithm|String|The file digest algorithm.|
|initializationVector|Binary|The initialization vector used for the encryption algorithm.|
|mac|Binary|The hash of the encrypted file content + IV (content hash).|
|macKey|Binary|The key used to get mac.|
|profileIdentifier|String|The the profile identifier.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.fileEncryptionInfo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileEncryptionInfo",
  "encryptionKey": "Binary",
  "initializationVector": "Binary",
  "mac": "Binary",
  "macKey": "Binary",
  "profileIdentifier": "String",
  "fileDigest": "Binary",
  "fileDigestAlgorithm": "String"
}
```

