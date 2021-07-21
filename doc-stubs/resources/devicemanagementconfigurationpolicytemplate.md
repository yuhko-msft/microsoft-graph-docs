---
title: "deviceManagementConfigurationPolicyTemplate resource type"
description: "Device Management Configuration Policy Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationPolicyTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Device Management Configuration Policy Template


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationPolicyTemplates](../api/devicemanagementconfigurationpolicytemplate-list.md)|[deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) collection|Get a list of the [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) objects and their properties.|
|[Create deviceManagementConfigurationPolicyTemplate](../api/devicemanagementconfigurationpolicytemplate-create.md)|[deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md)|Create a new [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) object.|
|[Get deviceManagementConfigurationPolicyTemplate](../api/devicemanagementconfigurationpolicytemplate-get.md)|[deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md)|Read the properties and relationships of a [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) object.|
|[Update deviceManagementConfigurationPolicyTemplate](../api/devicemanagementconfigurationpolicytemplate-update.md)|[deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md)|Update the properties of a [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) object.|
|[Delete deviceManagementConfigurationPolicyTemplate](../api/devicemanagementconfigurationpolicytemplate-delete.md)|None|Deletes a [deviceManagementConfigurationPolicyTemplate](../resources/devicemanagementconfigurationpolicytemplate.md) object.|
|[List settingTemplates](../api/devicemanagementconfigurationpolicytemplate-list-settingtemplates.md)|[deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) collection|Get the deviceManagementConfigurationSettingTemplate resources from the settingTemplates navigation property.|
|[Create deviceManagementConfigurationSettingTemplate](../api/devicemanagementconfigurationpolicytemplate-post-settingtemplates.md)|[deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md)|Create a new deviceManagementConfigurationSettingTemplate object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowUnmanagedSettings|Boolean|Allow unmanaged setting templates|
|baseId|String|Template base identifier|
|description|String|Template description|
|displayName|String|Template display name|
|displayVersion|String|Description of template version|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lifecycleState|deviceManagementTemplateLifecycleState|Indicate current lifecycle state of template. Possible values are: `invalid`, `draft`, `active`, `superseded`, `deprecated`, `retired`.|
|platforms|deviceManagementConfigurationPlatforms|Platforms for this template. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|settingTemplateCount|Int32|Number of setting templates. Valid values 0 to 2147483647. This property is read-only.|
|technologies|deviceManagementConfigurationTechnologies|Technologies for this template. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`, `microsoftSense`.|
|templateFamily|deviceManagementConfigurationTemplateFamily|TemplateFamily for this template. Possible values are: `none`, `endpointSecurityAntivirus`, `endpointSecurityDiskEncryption`, `endpointSecurityFirewall`, `endpointSecurityEndpointDetectionAndResponse`, `endpointSecurityAttackSurfaceReduction`, `endpointSecurityAccountProtection`, `endpointSecurityApplicationControl`.|
|version|Int32|Template version. Valid values 1 to 2147483647. This property is read-only.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settingTemplates|[deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) collection|Setting templates|

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
  "allowUnmanagedSettings": "Boolean",
  "baseId": "String",
  "description": "String",
  "displayName": "String",
  "displayVersion": "String",
  "lifecycleState": "String",
  "platforms": "String",
  "settingTemplateCount": "Integer",
  "technologies": "String",
  "templateFamily": "String",
  "version": "Integer"
}
```

