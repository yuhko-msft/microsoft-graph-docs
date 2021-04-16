---
title: "deviceManagementSettingComparison resource type"
description: "Entity representing setting comparison result"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingComparison resource type

Namespace: microsoft.graph



Entity representing setting comparison result

## Properties
|Property|Type|Description|
|:---|:---|:---|
|comparisonResult|deviceManagementComparisonResult|Setting comparison result. Possible values are: `unknown`, `equal`, `notEqual`, `added`, `removed`.|
|currentValueJson|String|JSON representation of current intent (or) template setting's value|
|definitionId|String|The ID of the setting definition for this instance|
|displayName|String|The setting's display name|
|id|String|The setting ID|
|newValueJson|String|JSON representation of new template setting's value|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementSettingComparison"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingComparison",
  "comparisonResult": "String",
  "currentValueJson": "String",
  "definitionId": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "newValueJson": "String"
}
```

