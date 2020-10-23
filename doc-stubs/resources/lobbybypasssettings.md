---
title: "lobbyBypassSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# lobbyBypassSettings resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|isDialInBypassEnabled|Boolean|**TODO: Add Description**|
|scope|lobbyBypassScope|**TODO: Add Description**. Possible values are: `organizer`, `organization`, `organizationAndFederated`, `everyone`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.lobbyBypassSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.lobbyBypassSettings",
  "scope": "String",
  "isDialInBypassEnabled": "Boolean"
}
```

