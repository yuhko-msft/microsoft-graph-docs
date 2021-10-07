---
title: "case resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
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
|[List caseSettings](../api/ediscovery-case-list-settings.md)|[microsoft.graph.ediscovery.caseSettings](../resources/ediscovery-casesettings.md) collection|Get the caseSettings resources from the settings navigation property.|
|[Create caseSettings](../api/ediscovery-case-post-settings.md)|[microsoft.graph.ediscovery.caseSettings](../resources/ediscovery-casesettings.md)|Create a new caseSettings object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|closedBy|[microsoft.graph.identitySet](../resources/ediscovery-intune-identityset.md)|**TODO: Add Description**|
|closedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md).|
|lastModifiedBy|[microsoft.graph.identitySet](../resources/ediscovery-intune-identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|caseStatus|**TODO: Add Description**. The possible values are: `unknown`, `active`, `pendingDelete`, `closing`, `closed`, `closedWithError`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|custodians|[microsoft.graph.ediscovery.custodian](../resources/ediscovery-custodian.md) collection|**TODO: Add Description**|
|legalHolds|[microsoft.graph.ediscovery.legalHold](../resources/ediscovery-legalhold.md) collection|**TODO: Add Description**|
|noncustodialDataSources|[microsoft.graph.ediscovery.noncustodialDataSource](../resources/ediscovery-noncustodialdatasource.md) collection|**TODO: Add Description**|
|operations|[microsoft.graph.ediscovery.caseOperation](../resources/ediscovery-caseoperation.md) collection|**TODO: Add Description**|
|reviewSets|[microsoft.graph.ediscovery.reviewSet](../resources/ediscovery-reviewset.md) collection|**TODO: Add Description**|
|settings|[caseSettings](../resources/ediscovery-casesettings.md)|**TODO: Add Description**|
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

