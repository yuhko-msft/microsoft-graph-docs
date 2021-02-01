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
|[List legalHolds](../api/ediscovery-case-list-legalholds.md)|[legalHold](../resources/ediscovery-legalhold.md) collection|Get the legalHold resources from the legalHolds navigation property.|
|[Create legalHold](../api/ediscovery-case-post-legalholds.md)|[legalHold](../resources/ediscovery-legalhold.md)|Create a new legalHold object.|
|[List noncustodialDataSources](../api/ediscovery-case-list-noncustodialdatasources.md)|[noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) collection|Get the noncustodialDataSource resources from the noncustodialDataSources navigation property.|
|[Create noncustodialDataSource](../api/ediscovery-case-post-noncustodialdatasources.md)|[noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md)|Create a new noncustodialDataSource object.|
|[List settings](../api/ediscovery-case-list-settings.md)|[settings](../resources/ediscovery-settings.md) collection|Get the settings resources from the settings navigation property.|
|[Create settings](../api/ediscovery-case-post-settings.md)|[settings](../resources/ediscovery-settings.md)|Create a new settings object.|

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
|legalHolds|[legalHold](../resources/ediscovery-legalhold.md) collection|**TODO: Add Description**|
|noncustodialDataSources|[noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) collection|**TODO: Add Description**|
|operations|[caseOperation](../resources/ediscovery-caseoperation.md) collection|**TODO: Add Description**|
|reviewSets|[reviewSet](../resources/ediscovery-reviewset.md) collection|**TODO: Add Description**|
|settings|[settings](../resources/ediscovery-settings.md)|**TODO: Add Description**|
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

