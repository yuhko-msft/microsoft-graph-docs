---
title: "openTypeExtension resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# openTypeExtension resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [extension](../resources/extension.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List openTypeExtensions](../api/opentypeextension-list.md)|[openTypeExtension](../resources/opentypeextension.md) collection|Get a list of the [openTypeExtension](../resources/opentypeextension.md) objects and their properties.|
|[Create openTypeExtension](../api/opentypeextension-create.md)|[openTypeExtension](../resources/opentypeextension.md)|Create a new [openTypeExtension](../resources/opentypeextension.md) object.|
|[Get openTypeExtension](../api/opentypeextension-get.md)|[openTypeExtension](../resources/opentypeextension.md)|Read the properties and relationships of an [openTypeExtension](../resources/opentypeextension.md) object.|
|[Update openTypeExtension](../api/opentypeextension-update.md)|[openTypeExtension](../resources/opentypeextension.md)|Update the properties of an [openTypeExtension](../resources/opentypeextension.md) object.|
|[Delete openTypeExtension](../api/opentypeextension-delete.md)|None|Deletes an [openTypeExtension](../resources/opentypeextension.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|extensionName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.openTypeExtension",
  "baseType": "microsoft.graph.extension",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.openTypeExtension",
  "id": "String (identifier)",
  "extensionName": "String"
}
```

