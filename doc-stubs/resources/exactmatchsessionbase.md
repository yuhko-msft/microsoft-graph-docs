---
title: "exactMatchSessionBase resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# exactMatchSessionBase resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [exactMatchJobBase](../resources/exactmatchjobbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List exactMatchSessionBases](../api/exactmatchsessionbase-list.md)|[exactMatchSessionBase](../resources/exactmatchsessionbase.md) collection|Get a list of the [exactMatchSessionBase](../resources/exactmatchsessionbase.md) objects and their properties.|
|[Create exactMatchSessionBase](../api/exactmatchsessionbase-create.md)|[exactMatchSessionBase](../resources/exactmatchsessionbase.md)|Create a new [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object.|
|[Get exactMatchSessionBase](../api/exactmatchsessionbase-get.md)|[exactMatchSessionBase](../resources/exactmatchsessionbase.md)|Read the properties and relationships of an [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object.|
|[Update exactMatchSessionBase](../api/exactmatchsessionbase-update.md)|[exactMatchSessionBase](../resources/exactmatchsessionbase.md)|Update the properties of an [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object.|
|[Delete exactMatchSessionBase](../api/exactmatchsessionbase-delete.md)|None|Deletes an [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|completionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|dataStoreId|String|**TODO: Add Description**|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|processingCompletionDateTime|DateTimeOffset|**TODO: Add Description**|
|remainingBlockCount|Int32|**TODO: Add Description**|
|remainingJobCount|Int32|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|state|String|**TODO: Add Description**|
|totalBlockCount|Int32|**TODO: Add Description**|
|totalJobCount|Int32|**TODO: Add Description**|
|uploadCompletionDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.exactMatchSessionBase",
  "baseType": "microsoft.graph.exactMatchJobBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exactMatchSessionBase",
  "id": "String (identifier)",
  "completionDateTime": "String (timestamp)",
  "creationDateTime": "String (timestamp)",
  "error": {
    "@odata.type": "microsoft.graph.classificationError"
  },
  "lastUpdatedDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)",
  "dataStoreId": "String",
  "processingCompletionDateTime": "String (timestamp)",
  "remainingBlockCount": "Integer",
  "remainingJobCount": "Integer",
  "state": "String",
  "totalBlockCount": "Integer",
  "totalJobCount": "Integer",
  "uploadCompletionDateTime": "String (timestamp)"
}
```

