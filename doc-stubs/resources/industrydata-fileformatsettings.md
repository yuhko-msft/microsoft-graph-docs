---
title: "fileFormatSettings resource type"
description: "Simple holder type for a format and any additionalInfo needed to go with that format."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileFormatSettings resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Simple holder type for a format and any additionalInfo needed to go with that format.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalData|[microsoft.graph.industryData.fileFormatAdditionalData](../resources/industrydata-fileformatadditionaldata.md)|Any additional data required by the specific format.|
|format|fileFormat|The file format being described. The possible values are: `educationClever`, `educationOneRoster`, `educationSchoolDataSyncV1`, `educationSchoolDataSyncUK`, `educationSchoolDataSyncV2`, `educationSchoolDataSyncV2Rev1`, `unknownFutureValue`.|
|optionalFiles|String collection|Read-only property specifying which files the client may optionally upload to use this format successfully.|
|requiredFiles|String collection|Read-only property specifying which files the client must upload to use this format successfully.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.industryData.fileFormatSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.fileFormatSettings",
  "format": "String",
  "additionalData": {
    "@odata.type": "microsoft.graph.industryData.fileFormatAdditionalData"
  },
  "requiredFiles": [
    "String"
  ],
  "optionalFiles": [
    "String"
  ]
}
```

