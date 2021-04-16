---
title: "printerDocumentConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# printerDocumentConfiguration resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|collate|Boolean|**TODO: Add Description**|
|colorMode|printColorMode|**TODO: Add Description**. Possible values are: `blackAndWhite`, `grayscale`, `color`, `auto`.|
|copies|Int32|**TODO: Add Description**|
|dpi|Int32|**TODO: Add Description**|
|duplexMode|printDuplexMode|**TODO: Add Description**. Possible values are: `flipOnLongEdge`, `flipOnShortEdge`, `oneSided`.|
|feedDirection|printerFeedDirection|**TODO: Add Description**. Possible values are: `longEdgeFirst`, `shortEdgeFirst`.|
|feedOrientation|printerFeedOrientation|**TODO: Add Description**. Possible values are: `longEdgeFirst`, `shortEdgeFirst`.|
|finishings|printFinishing collection|**TODO: Add Description**|
|fitPdfToPage|Boolean|**TODO: Add Description**|
|inputBin|String|**TODO: Add Description**|
|margin|[printMargin](../resources/printmargin.md)|**TODO: Add Description**|
|mediaSize|String|**TODO: Add Description**|
|mediaType|String|**TODO: Add Description**|
|multipageLayout|printMultipageLayout|**TODO: Add Description**. Possible values are: `clockwiseFromTopLeft`, `counterclockwiseFromTopLeft`, `counterclockwiseFromTopRight`, `clockwiseFromTopRight`, `counterclockwiseFromBottomLeft`, `clockwiseFromBottomLeft`, `counterclockwiseFromBottomRight`, `clockwiseFromBottomRight`.|
|orientation|printOrientation|**TODO: Add Description**. Possible values are: `portrait`, `landscape`, `reverseLandscape`, `reversePortrait`.|
|outputBin|String|**TODO: Add Description**|
|pageRanges|[integerRange](../resources/integerrange.md) collection|**TODO: Add Description**|
|pagesPerSheet|Int32|**TODO: Add Description**|
|quality|printQuality|**TODO: Add Description**. Possible values are: `low`, `medium`, `high`, `unknownFutureValue`.|
|scaling|printScaling|**TODO: Add Description**. Possible values are: `auto`, `shrinkToFit`, `fill`, `fit`, `none`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.printerDocumentConfiguration"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.printerDocumentConfiguration",
  "collate": "Boolean",
  "colorMode": "String",
  "copies": "Integer",
  "dpi": "Integer",
  "duplexMode": "String",
  "feedDirection": "String",
  "feedOrientation": "String",
  "finishings": [
    "String"
  ],
  "fitPdfToPage": "Boolean",
  "inputBin": "String",
  "margin": {
    "@odata.type": "microsoft.graph.printMargin"
  },
  "mediaSize": "String",
  "mediaType": "String",
  "multipageLayout": "String",
  "orientation": "String",
  "outputBin": "String",
  "pageRanges": [
    {
      "@odata.type": "microsoft.graph.integerRange"
    }
  ],
  "pagesPerSheet": "Integer",
  "quality": "String",
  "scaling": "String"
}
```

