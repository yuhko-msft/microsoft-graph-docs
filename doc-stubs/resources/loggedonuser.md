---
title: "loggedOnUser resource type"
description: "Logged On User"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# loggedOnUser resource type

Namespace: microsoft.graph



Logged On User

## Properties
|Property|Type|Description|
|:---|:---|:---|
|lastLogOnDateTime|DateTimeOffset|Date time when user logs on|
|userId|String|User id|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.loggedOnUser"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.loggedOnUser",
  "lastLogOnDateTime": "String (timestamp)",
  "userId": "String"
}
```

