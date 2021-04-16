---
title: "omaSettingInteger resource type"
description: "OMA Settings Integer definition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# omaSettingInteger resource type

Namespace: microsoft.graph



OMA Settings Integer definition.


Inherits from [omaSetting](../resources/omasetting.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|Description. Inherited from [omaSetting](../resources/omasetting.md)|
|displayName|String|Display Name. Inherited from [omaSetting](../resources/omasetting.md)|
|isEncrypted|Boolean|Indicates whether the value field is encrypted. Inherited from [omaSetting](../resources/omasetting.md)|
|isReadOnly|Boolean|By setting to true, the CSP (configuration service provider) specified in the OMA-URI will perform a get, instead of set|
|omaUri|String|OMA. Inherited from [omaSetting](../resources/omasetting.md)|
|value|Int32|Value.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.omaSettingInteger"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.omaSettingInteger",
  "description": "String",
  "displayName": "String",
  "isEncrypted": "Boolean",
  "omaUri": "String",
  "isReadOnly": "Boolean",
  "value": "Integer"
}
```

