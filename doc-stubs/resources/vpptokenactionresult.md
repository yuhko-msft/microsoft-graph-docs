---
title: "vppTokenActionResult resource type"
description: "The status of the action performed with an Apple Volume Purchase Program token."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# vppTokenActionResult resource type

Namespace: microsoft.graph



The status of the action performed with an Apple Volume Purchase Program token.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actionName|String|Action name|
|actionState|actionState|State of the action. Possible values are: `none`, `pending`, `canceled`, `active`, `done`, `failed`, `notSupported`.|
|lastUpdatedDateTime|DateTimeOffset|Time the action state was last updated|
|startDateTime|DateTimeOffset|Time the action was initiated|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.vppTokenActionResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.vppTokenActionResult",
  "actionName": "String",
  "actionState": "String",
  "lastUpdatedDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)"
}
```

