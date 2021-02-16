---
title: "case resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# case resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cases](../api/case-list.md)|[case](../resources/ediscovery-case.md) collection|Get a list of the [case](../resources/case.md) objects and their properties.|
|[Create case](../api/ediscovery-case-create.md)|[case](../resources/ediscovery-case.md)|Create a new [case](../resources/ediscovery-case.md) object.|
|[Get case](../api/ediscovery-case-get.md)|[case](../resources/ediscovery-case.md)|Read the properties and relationships of a [case](../resources/ediscovery-case.md) object.|
|[Update case](../api/ediscovery-case-update.md)|[case](../resources/ediscovery-case.md)|Update the properties of a [case](../resources/ediscovery-case.md) object.|
|[Delete case](../api/ediscovery-case-delete.md)|None|Deletes a [case](../resources/ediscovery-case.md) object.|
|[List legalholds](../api/ediscovery-case-list-legalholds.md)|[legalhold](../resources/ediscovery-legalhold.md) collection|Get the legalhold resources from the legalholds navigation property.|
|[Create legalhold](../api/ediscovery-case-post-legalholds.md)|[legalhold](../resources/ediscovery-legalhold.md)|Create a new legalhold object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|closedBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|closedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md)|
|lastModifiedBy|[identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|caseStatus|**TODO: Add Description**. Possible values are: `unknown`, `active`, `pendingDelete`, `closing`, `closed`, `closedWithError`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|custodians|[custodian](../resources/ediscovery-custodian.md) collection|**TODO: Add Description**|
|legalholds|[legalhold](../resources/ediscovery-legalhold.md) collection|**TODO: Add Description**|
|operations|[caseOperation](../resources/ediscovery-caseoperation.md) collection|**TODO: Add Description**|
|reviewSets|[reviewSet](../resources/ediscovery-reviewset.md) collection|**TODO: Add Description**|
|sourceCollections|[sourceCollection](../resources/ediscovery-sourcecollection.md) collection|**TODO: Add Description**|
|tags|[tag](../resources/ediscovery-tag.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.case",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.case",
  "id": "String (identifier)",
  "description": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "status": "String",
  "closedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "closedDateTime": "String (timestamp)",
  "externalId": "String",
  "displayName": "String",
  "createdDateTime": "String (timestamp)"
}
```

