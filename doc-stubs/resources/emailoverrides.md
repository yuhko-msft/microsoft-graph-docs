---
title: "emailOverrides resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailOverrides resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|String|Name of the ETRs which are part of the email.|
|primaryOverride|Boolean|Name of the ETRs which are part of the email.|
|source|String|Name of the ETRs which are part of the email.|
|type|String|Name of the ETRs which are part of the email.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.emailOverrides"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailOverrides",
  "source": "String",
  "type": "String",
  "primaryOverride": "Boolean",
  "action": "String"
}
```

