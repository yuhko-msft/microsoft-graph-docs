---
title: "deviceComplianceScriptError resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceScriptError resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|code|code|Error code. Possible values are: `none`, `jsonFileInvalid`, `jsonFileMissing`, `jsonFileTooLarge`, `rulesMissing`, `duplicateRules`, `tooManyRulesSpecified`, `operatorMissing`, `operatorNotSupported`, `datatypeMissing`, `datatypeNotSupported`, `operatorDataTypeCombinationNotSupported`, `moreInfoUriMissing`, `moreInfoUriInvalid`, `moreInfoUriTooLarge`, `descriptionMissing`, `descriptionInvalid`, `descriptionTooLarge`, `titleMissing`, `titleInvalid`, `titleTooLarge`, `operandMissing`, `operandInvalid`, `operandTooLarge`, `settingNameMissing`, `settingNameInvalid`, `settingNameTooLarge`, `englishLocaleMissing`, `duplicateLocales`, `unrecognizedLocale`, `unknown`, `remediationStringsMissing`.|
|deviceComplianceScriptRulesValidationError|deviceComplianceScriptRulesValidationError|Error code. Possible values are: `none`, `jsonFileInvalid`, `jsonFileMissing`, `jsonFileTooLarge`, `rulesMissing`, `duplicateRules`, `tooManyRulesSpecified`, `operatorMissing`, `operatorNotSupported`, `datatypeMissing`, `datatypeNotSupported`, `operatorDataTypeCombinationNotSupported`, `moreInfoUriMissing`, `moreInfoUriInvalid`, `moreInfoUriTooLarge`, `descriptionMissing`, `descriptionInvalid`, `descriptionTooLarge`, `titleMissing`, `titleInvalid`, `titleTooLarge`, `operandMissing`, `operandInvalid`, `operandTooLarge`, `settingNameMissing`, `settingNameInvalid`, `settingNameTooLarge`, `englishLocaleMissing`, `duplicateLocales`, `unrecognizedLocale`, `unknown`, `remediationStringsMissing`.|
|message|String|Error message.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceComplianceScriptError"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceScriptError",
  "code": "String",
  "deviceComplianceScriptRulesValidationError": "String",
  "message": "String"
}
```

