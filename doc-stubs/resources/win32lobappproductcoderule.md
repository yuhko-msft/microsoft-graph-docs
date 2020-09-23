---
title: "win32LobAppProductCodeRule resource type"
description: "A complex type to store the product code and version rule data for a Win32 LOB app. This rule is not supported as a requirement rule."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppProductCodeRule resource type

Namespace: microsoft.graph

A complex type to store the product code and version rule data for a Win32 LOB app. This rule is not supported as a requirement rule.


Inherits from [win32LobAppRule](../resources/win32lobapprule.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|productCode|String|The product code of the app.|
|productVersion|String|The product version comparison value.|
|productVersionOperator|win32LobAppRuleOperator|The product version comparison operator. Possible values are: `notConfigured`, `equal`, `notEqual`, `greaterThan`, `greaterThanOrEqual`, `lessThan`, `lessThanOrEqual`.|
|ruleType|win32LobAppRuleType|The rule type indicating the purpose of the rule. Inherited from [win32LobAppRule](../resources/win32lobapprule.md). Possible values are: `detection`, `requirement`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppProductCodeRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppProductCodeRule",
  "ruleType": "String",
  "productCode": "String",
  "productVersionOperator": "String",
  "productVersion": "String"
}
```

