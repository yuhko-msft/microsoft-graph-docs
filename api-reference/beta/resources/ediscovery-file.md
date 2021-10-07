---
title: "file resource type"
description: "Object that contains metadata for electronically stored information"
author: "mahage-msft"
ms.localizationpriority: medium
ms.prod: "ediscovery"
doc_type: "resourcePageType"
---

# file resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Object that contains metadata for electronically stored information

## Methods

|Method|Return type|Description|
|:---|:---|:---|
|[List files](../api/ediscovery-reviewset-list-files.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md) collection|Get a list of the [file](../resources/ediscovery-file.md) objects and their properties.|
|[Get file](../api/ediscovery-reviewset-get-file.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md)|Read the properties and relationships of a [file](../resources/ediscovery-file.md) object.|

## Properties

|Property|Type|Description|
|:---|:---|:---|
|content|Stream                                     | The content stream of the original file.|
|date|DateTimeOffset                                | See `date` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery)|
|extension|String                                   | See `InputFileExtension` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery)|
|extractedTextContent|Stream                        | See `Content` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery)|
|id|String                                          | File unique identifier. |
|mediaType|String                                   | See `Extracted content type` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery)|
|name|String                                        | File name or subject in case of email. |
|otherProperties|[microsoft.graph.ediscovery.stringValueDictionary](../resources/ediscovery-stringvaluedictionary.md)| Bag of additional properties of the file like to, from, Bcc, created date, etc.  For the full list of supported fields, see [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery)|
|processingStatus|microsoft.graph.ediscovery.fileProcessingStatus  | Processing status after the item was added to a review set. The possible values are: `success`, `internalError`, `unknownError`, `processingTimeout`, `invalidField`, `fileSizeIsZero`, `fileSizeIsTooLarge`, `fileDepthLimitExceeded`, `fileBodyIsTooLong`, `fileTypeIsUnknown`, `fileTypeIsNotSupported`, `malformedFile`, `protectedFile`, `poisonFile`, `noReviewSetSummaryGenerated`, `extractionException`, `ocrProcessingTimeout`, `ocrFileSizeExceedsLimit`, `unknownFutureValue`.|
|senderAuthor|String collection                     | See `SenderAuthor` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery)|
|size|Int64                                         | See `Size` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery)|
|sourceType|microsoft.graph.ediscovery.sourceType   | The original source of the content. The possible values are: `mailbox`, `site`.|
|subjectTitle|String                                | See `SubjectTitle` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery)|

### fileProcessingStatus values

|Member|Description|
|:----|-----------|
| success                       | Success                                                               |
| internalError                 | Unhandled exception                                                   |
| unknownError                  | Status of processing comes as null/empty                              |
| processingTimeout             | Timeout while processing                                              |
| invalidField                  | Failure in creating unique fileId hash for file from nativeFilePath   |
| fileSizeIsZero                | File size is zero or negative                                         |
| fileSizeIsTooLarge            | File size is larger than the limit                                    |
| fileDepthLimitExceeded        | Over 30 levels of embedded files                                      |
| fileBodyIsTooLong             | Text in the document exceeds the maximum length                       |
| fileTypeIsUnknown             | MimeType not supported                                                |
| fileTypeIsNotSupported        | File format not supported                                             |
| malformedFile                 | File is malformed                                                     |
| protectedFile                 | Email is rights protected or document is encrypted                    |
| poisonFile                    | File already processed                                                |
| noReviewSetSummaryGenerated   | Failure was encountered while generating review set summary           |
| extractionException           | Extracting embedded documents failure                                 |
| ocrProcessingTimeout          | Timeout while ocrProcessing of the file                               |
| ocrFileSizeExceedsLimit       | File size is not in limits for ocr processing                         |

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
  "otherProperties": {
    "@odata.type": "microsoft.graph.ediscovery.stringValueDictionary"
  }
}
```
