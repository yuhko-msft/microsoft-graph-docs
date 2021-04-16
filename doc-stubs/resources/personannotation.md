---
title: "personAnnotation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# personAnnotation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [itemFacet](../resources/itemfacet.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List personAnnotations](../api/personannotation-list.md)|[personAnnotation](../resources/personannotation.md) collection|Get a list of the [personAnnotation](../resources/personannotation.md) objects and their properties.|
|[Create personAnnotation](../api/personannotation-create.md)|[personAnnotation](../resources/personannotation.md)|Create a new [personAnnotation](../resources/personannotation.md) object.|
|[Get personAnnotation](../api/personannotation-get.md)|[personAnnotation](../resources/personannotation.md)|Read the properties and relationships of a [personAnnotation](../resources/personannotation.md) object.|
|[Update personAnnotation](../api/personannotation-update.md)|[personAnnotation](../resources/personannotation.md)|Update the properties of a [personAnnotation](../resources/personannotation.md) object.|
|[Delete personAnnotation](../api/personannotation-delete.md)|None|Deletes a [personAnnotation](../resources/personannotation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedAudiences|allowedAudiences|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md). Possible values are: `me`, `family`, `contacts`, `groupMembers`, `organization`, `federatedOrganizations`, `everyone`, `unknownFutureValue`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|detail|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|inference|[inferenceData](../resources/inferencedata.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|isSearchable|Boolean|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|source|[personDataSources](../resources/persondatasources.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|thumbnailUrl|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.personAnnotation",
  "baseType": "microsoft.graph.itemFacet",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.personAnnotation",
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
    "@odata.type": "microsoft.graph.itemBody"
  },
  "displayName": "String",
  "thumbnailUrl": "String"
}
```

