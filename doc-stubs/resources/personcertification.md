---
title: "personCertification resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# personCertification resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [itemFacet](../resources/itemfacet.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List personCertifications](../api/personcertification-list.md)|[personCertification](../resources/personcertification.md) collection|Get a list of the [personCertification](../resources/personcertification.md) objects and their properties.|
|[Create personCertification](../api/personcertification-create.md)|[personCertification](../resources/personcertification.md)|Create a new [personCertification](../resources/personcertification.md) object.|
|[Get personCertification](../api/personcertification-get.md)|[personCertification](../resources/personcertification.md)|Read the properties and relationships of a [personCertification](../resources/personcertification.md) object.|
|[Update personCertification](../api/personcertification-update.md)|[personCertification](../resources/personcertification.md)|Update the properties of a [personCertification](../resources/personcertification.md) object.|
|[Delete personCertification](../api/personcertification-delete.md)|None|Deletes a [personCertification](../resources/personcertification.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedAudiences|allowedAudiences|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md). Possible values are: `me`, `family`, `contacts`, `groupMembers`, `organization`, `federatedOrganizations`, `everyone`, `unknownFutureValue`.|
|certificationId|String|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|endDate|Date|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|inference|[inferenceData](../resources/inferencedata.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|isSearchable|Boolean|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|issuedDate|Date|**TODO: Add Description**|
|issuingAuthority|String|**TODO: Add Description**|
|issuingCompany|String|**TODO: Add Description**|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|source|[personDataSources](../resources/persondatasources.md)|**TODO: Add Description** Inherited from [itemFacet](../resources/itemfacet.md)|
|startDate|Date|**TODO: Add Description**|
|thumbnailUrl|String|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.personCertification",
  "baseType": "microsoft.graph.itemFacet",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.personCertification",
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
  "certificationId": "String",
  "description": "String",
  "displayName": "String",
  "endDate": "Date",
  "issuedDate": "Date",
  "issuingAuthority": "String",
  "issuingCompany": "String",
  "startDate": "Date",
  "thumbnailUrl": "String",
  "webUrl": "String"
}
```

