---
title: "muteParticipantOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# muteParticipantOperation resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List muteParticipantOperations](../api/muteparticipantoperation-list.md)|[muteParticipantOperation](../resources/muteparticipantoperation.md) collection|Get a list of the [muteParticipantOperation](../resources/muteparticipantoperation.md) objects and their properties.|
|[Create muteParticipantOperation](../api/muteparticipantoperation-create.md)|[muteParticipantOperation](../resources/muteparticipantoperation.md)|Create a new [muteParticipantOperation](../resources/muteparticipantoperation.md) object.|
|[Get muteParticipantOperation](../api/muteparticipantoperation-get.md)|[muteParticipantOperation](../resources/muteparticipantoperation.md)|Read the properties and relationships of a [muteParticipantOperation](../resources/muteparticipantoperation.md) object.|
|[Update muteParticipantOperation](../api/muteparticipantoperation-update.md)|[muteParticipantOperation](../resources/muteparticipantoperation.md)|Update the properties of a [muteParticipantOperation](../resources/muteparticipantoperation.md) object.|
|[Delete muteParticipantOperation](../api/muteparticipantoperation-delete.md)|None|Deletes a [muteParticipantOperation](../resources/muteparticipantoperation.md) object.|

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
  "@odata.type": "microsoft.graph.muteParticipantOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.muteParticipantOperation",
  "id": "String (identifier)",
  "status": "String",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.ResultInfo"
  }
}
```

