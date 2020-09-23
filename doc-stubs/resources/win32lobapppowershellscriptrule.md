---
title: "win32LobAppPowerShellScriptRule resource type"
description: "A complex type to store the PowerShell script rule data for a Win32 LOB app."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# win32LobAppPowerShellScriptRule resource type

Namespace: microsoft.graph

A complex type to store the PowerShell script rule data for a Win32 LOB app.


Inherits from [win32LobAppRule](../resources/win32lobapprule.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|comparisonValue|String|The script output comparison value. Do not specify a value if the rule is used for detection.|
|displayName|String|The display name for the rule. Do not specify this value if the rule is used for detection.|
|enforceSignatureCheck|Boolean|A value indicating whether a signature check is enforced.|
|operationType|win32LobAppPowerShellScriptRuleOperationType|The script output comparison operation type. Use NotConfigured (the default value) if the rule is used for detection. Possible values are: `notConfigured`, `string`, `dateTime`, `integer`, `float`, `version`, `boolean`.|
|operator|win32LobAppRuleOperator|The script output operator. Use NotConfigured (the default value) if the rule is used for detection. Possible values are: `notConfigured`, `equal`, `notEqual`, `greaterThan`, `greaterThanOrEqual`, `lessThan`, `lessThanOrEqual`.|
|ruleType|win32LobAppRuleType|The rule type indicating the purpose of the rule. Inherited from [win32LobAppRule](../resources/win32lobapprule.md). Possible values are: `detection`, `requirement`.|
|runAs32Bit|Boolean|A value indicating whether the script should run as 32-bit.|
|runAsAccount|runAsAccountType|The execution context of the script. Do not specify this value if the rule is used for detection. Script detection rules will run in the same context as the associated app install context. Possible values are: `system`, `user`.|
|scriptContent|String|The base64-encoded script content.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.win32LobAppPowerShellScriptRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.win32LobAppPowerShellScriptRule",
  "ruleType": "String",
  "displayName": "String",
  "enforceSignatureCheck": "Boolean",
  "runAs32Bit": "Boolean",
  "runAsAccount": "String",
  "scriptContent": "String",
  "operationType": "String",
  "operator": "String",
  "comparisonValue": "String"
}
```

