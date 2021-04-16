---
title: "suggestedEnrollmentLimit resource type"
description: "The suggestedEnrollmentLimit resource represents the suggested enrollment limit when given an enrollment type."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# suggestedEnrollmentLimit resource type

Namespace: microsoft.graph



The suggestedEnrollmentLimit resource represents the suggested enrollment limit when given an enrollment type.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|suggestedDailyLimit|Int32|The suggested enrollment limit within a day|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.suggestedEnrollmentLimit"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.suggestedEnrollmentLimit",
  "suggestedDailyLimit": "Integer"
}
```

