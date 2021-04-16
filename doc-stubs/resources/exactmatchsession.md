---
title: "exactMatchSession resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# exactMatchSession resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [exactMatchSessionBase](../resources/exactmatchsessionbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List exactMatchSessions](../api/exactmatchsession-list.md)|[exactMatchSession](../resources/exactmatchsession.md) collection|Get a list of the [exactMatchSession](../resources/exactmatchsession.md) objects and their properties.|
|[Create exactMatchSession](../api/exactmatchsession-create.md)|[exactMatchSession](../resources/exactmatchsession.md)|Create a new [exactMatchSession](../resources/exactmatchsession.md) object.|
|[Get exactMatchSession](../api/exactmatchsession-get.md)|[exactMatchSession](../resources/exactmatchsession.md)|Read the properties and relationships of an [exactMatchSession](../resources/exactmatchsession.md) object.|
|[Update exactMatchSession](../api/exactmatchsession-update.md)|[exactMatchSession](../resources/exactmatchsession.md)|Update the properties of an [exactMatchSession](../resources/exactmatchsession.md) object.|
|[Delete exactMatchSession](../api/exactmatchsession-delete.md)|None|Deletes an [exactMatchSession](../resources/exactmatchsession.md) object.|
|[cancel](../api/exactmatchsession-cancel.md)|None|**TODO: Add Description**|
|[commit](../api/exactmatchsession-commit.md)|None|**TODO: Add Description**|
|[renew](../api/exactmatchsession-renew.md)|[exactMatchSession](../resources/exactmatchsession.md)|**TODO: Add Description**|
|[List exactMatchUploadAgent](../api/exactmatchsession-list-uploadagent.md)|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md) collection|Get the exactMatchUploadAgent resources from the uploadAgent navigation property.|
|[Create exactMatchUploadAgent](../api/exactmatchsession-post-uploadagent.md)|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md)|Create a new exactMatchUploadAgent object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|checksum|String|**TODO: Add Description**|
|completionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|dataStoreId|String|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|dataUploadURI|String|**TODO: Add Description**|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|fields|String collection|**TODO: Add Description**|
|fileName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|processingCompletionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|remainingBlockCount|Int32|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|remainingJobCount|Int32|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|rowsPerBlock|Int32|**TODO: Add Description**|
|salt|String|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|state|String|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|totalBlockCount|Int32|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|totalJobCount|Int32|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|uploadAgentId|String|**TODO: Add Description**|
|uploadCompletionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|uploadAgent|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.exactMatchSession",
  "baseType": "microsoft.graph.exactMatchSessionBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exactMatchSession",
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
  "uploadCompletionDateTime": "String (timestamp)",
  "checksum": "String",
  "dataUploadURI": "String",
  "fields": [
    "String"
  ],
  "fileName": "String",
  "rowsPerBlock": "Integer",
  "salt": "String",
  "uploadAgentId": "String"
}
```

