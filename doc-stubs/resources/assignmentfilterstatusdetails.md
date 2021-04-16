---
title: "assignmentFilterStatusDetails resource type"
description: "Represent status details for device and payload and all associated applied filters."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# assignmentFilterStatusDetails resource type

Namespace: microsoft.graph



Represent status details for device and payload and all associated applied filters.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceProperties|[keyValuePair](../resources/keyvaluepair.md) collection|Device properties used for filter evaluation during device check-in time.|
|evalutionSummaries|[assignmentFilterEvaluationSummary](../resources/assignmentfilterevaluationsummary.md) collection|Evaluation result summaries for each filter associated to device and payload|
|managedDeviceId|String|Unique identifier for the device object.|
|payloadId|String|Unique identifier for payload object.|
|userId|String|Unique identifier for UserId object. Can be null|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.assignmentFilterStatusDetails"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.assignmentFilterStatusDetails",
  "deviceProperties": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "evalutionSummaries": [
    {
      "@odata.type": "microsoft.graph.assignmentFilterEvaluationSummary"
    }
  ],
  "managedDeviceId": "String",
  "payloadId": "String",
  "userId": "String"
}
```

