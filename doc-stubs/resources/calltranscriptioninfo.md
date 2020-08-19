---
title: "callTranscriptionInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# callTranscriptionInfo resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|state|callTranscriptionState|**TODO: Add Description**. Possible values are: `notStarted`, `active`, `inactive`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.callTranscriptionInfo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.callTranscriptionInfo",
  "state": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

