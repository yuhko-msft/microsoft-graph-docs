---
title: "onenotePage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onenotePage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onenotePages](../api/onenotepage-list.md)|[onenotePage](../resources/onenotepage.md) collection|Get a list of the [onenotePage](../resources/onenotepage.md) objects and their properties.|
|[Create onenotePage](../api/onenotepage-create.md)|[onenotePage](../resources/onenotepage.md)|Create a new [onenotePage](../resources/onenotepage.md) object.|
|[Get onenotePage](../api/onenotepage-get.md)|[onenotePage](../resources/onenotepage.md)|Read the properties and relationships of an [onenotePage](../resources/onenotepage.md) object.|
|[Update onenotePage](../api/onenotepage-update.md)|[onenotePage](../resources/onenotepage.md)|Update the properties of an [onenotePage](../resources/onenotepage.md) object.|
|[Delete onenotePage](../api/onenotepage-delete.md)|None|Deletes an [onenotePage](../resources/onenotepage.md) object.|
|[preview](../api/onenotepage-preview.md)|[onenotePagePreview](../resources/onenotepagepreview.md)|**TODO: Add Description**|
|[copyToSection](../api/onenotepage-copytosection.md)|[onenoteOperation](../resources/onenoteoperation.md)|**TODO: Add Description**|
|[onenotePatchContent](../api/onenotepage-onenotepatchcontent.md)|None|**TODO: Add Description**|
|[List notebook](../api/onenotepage-list-parentnotebook.md)|[notebook](../resources/notebook.md) collection|Get the notebook resources from the parentNotebook navigation property.|
|[Create notebook](../api/onenotepage-post-parentnotebook.md)|[notebook](../resources/notebook.md)|Create a new notebook object.|
|[List onenoteSection](../api/onenotepage-list-parentsection.md)|[onenoteSection](../resources/onenotesection.md) collection|Get the onenoteSection resources from the parentSection navigation property.|
|[Create onenoteSection](../api/onenotepage-post-parentsection.md)|[onenoteSection](../resources/onenotesection.md)|Create a new onenoteSection object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|Stream|**TODO: Add Description**|
|contentUrl|String|**TODO: Add Description**|
|createdByAppId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [onenoteEntitySchemaObjectModel](../resources/onenoteentityschemaobjectmodel.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|level|Int32|**TODO: Add Description**|
|links|[pageLinks](../resources/pagelinks.md)|**TODO: Add Description**|
|order|Int32|**TODO: Add Description**|
|self|String|**TODO: Add Description** Inherited from [onenoteEntityBaseModel](../resources/onenoteentitybasemodel.md).|
|title|String|**TODO: Add Description**|
|userTags|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|parentNotebook|[notebook](../resources/notebook.md)|**TODO: Add Description**|
|parentSection|[onenoteSection](../resources/onenotesection.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.onenotePage",
  "baseType": "microsoft.graph.onenoteEntitySchemaObjectModel",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onenotePage",
  "id": "String (identifier)",
  "self": "String",
  "createdDateTime": "String (timestamp)",
  "content": "Stream",
  "contentUrl": "String",
  "createdByAppId": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "level": "Integer",
  "links": {
    "@odata.type": "microsoft.graph.pageLinks"
  },
  "order": "Integer",
  "title": "String",
  "userTags": [
    "String"
  ]
}
```

