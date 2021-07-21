---
title: "onenote resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onenote resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onenotes](../api/onenote-list.md)|[onenote](../resources/onenote.md) collection|Get a list of the [onenote](../resources/onenote.md) objects and their properties.|
|[Create onenote](../api/onenote-create.md)|[onenote](../resources/onenote.md)|Create a new [onenote](../resources/onenote.md) object.|
|[Get onenote](../api/onenote-get.md)|[onenote](../resources/onenote.md)|Read the properties and relationships of an [onenote](../resources/onenote.md) object.|
|[Update onenote](../api/onenote-update.md)|[onenote](../resources/onenote.md)|Update the properties of an [onenote](../resources/onenote.md) object.|
|[Delete onenote](../api/onenote-delete.md)|None|Deletes an [onenote](../resources/onenote.md) object.|
|[List notebooks](../api/onenote-list-notebooks.md)|[notebook](../resources/notebook.md) collection|Get the notebook resources from the notebooks navigation property.|
|[Create notebook](../api/onenote-post-notebooks.md)|[notebook](../resources/notebook.md)|Create a new notebook object.|
|[List operations](../api/onenote-list-operations.md)|[onenoteOperation](../resources/onenoteoperation.md) collection|Get the onenoteOperation resources from the operations navigation property.|
|[Create onenoteOperation](../api/onenote-post-operations.md)|[onenoteOperation](../resources/onenoteoperation.md)|Create a new onenoteOperation object.|
|[List pages](../api/onenote-list-pages.md)|[onenotePage](../resources/onenotepage.md) collection|Get the onenotePage resources from the pages navigation property.|
|[Create onenotePage](../api/onenote-post-pages.md)|[onenotePage](../resources/onenotepage.md)|Create a new onenotePage object.|
|[List resources](../api/onenote-list-resources.md)|[onenoteResource](../resources/onenoteresource.md) collection|Get the onenoteResource resources from the resources navigation property.|
|[Create onenoteResource](../api/onenote-post-resources.md)|[onenoteResource](../resources/onenoteresource.md)|Create a new onenoteResource object.|
|[List sectionGroups](../api/onenote-list-sectiongroups.md)|[sectionGroup](../resources/sectiongroup.md) collection|Get the sectionGroup resources from the sectionGroups navigation property.|
|[Create sectionGroup](../api/onenote-post-sectiongroups.md)|[sectionGroup](../resources/sectiongroup.md)|Create a new sectionGroup object.|
|[List sections](../api/onenote-list-sections.md)|[onenoteSection](../resources/onenotesection.md) collection|Get the onenoteSection resources from the sections navigation property.|
|[Create onenoteSection](../api/onenote-post-sections.md)|[onenoteSection](../resources/onenotesection.md)|Create a new onenoteSection object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|notebooks|[notebook](../resources/notebook.md) collection|**TODO: Add Description**|
|operations|[onenoteOperation](../resources/onenoteoperation.md) collection|**TODO: Add Description**|
|pages|[onenotePage](../resources/onenotepage.md) collection|**TODO: Add Description**|
|resources|[onenoteResource](../resources/onenoteresource.md) collection|**TODO: Add Description**|
|sectionGroups|[sectionGroup](../resources/sectiongroup.md) collection|**TODO: Add Description**|
|sections|[onenoteSection](../resources/onenotesection.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.onenote",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onenote",
  "id": "String (identifier)"
}
```

