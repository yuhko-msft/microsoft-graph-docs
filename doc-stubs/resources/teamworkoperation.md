---
title: "teamworkOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkOperation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamworkOperations](../api/teamworkoperation-list.md)|[teamworkOperation](../resources/teamworkoperation.md) collection|Get a list of the [teamworkOperation](../resources/teamworkoperation.md) objects and their properties.|
|[Get teamworkOperation](../api/teamworkoperation-get.md)|[teamworkOperation](../resources/teamworkoperation.md)|Read the properties and relationships of a [teamworkOperation](../resources/teamworkoperation.md) object.|
|[Update teamworkOperation](../api/teamworkoperation-update.md)|[teamworkOperation](../resources/teamworkoperation.md)|Update the properties of a [teamworkOperation](../resources/teamworkoperation.md) object.|
|[Delete teamworkOperation](../api/teamworkoperation-delete.md)|None|Deletes a [teamworkOperation](../resources/teamworkoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|error|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|resourceLocation|String|**TODO: Add Description**|
|resourceType|teamworkResourceType|**TODO: Add Description**. The possible values are: `hierarchy`, `customList`, `unknownFutureValue`.|
|status|teamworkOperationStatus|**TODO: Add Description**. The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamworkOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkOperation",
  "id": "String (identifier)",
  "status": "String",
  "resourceType": "String",
  "error": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "resourceLocation": "String"
}
```

