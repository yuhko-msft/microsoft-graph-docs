---
title: "deviceManagementConfigurationPolicyTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationPolicyTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationPolicyTemplates](../api/intune-devicemanagementconfigurationpolicytemplate-list.md)|[deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) collection|Get a list of the [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) objects and their properties.|
|[Create deviceManagementConfigurationPolicyTemplate](../api/intune-devicemanagementconfigurationpolicytemplate-create.md)|[deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md)|Create a new [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object.|
|[Get deviceManagementConfigurationPolicyTemplate](../api/intune-devicemanagementconfigurationpolicytemplate-get.md)|[deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md)|Read the properties and relationships of a [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object.|
|[Update deviceManagementConfigurationPolicyTemplate](../api/intune-devicemanagementconfigurationpolicytemplate-update.md)|[deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md)|Update the properties of a [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object.|
|[Delete deviceManagementConfigurationPolicyTemplate](../api/intune-devicemanagementconfigurationpolicytemplate-delete.md)|None|Deletes a [deviceManagementConfigurationPolicyTemplate](../resources/intune-devicemanagementconfigurationpolicytemplate.md) object.|
|[List settingTemplates](../api/intune-devicemanagementconfigurationpolicytemplate-list-settingtemplates.md)|[deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) collection|Get the deviceManagementConfigurationSettingTemplate resources from the settingTemplates navigation property.|
|[Create deviceManagementConfigurationSettingTemplate](../api/intune-devicemanagementconfigurationpolicytemplate-post-settingtemplates.md)|[deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md)|Create a new deviceManagementConfigurationSettingTemplate object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowUnmanagedSettings|Boolean|**TODO: Add Description**|
|baseId|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|displayVersion|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lifecycleState|deviceManagementTemplateLifecycleState|**TODO: Add Description**. Possible values are: `invalid`, `draft`, `active`, `superseded`, `deprecated`, `retired`.|
|platforms|deviceManagementConfigurationPlatforms|**TODO: Add Description**. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|settingTemplateCount|Int32|**TODO: Add Description**|
|technologies|deviceManagementConfigurationTechnologies|**TODO: Add Description**. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|
|templateFamily|deviceManagementConfigurationTemplateFamily|**TODO: Add Description**. Possible values are: `none`, `endpointSecurityAntivirus`, `endpointSecurityDiskEncryption`, `endpointSecurityFirewall`, `endpointSecurityEndpointDectionAndResponse`, `endpointSecurityAttackSurfaceReduction`, `endpointSecurityAccountProtection`, `endpointSecurityApplicationControl`.|
|version|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settingTemplates|[deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyTemplate",
  "id": "String (identifier)",
  "baseId": "String",
  "version": "Integer",
  "displayName": "String",
  "description": "String",
  "displayVersion": "String",
  "lifecycleState": "String",
  "platforms": "String",
  "technologies": "String",
  "templateFamily": "String",
  "allowUnmanagedSettings": "Boolean",
  "settingTemplateCount": "Integer"
}
```

