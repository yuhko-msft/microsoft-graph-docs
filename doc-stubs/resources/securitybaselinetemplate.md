---
title: "securityBaselineTemplate resource type"
description: "The security baseline template of the account"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# securityBaselineTemplate resource type

Namespace: microsoft.graph



The security baseline template of the account


Inherits from [deviceManagementTemplate](../resources/devicemanagementtemplate.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List securityBaselineTemplates](../api/securitybaselinetemplate-list.md)|[securityBaselineTemplate](../resources/securitybaselinetemplate.md) collection|Get a list of the [securityBaselineTemplate](../resources/securitybaselinetemplate.md) objects and their properties.|
|[Create securityBaselineTemplate](../api/securitybaselinetemplate-create.md)|[securityBaselineTemplate](../resources/securitybaselinetemplate.md)|Create a new [securityBaselineTemplate](../resources/securitybaselinetemplate.md) object.|
|[Get securityBaselineTemplate](../api/securitybaselinetemplate-get.md)|[securityBaselineTemplate](../resources/securitybaselinetemplate.md)|Read the properties and relationships of a [securityBaselineTemplate](../resources/securitybaselinetemplate.md) object.|
|[Update securityBaselineTemplate](../api/securitybaselinetemplate-update.md)|[securityBaselineTemplate](../resources/securitybaselinetemplate.md)|Update the properties of a [securityBaselineTemplate](../resources/securitybaselinetemplate.md) object.|
|[Delete securityBaselineTemplate](../api/securitybaselinetemplate-delete.md)|None|Deletes a [securityBaselineTemplate](../resources/securitybaselinetemplate.md) object.|
|[createInstance](../api/securitybaselinetemplate-createinstance.md)|[deviceManagementIntent](../resources/devicemanagementintent.md)|**TODO: Add Description**|
|[compare](../api/securitybaselinetemplate-compare.md)|[deviceManagementSettingComparison](../resources/devicemanagementsettingcomparison.md) collection|**TODO: Add Description**|
|[List categories](../api/securitybaselinetemplate-list-categories.md)|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) collection|Get the deviceManagementTemplateSettingCategory resources from the categories navigation property.|
|[Create deviceManagementTemplateSettingCategory](../api/securitybaselinetemplate-post-categories.md)|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md)|Create a new deviceManagementTemplateSettingCategory object.|
|[List categoryDeviceStateSummaries](../api/securitybaselinetemplate-list-categorydevicestatesummaries.md)|[securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) collection|Get the securityBaselineCategoryStateSummary resources from the categoryDeviceStateSummaries navigation property.|
|[Create securityBaselineCategoryStateSummary](../api/securitybaselinetemplate-post-categorydevicestatesummaries.md)|[securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md)|Create a new securityBaselineCategoryStateSummary object.|
|[List deviceStates](../api/securitybaselinetemplate-list-devicestates.md)|[securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) collection|Get the securityBaselineDeviceState resources from the deviceStates navigation property.|
|[Create securityBaselineDeviceState](../api/securitybaselinetemplate-post-devicestates.md)|[securityBaselineDeviceState](../resources/securitybaselinedevicestate.md)|Create a new securityBaselineDeviceState object.|
|[List securityBaselineStateSummary](../api/securitybaselinetemplate-list-devicestatesummary.md)|[securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) collection|Get the securityBaselineStateSummary resources from the deviceStateSummary navigation property.|
|[Create securityBaselineStateSummary](../api/securitybaselinetemplate-post-devicestatesummary.md)|[securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|Create a new securityBaselineStateSummary object.|
|[List migratableTo](../api/securitybaselinetemplate-list-migratableto.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md) collection|Get the deviceManagementTemplate resources from the migratableTo navigation property.|
|[Create deviceManagementTemplate](../api/securitybaselinetemplate-post-migratableto.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md)|Create a new deviceManagementTemplate object.|
|[List settings](../api/securitybaselinetemplate-list-settings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the settings navigation property.|
|[Create deviceManagementSettingInstance](../api/securitybaselinetemplate-post-settings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Create a new deviceManagementSettingInstance object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|The template's description Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|displayName|String|The template's display name Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intentCount|Int32|Number of Intents created from this template. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|isDeprecated|Boolean|The template is deprecated or not. Intents cannot be created from a deprecated template. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|platformType|policyPlatformType|The template's platform. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md). Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|publishedDateTime|DateTimeOffset|When the template was published Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|templateSubtype|deviceManagementTemplateSubtype|The template's subtype. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md). Possible values are: `none`, `firewall`, `diskEncryption`, `attackSurfaceReduction`, `endpointDetectionReponse`, `accountProtection`, `antivirus`, `firewallSharedAppList`, `firewallSharedIpList`, `firewallSharedPortlist`.|
|templateType|deviceManagementTemplateType|The template's type. Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md). Possible values are: `securityBaseline`, `specializedDevices`, `advancedThreatProtectionSecurityBaseline`, `deviceConfiguration`, `custom`, `securityTemplate`, `microsoftEdgeSecurityBaseline`, `microsoftOffice365ProPlusSecurityBaseline`, `deviceCompliance`, `deviceConfigurationForOffice365`, `cloudPC`, `firewallSharedSettings`.|
|versionInfo|String|The template's version information Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|categories|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) collection|Collection of setting categories within the template Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|categoryDeviceStateSummaries|[securityBaselineCategoryStateSummary](../resources/securitybaselinecategorystatesummary.md) collection|The security baseline per category device state summary|
|deviceStates|[securityBaselineDeviceState](../resources/securitybaselinedevicestate.md) collection|The security baseline device states|
|deviceStateSummary|[securityBaselineStateSummary](../resources/securitybaselinestatesummary.md)|The security baseline device state summary|
|migratableTo|[deviceManagementTemplate](../resources/devicemanagementtemplate.md) collection|Collection of templates this template can migrate to Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|
|settings|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Collection of all settings this template has Inherited from [deviceManagementTemplate](../resources/devicemanagementtemplate.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.securityBaselineTemplate",
  "baseType": "microsoft.graph.deviceManagementTemplate",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.securityBaselineTemplate",
  "id": "String (identifier)",
  "description": "String",
  "displayName": "String",
  "intentCount": "Integer",
  "isDeprecated": "Boolean",
  "platformType": "String",
  "publishedDateTime": "String (timestamp)",
  "templateSubtype": "String",
  "templateType": "String",
  "versionInfo": "String"
}
```

