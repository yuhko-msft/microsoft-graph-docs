---
title: "win32LobAppRule resource type"
description: "A base complex type to store the detection or requirement rule data for a Win32 LOB app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppRule resource type

Namespace: microsoft.graph

A base complex type to store the detection or requirement rule data for a Win32 LOB app.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|ruleType|win32LobAppRuleType|The rule type indicating the purpose of the rule. Possible values are: `detection`, `requirement`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppRule",
  "ruleType": "String"
}
```

