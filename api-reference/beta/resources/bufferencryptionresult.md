---
title: "bufferEncryptionResult resource type"
description: "Encrypted piece of data resulting from the information protection encryptBuffer API."
author: "libarson"
localization_priority: Normal
ms.prod: "microsoft-identity-platform"
doc_type: resourcePageType
---

# bufferEncryptionResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The buffer encryption result includes the encrypted data and publishing license that results from the [EncryptBuffer] ((../api/informationprotection-encryptbuffer.md)) API for information protection. The encrypted data is base64 encoded and can be decrypted with the [DecryptBuffer] ((../api/informationprotection-decryptbuffer.md)) API. The publishing license includes rights-management information corresponding to the label associated with the data. 

## Properties
|Property|Type|Description|
|:---|:---|:---|
|encryptedBuffer|Binary| Provides the encrypted data to be decrypted. |
|publishingLicense|Binary| Provides the rights-management information associated with the data including owner, encrypted content key, template associated with the label ID, and more. For more details on the publishing license, go here: https://docs.microsoft.com/en-us/openspecs/windows_protocols/ms-rmsod/0af175ee-d54d-4d70-b169-b0ade1ab9bf4#gt_3b0362d9-f209-48d2-afd0-0c0f6531a7d1 |

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.bufferEncryptionResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bufferEncryptionResult",
  "encryptedBuffer": "Binary",
  "publishingLicense": "Binary"
}
```

