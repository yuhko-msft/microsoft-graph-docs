---
title: "file resource type"
description: "Represents an object that contains metadata for electronically stored information."
author: "mahage-msft"
ms.localizationpriority: medium
ms.prod: "ediscovery"
doc_type: "resourcePageType"
---

# file resource type

Namespace: microsoft.graph.ediscovery

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents an object that contains metadata for electronically stored information.

## Methods

|Method|Return type|Description|
|:---|:---|:---|
|[List files](../api/ediscovery-reviewset-list-files.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md) collection|Get a list of the [file](../resources/ediscovery-file.md) objects and their properties.|
|[Get file](../api/ediscovery-reviewset-get-file.md)|[microsoft.graph.ediscovery.file](../resources/ediscovery-file.md)|Read the properties and relationships of a [file](../resources/ediscovery-file.md) object.|

## Properties

|Property|Type|Description|
|:---|:---|:---|
|content|Stream                                     | The content stream of the original file.|
|date|DateTimeOffset                                | See `date` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery).|
|extension|String                                   | See `InputFileExtension` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery).|
|extractedTextContent|Stream                        | See `Content` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery).|
|id|String                                          | The unique identifier for the file. |
|mediaType|String                                   | See `Extracted content type` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery).|
|name|String                                        | The file name or the subject in case of an email. |
|otherProperties|[microsoft.graph.ediscovery.stringValueDictionary](../resources/ediscovery-stringvaluedictionary.md)| A container for additional **file** properties like **to**, **from**, **bcc**, and **createdDate**.  For the full list of supported fields, see [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery).|
|processingStatus|[microsoft.graph.ediscovery.fileProcessingStatus](../resources/ediscovery-file.md#fileprocessingstatus-values)| Processing status after the item was added to a review set. The possible values are: `success`, `internalError`, `unknownError`, `processingTimeout`, `invalidField`, `fileSizeIsZero`, `fileSizeIsTooLarge`, `fileDepthLimitExceeded`, `fileBodyIsTooLong`, `fileTypeIsUnknown`, `fileTypeIsNotSupported`, `malformedFile`, `protectedFile`, `poisonFile`, `noReviewSetSummaryGenerated`, `extractionException`, `ocrProcessingTimeout`, `ocrFileSizeExceedsLimit`, `unknownFutureValue`.|
|senderAuthor|String collection                     | See `SenderAuthor` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery).|
|size|Int64                                         | See `Size` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery).|
|sourceType|microsoft.graph.ediscovery.sourceType   | The original source of the content. The possible values are: `mailbox`, `site`.|
|subjectTitle|String                                | See `SubjectTitle` at [Document metadata fields in Advanced eDiscovery](/microsoft-365/compliance/document-metadata-fields-in-advanced-ediscovery).|

### fileProcessingStatus values

|Member|Description|
|:----|-----------|
| success                       | Success.                                                                   |
| internalError                 | Unhandled exception.                                                       |
| unknownError                  | The processing status is unknown.                                          |
| processingTimeout             | Timeout while processing.                                                  |
| invalidField                  | An error occurred during the creation of the unique **fileId** hash for the **file** from the **nativeFilePath**. |
| fileSizeIsZero                | The file size is zero or negative.                                         |
| fileSizeIsTooLarge            | The file size is larger than the limit.                                    |
| fileDepthLimitExceeded        | Over 30 levels of embedded files.                                          |
| fileBodyIsTooLong             | The text in the document exceeds the maximum length.                       |
| fileTypeIsUnknown             | MimeType not supported.                                                    |
| fileTypeIsNotSupported        | The file format not supported.                                             |
| malformedFile                 | The file is malformed.                                                     |
| protectedFile                 | The email is either rights protected or the document is encrypted.         |
| poisonFile                    | File already processed.                                                    |
| noReviewSetSummaryGenerated   | An error occurred during the generation of the review set summary.         |
| extractionException           | An error occurred during the extraction of the embedded documents.|
| ocrProcessingTimeout          | Timeout while OCR (Optical Character Recognition) processing the file.  |
| ocrFileSizeExceedsLimit       | The file size is not in limits for OCR processing.                             |

## Relationships
| Relationship | Type        | Description |
|:-------------|:------------|:------------|
|custodians|[microsoft.graph.ediscovery.custodian](../resources/ediscovery-custodian.md) collection| Returns a list of case **custodian** objects for this **file**.|
|tags|[microsoft.graph.ediscovery.tag](../resources/ediscovery-tag.md) collection|Returns a list of **tag** objects for this **file**.|

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