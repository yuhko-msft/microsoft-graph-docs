---
title: "list resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# list resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [baseItem](../resources/baseitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List lists](../api/list-list.md)|[list](../resources/list.md) collection|Get a list of the [list](../resources/list.md) objects and their properties.|
|[Create list](../api/list-create.md)|[list](../resources/list.md)|Create a new [list](../resources/list.md) object.|
|[Get list](../api/list-get.md)|[list](../resources/list.md)|Read the properties and relationships of a [list](../resources/list.md) object.|
|[Update list](../api/list-update.md)|[list](../resources/list.md)|Update the properties of a [list](../resources/list.md) object.|
|[Delete list](../api/list-delete.md)|None|Deletes a [list](../resources/list.md) object.|
|[List activities](../api/list-list-activities.md)|[itemActivityOLD](../resources/itemactivityold.md) collection|Get the itemActivityOLD resources from the activities navigation property.|
|[Create itemActivityOLD](../api/list-post-activities.md)|[itemActivityOLD](../resources/itemactivityold.md)|Create a new itemActivityOLD object.|
|[List columns](../api/list-list-columns.md)|[columnDefinition](../resources/columndefinition.md) collection|Get the columnDefinition resources from the columns navigation property.|
|[Create columnDefinition](../api/list-post-columns.md)|[columnDefinition](../resources/columndefinition.md)|Create a new columnDefinition object.|
|[List contentTypes](../api/list-list-contenttypes.md)|[contentType](../resources/contenttype.md) collection|Get the contentType resources from the contentTypes navigation property.|
|[Create contentType](../api/list-post-contenttypes.md)|[contentType](../resources/contenttype.md)|Create a new contentType object.|
|[List user](../api/list-list-createdbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the createdByUser navigation property.|
|[Add user](../api/list-post-createdbyuser.md)|[user](../resources/user.md)|Add createdByUser by posting to the createdByUser collection.|
|[List drive](../api/list-list-drive.md)|[drive](../resources/drive.md) collection|Get the drive resources from the drive navigation property.|
|[Create drive](../api/list-post-drive.md)|[drive](../resources/drive.md)|Create a new drive object.|
|[List items](../api/list-list-items.md)|[listItem](../resources/listitem.md) collection|Get the listItem resources from the items navigation property.|
|[Create listItem](../api/list-post-items.md)|[listItem](../resources/listitem.md)|Create a new listItem object.|
|[List user](../api/list-list-lastmodifiedbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the lastModifiedByUser navigation property.|
|[Add user](../api/list-post-lastmodifiedbyuser.md)|[user](../resources/user.md)|Add lastModifiedByUser by posting to the lastModifiedByUser collection.|
|[List subscriptions](../api/list-list-subscriptions.md)|[subscription](../resources/subscription.md) collection|Get the subscription resources from the subscriptions navigation property.|
|[Create subscription](../api/list-post-subscriptions.md)|[subscription](../resources/subscription.md)|Create a new subscription object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|description|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|displayName|String|**TODO: Add Description**|
|eTag|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|list|[listInfo](../resources/listinfo.md)|**TODO: Add Description**|
|name|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|parentReference|[itemReference](../resources/itemreference.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|sharepointIds|[sharepointIds](../resources/sharepointids.md)|**TODO: Add Description**|
|system|[systemFacet](../resources/systemfacet.md)|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|activities|[itemActivityOLD](../resources/itemactivityold.md) collection|**TODO: Add Description**|
|columns|[columnDefinition](../resources/columndefinition.md) collection|**TODO: Add Description**|
|contentTypes|[contentType](../resources/contenttype.md) collection|**TODO: Add Description**|
|createdByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|drive|[drive](../resources/drive.md)|**TODO: Add Description**|
|items|[listItem](../resources/listitem.md) collection|**TODO: Add Description**|
|lastModifiedByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|subscriptions|[subscription](../resources/subscription.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.list",
  "baseType": "microsoft.graph.baseItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.list",
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
  "displayName": "String",
  "list": {
    "@odata.type": "microsoft.graph.listInfo"
  },
  "sharepointIds": {
    "@odata.type": "microsoft.graph.sharepointIds"
  },
  "system": {
    "@odata.type": "microsoft.graph.systemFacet"
  }
}
```

