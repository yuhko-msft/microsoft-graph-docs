---
title: "recordOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# recordOperation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List recordOperations](../api/recordoperation-list.md)|[recordOperation](../resources/recordoperation.md) collection|Get a list of the [recordOperation](../resources/recordoperation.md) objects and their properties.|
|[Create recordOperation](../api/recordoperation-create.md)|[recordOperation](../resources/recordoperation.md)|Create a new [recordOperation](../resources/recordoperation.md) object.|
|[Get recordOperation](../api/recordoperation-get.md)|[recordOperation](../resources/recordoperation.md)|Read the properties and relationships of a [recordOperation](../resources/recordoperation.md) object.|
|[Update recordOperation](../api/recordoperation-update.md)|[recordOperation](../resources/recordoperation.md)|Update the properties of a [recordOperation](../resources/recordoperation.md) object.|
|[Delete recordOperation](../api/recordoperation-delete.md)|None|Deletes a [recordOperation](../resources/recordoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|completionReason|recordCompletionReason|**TODO: Add Description**. Possible values are: `operationCanceled`, `stopToneDetected`, `maxRecordDurationReached`, `initialSilenceTimeout`, `maxSilenceTimeout`, `playPromptFailed`, `playBeepFailed`, `mediaReceiveTimeout`, `unspecifiedError`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|recordingAccessToken|String|**TODO: Add Description**|
|recordingLocation|String|**TODO: Add Description**|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.recordOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.recordOperation",
  "id": "String (identifier)",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "completionReason": "String",
  "recordingAccessToken": "String",
  "recordingLocation": "String"
}
```

