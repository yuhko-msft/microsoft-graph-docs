---
title: "webAccount resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# webAccount resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [itemFacet](../resources/itemfacet.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List webAccounts](../api/webaccount-list.md)|[webAccount](../resources/webaccount.md) collection|Get a list of the [webAccount](../resources/webaccount.md) objects and their properties.|
|[Create webAccount](../api/webaccount-create.md)|[webAccount](../resources/webaccount.md)|Create a new [webAccount](../resources/webaccount.md) object.|
|[Get webAccount](../api/webaccount-get.md)|[webAccount](../resources/webaccount.md)|Read the properties and relationships of a [webAccount](../resources/webaccount.md) object.|
|[Update webAccount](../api/webaccount-update.md)|[webAccount](../resources/webaccount.md)|Update the properties of a [webAccount](../resources/webaccount.md) object.|
|[Delete webAccount](../api/webaccount-delete.md)|None|Deletes a [webAccount](../resources/webaccount.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedAudiences|allowedAudiences|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md). Possible values are: `me`, `family`, `contacts`, `groupMembers`, `organization`, `federatedOrganizations`, `everyone`, `unknownFutureValue`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|inference|[inferenceData](../resources/inferencedata.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|isSearchable|Boolean|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|service|[serviceInformation](../resources/serviceinformation.md)|**TODO: Add Description**|
|source|[personDataSources](../resources/persondatasources.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|statusMessage|String|**TODO: Add Description**|
|thumbnailUrl|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.webAccount",
  "baseType": "microsoft.graph.itemFacet",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.webAccount",
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
  "description": "String",
  "service": {
    "@odata.type": "microsoft.graph.serviceInformation"
  },
  "statusMessage": "String",
  "thumbnailUrl": "String",
  "userId": "String",
  "webUrl": "String"
}
```

