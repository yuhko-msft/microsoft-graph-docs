---
title: "emailInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailInfo resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bcc|String collection|**TODO: Add Description**|
|cc|String collection|**TODO: Add Description**|
|from|String|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|
|to|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.emailInfo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailInfo",
  "from": "String",
  "to": [
    "String"
  ],
  "cc": [
    "String"
  ],
  "bcc": [
    "String"
  ],
  "subject": "String"
}
```

