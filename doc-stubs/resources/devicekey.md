---
title: "deviceKey resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceKey resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|customKeyInformation|Binary|**TODO: Add Description**|
|deviceId|Guid|**TODO: Add Description**|
|keyIdentifier|String|**TODO: Add Description**|
|keyMaterial|Binary|**TODO: Add Description**|
|keyType|String|**TODO: Add Description**|
|usage|deviceKeyUsage|**TODO: Add Description**. The possible values are: `none`, `ngc`, `stk`, `adminKey`, `bitlockerRecovery`, `roaming`, `dpapi`, `fido`, `wip`, `resourceKey`, `encryptedDPAPIEncryptionKey`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceKey"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceKey",
  "creationDateTime": "String (timestamp)",
  "customKeyInformation": "Binary",
  "deviceId": "Guid",
  "keyIdentifier": "String",
  "keyMaterial": "Binary",
  "keyType": "String",
  "usage": "String"
}
```

