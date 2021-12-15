---
title: "submissionDetectedFile resource type"
description: "Detected file in email threat submission."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# submissionDetectedFile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Detected file in email threat submission.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|fileHash|String|The file hash.|
|fileName|String|The file name.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.submissionDetectedFile"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.submissionDetectedFile",
  "fileName": "String",
  "fileHash": "String"
}
```

