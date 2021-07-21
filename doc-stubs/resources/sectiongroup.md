---
title: "sectionGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sectionGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sectionGroups](../api/sectiongroup-list.md)|[sectionGroup](../resources/sectiongroup.md) collection|Get a list of the [sectionGroup](../resources/sectiongroup.md) objects and their properties.|
|[Create sectionGroup](../api/sectiongroup-create.md)|[sectionGroup](../resources/sectiongroup.md)|Create a new [sectionGroup](../resources/sectiongroup.md) object.|
|[Get sectionGroup](../api/sectiongroup-get.md)|[sectionGroup](../resources/sectiongroup.md)|Read the properties and relationships of a [sectionGroup](../resources/sectiongroup.md) object.|
|[Update sectionGroup](../api/sectiongroup-update.md)|[sectionGroup](../resources/sectiongroup.md)|Update the properties of a [sectionGroup](../resources/sectiongroup.md) object.|
|[Delete sectionGroup](../api/sectiongroup-delete.md)|None|Deletes a [sectionGroup](../resources/sectiongroup.md) object.|
|[List notebook](../api/sectiongroup-list-parentnotebook.md)|[notebook](../resources/notebook.md) collection|Get the notebook resources from the parentNotebook navigation property.|
|[Create notebook](../api/sectiongroup-post-parentnotebook.md)|[notebook](../resources/notebook.md)|Create a new notebook object.|
|[List sectionGroup](../api/sectiongroup-list-parentsectiongroup.md)|[sectionGroup](../resources/sectiongroup.md) collection|Get the sectionGroup resources from the parentSectionGroup navigation property.|
|[Create sectionGroup](../api/sectiongroup-post-parentsectiongroup.md)|[sectionGroup](../resources/sectiongroup.md)|Create a new sectionGroup object.|
|[List sectionGroups](../api/sectiongroup-list-sectiongroups.md)|[sectionGroup](../resources/sectiongroup.md) collection|Get the sectionGroup resources from the sectionGroups navigation property.|
|[Create sectionGroup](../api/sectiongroup-post-sectiongroups.md)|[sectionGroup](../resources/sectiongroup.md)|Create a new sectionGroup object.|
|[List sections](../api/sectiongroup-list-sections.md)|[onenoteSection](../resources/onenotesection.md) collection|Get the onenoteSection resources from the sections navigation property.|
|[Create onenoteSection](../api/sectiongroup-post-sections.md)|[onenoteSection](../resources/onenotesection.md)|Create a new onenoteSection object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md).|
|displayName|String|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntityHierarchyModel](../resources/onenoteentityhierarchymodel.md).|
|sectionGroupsUrl|String|**TODO: Add Description**|
|sectionsUrl|String|**TODO: Add Description**|
|self|String|**TODO: Add Description** Inherited from [onenoteEntityBaseModel](../resources/onenoteentitybasemodel.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|parentNotebook|[notebook](../resources/notebook.md)|**TODO: Add Description**|
|parentSectionGroup|[sectionGroup](../resources/sectiongroup.md)|**TODO: Add Description**|
|sectionGroups|[sectionGroup](../resources/sectiongroup.md) collection|**TODO: Add Description**|
|sections|[onenoteSection](../resources/onenotesection.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sectionGroup",
  "baseType": "microsoft.graph.onenoteEntityHierarchyModel",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sectionGroup",
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
  "sectionGroupsUrl": "String",
  "sectionsUrl": "String"
}
```

