---
title: "printerCapabilities resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# printerCapabilities resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bottomMargins|Int32 collection|**TODO: Add Description**|
|collation|Boolean|**TODO: Add Description**|
|colorModes|printColorMode collection|**TODO: Add Description**|
|contentTypes|String collection|**TODO: Add Description**|
|copiesPerJob|[integerRange](../resources/integerrange.md)|**TODO: Add Description**|
|dpis|Int32 collection|**TODO: Add Description**|
|duplexModes|printDuplexMode collection|**TODO: Add Description**|
|feedDirections|printerFeedDirection collection|**TODO: Add Description**|
|feedOrientations|printerFeedOrientation collection|**TODO: Add Description**|
|finishings|printFinishing collection|**TODO: Add Description**|
|inputBins|String collection|**TODO: Add Description**|
|isColorPrintingSupported|Boolean|**TODO: Add Description**|
|isPageRangeSupported|Boolean|**TODO: Add Description**|
|leftMargins|Int32 collection|**TODO: Add Description**|
|mediaColors|String collection|**TODO: Add Description**|
|mediaSizes|String collection|**TODO: Add Description**|
|mediaTypes|String collection|**TODO: Add Description**|
|multipageLayouts|printMultipageLayout collection|**TODO: Add Description**|
|orientations|printOrientation collection|**TODO: Add Description**|
|outputBins|String collection|**TODO: Add Description**|
|pagesPerSheet|Int32 collection|**TODO: Add Description**|
|qualities|printQuality collection|**TODO: Add Description**|
|rightMargins|Int32 collection|**TODO: Add Description**|
|scalings|printScaling collection|**TODO: Add Description**|
|supportedColorConfigurations|printColorConfiguration collection|**TODO: Add Description**|
|supportedCopiesPerJob|[integerRange](../resources/integerrange.md)|**TODO: Add Description**|
|supportedDocumentMimeTypes|String collection|**TODO: Add Description**|
|supportedDuplexConfigurations|printDuplexConfiguration collection|**TODO: Add Description**|
|supportedFinishings|printFinishing collection|**TODO: Add Description**|
|supportedMediaColors|String collection|**TODO: Add Description**|
|supportedMediaSizes|String collection|**TODO: Add Description**|
|supportedMediaTypes|printMediaType collection|**TODO: Add Description**|
|supportedOrientations|printOrientation collection|**TODO: Add Description**|
|supportedOutputBins|String collection|**TODO: Add Description**|
|supportedPagesPerSheet|[integerRange](../resources/integerrange.md)|**TODO: Add Description**|
|supportedPresentationDirections|printPresentationDirection collection|**TODO: Add Description**|
|supportedPrintQualities|printQuality collection|**TODO: Add Description**|
|supportsFitPdfToPage|Boolean|**TODO: Add Description**|
|topMargins|Int32 collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.printerCapabilities"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.printerCapabilities",
  "bottomMargins": [
    "Integer"
  ],
  "collation": "Boolean",
  "colorModes": [
    "String"
  ],
  "contentTypes": [
    "String"
  ],
  "copiesPerJob": {
    "@odata.type": "microsoft.graph.integerRange"
  },
  "dpis": [
    "Integer"
  ],
  "duplexModes": [
    "String"
  ],
  "feedDirections": [
    "String"
  ],
  "feedOrientations": [
    "String"
  ],
  "finishings": [
    "String"
  ],
  "inputBins": [
    "String"
  ],
  "isColorPrintingSupported": "Boolean",
  "isPageRangeSupported": "Boolean",
  "leftMargins": [
    "Integer"
  ],
  "mediaColors": [
    "String"
  ],
  "mediaSizes": [
    "String"
  ],
  "mediaTypes": [
    "String"
  ],
  "multipageLayouts": [
    "String"
  ],
  "orientations": [
    "String"
  ],
  "outputBins": [
    "String"
  ],
  "pagesPerSheet": [
    "Integer"
  ],
  "qualities": [
    "String"
  ],
  "rightMargins": [
    "Integer"
  ],
  "scalings": [
    "String"
  ],
  "supportedColorConfigurations": [
    "String"
  ],
  "supportedCopiesPerJob": {
    "@odata.type": "microsoft.graph.integerRange"
  },
  "supportedDocumentMimeTypes": [
    "String"
  ],
  "supportedDuplexConfigurations": [
    "String"
  ],
  "supportedFinishings": [
    "String"
  ],
  "supportedMediaColors": [
    "String"
  ],
  "supportedMediaSizes": [
    "String"
  ],
  "supportedMediaTypes": [
    "String"
  ],
  "supportedOrientations": [
    "String"
  ],
  "supportedOutputBins": [
    "String"
  ],
  "supportedPagesPerSheet": {
    "@odata.type": "microsoft.graph.integerRange"
  },
  "supportedPresentationDirections": [
    "String"
  ],
  "supportedPrintQualities": [
    "String"
  ],
  "supportsFitPdfToPage": "Boolean",
  "topMargins": [
    "Integer"
  ]
}
```

