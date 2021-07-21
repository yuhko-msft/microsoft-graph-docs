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


Inherits from [entity](../resources/ediscovery-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cases](../api/ediscovery-case-list.md)|[microsoft.graph.ediscovery.case](../resources/ediscovery-case.md) collection|Get a list of the [case](../resources/ediscovery-case.md) objects and their properties.|
|[Create case](../api/ediscovery-case-create.md)|[microsoft.graph.ediscovery.case](../resources/ediscovery-case.md)|Create a new [case](../resources/ediscovery-case.md) object.|
|[Get case](../api/ediscovery-case-get.md)|[microsoft.graph.ediscovery.case](../resources/ediscovery-case.md)|Read the properties and relationships of a [case](../resources/ediscovery-case.md) object.|
|[Update case](../api/ediscovery-case-update.md)|[microsoft.graph.ediscovery.case](../resources/ediscovery-case.md)|Update the properties of a [case](../resources/ediscovery-case.md) object.|
|[Delete case](../api/ediscovery-case-delete.md)|None|Deletes a [case](../resources/ediscovery-case.md) object.|
|[close](../api/ediscovery-case-close.md)|None|**TODO: Add Description**|
|[reopen](../api/ediscovery-case-reopen.md)|None|**TODO: Add Description**|
|[List custodians](../api/ediscovery-case-list-custodians.md)|[microsoft.graph.ediscovery.custodian](../resources/ediscovery-custodian.md) collection|Get the custodian resources from the custodians navigation property.|
|[Create custodian](../api/ediscovery-case-post-custodians.md)|[microsoft.graph.ediscovery.custodian](../resources/ediscovery-custodian.md)|Create a new custodian object.|
|[List legalHolds](../api/ediscovery-case-list-legalholds.md)|[microsoft.graph.ediscovery.legalHold](../resources/ediscovery-legalhold.md) collection|Get the legalHold resources from the legalHolds navigation property.|
|[Create legalHold](../api/ediscovery-case-post-legalholds.md)|[microsoft.graph.ediscovery.legalHold](../resources/ediscovery-legalhold.md)|Create a new legalHold object.|
|[List noncustodialDataSources](../api/ediscovery-case-list-noncustodialdatasources.md)|[microsoft.graph.ediscovery.noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) collection|Get the noncustodialDataSource resources from the noncustodialDataSources navigation property.|
|[Create noncustodialDataSource](../api/ediscovery-case-post-noncustodialdatasources.md)|[microsoft.graph.ediscovery.noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md)|Create a new noncustodialDataSource object.|
|[List operations](../api/ediscovery-case-list-operations.md)|[microsoft.graph.ediscovery.caseOperation](../resources/ediscovery-caseoperation.md) collection|Get the caseOperation resources from the operations navigation property.|
|[Create caseOperation](../api/ediscovery-case-post-operations.md)|[microsoft.graph.ediscovery.caseOperation](../resources/ediscovery-caseoperation.md)|Create a new caseOperation object.|
|[List reviewSets](../api/ediscovery-case-list-reviewsets.md)|[microsoft.graph.ediscovery.reviewSet](../resources/ediscovery-reviewset.md) collection|Get the reviewSet resources from the reviewSets navigation property.|
|[Create reviewSet](../api/ediscovery-case-post-reviewsets.md)|[microsoft.graph.ediscovery.reviewSet](../resources/ediscovery-reviewset.md)|Create a new reviewSet object.|
|[List settings](../api/ediscovery-case-list-settings.md)|[microsoft.graph.ediscovery.settings](../resources/ediscovery-settings.md) collection|Get the settings resources from the settings navigation property.|
|[Create settings](../api/ediscovery-case-post-settings.md)|[microsoft.graph.ediscovery.settings](../resources/ediscovery-settings.md)|Create a new settings object.|
|[List sourceCollections](../api/ediscovery-case-list-sourcecollections.md)|[microsoft.graph.ediscovery.sourceCollection](../resources/ediscovery-sourcecollection.md) collection|Get the sourceCollection resources from the sourceCollections navigation property.|
|[Create sourceCollection](../api/ediscovery-case-post-sourcecollections.md)|[microsoft.graph.ediscovery.sourceCollection](../resources/ediscovery-sourcecollection.md)|Create a new sourceCollection object.|
|[List tags](../api/ediscovery-case-list-tags.md)|[microsoft.graph.ediscovery.tag](../resources/ediscovery-tag.md) collection|Get the tag resources from the tags navigation property.|
|[Create tag](../api/ediscovery-case-post-tags.md)|[microsoft.graph.ediscovery.tag](../resources/ediscovery-tag.md)|Create a new tag object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|closedBy|[microsoft.graph.identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|closedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md).|
|lastModifiedBy|[microsoft.graph.identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|caseStatus|**TODO: Add Description**. Possible values are: `unknown`, `active`, `pendingDelete`, `closing`, `closed`, `closedWithError`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|custodians|[microsoft.graph.ediscovery.custodian](../resources/ediscovery-custodian.md) collection|**TODO: Add Description**|
|legalHolds|[microsoft.graph.ediscovery.legalHold](../resources/ediscovery-legalhold.md) collection|**TODO: Add Description**|
|noncustodialDataSources|[microsoft.graph.ediscovery.noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) collection|**TODO: Add Description**|
|operations|[microsoft.graph.ediscovery.caseOperation](../resources/ediscovery-caseoperation.md) collection|**TODO: Add Description**|
|reviewSets|[microsoft.graph.ediscovery.reviewSet](../resources/ediscovery-reviewset.md) collection|**TODO: Add Description**|
|settings|[settings](../resources/ediscovery-settings.md)|**TODO: Add Description**|
|sourceCollections|[microsoft.graph.ediscovery.sourceCollection](../resources/ediscovery-sourcecollection.md) collection|**TODO: Add Description**|
|tags|[microsoft.graph.ediscovery.tag](../resources/ediscovery-tag.md) collection|**TODO: Add Description**|

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
  "closedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "closedDateTime": "String (timestamp)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "externalId": "String",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "status": "String"
}
```

