---
title: "keyIntegerValuePair resource type"
description: "A key-value pair with a string key and an integer value."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# keyIntegerValuePair resource type

Namespace: microsoft.graph



A key-value pair with a string key and an integer value.


Inherits from [keyTypedValuePair](../resources/keytypedvaluepair.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|key|String|The string key of the key-value pair. Inherited from [keyTypedValuePair](../resources/keytypedvaluepair.md)|
|value|Int32|The integer value of the key-value pair.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.keyIntegerValuePair"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.keyIntegerValuePair",
  "key": "String",
  "value": "Integer"
}
```

