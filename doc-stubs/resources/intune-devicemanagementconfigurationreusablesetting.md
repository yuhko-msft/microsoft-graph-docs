---
title: "deviceManagementConfigurationReusableSetting resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationReusableSetting resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationReusableSettings](../api/intune-devicemanagementconfigurationreusablesetting-list.md)|[deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) collection|Get a list of the [deviceManagementConfigurationReusableSetting](../resources/devicemanagementconfigurationreusablesetting.md) objects and their properties.|
|[Create deviceManagementConfigurationReusableSetting](../api/intune-devicemanagementconfigurationreusablesetting-create.md)|[deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md)|Create a new [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object.|
|[Get deviceManagementConfigurationReusableSetting](../api/intune-devicemanagementconfigurationreusablesetting-get.md)|[deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md)|Read the properties and relationships of a [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object.|
|[Update deviceManagementConfigurationReusableSetting](../api/intune-devicemanagementconfigurationreusablesetting-update.md)|[deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md)|Update the properties of a [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object.|
|[Delete deviceManagementConfigurationReusableSetting](../api/intune-devicemanagementconfigurationreusablesetting-delete.md)|None|Deletes a [deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md) object.|
|[clone](../api/intune-devicemanagementconfigurationreusablesetting-clone.md)|[deviceManagementConfigurationReusableSetting](../resources/intune-devicemanagementconfigurationreusablesetting.md)|**TODO: Add Description**|
|[List referencingConfigurationPolicies](../api/intune-devicemanagementconfigurationreusablesetting-list-referencingconfigurationpolicies.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) collection|Get the deviceManagementConfigurationPolicy resources from the referencingConfigurationPolicies navigation property.|
|[Create deviceManagementConfigurationPolicy](../api/intune-devicemanagementconfigurationreusablesetting-post-referencingconfigurationpolicies.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md)|Create a new deviceManagementConfigurationPolicy object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|referencingConfigurationPolicyCount|Int32|**TODO: Add Description**|
|settingDefinitionId|String|**TODO: Add Description**|
|settingInstance|[deviceManagementConfigurationSettingInstance](../resources/intune-devicemanagementconfigurationsettinginstance.md)|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|referencingConfigurationPolicies|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationReusableSetting",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationReusableSetting",
  "id": "String (identifier)",
  "displayName": "String",
  "description": "String",
  "settingDefinitionId": "String",
  "settingInstance": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "version": "Integer",
  "referencingConfigurationPolicyCount": "Integer"
}
```

