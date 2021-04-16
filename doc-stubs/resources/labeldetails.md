---
title: "labelDetails resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# labelDetails resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [parentLabelDetails](../resources/parentlabeldetails.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|color|String|**TODO: Add Description** Inherited from [parentLabelDetails](../resources/parentlabeldetails.md)|
|description|String|**TODO: Add Description** Inherited from [parentLabelDetails](../resources/parentlabeldetails.md)|
|id|String|**TODO: Add Description** Inherited from [parentLabelDetails](../resources/parentlabeldetails.md)|
|isActive|Boolean|**TODO: Add Description** Inherited from [parentLabelDetails](../resources/parentlabeldetails.md)|
|name|String|**TODO: Add Description** Inherited from [parentLabelDetails](../resources/parentlabeldetails.md)|
|parent|[parentLabelDetails](../resources/parentlabeldetails.md)|**TODO: Add Description** Inherited from [parentLabelDetails](../resources/parentlabeldetails.md)|
|sensitivity|Int32|**TODO: Add Description** Inherited from [parentLabelDetails](../resources/parentlabeldetails.md)|
|tooltip|String|**TODO: Add Description** Inherited from [parentLabelDetails](../resources/parentlabeldetails.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.labelDetails"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.labelDetails",
  "color": "String",
  "description": "String",
  "id": "String (identifier)",
  "isActive": "Boolean",
  "name": "String",
  "parent": {
    "@odata.type": "microsoft.graph.parentLabelDetails"
  },
  "sensitivity": "Integer",
  "tooltip": "String"
}
```

