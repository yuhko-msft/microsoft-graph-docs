---
title: "validateOperation resource type"
description: "This entity represents the asynchronous operation results from any operation that validates data."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# validateOperation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity represents the asynchronous operation results from any operation that validates data.


Inherits from [longRunningOperation](../resources/longrunningoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List validateOperations](../api/validateoperation-list.md)|[validateOperation](../resources/validateoperation.md) collection|Get a list of the [validateOperation](../resources/validateoperation.md) objects and their properties.|
|[Get validateOperation](../api/validateoperation-get.md)|[validateOperation](../resources/validateoperation.md)|Read the properties and relationships of a [validateOperation](../resources/validateoperation.md) object.|
|[Update validateOperation](../api/validateoperation-update.md)|[validateOperation](../resources/validateoperation.md)|Update the properties of a [validateOperation](../resources/validateoperation.md) object.|
|[Delete validateOperation](../api/validateoperation-delete.md)|None|Deletes a [validateOperation](../resources/validateoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|errors|[publicError](../resources/publicerror.md) collection|Set of errors discovered by validation.|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|resourceLocation|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|status|longRunningOperationStatus|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). The possible values are: `notstarted`, `running`, `succeeded`, `failed`.|
|statusDetail|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|warnings|[publicError](../resources/publicerror.md) collection|Set of warnings discovered by validation.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.validateOperation",
  "baseType": "microsoft.graph.longRunningOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.validateOperation",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastActionDateTime": "String (timestamp)",
  "status": "String",
  "statusDetail": "String",
  "resourceLocation": "String",
  "errors": [
    {
      "@odata.type": "microsoft.graph.publicError"
    }
  ],
  "warnings": [
    {
      "@odata.type": "microsoft.graph.publicError"
    }
  ]
}
```

