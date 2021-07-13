---
title: "sharedDriveItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharedDriveItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [baseItem](../resources/baseitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharedDriveItems](../api/shareddriveitem-list.md)|[sharedDriveItem](../resources/shareddriveitem.md) collection|Get a list of the [sharedDriveItem](../resources/shareddriveitem.md) objects and their properties.|
|[Create sharedDriveItem](../api/shareddriveitem-post-shares.md)|[sharedDriveItem](../resources/shareddriveitem.md)|Create a new [sharedDriveItem](../resources/shareddriveitem.md) object.|
|[Get sharedDriveItem](../api/shareddriveitem-get.md)|[sharedDriveItem](../resources/shareddriveitem.md)|Read the properties and relationships of a [sharedDriveItem](../resources/shareddriveitem.md) object.|
|[Update sharedDriveItem](../api/shareddriveitem-update.md)|[sharedDriveItem](../resources/shareddriveitem.md)|Update the properties of a [sharedDriveItem](../resources/shareddriveitem.md) object.|
|[Delete sharedDriveItem](../api/shareddriveitem-delete.md)|None|Deletes a [sharedDriveItem](../resources/shareddriveitem.md) object.|
|[List user](../api/shareddriveitem-list-createdbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the createdByUser navigation property.|
|[Add user](../api/shareddriveitem-post-createdbyuser.md)|[user](../resources/user.md)|Add createdByUser by posting to the createdByUser collection.|
|[List driveItem](../api/shareddriveitem-list-driveitem.md)|[driveItem](../resources/driveitem.md) collection|Get the driveItem resources from the driveItem navigation property.|
|[Create driveItem](../api/shareddriveitem-post-driveitem.md)|[driveItem](../resources/driveitem.md)|Create a new driveItem object.|
|[List items](../api/shareddriveitem-list-items.md)|[driveItem](../resources/driveitem.md) collection|Get the driveItem resources from the items navigation property.|
|[Create driveItem](../api/shareddriveitem-post-items.md)|[driveItem](../resources/driveitem.md)|Create a new driveItem object.|
|[List user](../api/shareddriveitem-list-lastmodifiedbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the lastModifiedByUser navigation property.|
|[Add user](../api/shareddriveitem-post-lastmodifiedbyuser.md)|[user](../resources/user.md)|Add lastModifiedByUser by posting to the lastModifiedByUser collection.|
|[List list](../api/shareddriveitem-list-list.md)|[list](../resources/list.md) collection|Get the list resources from the list navigation property.|
|[Create list](../api/shareddriveitem-post-list.md)|[list](../resources/list.md)|Create a new list object.|
|[List listItem](../api/shareddriveitem-list-listitem.md)|[listItem](../resources/listitem.md) collection|Get the listItem resources from the listItem navigation property.|
|[Create listItem](../api/shareddriveitem-post-listitem.md)|[listItem](../resources/listitem.md)|Create a new listItem object.|
|[List permission](../api/shareddriveitem-list-permission.md)|[permission](../resources/permission.md) collection|Get the permission resources from the permission navigation property.|
|[Create permission](../api/shareddriveitem-post-permission.md)|[permission](../resources/permission.md)|Create a new permission object.|
|[List driveItem](../api/shareddriveitem-list-root.md)|[driveItem](../resources/driveitem.md) collection|Get the driveItem resources from the root navigation property.|
|[Create driveItem](../api/shareddriveitem-post-root.md)|[driveItem](../resources/driveitem.md)|Create a new driveItem object.|
|[List site](../api/shareddriveitem-list-site.md)|[site](../resources/site.md) collection|Get the site resources from the site navigation property.|
|[Create site](../api/shareddriveitem-post-site.md)|[site](../resources/site.md)|Create a new site object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|description|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|eTag|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|name|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|owner|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|parentReference|[itemReference](../resources/itemreference.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|webUrl|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|createdByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|driveItem|[driveItem](../resources/driveitem.md)|**TODO: Add Description**|
|items|[driveItem](../resources/driveitem.md) collection|**TODO: Add Description**|
|lastModifiedByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|list|[list](../resources/list.md)|**TODO: Add Description**|
|listItem|[listItem](../resources/listitem.md)|**TODO: Add Description**|
|permission|[permission](../resources/permission.md)|**TODO: Add Description**|
|root|[driveItem](../resources/driveitem.md)|**TODO: Add Description**|
|site|[site](../resources/site.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharedDriveItem",
  "baseType": "microsoft.graph.baseItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharedDriveItem",
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
  "owner": {
    "@odata.type": "microsoft.graph.identitySet"
  }
}
```

