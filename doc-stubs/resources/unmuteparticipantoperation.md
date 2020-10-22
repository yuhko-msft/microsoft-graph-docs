---
title: "unmuteParticipantOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# unmuteParticipantOperation resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List unmuteParticipantOperations](../api/unmuteparticipantoperation-list.md)|[unmuteParticipantOperation](../resources/unmuteparticipantoperation.md) collection|Get a list of the [unmuteParticipantOperation](../resources/unmuteparticipantoperation.md) objects and their properties.|
|[Create unmuteParticipantOperation](../api/unmuteparticipantoperation-create.md)|[unmuteParticipantOperation](../resources/unmuteparticipantoperation.md)|Create a new [unmuteParticipantOperation](../resources/unmuteparticipantoperation.md) object.|
|[Get unmuteParticipantOperation](../api/unmuteparticipantoperation-get.md)|[unmuteParticipantOperation](../resources/unmuteparticipantoperation.md)|Read the properties and relationships of an [unmuteParticipantOperation](../resources/unmuteparticipantoperation.md) object.|
|[Update unmuteParticipantOperation](../api/unmuteparticipantoperation-update.md)|[unmuteParticipantOperation](../resources/unmuteparticipantoperation.md)|Update the properties of an [unmuteParticipantOperation](../resources/unmuteparticipantoperation.md) object.|
|[Delete unmuteParticipantOperation](../api/unmuteparticipantoperation-delete.md)|None|Deletes an [unmuteParticipantOperation](../resources/unmuteparticipantoperation.md) object.|

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
  "@odata.type": "microsoft.graph.unmuteParticipantOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.unmuteParticipantOperation",
  "id": "String (identifier)",
  "status": "String",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.ResultInfo"
  }
}
```

