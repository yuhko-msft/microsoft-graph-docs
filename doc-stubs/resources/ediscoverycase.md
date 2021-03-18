---
title: "ediscoveryCase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# ediscoveryCase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List ediscoveryCases](../api/ediscoverycase-list.md)|[ediscoveryCase](../resources/ediscoverycase.md) collection|Get a list of the [ediscoveryCase](../resources/ediscoverycase.md) objects and their properties.|
|[Create ediscoveryCase](../api/ediscoverycase-create.md)|[ediscoveryCase](../resources/ediscoverycase.md)|Create a new [ediscoveryCase](../resources/ediscoverycase.md) object.|
|[Get ediscoveryCase](../api/ediscoverycase-get.md)|[ediscoveryCase](../resources/ediscoverycase.md)|Read the properties and relationships of an [ediscoveryCase](../resources/ediscoverycase.md) object.|
|[Update ediscoveryCase](../api/ediscoverycase-update.md)|[ediscoveryCase](../resources/ediscoverycase.md)|Update the properties of an [ediscoveryCase](../resources/ediscoverycase.md) object.|
|[Delete ediscoveryCase](../api/ediscoverycase-delete.md)|None|Deletes an [ediscoveryCase](../resources/ediscoverycase.md) object.|
|[close](../api/ediscoverycase-close.md)|None|**TODO: Add Description**|
|[reopen](../api/ediscoverycase-reopen.md)|None|**TODO: Add Description**|
|[List reviewSets](../api/ediscoverycase-list-reviewsets.md)|[reviewSet](../resources/reviewset.md) collection|Get the reviewSet resources from the reviewSets navigation property.|
|[Create reviewSet](../api/ediscoverycase-post-reviewsets.md)|[reviewSet](../resources/reviewset.md)|Create a new reviewSet object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|closedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|closedDateTime|DateTimeOffset|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|caseStatus|**TODO: Add Description**. Possible values are: `unknown`, `active`, `pendingDelete`, `closing`, `closed`, `closedWithError`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|reviewSets|[reviewSet](../resources/reviewset.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscoveryCase",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscoveryCase",
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

