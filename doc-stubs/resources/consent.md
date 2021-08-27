---
title: "consent resource type"
description: "Contains infromation to display to the Verfiaible Credential subject prior to issuance."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# consent resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains infromation to display to the Verfiaible Credential subject prior to issuance.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|instructions|String|Contains directions on how to issue the Verifiable Credential.|
|title|String|Prompt to display.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.consent"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.consent",
  "title": "String",
  "instructions": "String"
}
```

