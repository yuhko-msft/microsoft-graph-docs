---
title: "notebook resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# notebook resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List notebooks](../api/notebook-list.md)|[notebook](../resources/notebook.md) collection|Get a list of the [notebook](../resources/notebook.md) objects and their properties.|
|[Create notebook](../api/notebook-create.md)|[notebook](../resources/notebook.md)|Create a new [notebook](../resources/notebook.md) object.|
|[Get notebook](../api/notebook-get.md)|[notebook](../resources/notebook.md)|Read the properties and relationships of a [notebook](../resources/notebook.md) object.|
|[Update notebook](../api/notebook-update.md)|[notebook](../resources/notebook.md)|Update the properties of a [notebook](../resources/notebook.md) object.|
|[Delete notebook](../api/notebook-delete.md)|None|Deletes a [notebook](../resources/notebook.md) object.|
|[copyNotebook](../api/notebook-copynotebook.md)|[onenoteOperation](../resources/onenoteoperation.md)|**TODO: Add Description**|
|[getNotebookFromWebUrl](../api/notebook-getnotebookfromweburl.md)|[CopyNotebookModel](../resources/copynotebookmodel.md)|**TODO: Add Description**|
|[getRecentNotebooks](../api/notebook-getrecentnotebooks.md)|[recentNotebook](../resources/recentnotebook.md) collection|**TODO: Add Description**|
|[List sectionGroups](../api/notebook-list-sectiongroups.md)|[sectionGroup](../resources/sectiongroup.md) collection|Get the sectionGroup resources from the sectionGroups navigation property.|
|[Create sectionGroup](../api/notebook-post-sectiongroups.md)|[sectionGroup](../resources/sectiongroup.md)|Create a new sectionGroup object.|
|[List sections](../api/notebook-list-sections.md)|[onenoteSection](../resources/onenotesection.md) collection|Get the onenoteSection resources from the sections navigation property.|
|[Create onenoteSection](../api/notebook-post-sections.md)|[onenoteSection](../resources/onenotesection.md)|Create a new onenoteSection object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md).|
|displayName|String|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isDefault|Boolean|**TODO: Add Description**|
|isShared|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|links|[notebookLinks](../resources/notebooklinks.md)|**TODO: Add Description**|
|sectionGroupsUrl|String|**TODO: Add Description**|
|sectionsUrl|String|**TODO: Add Description**|
|self|String|**TODO: Add Description** Inherited from [onenoteEntityBaseModel](../resources/onenoteentitybasemodel.md).|
|userRole|onenoteUserRole|**TODO: Add Description**. Possible values are: `None`, `Owner`, `Contributor`, `Reader`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|sectionGroups|[sectionGroup](../resources/sectiongroup.md) collection|**TODO: Add Description**|
|sections|[onenoteSection](../resources/onenotesection.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.notebook",
  "baseType": "microsoft.graph.onenoteEntityHierarchyModel",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.notebook",
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
  "isShared": "Boolean",
  "links": {
    "@odata.type": "microsoft.graph.notebookLinks"
  },
  "sectionGroupsUrl": "String",
  "sectionsUrl": "String",
  "userRole": "String"
}
```

