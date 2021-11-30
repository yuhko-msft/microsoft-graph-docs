---
title: "fileFormatSettings resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileFormatSettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|additionalData|[fileFormatAdditionalData](../resources/fileformatadditionaldata.md)|**TODO: Add Description**|
|format|fileFormat|**TODO: Add Description**. The possible values are: `educationClever`, `educationOneRoster`, `educationSchoolDataSyncV1`, `educationSchoolDataSyncUK`, `educationSchoolDataSyncV2`, `educationSchoolDataSyncV2Rev1`, `unknownFutureValue`.|
|optionalFiles|String collection|**TODO: Add Description**|
|requiredFiles|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.fileFormatSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileFormatSettings",
  "format": "String",
  "additionalData": {
    "@odata.type": "microsoft.graph.fileFormatAdditionalData"
  },
  "requiredFiles": [
    "String"
  ],
  "optionalFiles": [
    "String"
  ]
}
```

