---
title: "sensitiveContentLocation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sensitiveContentLocation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [sensitiveContentLocationBase](../resources/sensitivecontentlocationbase.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|confidence|Int32|**TODO: Add Description**|
|evidences|[sensitiveContentEvidence](../resources/sensitivecontentevidence.md) collection|**TODO: Add Description** Inherited from [sensitiveContentLocationBase](../resources/sensitivecontentlocationbase.md)|
|idMatch|String|**TODO: Add Description** Inherited from [sensitiveContentLocationBase](../resources/sensitivecontentlocationbase.md)|
|length|Int32|**TODO: Add Description** Inherited from [sensitiveContentLocationBase](../resources/sensitivecontentlocationbase.md)|
|offset|Int32|**TODO: Add Description** Inherited from [sensitiveContentLocationBase](../resources/sensitivecontentlocationbase.md)|
|userIdentityColumnName|String|**TODO: Add Description**|
|userIdentityColumnValues|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.sensitiveContentLocation"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sensitiveContentLocation",
  "evidences": [
    {
      "@odata.type": "microsoft.graph.sensitiveContentEvidence"
    }
  ],
  "idMatch": "String",
  "length": "Integer",
  "offset": "Integer",
  "confidence": "Integer",
  "userIdentityColumnName": "String",
  "userIdentityColumnValues": [
    "String"
  ]
}
```

