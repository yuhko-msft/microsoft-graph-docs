---
title: "sitePage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sitePage resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [baseItem](../resources/baseitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sitePages](../api/sitepage-list.md)|[sitePage](../resources/sitepage.md) collection|Get a list of the [sitePage](../resources/sitepage.md) objects and their properties.|
|[Create sitePage](../api/sitepage-create.md)|[sitePage](../resources/sitepage.md)|Create a new [sitePage](../resources/sitepage.md) object.|
|[Get sitePage](../api/sitepage-get.md)|[sitePage](../resources/sitepage.md)|Read the properties and relationships of a [sitePage](../resources/sitepage.md) object.|
|[Update sitePage](../api/sitepage-update.md)|[sitePage](../resources/sitepage.md)|Update the properties of a [sitePage](../resources/sitepage.md) object.|
|[Delete sitePage](../api/sitepage-delete.md)|None|Deletes a [sitePage](../resources/sitepage.md) object.|
|[publish](../api/sitepage-publish.md)|None|**TODO: Add Description**|
|[List user](../api/sitepage-list-createdbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the createdByUser navigation property.|
|[Add user](../api/sitepage-post-createdbyuser.md)|[user](../resources/user.md)|Add createdByUser by posting to the createdByUser collection.|
|[List user](../api/sitepage-list-lastmodifiedbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the lastModifiedByUser navigation property.|
|[Add user](../api/sitepage-post-lastmodifiedbyuser.md)|[user](../resources/user.md)|Add lastModifiedByUser by posting to the lastModifiedByUser collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentType|[contentTypeInfo](../resources/contenttypeinfo.md)|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|description|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|eTag|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|name|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|pageLayoutType|String|**TODO: Add Description**|
|parentReference|[itemReference](../resources/itemreference.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|publishingState|[publicationFacet](../resources/publicationfacet.md)|**TODO: Add Description**|
|title|String|**TODO: Add Description**|
|webParts|[webPart](../resources/webpart.md) collection|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|createdByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|lastModifiedByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sitePage",
  "baseType": "microsoft.graph.baseItem",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sitePage",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "eTag": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "parentReference": {
    "@odata.type": "microsoft.graph.itemReference"
  },
  "webUrl": "String",
  "contentType": {
    "@odata.type": "microsoft.graph.contentTypeInfo"
  },
  "pageLayoutType": "String",
  "publishingState": {
    "@odata.type": "microsoft.graph.publicationFacet"
  },
  "title": "String",
  "webParts": [
    {
      "@odata.type": "microsoft.graph.webPart"
    }
  ]
}
```

