---
title: "file resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# file resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List files](../api/ediscovery-file-list.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md) collection|Get a list of the [file](../resources/ediscovery-file.md) objects and their properties.|
|[Create file](../api/ediscovery-file-create.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md)|Create a new [file](../resources/ediscovery-file.md) object.|
|[Get file](../api/ediscovery-file-get.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md)|Read the properties and relationships of a [file](../resources/ediscovery-file.md) object.|
|[Update file](../api/ediscovery-file-update.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md)|Update the properties of a [file](../resources/ediscovery-file.md) object.|
|[Delete file](../api/ediscovery-file-delete.md)|None|Deletes a [file](../resources/ediscovery-file.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|Stream|**TODO: Add Description**|
|date|DateTimeOffset|**TODO: Add Description**|
|extension|String|**TODO: Add Description**|
|extractedTextContent|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|mediaType|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|otherProperties|[microsoft.graph.ediscovery.stringValueDictionary](../resources/ediscovery-stringvaluedictionary.md)|**TODO: Add Description**|
|processingStatus|fileProcessingStatus|**TODO: Add Description**. The possible values are: `success`, `internalError`, `unknownError`, `processingTimeout`, `invalidField`, `fileSizeIsZero`, `fileSizeIsTooLarge`, `fileDepthLimitExceeded`, `fileBodyIsTooLong`, `fileTypeIsUnknown`, `fileTypeIsNotSupported`, `malformedFile`, `protectedFile`, `poisonFile`, `noReviewSetSummaryGenerated`, `extractionException`, `ocrProcessingTimeout`, `ocrFileSizeExceedsLimit`, `unknownFutureValue`.|
|senderAuthor|String collection|**TODO: Add Description**|
|size|Int64|**TODO: Add Description**|
|sourceType|sourceType|**TODO: Add Description**. The possible values are: `mailbox`, `site`.|
|subjectTitle|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery.file",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.ediscovery.file",
  "id": "String (identifier)",
  "date": "String (timestamp)",
  "size": "Integer",
  "name": "String",
  "sourceType": "String",
  "senderAuthor": [
    "String"
  ],
  "subjectTitle": "String",
  "extension": "String",
  "mediaType": "String",
  "processingStatus": "String",
  "content": "Stream",
  "extractedTextContent": "String",
  "otherProperties": {
    "@odata.type": "microsoft.graph.ediscovery.stringValueDictionary"
  }
}
```

