---
title: "omaSettingString resource type"
description: "OMA Settings String definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# omaSettingString resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

OMA Settings String definition.


Inherits from [omaSetting](../resources/omasetting.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Description. Inherited from [omaSetting](../resources/omasetting.md).|
|displayName|String|Display Name. Inherited from [omaSetting](../resources/omasetting.md).|
|isEncrypted|Boolean|Indicates whether the value field is encrypted. This property is read-only. Inherited from [omaSetting](../resources/omasetting.md).|
|omaUri|String|OMA. Inherited from [omaSetting](../resources/omasetting.md).|
|secretReferenceValueId|String|ReferenceId for looking up secret for decryption. This property is read-only. Inherited from [omaSetting](../resources/omasetting.md).|
|value|String|Value.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.omaSettingString"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.omaSettingString",
  "description": "String",
  "displayName": "String",
  "isEncrypted": "Boolean",
  "omaUri": "String",
  "secretReferenceValueId": "String",
  "value": "String"
}
```

