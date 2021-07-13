---
title: "omaSetting resource type"
description: "OMA Settings definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# omaSetting resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

OMA Settings definition.
This is an abstract type.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Description.|
|displayName|String|Display Name.|
|isEncrypted|Boolean|Indicates whether the value field is encrypted. This property is read-only.|
|omaUri|String|OMA.|
|secretReferenceValueId|String|ReferenceId for looking up secret for decryption. This property is read-only.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.omaSetting"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.omaSetting",
  "description": "String",
  "displayName": "String",
  "isEncrypted": "Boolean",
  "omaUri": "String",
  "secretReferenceValueId": "String"
}
```

