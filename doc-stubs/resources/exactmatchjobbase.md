---
title: "exactMatchJobBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# exactMatchJobBase resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List exactMatchJobBases](../api/exactmatchjobbase-list.md)|[exactMatchJobBase](../resources/exactmatchjobbase.md) collection|Get a list of the [exactMatchJobBase](../resources/exactmatchjobbase.md) objects and their properties.|
|[Create exactMatchJobBase](../api/exactmatchjobbase-create.md)|[exactMatchJobBase](../resources/exactmatchjobbase.md)|Create a new [exactMatchJobBase](../resources/exactmatchjobbase.md) object.|
|[Get exactMatchJobBase](../api/exactmatchjobbase-get.md)|[exactMatchJobBase](../resources/exactmatchjobbase.md)|Read the properties and relationships of an [exactMatchJobBase](../resources/exactmatchjobbase.md) object.|
|[Update exactMatchJobBase](../api/exactmatchjobbase-update.md)|[exactMatchJobBase](../resources/exactmatchjobbase.md)|Update the properties of an [exactMatchJobBase](../resources/exactmatchjobbase.md) object.|
|[Delete exactMatchJobBase](../api/exactmatchjobbase-delete.md)|None|Deletes an [exactMatchJobBase](../resources/exactmatchjobbase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|completionDateTime|DateTimeOffset|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.exactMatchJobBase",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exactMatchJobBase",
  "id": "String (identifier)",
  "completionDateTime": "String (timestamp)",
  "creationDateTime": "String (timestamp)",
  "error": {
    "@odata.type": "microsoft.graph.classificationError"
  },
  "lastUpdatedDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)"
}
```

