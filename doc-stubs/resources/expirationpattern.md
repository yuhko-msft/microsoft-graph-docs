---
title: "expirationPattern resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# expirationPattern resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|duration|Duration|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|type|expirationPatternType|**TODO: Add Description**. Possible values are: `notSpecified`, `noExpiration`, `afterDateTime`, `afterDuration`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.expirationPattern"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.expirationPattern",
  "duration": "String (duration)",
  "endDateTime": "String (timestamp)",
  "type": "String"
}
```

