---
title: "schoolDataSyncV1FileFormatAdditionalData resource type"
description: "Base type for additional data to make up for missing required elements in the School Data Sync V1 format."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# schoolDataSyncV1FileFormatAdditionalData resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base type for additional data to make up for missing required elements in the School Data Sync V1 format.


Inherits from [fileFormatAdditionalData](../resources/fileformatadditionaldata.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|term|String|The term that the imported data should be associated with.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.schoolDataSyncV1FileFormatAdditionalData"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.schoolDataSyncV1FileFormatAdditionalData",
  "term": "String"
}
```

