---
title: "securityBaselineSettingState resource type"
description: "The security baseline compliance state of a setting for a device"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineSettingState resource type

Namespace: microsoft.graph



The security baseline compliance state of a setting for a device


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List securityBaselineSettingStates](../api/securitybaselinesettingstate-list.md)|[securityBaselineSettingState](../resources/securitybaselinesettingstate.md) collection|Get a list of the [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) objects and their properties.|
|[Create securityBaselineSettingState](../api/securitybaselinesettingstate-create.md)|[securityBaselineSettingState](../resources/securitybaselinesettingstate.md)|Create a new [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) object.|
|[Get securityBaselineSettingState](../api/securitybaselinesettingstate-get.md)|[securityBaselineSettingState](../resources/securitybaselinesettingstate.md)|Read the properties and relationships of a [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) object.|
|[Update securityBaselineSettingState](../api/securitybaselinesettingstate-update.md)|[securityBaselineSettingState](../resources/securitybaselinesettingstate.md)|Update the properties of a [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) object.|
|[Delete securityBaselineSettingState](../api/securitybaselinesettingstate-delete.md)|None|Deletes a [securityBaselineSettingState](../resources/securitybaselinesettingstate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contributingPolicies|[securityBaselineContributingPolicy](../resources/securitybaselinecontributingpolicy.md) collection|The policies that contribute to this setting instance|
|errorCode|String|The error code if the setting is in error state|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|settingCategoryId|String|The setting category id which this setting belongs to|
|settingCategoryName|String|The setting category name which this setting belongs to|
|settingId|String|The setting id guid|
|settingName|String|The setting name that is being reported|
|sourcePolicies|[settingSource](../resources/settingsource.md) collection|The policies that contribute to this setting instance|
|state|securityBaselineComplianceState|The compliance state of the security baseline setting. Possible values are: `unknown`, `secure`, `notApplicable`, `notSecure`, `error`, `conflict`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityBaselineSettingState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineSettingState",
  "id": "String (identifier)",
  "contributingPolicies": [
    {
      "@odata.type": "microsoft.graph.securityBaselineContributingPolicy"
    }
  ],
  "errorCode": "String",
  "settingCategoryId": "String",
  "settingCategoryName": "String",
  "settingId": "String",
  "settingName": "String",
  "sourcePolicies": [
    {
      "@odata.type": "microsoft.graph.settingSource"
    }
  ],
  "state": "String"
}
```

