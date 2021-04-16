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
|[List activities](../api/listitem-list-activities.md)|[itemActivityOLD](../resources/itemactivityold.md) collection|Get the itemActivityOLD resources from the activities navigation property.|
|[Create itemActivityOLD](../api/listitem-post-activities.md)|[itemActivityOLD](../resources/itemactivityold.md)|Create a new itemActivityOLD object.|

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
|parentReference|[itemReference](../resources/itemreference.md)|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|
|sharepointIds|[sharepointIds](../resources/sharepointids.md)|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description** Inherited from [baseItem](../resources/baseitem.md)|

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

