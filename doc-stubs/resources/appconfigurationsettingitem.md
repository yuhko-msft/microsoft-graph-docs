---
title: "appConfigurationSettingItem resource type"
description: "Contains properties for App configuration setting item."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# appConfigurationSettingItem resource type

Namespace: microsoft.graph

Contains properties for App configuration setting item.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appConfigKey|String|app configuration key.|
|appConfigKeyType|mdmAppConfigKeyType|app configuration key type. Possible values are: `stringType`, `integerType`, `realType`, `booleanType`, `tokenType`.|
|appConfigKeyValue|String|app configuration key value.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.appConfigurationSettingItem"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.appConfigurationSettingItem",
  "appConfigKey": "String",
  "appConfigKeyType": "String",
  "appConfigKeyValue": "String"
}
```

