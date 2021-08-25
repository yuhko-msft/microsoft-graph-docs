---
title: "card resource type"
description: "Contains directives for clients to know how to display Verifiable Credentials issued from this contract."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# card resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains directives for clients to know how to display Verifiable Credentials issued from this contract.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|backgroundColor|String|Hex color for the Verifiable Credential background.|
|description|String|Describes the Verifiable Credential.|
|issuedBy|String|Label describing the issuer of the contract.|
|logo|[logo](../resources/logo.md)|Contains all information needed to display the Verifiable Credential logo.|
|textColor|String|Hex color for all text in Verifiable Credential.|
|title|String|Verifiable Credential title.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.card"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.card",
  "title": "String",
  "issuedBy": "String",
  "backgroundColor": "String",
  "textColor": "String",
  "description": "String",
  "logo": {
    "@odata.type": "microsoft.graph.logo"
  }
}
```

