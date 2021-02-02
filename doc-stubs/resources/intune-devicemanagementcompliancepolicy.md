---
title: "deviceManagementCompliancePolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementCompliancePolicy resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementCompliancePolicies](../api/intune-devicemanagementcompliancepolicy-list.md)|[deviceManagementCompliancePolicy](../resources/intune-devicemanagementcompliancepolicy.md) collection|Get a list of the [deviceManagementCompliancePolicy](../resources/devicemanagementcompliancepolicy.md) objects and their properties.|
|[Create deviceManagementCompliancePolicy](../api/intune-devicemanagementcompliancepolicy-create.md)|[deviceManagementCompliancePolicy](../resources/intune-devicemanagementcompliancepolicy.md)|Create a new [deviceManagementCompliancePolicy](../resources/intune-devicemanagementcompliancepolicy.md) object.|
|[Get deviceManagementCompliancePolicy](../api/intune-devicemanagementcompliancepolicy-get.md)|[deviceManagementCompliancePolicy](../resources/intune-devicemanagementcompliancepolicy.md)|Read the properties and relationships of a [deviceManagementCompliancePolicy](../resources/intune-devicemanagementcompliancepolicy.md) object.|
|[Update deviceManagementCompliancePolicy](../api/intune-devicemanagementcompliancepolicy-update.md)|[deviceManagementCompliancePolicy](../resources/intune-devicemanagementcompliancepolicy.md)|Update the properties of a [deviceManagementCompliancePolicy](../resources/intune-devicemanagementcompliancepolicy.md) object.|
|[Delete deviceManagementCompliancePolicy](../api/intune-devicemanagementcompliancepolicy-delete.md)|None|Deletes a [deviceManagementCompliancePolicy](../resources/intune-devicemanagementcompliancepolicy.md) object.|
|[assign](../api/intune-devicemanagementcompliancepolicy-assign.md)|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) collection|**TODO: Add Description**|
|[setScheduledActions](../api/intune-devicemanagementcompliancepolicy-setscheduledactions.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|**TODO: Add Description**|
|[List assignments](../api/intune-devicemanagementcompliancepolicy-list-assignments.md)|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) collection|Get the deviceManagementConfigurationPolicyAssignment resources from the assignments navigation property.|
|[Create deviceManagementConfigurationPolicyAssignment](../api/intune-devicemanagementcompliancepolicy-post-assignments.md)|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md)|Create a new deviceManagementConfigurationPolicyAssignment object.|
|[List scheduledActionsForRule](../api/intune-devicemanagementcompliancepolicy-list-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|Get the deviceComplianceScheduledActionForRule resources from the scheduledActionsForRule navigation property.|
|[Create deviceComplianceScheduledActionForRule](../api/intune-devicemanagementcompliancepolicy-post-scheduledactionsforrule.md)|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md)|Create a new deviceComplianceScheduledActionForRule object.|
|[List settings](../api/intune-devicemanagementcompliancepolicy-list-settings.md)|[deviceManagementConfigurationSetting](../resources/intune-devicemanagementconfigurationsetting.md) collection|Get the deviceManagementConfigurationSetting resources from the settings navigation property.|
|[Create deviceManagementConfigurationSetting](../api/intune-devicemanagementcompliancepolicy-post-settings.md)|[deviceManagementConfigurationSetting](../resources/intune-devicemanagementconfigurationsetting.md)|Create a new deviceManagementConfigurationSetting object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|creationSource|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAssigned|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|platforms|deviceManagementConfigurationPlatforms|**TODO: Add Description**. Possible values are: `none`, `android`, `androidEnterprise`, `iOS`, `macOS`, `windows10X`, `windows10`.|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|settingCount|Int32|**TODO: Add Description**|
|technologies|deviceManagementConfigurationTechnologies|**TODO: Add Description**. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`, `intuneManagementExtension`, `thirdParty`, `documentGateway`, `appleRemoteManagement`.|
|templateReference|[deviceManagementConfigurationPolicyTemplateReference](../resources/intune-devicemanagementconfigurationpolicytemplatereference.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) collection|**TODO: Add Description**|
|scheduledActionsForRule|[deviceComplianceScheduledActionForRule](../resources/intune-devicecompliancescheduledactionforrule.md) collection|**TODO: Add Description**|
|settings|[deviceManagementConfigurationSetting](../resources/intune-devicemanagementconfigurationsetting.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementCompliancePolicy",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementCompliancePolicy",
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "platforms": "String",
  "technologies": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "settingCount": "Integer",
  "creationSource": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "isAssigned": "Boolean",
  "templateReference": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplateReference"
  }
}
```

