---
title: "bufferDecryptionResult resource type"
description: "Decrypted piece of data resulting from the information protection decryptBuffer API."
author: "libarson"
localization_priority: Normal
ms.prod: "microsoft-identity-platform"
doc_type: resourcePageType
---

# bufferDecryptionResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The decrypt buffer result showcases the plain-text data that is returned by the [decryptBuffer] (../api/informationprotection-decryptbuffer) API for information protection. The decrypt buffer result will match the plaintext buffer that was inputted to the [encryptBuffer] (../api/informationprotection-encryptbuffer) API.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|decryptedBuffer|Binary| Plain-text data returned by [decryptBuffer] (../api/informationprotection-decryptbuffer)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.bufferDecryptionResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bufferDecryptionResult",
  "decryptedBuffer": "Binary"
}
```

