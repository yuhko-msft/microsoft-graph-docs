---
title: "listItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# listItem resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [baseItem](../resources/baseitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List listItems](../api/listitem-list.md)|[listItem](../resources/listitem.md) collection|Get a list of the [listItem](../resources/listitem.md) objects and their properties.|
|[Create listItem](../api/listitem-create.md)|[listItem](../resources/listitem.md)|Create a new [listItem](../resources/listitem.md) object.|
|[Get listItem](../api/listitem-get.md)|[listItem](../resources/listitem.md)|Read the properties and relationships of a [listItem](../resources/listitem.md) object.|
|[Update listItem](../api/listitem-update.md)|[listItem](../resources/listitem.md)|Update the properties of a [listItem](../resources/listitem.md) object.|
|[Delete listItem](../api/listitem-delete.md)|None|Deletes a [listItem](../resources/listitem.md) object.|
|[createLink](../api/listitem-createlink.md)|[permission](../resources/permission.md)|**TODO: Add Description**|
|[getActivitiesByInterval](../api/listitem-getactivitiesbyinterval.md)|[itemActivityStat](../resources/itemactivitystat.md) collection|**TODO: Add Description**|
|[List activities](../api/listitem-list-activities.md)|[itemActivityOLD](../resources/itemactivityold.md) collection|Get the itemActivityOLD resources from the activities navigation property.|
|[Create itemActivityOLD](../api/listitem-post-activities.md)|[itemActivityOLD](../resources/itemactivityold.md)|Create a new itemActivityOLD object.|
|[List itemAnalytics](../api/listitem-list-analytics.md)|[itemAnalytics](../resources/itemanalytics.md) collection|Get the itemAnalytics resources from the analytics navigation property.|
|[Add itemAnalytics](../api/listitem-post-analytics.md)|[itemAnalytics](../resources/itemanalytics.md)|Add analytics by posting to the analytics collection.|
|[List user](../api/listitem-list-createdbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the createdByUser navigation property.|
|[Add user](../api/listitem-post-createdbyuser.md)|[user](../resources/user.md)|Add createdByUser by posting to the createdByUser collection.|
|[List driveItem](../api/listitem-list-driveitem.md)|[driveItem](../resources/driveitem.md) collection|Get the driveItem resources from the driveItem navigation property.|
|[Create driveItem](../api/listitem-post-driveitem.md)|[driveItem](../resources/driveitem.md)|Create a new driveItem object.|
|[List fieldValueSet](../api/listitem-list-fields.md)|[fieldValueSet](../resources/fieldvalueset.md) collection|Get the fieldValueSet resources from the fields navigation property.|
|[Create fieldValueSet](../api/listitem-post-fields.md)|[fieldValueSet](../resources/fieldvalueset.md)|Create a new fieldValueSet object.|
|[List user](../api/listitem-list-lastmodifiedbyuser.md)|[user](../resources/user.md) collection|Get the user resources from the lastModifiedByUser navigation property.|
|[Add user](../api/listitem-post-lastmodifiedbyuser.md)|[user](../resources/user.md)|Add lastModifiedByUser by posting to the lastModifiedByUser collection.|
|[List versions](../api/listitem-list-versions.md)|[listItemVersion](../resources/listitemversion.md) collection|Get the listItemVersion resources from the versions navigation property.|
|[Create listItemVersion](../api/listitem-post-versions.md)|[listItemVersion](../resources/listitemversion.md)|Create a new listItemVersion object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentType|[contentTypeInfo](../resources/contenttypeinfo.md)|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|description|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|eTag|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|name|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|parentReference|[itemReference](../resources/itemreference.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|
|sharepointIds|[sharepointIds](../resources/sharepointids.md)|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|activities|[itemActivityOLD](../resources/itemactivityold.md) collection|**TODO: Add Description**|
|analytics|[itemAnalytics](../resources/itemanalytics.md)|**TODO: Add Description**|
|createdByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|driveItem|[driveItem](../resources/driveitem.md)|**TODO: Add Description**|
|fields|[fieldValueSet](../resources/fieldvalueset.md)|**TODO: Add Description**|
|lastModifiedByUser|[user](../resources/user.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|versions|[listItemVersion](../resources/listitemversion.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.listItem",
  "baseType": "microsoft.graph.baseItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.listItem",
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
  "sharepointIds": {
    "@odata.type": "microsoft.graph.sharepointIds"
  }
}
```

