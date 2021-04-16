---
title: "fileClassificationRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileClassificationRequest resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fileClassificationRequests](../api/fileclassificationrequest-list.md)|[fileClassificationRequest](../resources/fileclassificationrequest.md) collection|Get a list of the [fileClassificationRequest](../resources/fileclassificationrequest.md) objects and their properties.|
|[Create fileClassificationRequest](../api/fileclassificationrequest-create.md)|[fileClassificationRequest](../resources/fileclassificationrequest.md)|Create a new [fileClassificationRequest](../resources/fileclassificationrequest.md) object.|
|[Get fileClassificationRequest](../api/fileclassificationrequest-get.md)|[fileClassificationRequest](../resources/fileclassificationrequest.md)|Read the properties and relationships of a [fileClassificationRequest](../resources/fileclassificationrequest.md) object.|
|[Update fileClassificationRequest](../api/fileclassificationrequest-update.md)|[fileClassificationRequest](../resources/fileclassificationrequest.md)|Update the properties of a [fileClassificationRequest](../resources/fileclassificationrequest.md) object.|
|[Delete fileClassificationRequest](../api/fileclassificationrequest-delete.md)|None|Deletes a [fileClassificationRequest](../resources/fileclassificationrequest.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|file|Stream|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|sensitiveTypeIds|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileClassificationRequest",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileClassificationRequest",
  "id": "String (identifier)",
  "file": "Stream",
  "sensitiveTypeIds": [
    "String"
  ]
}
```

