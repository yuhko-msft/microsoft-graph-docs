---
title: "monitoringRule resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# monitoringRule resource type

Namespace: microsoft.graph.windowsUpdates



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|monitoringAction|**TODO: Add Description**. Possible values are: `alertError`, `pauseDeployment`, `unknownFutureValue`.|
|signal|monitoringSignal|**TODO: Add Description**. Possible values are: `rollback`, `unknownFutureValue`.|
|threshold|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsUpdates.monitoringRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdates.monitoringRule",
  "action": "String",
  "signal": "String",
  "threshold": "Integer"
}
```

