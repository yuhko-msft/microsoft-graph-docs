---
title: "connectionOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# connectionOperation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List connectionOperations](../api/connectionoperation-list.md)|[connectionOperation](../resources/connectionoperation.md) collection|Get a list of the [connectionOperation](../resources/connectionoperation.md) objects and their properties.|
|[Create connectionOperation](../api/connectionoperation-create.md)|[connectionOperation](../resources/connectionoperation.md)|Create a new [connectionOperation](../resources/connectionoperation.md) object.|
|[Get connectionOperation](../api/connectionoperation-get.md)|[connectionOperation](../resources/connectionoperation.md)|Read the properties and relationships of a [connectionOperation](../resources/connectionoperation.md) object.|
|[Update connectionOperation](../api/connectionoperation-update.md)|[connectionOperation](../resources/connectionoperation.md)|Update the properties of a [connectionOperation](../resources/connectionoperation.md) object.|
|[Delete connectionOperation](../api/connectionoperation-delete.md)|None|Deletes a [connectionOperation](../resources/connectionoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|error|[publicError](../resources/publicerror.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|status|connectionOperationStatus|**TODO: Add Description**. Possible values are: `unspecified`, `inprogress`, `completed`, `failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.connectionOperation",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.connectionOperation",
  "id": "String (identifier)",
  "error": {
    "@odata.type": "microsoft.graph.publicError"
  },
  "status": "String"
}
```

