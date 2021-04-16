---
title: "deviceHealthScriptParameter resource type"
description: "Base properties of the script parameter."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceHealthScriptParameter resource type

Namespace: microsoft.graph



Base properties of the script parameter.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applyDefaultValueWhenNotAssigned|Boolean|Whether Apply DefaultValue When Not Assigned|
|description|String|The description of the param|
|isRequired|Boolean|Whether the param is required|
|name|String|The name of the param|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceHealthScriptParameter"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceHealthScriptParameter",
  "applyDefaultValueWhenNotAssigned": "Boolean",
  "description": "String",
  "isRequired": "Boolean",
  "name": "String"
}
```

