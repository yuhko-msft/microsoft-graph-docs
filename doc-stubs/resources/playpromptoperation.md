---
title: "playPromptOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# playPromptOperation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List playPromptOperations](../api/playpromptoperation-list.md)|[playPromptOperation](../resources/playpromptoperation.md) collection|Get a list of the [playPromptOperation](../resources/playpromptoperation.md) objects and their properties.|
|[Create playPromptOperation](../api/playpromptoperation-create.md)|[playPromptOperation](../resources/playpromptoperation.md)|Create a new [playPromptOperation](../resources/playpromptoperation.md) object.|
|[Get playPromptOperation](../api/playpromptoperation-get.md)|[playPromptOperation](../resources/playpromptoperation.md)|Read the properties and relationships of a [playPromptOperation](../resources/playpromptoperation.md) object.|
|[Update playPromptOperation](../api/playpromptoperation-update.md)|[playPromptOperation](../resources/playpromptoperation.md)|Update the properties of a [playPromptOperation](../resources/playpromptoperation.md) object.|
|[Delete playPromptOperation](../api/playpromptoperation-delete.md)|None|Deletes a [playPromptOperation](../resources/playpromptoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|completionReason|playPromptCompletionReason|**TODO: Add Description**. Possible values are: `unknown`, `completedSuccessfully`, `mediaOperationCanceled`, `unknownFutureValue`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.playPromptOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.playPromptOperation",
  "id": "String (identifier)",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "completionReason": "String"
}
```

