---
title: "deviceComplianceScriptRule resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceScriptRule resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dataType|dataType|Data type specified in the rule. Possible values are: `none`, `boolean`, `int64`, `double`, `string`, `dateTime`, `version`, `base64`, `xml`, `booleanArray`, `int64Array`, `doubleArray`, `stringArray`, `dateTimeArray`, `versionArray`.|
|deviceComplianceScriptRuleDataType|deviceComplianceScriptRuleDataType|Data type specified in the rule. Possible values are: `none`, `boolean`, `int64`, `double`, `string`, `dateTime`, `version`, `base64`, `xml`, `booleanArray`, `int64Array`, `doubleArray`, `stringArray`, `dateTimeArray`, `versionArray`.|
|deviceComplianceScriptRulOperator|deviceComplianceScriptRulOperator|Operator specified in the rule. Possible values are: `none`, `and`, `or`, `isEquals`, `notEquals`, `greaterThan`, `lessThan`, `between`, `notBetween`, `greaterEquals`, `lessEquals`, `dayTimeBetween`, `beginsWith`, `notBeginsWith`, `endsWith`, `notEndsWith`, `contains`, `notContains`, `allOf`, `oneOf`, `noneOf`, `setEquals`, `orderedSetEquals`, `subsetOf`, `excludesAll`.|
|operand|String|Operand specified in the rule.|
|operator|operator|Operator specified in the rule. Possible values are: `none`, `and`, `or`, `isEquals`, `notEquals`, `greaterThan`, `lessThan`, `between`, `notBetween`, `greaterEquals`, `lessEquals`, `dayTimeBetween`, `beginsWith`, `notBeginsWith`, `endsWith`, `notEndsWith`, `contains`, `notContains`, `allOf`, `oneOf`, `noneOf`, `setEquals`, `orderedSetEquals`, `subsetOf`, `excludesAll`.|
|settingName|String|Setting name specified in the rule.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceComplianceScriptRule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceScriptRule",
  "dataType": "String",
  "deviceComplianceScriptRuleDataType": "String",
  "deviceComplianceScriptRulOperator": "String",
  "operand": "String",
  "operator": "String",
  "settingName": "String"
}
```

