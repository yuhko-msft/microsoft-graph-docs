---
title: "updateRecordingStatusOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# updateRecordingStatusOperation resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List updateRecordingStatusOperations](../api/updaterecordingstatusoperation-list.md)|[updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md) collection|Get a list of the [updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md) objects and their properties.|
|[Create updateRecordingStatusOperation](../api/updaterecordingstatusoperation-create.md)|[updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md)|Create a new [updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md) object.|
|[Get updateRecordingStatusOperation](../api/updaterecordingstatusoperation-get.md)|[updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md)|Read the properties and relationships of an [updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md) object.|
|[Update updateRecordingStatusOperation](../api/updaterecordingstatusoperation-update.md)|[updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md)|Update the properties of an [updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md) object.|
|[Delete updateRecordingStatusOperation](../api/updaterecordingstatusoperation-delete.md)|None|Deletes an [updateRecordingStatusOperation](../resources/updaterecordingstatusoperation.md) object.|

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
  "@odata.type": "microsoft.graph.updateRecordingStatusOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.updateRecordingStatusOperation",
  "id": "String (identifier)",
  "status": "String",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.ResultInfo"
  }
}
```

