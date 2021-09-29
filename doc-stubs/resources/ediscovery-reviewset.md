---
title: "reviewSet resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# reviewSet resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/ediscovery-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List reviewSets](../api/ediscovery-reviewset-list.md)|[microsoft.graph.ediscovery.reviewSet](../resources/ediscovery-reviewset.md) collection|Get a list of the [reviewSet](../resources/ediscovery-reviewset.md) objects and their properties.|
|[Create reviewSet](../api/ediscovery-reviewset-create.md)|[microsoft.graph.ediscovery.reviewSet](../resources/ediscovery-reviewset.md)|Create a new [reviewSet](../resources/ediscovery-reviewset.md) object.|
|[Get reviewSet](../api/ediscovery-reviewset-get.md)|[microsoft.graph.ediscovery.reviewSet](../resources/ediscovery-reviewset.md)|Read the properties and relationships of a [reviewSet](../resources/ediscovery-reviewset.md) object.|
|[Update reviewSet](../api/ediscovery-reviewset-update.md)|[microsoft.graph.ediscovery.reviewSet](../resources/ediscovery-reviewset.md)|Update the properties of a [reviewSet](../resources/ediscovery-reviewset.md) object.|
|[Delete reviewSet](../api/ediscovery-reviewset-delete.md)|None|Deletes a [reviewSet](../resources/ediscovery-reviewset.md) object.|
|[List files](../api/ediscovery-reviewset-list-files.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md) collection|Get the file resources from the files navigation property.|
|[Create file](../api/ediscovery-reviewset-post-files.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md)|Create a new file object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdBy|[microsoft.graph.identitySet](../resources/ediscovery-identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/ediscovery-entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|files|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md) collection|**TODO: Add Description**|
|queries|[microsoft.graph.ediscovery.reviewSetQuery](../resources/ediscovery-reviewsetquery.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.reviewSet",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.reviewSet",
  "id": "String (identifier)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "displayName": "String",
  "createdDateTime": "String (timestamp)"
}
```

