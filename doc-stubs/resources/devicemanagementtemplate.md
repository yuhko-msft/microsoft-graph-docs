---
title: "deviceManagementTemplate resource type"
description: "Entity that represents a defined collection of device settings"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementTemplate resource type

Namespace: microsoft.graph



Entity that represents a defined collection of device settings


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementTemplates](../api/devicemanagementtemplate-list.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md) collection|Get a list of the [deviceManagementTemplate](../resources/devicemanagementtemplate.md) objects and their properties.|
|[Create deviceManagementTemplate](../api/devicemanagementtemplate-create.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md)|Create a new [deviceManagementTemplate](../resources/devicemanagementtemplate.md) object.|
|[Get deviceManagementTemplate](../api/devicemanagementtemplate-get.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md)|Read the properties and relationships of a [deviceManagementTemplate](../resources/devicemanagementtemplate.md) object.|
|[Update deviceManagementTemplate](../api/devicemanagementtemplate-update.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md)|Update the properties of a [deviceManagementTemplate](../resources/devicemanagementtemplate.md) object.|
|[Delete deviceManagementTemplate](../api/devicemanagementtemplate-delete.md)|None|Deletes a [deviceManagementTemplate](../resources/devicemanagementtemplate.md) object.|
|[createInstance](../api/devicemanagementtemplate-createinstance.md)|[deviceManagementIntent](../resources/devicemanagementintent.md)|**TODO: Add Description**|
|[importOffice365DeviceConfigurationPolicies](../api/devicemanagementtemplate-importoffice365deviceconfigurationpolicies.md)|[deviceManagementIntent](../resources/devicemanagementintent.md) collection|**TODO: Add Description**|
|[compare](../api/devicemanagementtemplate-compare.md)|[deviceManagementSettingComparison](../resources/devicemanagementsettingcomparison.md) collection|**TODO: Add Description**|
|[List categories](../api/devicemanagementtemplate-list-categories.md)|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) collection|Get the deviceManagementTemplateSettingCategory resources from the categories navigation property.|
|[Create deviceManagementTemplateSettingCategory](../api/devicemanagementtemplate-post-categories.md)|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md)|Create a new deviceManagementTemplateSettingCategory object.|
|[List migratableTo](../api/devicemanagementtemplate-list-migratableto.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md) collection|Get the deviceManagementTemplate resources from the migratableTo navigation property.|
|[Create deviceManagementTemplate](../api/devicemanagementtemplate-post-migratableto.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md)|Create a new deviceManagementTemplate object.|
|[List settings](../api/devicemanagementtemplate-list-settings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the settings navigation property.|
|[Create deviceManagementSettingInstance](../api/devicemanagementtemplate-post-settings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Create a new deviceManagementSettingInstance object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|The template's description|
|displayName|String|The template's display name|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intentCount|Int32|Number of Intents created from this template.|
|isDeprecated|Boolean|The template is deprecated or not. Intents cannot be created from a deprecated template.|
|platformType|policyPlatformType|The template's platform. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|publishedDateTime|DateTimeOffset|When the template was published|
|templateSubtype|deviceManagementTemplateSubtype|The template's subtype. Possible values are: `none`, `firewall`, `diskEncryption`, `attackSurfaceReduction`, `endpointDetectionReponse`, `accountProtection`, `antivirus`, `firewallSharedAppList`, `firewallSharedIpList`, `firewallSharedPortlist`.|
|templateType|deviceManagementTemplateType|The template's type. Possible values are: `securityBaseline`, `specializedDevices`, `advancedThreatProtectionSecurityBaseline`, `deviceConfiguration`, `custom`, `securityTemplate`, `microsoftEdgeSecurityBaseline`, `microsoftOffice365ProPlusSecurityBaseline`, `deviceCompliance`, `deviceConfigurationForOffice365`, `cloudPC`, `firewallSharedSettings`.|
|versionInfo|String|The template's version information|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|categories|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) collection|Collection of setting categories within the template|
|migratableTo|[deviceManagementTemplate](../resources/devicemanagementtemplate.md) collection|Collection of templates this template can migrate to|
|settings|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Collection of all settings this template has|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementTemplate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementTemplate",
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

