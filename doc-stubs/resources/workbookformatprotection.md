---
title: "workbookFormatProtection resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookFormatProtection resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookFormatProtections](../api/workbookformatprotection-list.md)|[workbookFormatProtection](../resources/workbookformatprotection.md) collection|Get a list of the [workbookFormatProtection](../resources/workbookformatprotection.md) objects and their properties.|
|[Create workbookFormatProtection](../api/workbookformatprotection-create.md)|[workbookFormatProtection](../resources/workbookformatprotection.md)|Create a new [workbookFormatProtection](../resources/workbookformatprotection.md) object.|
|[Get workbookFormatProtection](../api/workbookformatprotection-get.md)|[workbookFormatProtection](../resources/workbookformatprotection.md)|Read the properties and relationships of a [workbookFormatProtection](../resources/workbookformatprotection.md) object.|
|[Update workbookFormatProtection](../api/workbookformatprotection-update.md)|[workbookFormatProtection](../resources/workbookformatprotection.md)|Update the properties of a [workbookFormatProtection](../resources/workbookformatprotection.md) object.|
|[Delete workbookFormatProtection](../api/workbookformatprotection-delete.md)|None|Deletes a [workbookFormatProtection](../resources/workbookformatprotection.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|formulaHidden|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|locked|Boolean|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookFormatProtection",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookFormatProtection",
  "id": "String (identifier)",
  "formulaHidden": "Boolean",
  "locked": "Boolean"
}
```

