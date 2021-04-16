---
title: "exactMatchUploadAgent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# exactMatchUploadAgent resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List exactMatchUploadAgents](../api/exactmatchuploadagent-list.md)|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md) collection|Get a list of the [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) objects and their properties.|
|[Create exactMatchUploadAgent](../api/exactmatchuploadagent-create.md)|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md)|Create a new [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object.|
|[Get exactMatchUploadAgent](../api/exactmatchuploadagent-get.md)|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md)|Read the properties and relationships of an [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object.|
|[Update exactMatchUploadAgent](../api/exactmatchuploadagent-update.md)|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md)|Update the properties of an [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object.|
|[Delete exactMatchUploadAgent](../api/exactmatchuploadagent-delete.md)|None|Deletes an [exactMatchUploadAgent](../resources/exactmatchuploadagent.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.exactMatchUploadAgent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exactMatchUploadAgent",
  "id": "String (identifier)",
  "creationDateTime": "String (timestamp)",
  "description": "String"
}
```

