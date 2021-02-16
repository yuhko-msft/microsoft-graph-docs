---
title: "legalhold resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# legalhold resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List legalholds](../api/legalhold-list.md)|[legalhold](../resources/ediscovery-legalhold.md) collection|Get a list of the [legalhold](../resources/legalhold.md) objects and their properties.|
|[Create legalhold](../api/ediscovery-legalhold-create.md)|[legalhold](../resources/ediscovery-legalhold.md)|Create a new [legalhold](../resources/ediscovery-legalhold.md) object.|
|[Get legalhold](../api/ediscovery-legalhold-get.md)|[legalhold](../resources/ediscovery-legalhold.md)|Read the properties and relationships of a [legalhold](../resources/ediscovery-legalhold.md) object.|
|[Update legalhold](../api/ediscovery-legalhold-update.md)|[legalhold](../resources/ediscovery-legalhold.md)|Update the properties of a [legalhold](../resources/ediscovery-legalhold.md) object.|
|[Delete legalhold](../api/ediscovery-legalhold-delete.md)|None|Deletes a [legalhold](../resources/ediscovery-legalhold.md) object.|
|[List siteSources](../api/ediscovery-legalhold-list-sitesources.md)|[siteSource](../resources/ediscovery-sitesource.md) collection|Get the siteSource resources from the siteSources navigation property.|
|[Create siteSource](../api/ediscovery-legalhold-post-sitesources.md)|[siteSource](../resources/ediscovery-sitesource.md)|Create a new siteSource object.|
|[List unifiedGroupSources](../api/ediscovery-legalhold-list-unifiedgroupsources.md)|[unifiedGroupSource](../resources/ediscovery-unifiedgroupsource.md) collection|Get the unifiedGroupSource resources from the unifiedGroupSources navigation property.|
|[Create unifiedGroupSource](../api/ediscovery-legalhold-post-unifiedgroupsources.md)|[unifiedGroupSource](../resources/ediscovery-unifiedgroupsource.md)|Create a new unifiedGroupSource object.|
|[List userSources](../api/ediscovery-legalhold-list-usersources.md)|[userSource](../resources/ediscovery-usersource.md) collection|Get the userSource resources from the userSources navigation property.|
|[Create userSource](../api/ediscovery-legalhold-post-usersources.md)|[userSource](../resources/ediscovery-usersource.md)|Create a new userSource object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentQuery|String|**TODO: Add Description**|
|createdBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|errors|String collection|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|isEnabled|Boolean|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|legalHoldStatus|**TODO: Add Description**. Possible values are: `Pending`, `Error`, `Success`, `UnknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|siteSources|[siteSource](../resources/ediscovery-sitesource.md) collection|**TODO: Add Description**|
|unifiedGroupSources|[unifiedGroupSource](../resources/ediscovery-unifiedgroupsource.md) collection|**TODO: Add Description**|
|userSources|[userSource](../resources/ediscovery-usersource.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.legalhold",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.legalhold",
  "id": "String (identifier)",
  "description": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "isEnabled": "Boolean",
  "status": "String",
  "contentQuery": "String",
  "errors": [
    "String"
  ],
  "displayName": "String",
  "createdDateTime": "String (timestamp)"
}
```

