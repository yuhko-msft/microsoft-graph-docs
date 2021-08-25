---
title: "claimDescriptor resource type"
description: "Contains metadata about the claims in the Verifiable Credential."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# claimDescriptor resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains metadata about the claims in the Verifiable Credential.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Describes the claim.|
|label|String|Identifies the claim.|
|type|String|Claim data type.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.claimDescriptor"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.claimDescriptor",
  "label": "String",
  "type": "String",
  "description": "String"
}
```

