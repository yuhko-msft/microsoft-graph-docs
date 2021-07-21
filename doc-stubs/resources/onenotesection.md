---
title: "onenoteSection resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onenoteSection resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onenoteSections](../api/onenotesection-list.md)|[onenoteSection](../resources/onenotesection.md) collection|Get a list of the [onenoteSection](../resources/onenotesection.md) objects and their properties.|
|[Create onenoteSection](../api/onenotesection-create.md)|[onenoteSection](../resources/onenotesection.md)|Create a new [onenoteSection](../resources/onenotesection.md) object.|
|[Get onenoteSection](../api/onenotesection-get.md)|[onenoteSection](../resources/onenotesection.md)|Read the properties and relationships of an [onenoteSection](../resources/onenotesection.md) object.|
|[Update onenoteSection](../api/onenotesection-update.md)|[onenoteSection](../resources/onenotesection.md)|Update the properties of an [onenoteSection](../resources/onenotesection.md) object.|
|[Delete onenoteSection](../api/onenotesection-delete.md)|None|Deletes an [onenoteSection](../resources/onenotesection.md) object.|
|[copyToNotebook](../api/onenotesection-copytonotebook.md)|[onenoteOperation](../resources/onenoteoperation.md)|**TODO: Add Description**|
|[copyToSectionGroup](../api/onenotesection-copytosectiongroup.md)|[onenoteOperation](../resources/onenoteoperation.md)|**TODO: Add Description**|
|[List pages](../api/onenotesection-list-pages.md)|[onenotePage](../resources/onenotepage.md) collection|Get the onenotePage resources from the pages navigation property.|
|[Create onenotePage](../api/onenotesection-post-pages.md)|[onenotePage](../resources/onenotepage.md)|Create a new onenotePage object.|
|[List notebook](../api/onenotesection-list-parentnotebook.md)|[notebook](../resources/notebook.md) collection|Get the notebook resources from the parentNotebook navigation property.|
|[Create notebook](../api/onenotesection-post-parentnotebook.md)|[notebook](../resources/notebook.md)|Create a new notebook object.|
|[List sectionGroup](../api/onenotesection-list-parentsectiongroup.md)|[sectionGroup](../resources/sectiongroup.md) collection|Get the sectionGroup resources from the parentSectionGroup navigation property.|
|[Create sectionGroup](../api/onenotesection-post-parentsectiongroup.md)|[sectionGroup](../resources/sectiongroup.md)|Create a new sectionGroup object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md).|
|displayName|String|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isDefault|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|links|[sectionLinks](../resources/sectionlinks.md)|**TODO: Add Description**|
|pagesUrl|String|**TODO: Add Description**|
|self|String|**TODO: Add Description** Inherited from [onenoteEntityBaseModel](../resources/onenoteentitybasemodel.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|pages|[onenotePage](../resources/onenotepage.md) collection|**TODO: Add Description**|
|parentNotebook|[notebook](../resources/notebook.md)|**TODO: Add Description**|
|parentSectionGroup|[sectionGroup](../resources/sectiongroup.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.onenoteSection",
  "baseType": "microsoft.graph.onenoteEntityHierarchyModel",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onenoteSection",
  "id": "String (identifier)",
  "self": "String",
  "createdDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "isDefault": "Boolean",
  "links": {
    "@odata.type": "microsoft.graph.sectionLinks"
  },
  "pagesUrl": "String"
}
```

