---
title: "subscribeToToneOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# subscribeToToneOperation resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List subscribeToToneOperations](../api/subscribetotoneoperation-list.md)|[subscribeToToneOperation](../resources/subscribetotoneoperation.md) collection|Get a list of the [subscribeToToneOperation](../resources/subscribetotoneoperation.md) objects and their properties.|
|[Create subscribeToToneOperation](../api/subscribetotoneoperation-create.md)|[subscribeToToneOperation](../resources/subscribetotoneoperation.md)|Create a new [subscribeToToneOperation](../resources/subscribetotoneoperation.md) object.|
|[Get subscribeToToneOperation](../api/subscribetotoneoperation-get.md)|[subscribeToToneOperation](../resources/subscribetotoneoperation.md)|Read the properties and relationships of a [subscribeToToneOperation](../resources/subscribetotoneoperation.md) object.|
|[Update subscribeToToneOperation](../api/subscribetotoneoperation-update.md)|[subscribeToToneOperation](../resources/subscribetotoneoperation.md)|Update the properties of a [subscribeToToneOperation](../resources/subscribetotoneoperation.md) object.|
|[Delete subscribeToToneOperation](../api/subscribetotoneoperation-delete.md)|None|Deletes a [subscribeToToneOperation](../resources/subscribetotoneoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|resultInfo|[ResultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.subscribeToToneOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.subscribeToToneOperation",
  "id": "String (identifier)",
  "status": "String",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.ResultInfo"
  }
}
```

