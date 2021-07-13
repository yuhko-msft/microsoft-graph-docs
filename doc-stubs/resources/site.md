---
title: "site resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# site resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [baseItem](../resources/baseitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sites](../api/site-list.md)|[site](../resources/site.md) collection|Get a list of the [site](../resources/site.md) objects and their properties.|
|[Create site](../api/site-post-sites.md)|[site](../resources/site.md)|Create a new [site](../resources/site.md) object.|
|[Get site](../api/site-get.md)|[site](../resources/site.md)|Read the properties and relationships of a [site](../resources/site.md) object.|
|[Update site](../api/site-update.md)|[site](../resources/site.md)|Update the properties of a [site](../resources/site.md) object.|
|[Delete site](../api/site-delete.md)|None|Deletes a [site](../resources/site.md) object.|
|[delta](../api/site-delta.md)|[site](../resources/site.md) collection|**TODO: Add Description**|
|[delta](../api/site-delta.md)|[site](../resources/site.md) collection|**TODO: Add Description**|
|[add](../api/site-add.md)|[site](../resources/site.md) collection|**TODO: Add Description**|
|[remove](../api/site-remove.md)|[site](../resources/site.md) collection|**TODO: Add Description**|
|[getActivitiesByInterval](../api/site-getactivitiesbyinterval.md)|[itemActivityStat](../resources/itemactivitystat.md) collection|**TODO: Add Description**|
|[getApplicableContentTypesForList](../api/site-getapplicablecontenttypesforlist.md)|[contentType](../resources/contenttype.md) collection|**TODO: Add Description**|
|[getByPath](../api/site-getbypath.md)|[site](../resources/site.md)|**TODO: Add Description**|
|[List itemAnalytics](../api/site-list-analytics.md)|[itemAnalytics](../resources/itemanalytics.md) collection|Get the itemAnalytics resources from the analytics navigation property.|
|[Add itemAnalytics](../api/site-post-analytics.md)|[itemAnalytics](../resources/itemanalytics.md)|Add analytics by posting to the analytics collection.|
|[List columns](../api/site-list-columns.md)|[columnDefinition](../resources/columndefinition.md) collection|Get the columnDefinition resources from the columns navigation property.|
|[Create columnDefinition](../api/site-post-columns.md)|[columnDefinition](../resources/columndefinition.md)|Create a new columnDefinition object.|
|[List contentTypes](../api/site-list-contenttypes.md)|[contentType](../resources/contenttype.md) collection|Get the contentType resources from the contentTypes navigation property.|
|[Create contentType](../api/site-post-contenttypes.md)|[contentType](../resources/contenttype.md)|Create a new contentType object.|
|[List user](../api/site-list-createdbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the createdByUser navigation property.|
|[Add user](../api/site-post-createdbyuser.md)|[user](../resources/user.md)|Add createdByUser by posting to the createdByUser collection.|
|[List drive](../api/site-list-drive.md)|[drive](../resources/drive.md) collection|Get the drive resources from the drive navigation property.|
|[Create drive](../api/site-post-drive.md)|[drive](../resources/drive.md)|Create a new drive object.|
|[List drives](../api/site-list-drives.md)|[drive](../resources/drive.md) collection|Get the drive resources from the drives navigation property.|
|[Create drive](../api/site-post-drives.md)|[drive](../resources/drive.md)|Create a new drive object.|
|[List externalColumns](../api/site-list-externalcolumns.md)|[columnDefinition](../resources/columndefinition.md) collection|Get the columnDefinition resources from the externalColumns navigation property.|
|[Add columnDefinition](../api/site-post-externalcolumns.md)|[columnDefinition](../resources/columndefinition.md)|Add externalColumns by posting to the externalColumns collection.|
|[List items](../api/site-list-items.md)|[baseItem](../resources/baseitem.md) collection|Get the baseItem resources from the items navigation property.|
|[Create baseItem](../api/site-post-items.md)|[baseItem](../resources/baseitem.md)|Create a new baseItem object.|
|[List user](../api/site-list-lastmodifiedbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the lastModifiedByUser navigation property.|
|[Add user](../api/site-post-lastmodifiedbyuser.md)|[user](../resources/user.md)|Add lastModifiedByUser by posting to the lastModifiedByUser collection.|
|[List lists](../api/site-list-lists.md)|[list](../resources/list.md) collection|Get the list resources from the lists navigation property.|
|[Create list](../api/site-post-lists.md)|[list](../resources/list.md)|Create a new list object.|
|[List onenote](../api/site-list-onenote.md)|[onenote](../resources/onenote.md) collection|Get the onenote resources from the onenote navigation property.|
|[Create onenote](../api/site-post-onenote.md)|[onenote](../resources/onenote.md)|Create a new onenote object.|
|[List pages](../api/site-list-pages.md)|[sitePage](../resources/sitepage.md) collection|Get the sitePage resources from the pages navigation property.|
|[Create sitePage](../api/site-post-pages.md)|[sitePage](../resources/sitepage.md)|Create a new sitePage object.|
|[List permissions](../api/site-list-permissions.md)|[permission](../resources/permission.md) collection|Get the permission resources from the permissions navigation property.|
|[Create permission](../api/site-post-permissions.md)|[permission](../resources/permission.md)|Create a new permission object.|
|[List sites](../api/site-list-sites.md)|[site](../resources/site.md) collection|Get the site resources from the sites navigation property.|
|[Create site](../api/site-post-sites.md)|[site](../resources/site.md)|Create a new site object.|
|[List store](../api/site-list-termstore.md)|[store](../resources/store.md) collection|Get the store resources from the termStore navigation property.|
|[Create store](../api/site-post-termstore.md)|[store](../resources/store.md)|Create a new store object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|deleted|[deleted](../resources/deleted.md)|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|displayName|String|**TODO: Add Description**|
|eTag|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|name|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|parentReference|[itemReference](../resources/itemreference.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|root|[root](../resources/root.md)|**TODO: Add Description**|
|sharepointIds|[sharepointIds](../resources/sharepointids.md)|**TODO: Add Description**|
|siteCollection|[siteCollection](../resources/sitecollection.md)|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|analytics|[itemAnalytics](../resources/itemanalytics.md)|**TODO: Add Description**|
|columns|[columnDefinition](../resources/columndefinition.md) collection|**TODO: Add Description**|
|contentTypes|[contentType](../resources/contenttype.md) collection|**TODO: Add Description**|
|createdByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|drive|[drive](../resources/drive.md)|**TODO: Add Description**|
|drives|[drive](../resources/drive.md) collection|**TODO: Add Description**|
|externalColumns|[columnDefinition](../resources/columndefinition.md) collection|**TODO: Add Description**|
|items|[baseItem](../resources/baseitem.md) collection|**TODO: Add Description**|
|lastModifiedByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|lists|[list](../resources/list.md) collection|**TODO: Add Description**|
|onenote|[onenote](../resources/onenote.md)|**TODO: Add Description**|
|pages|[sitePage](../resources/sitepage.md) collection|**TODO: Add Description**|
|permissions|[permission](../resources/permission.md) collection|**TODO: Add Description**|
|sites|[site](../resources/site.md) collection|**TODO: Add Description**|
|termStore|[store](../resources/store.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.site",
  "baseType": "microsoft.graph.baseItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.site",
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
  "deleted": {
    "@odata.type": "microsoft.graph.deleted"
  },
  "displayName": "String",
  "root": {
    "@odata.type": "microsoft.graph.root"
  },
  "sharepointIds": {
    "@odata.type": "microsoft.graph.sharepointIds"
  },
  "siteCollection": {
    "@odata.type": "microsoft.graph.siteCollection"
  }
}
```

