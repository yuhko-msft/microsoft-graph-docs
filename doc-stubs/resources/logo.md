---
title: "logo resource type"
description: "Contains all information needed to display the Verifiable Credential logo."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# logo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains all information needed to display the Verifiable Credential logo.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Describes the Verifiable Credential logo.|
|uri|String|Full URI of the logo image.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.logo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.logo",
  "uri": "String",
  "description": "String"
}
```

