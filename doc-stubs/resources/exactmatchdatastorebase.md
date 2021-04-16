---
title: "exactMatchDataStoreBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# exactMatchDataStoreBase resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List exactMatchDataStoreBases](../api/exactmatchdatastorebase-list.md)|[exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) collection|Get a list of the [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) objects and their properties.|
|[Create exactMatchDataStoreBase](../api/exactmatchdatastorebase-create.md)|[exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md)|Create a new [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object.|
|[Get exactMatchDataStoreBase](../api/exactmatchdatastorebase-get.md)|[exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md)|Read the properties and relationships of an [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object.|
|[Update exactMatchDataStoreBase](../api/exactmatchdatastorebase-update.md)|[exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md)|Update the properties of an [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object.|
|[Delete exactMatchDataStoreBase](../api/exactmatchdatastorebase-delete.md)|None|Deletes an [exactMatchDataStoreBase](../resources/exactmatchdatastorebase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|columns|[exactDataMatchStoreColumn](../resources/exactdatamatchstorecolumn.md) collection|**TODO: Add Description**|
|dataLastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.exactMatchDataStoreBase",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exactMatchDataStoreBase",
  "id": "String (identifier)",
  "columns": [
    {
      "@odata.type": "microsoft.graph.exactDataMatchStoreColumn"
    }
  ],
  "dataLastUpdatedDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String"
}
```

