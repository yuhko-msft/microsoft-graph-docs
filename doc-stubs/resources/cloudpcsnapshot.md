---
title: "cloudPcSnapshot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cloudPcSnapshot resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cloudPcSnapshots](../api/cloudpcsnapshot-list.md)|[cloudPcSnapshot](../resources/cloudpcsnapshot.md) collection|Get a list of the [cloudPcSnapshot](../resources/cloudpcsnapshot.md) objects and their properties.|
|[Create cloudPcSnapshot](../api/virtualendpoint-post-snapshots.md)|[cloudPcSnapshot](../resources/cloudpcsnapshot.md)|Create a new [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object.|
|[Get cloudPcSnapshot](../api/cloudpcsnapshot-get.md)|[cloudPcSnapshot](../resources/cloudpcsnapshot.md)|Read the properties and relationships of a [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object.|
|[Update cloudPcSnapshot](../api/cloudpcsnapshot-update.md)|[cloudPcSnapshot](../resources/cloudpcsnapshot.md)|Update the properties of a [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object.|
|[Delete cloudPcSnapshot](../api/cloudpcsnapshot-delete.md)|None|Deletes a [cloudPcSnapshot](../resources/cloudpcsnapshot.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|cloudPcId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastRestoredDateTime|DateTimeOffset|**TODO: Add Description**|
|status|cloudPcSnapshotStatus|**TODO: Add Description**. The possible values are: `ready`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cloudPcSnapshot",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcSnapshot",
  "id": "String (identifier)",
  "cloudPcId": "String",
  "status": "String",
  "createdDateTime": "String (timestamp)",
  "lastRestoredDateTime": "String (timestamp)"
}
```

