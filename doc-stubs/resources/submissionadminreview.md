---
title: "submissionAdminReview resource type"
description: "Admin review information for user reported messages."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# submissionAdminReview resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Admin review information for user reported messages.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|reviewBy|String|The reviewer email or other identity string.|
|reviewDateTime|DateTimeOffset|The review date time.|
|reviewResult|submissionResultCategory|The review result. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `allowedByPolicy`, `blockedByPolicy`, `spoof`, `unkown`, `noResultAvailable`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.submissionAdminReview"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.submissionAdminReview",
  "reviewDateTime": "String (timestamp)",
  "reviewResult": "String",
  "reviewBy": "String"
}
```

