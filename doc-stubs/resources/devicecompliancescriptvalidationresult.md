---
title: "deviceComplianceScriptValidationResult resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceScriptValidationResult resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|ruleErrors|[deviceComplianceScriptRuleError](../resources/devicecompliancescriptruleerror.md) collection|Errors in json for the script for rules.|
|rules|[deviceComplianceScriptRule](../resources/devicecompliancescriptrule.md) collection|Parsed rules from json.|
|scriptErrors|[deviceComplianceScriptError](../resources/devicecompliancescripterror.md) collection|Errors in json for the script.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceComplianceScriptValidationResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceScriptValidationResult",
  "ruleErrors": [
    {
      "@odata.type": "microsoft.graph.deviceComplianceScriptRuleError"
    }
  ],
  "rules": [
    {
      "@odata.type": "microsoft.graph.deviceComplianceScriptRule"
    }
  ],
  "scriptErrors": [
    {
      "@odata.type": "microsoft.graph.deviceComplianceScriptError"
    }
  ]
}
```

