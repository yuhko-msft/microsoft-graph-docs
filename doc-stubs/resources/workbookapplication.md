---
title: "workbookApplication resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookApplication resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookApplications](../api/workbookapplication-list.md)|[workbookApplication](../resources/workbookapplication.md) collection|Get a list of the [workbookApplication](../resources/workbookapplication.md) objects and their properties.|
|[Create workbookApplication](../api/workbookapplication-create.md)|[workbookApplication](../resources/workbookapplication.md)|Create a new [workbookApplication](../resources/workbookapplication.md) object.|
|[Get workbookApplication](../api/workbookapplication-get.md)|[workbookApplication](../resources/workbookapplication.md)|Read the properties and relationships of a [workbookApplication](../resources/workbookapplication.md) object.|
|[Update workbookApplication](../api/workbookapplication-update.md)|[workbookApplication](../resources/workbookapplication.md)|Update the properties of a [workbookApplication](../resources/workbookapplication.md) object.|
|[Delete workbookApplication](../api/workbookapplication-delete.md)|None|Deletes a [workbookApplication](../resources/workbookapplication.md) object.|
|[calculate](../api/workbookapplication-calculate.md)|None|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|calculationMode|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookApplication",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookApplication",
  "id": "String (identifier)",
  "calculationMode": "String"
}
```

