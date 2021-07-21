---
title: "plannerTaskDetails resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# plannerTaskDetails resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [plannerDelta](../resources/plannerdelta.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List plannerTaskDetails](../api/plannertaskdetails-list.md)|[plannerTaskDetails](../resources/plannertaskdetails.md) collection|Get a list of the [plannerTaskDetails](../resources/plannertaskdetails.md) objects and their properties.|
|[Create plannerTaskDetails](../api/plannertaskdetails-create.md)|[plannerTaskDetails](../resources/plannertaskdetails.md)|Create a new [plannerTaskDetails](../resources/plannertaskdetails.md) object.|
|[Get plannerTaskDetails](../api/plannertaskdetails-get.md)|[plannerTaskDetails](../resources/plannertaskdetails.md)|Read the properties and relationships of a [plannerTaskDetails](../resources/plannertaskdetails.md) object.|
|[Update plannerTaskDetails](../api/plannertaskdetails-update.md)|[plannerTaskDetails](../resources/plannertaskdetails.md)|Update the properties of a [plannerTaskDetails](../resources/plannertaskdetails.md) object.|
|[Delete plannerTaskDetails](../api/plannertaskdetails-delete.md)|None|Deletes a [plannerTaskDetails](../resources/plannertaskdetails.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|checklist|[plannerChecklistItems](../resources/plannerchecklistitems.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|previewType|plannerPreviewType|**TODO: Add Description**. Possible values are: `automatic`, `noPreview`, `checklist`, `description`, `reference`.|
|references|[plannerExternalReferences](../resources/plannerexternalreferences.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.plannerTaskDetails",
  "baseType": "microsoft.graph.plannerDelta",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.plannerTaskDetails",
  "id": "String (identifier)",
  "checklist": {
    "@odata.type": "microsoft.graph.plannerChecklistItems"
  },
  "description": "String",
  "previewType": "String",
  "references": {
    "@odata.type": "microsoft.graph.plannerExternalReferences"
  }
}
```

