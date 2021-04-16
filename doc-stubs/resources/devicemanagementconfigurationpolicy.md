---
title: "deviceManagementConfigurationPolicy resource type"
description: "Device Management Configuration Policy"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationPolicy resource type

Namespace: microsoft.graph



Device Management Configuration Policy


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationPolicies](../api/devicemanagementconfigurationpolicy-list.md)|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) collection|Get a list of the [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) objects and their properties.|
|[Create deviceManagementConfigurationPolicy](../api/devicemanagementconfigurationpolicy-create.md)|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md)|Create a new [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object.|
|[Get deviceManagementConfigurationPolicy](../api/devicemanagementconfigurationpolicy-get.md)|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md)|Read the properties and relationships of a [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object.|
|[Update deviceManagementConfigurationPolicy](../api/devicemanagementconfigurationpolicy-update.md)|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md)|Update the properties of a [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object.|
|[Delete deviceManagementConfigurationPolicy](../api/devicemanagementconfigurationpolicy-delete.md)|None|Deletes a [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object.|
|[assign](../api/devicemanagementconfigurationpolicy-assign.md)|[deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) collection|**TODO: Add Description**|
|[List assignments](../api/devicemanagementconfigurationpolicy-list-assignments.md)|[deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) collection|Get the deviceManagementConfigurationPolicyAssignment resources from the assignments navigation property.|
|[Create deviceManagementConfigurationPolicyAssignment](../api/devicemanagementconfigurationpolicy-post-assignments.md)|[deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md)|Create a new deviceManagementConfigurationPolicyAssignment object.|
|[List settings](../api/devicemanagementconfigurationpolicy-list-settings.md)|[deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) collection|Get the deviceManagementConfigurationSetting resources from the settings navigation property.|
|[Create deviceManagementConfigurationSetting](../api/devicemanagementconfigurationpolicy-post-settings.md)|[deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md)|Create a new deviceManagementConfigurationSetting object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Policy creation date and time. This property is read-only.|
|creationSource|String|Policy creation source|
|description|String|Policy description|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAssigned|Boolean|Policy assignment status. This property is read-only.|
|lastModifiedDateTime|DateTimeOffset|Policy last modification date and time. This property is read-only.|
|name|String|Policy name|
|platforms|deviceManagementConfigurationPlatforms|Platforms for this policy. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|settingCount|Int32|Number of settings. This property is read-only.|
|technologies|deviceManagementConfigurationTechnologies|Technologies for this policy. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) collection|Policy assignments|
|settings|[deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) collection|Policy settings|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicy",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "creationSource": "String",
  "description": "String",
  "isAssigned": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "name": "String",
  "platforms": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "settingCount": "Integer",
  "technologies": "String"
}
```

