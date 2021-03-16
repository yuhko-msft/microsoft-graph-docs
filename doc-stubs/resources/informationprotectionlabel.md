---
title: "informationProtectionLabel resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# informationProtectionLabel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List informationProtectionLabels](../api/informationprotectionlabel-list.md)|[informationProtectionLabel](../resources/informationprotectionlabel.md) collection|Get a list of the [informationProtectionLabel](../resources/informationprotectionlabel.md) objects and their properties.|
|[Create informationProtectionLabel](../api/informationprotectionlabel-create.md)|[informationProtectionLabel](../resources/informationprotectionlabel.md)|Create a new [informationProtectionLabel](../resources/informationprotectionlabel.md) object.|
|[Get informationProtectionLabel](../api/informationprotectionlabel-get.md)|[informationProtectionLabel](../resources/informationprotectionlabel.md)|Read the properties and relationships of an [informationProtectionLabel](../resources/informationprotectionlabel.md) object.|
|[Update informationProtectionLabel](../api/informationprotectionlabel-update.md)|[informationProtectionLabel](../resources/informationprotectionlabel.md)|Update the properties of an [informationProtectionLabel](../resources/informationprotectionlabel.md) object.|
|[Delete informationProtectionLabel](../api/informationprotectionlabel-delete.md)|None|Deletes an [informationProtectionLabel](../resources/informationprotectionlabel.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|color|String|**TODO: Add Description**|
|contentFormats|String collection|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.informationProtectionLabel",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.informationProtectionLabel",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "color": "String",
  "sensitivity": "Integer",
  "tooltip": "String",
  "isActive": "Boolean",
  "contentFormats": [
    "String"
  ],
  "parent": {
    "@odata.type": "microsoft.graph.parentLabelDetails"
  }
}
```

