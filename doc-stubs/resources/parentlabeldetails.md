---
title: "parentLabelDetails resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# parentLabelDetails resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|color|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|isActive|Boolean|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|parent|[parentLabelDetails](../resources/parentlabeldetails.md)|**TODO: Add Description**|
|sensitivity|Int32|**TODO: Add Description**|
|tooltip|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.parentLabelDetails"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.parentLabelDetails",
  "color": "String",
  "description": "String",
  "id": "String (identifier)",
  "isActive": "Boolean",
  "name": "String",
  "parent": {
    "@odata.type": "microsoft.graph.parentLabelDetails",
    "id": "String",
    "parent": {
      "@odata.type": "microsoft.graph.parentLabelDetails"
    },
    "sensitivity": "Integer",
    "tooltip": "String"
  },
  "sensitivity": "Integer",
  "tooltip": "String"
}
```

