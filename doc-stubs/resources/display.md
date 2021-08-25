---
title: "display resource type"
description: "Describes how to display Verifiable Credentials issued from this contract."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# display resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Describes how to display Verifiable Credentials issued from this contract.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|card|[card](../resources/card.md)|Contains directives for clients to know how to display Verifiable Credentials issued from this contract.|
|consent|[consent](../resources/consent.md)|Contains infromation to display to the Verfiaible Credential subject prior to issuance.|
|contract|String|Full url of the contract.|
|id|String|Identifies the display. Always set to "display".|
|locale|String|Language tag or locale identifier.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.display"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.display",
  "id": "String (identifier)",
  "locale": "String",
  "contract": "String",
  "card": {
    "@odata.type": "microsoft.graph.card"
  },
  "consent": {
    "@odata.type": "microsoft.graph.consent"
  }
}
```

