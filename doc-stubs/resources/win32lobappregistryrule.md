---
title: "win32LobAppRegistryRule resource type"
description: "A complex type to store registry rule data for a Win32 LOB app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppRegistryRule resource type

Namespace: microsoft.graph

A complex type to store registry rule data for a Win32 LOB app.


Inherits from [win32LobAppRule](../resources/win32lobapprule.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|check32BitOn64System|Boolean|A value indicating whether to search the 32-bit registry on 64-bit systems.|
|comparisonValue|String|The registry comparison value.|
|keyPath|String|The full path of the registry entry containing the value to detect.|
|operationType|win32LobAppRegistryRuleOperationType|The registry operation type. Possible values are: `notConfigured`, `exists`, `doesNotExist`, `string`, `integer`, `version`.|
|operator|win32LobAppRuleOperator|The operator for registry detection. Possible values are: `notConfigured`, `equal`, `notEqual`, `greaterThan`, `greaterThanOrEqual`, `lessThan`, `lessThanOrEqual`.|
|ruleType|win32LobAppRuleType|The rule type indicating the purpose of the rule. Inherited from [win32LobAppRule](../resources/win32lobapprule.md). Possible values are: `detection`, `requirement`.|
|valueName|String|The name of the registry value to detect.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppRegistryRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppRegistryRule",
  "ruleType": "String",
  "check32BitOn64System": "Boolean",
  "keyPath": "String",
  "valueName": "String",
  "operationType": "String",
  "operator": "String",
  "comparisonValue": "String"
}
```

