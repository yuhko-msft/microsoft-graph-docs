---
title: "itemAddress resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemAddress resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [itemFacet](../resources/itemfacet.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List itemAddresses](../api/itemaddress-list.md)|[itemAddress](../resources/itemaddress.md) collection|Get a list of the [itemAddress](../resources/itemaddress.md) objects and their properties.|
|[Create itemAddress](../api/itemaddress-create.md)|[itemAddress](../resources/itemaddress.md)|Create a new [itemAddress](../resources/itemaddress.md) object.|
|[Get itemAddress](../api/itemaddress-get.md)|[itemAddress](../resources/itemaddress.md)|Read the properties and relationships of an [itemAddress](../resources/itemaddress.md) object.|
|[Update itemAddress](../api/itemaddress-update.md)|[itemAddress](../resources/itemaddress.md)|Update the properties of an [itemAddress](../resources/itemaddress.md) object.|
|[Delete itemAddress](../api/itemaddress-delete.md)|None|Deletes an [itemAddress](../resources/itemaddress.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedAudiences|allowedAudiences|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md). Possible values are: `me`, `family`, `contacts`, `groupMembers`, `organization`, `federatedOrganizations`, `everyone`, `unknownFutureValue`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|detail|[physicalAddress](../resources/physicaladdress.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|geoCoordinates|[geoCoordinates](../resources/geocoordinates.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|inference|[inferenceData](../resources/inferencedata.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|isSearchable|Boolean|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|source|[personDataSources](../resources/persondatasources.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.itemAddress",
  "baseType": "microsoft.graph.itemFacet",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemAddress",
  "id": "String (identifier)",
  "allowedAudiences": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "inference": {
    "@odata.type": "microsoft.graph.inferenceData"
  },
  "isSearchable": "Boolean",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "source": {
    "@odata.type": "microsoft.graph.personDataSources"
  },
  "detail": {
    "@odata.type": "microsoft.graph.physicalAddress"
  },
  "displayName": "String",
  "geoCoordinates": {
    "@odata.type": "microsoft.graph.geoCoordinates"
  }
}
```

