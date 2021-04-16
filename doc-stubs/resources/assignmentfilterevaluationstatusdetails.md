---
title: "assignmentFilterEvaluationStatusDetails resource type"
description: "A class containing information about the payloads on which filter has been applied."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# assignmentFilterEvaluationStatusDetails resource type

Namespace: microsoft.graph



A class containing information about the payloads on which filter has been applied.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List assignmentFilterEvaluationStatusDetails](../api/assignmentfilterevaluationstatusdetails-list.md)|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) collection|Get a list of the [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) objects and their properties.|
|[Create assignmentFilterEvaluationStatusDetails](../api/assignmentfilterevaluationstatusdetails-create.md)|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md)|Create a new [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) object.|
|[Get assignmentFilterEvaluationStatusDetails](../api/assignmentfilterevaluationstatusdetails-get.md)|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md)|Read the properties and relationships of an [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) object.|
|[Update assignmentFilterEvaluationStatusDetails](../api/assignmentfilterevaluationstatusdetails-update.md)|[assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md)|Update the properties of an [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) object.|
|[Delete assignmentFilterEvaluationStatusDetails](../api/assignmentfilterevaluationstatusdetails-delete.md)|None|Deletes an [assignmentFilterEvaluationStatusDetails](../resources/assignmentfilterevaluationstatusdetails.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|payloadId|String|PayloadId on which filter has been applied.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.assignmentFilterEvaluationStatusDetails",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.assignmentFilterEvaluationStatusDetails",
  "id": "String (identifier)",
  "payloadId": "String"
}
```

