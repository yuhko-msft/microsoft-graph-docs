---
title: "muteParticipantsOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# muteParticipantsOperation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List muteParticipantsOperations](../api/muteparticipantsoperation-list.md)|[muteParticipantsOperation](../resources/muteparticipantsoperation.md) collection|Get a list of the [muteParticipantsOperation](../resources/muteparticipantsoperation.md) objects and their properties.|
|[Create muteParticipantsOperation](../api/muteparticipantsoperation-create.md)|[muteParticipantsOperation](../resources/muteparticipantsoperation.md)|Create a new [muteParticipantsOperation](../resources/muteparticipantsoperation.md) object.|
|[Get muteParticipantsOperation](../api/muteparticipantsoperation-get.md)|[muteParticipantsOperation](../resources/muteparticipantsoperation.md)|Read the properties and relationships of a [muteParticipantsOperation](../resources/muteparticipantsoperation.md) object.|
|[Update muteParticipantsOperation](../api/muteparticipantsoperation-update.md)|[muteParticipantsOperation](../resources/muteparticipantsoperation.md)|Update the properties of a [muteParticipantsOperation](../resources/muteparticipantsoperation.md) object.|
|[Delete muteParticipantsOperation](../api/muteparticipantsoperation-delete.md)|None|Deletes a [muteParticipantsOperation](../resources/muteparticipantsoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|participants|String collection|**TODO: Add Description**|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.muteParticipantsOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.muteParticipantsOperation",
  "id": "String (identifier)",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "participants": [
    "String"
  ]
}
```

