---
title: "deviceManagementReusablePolicySetting resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementReusablePolicySetting resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementReusablePolicySettings](../api/intune-devicemanagementreusablepolicysetting-list.md)|[deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md) collection|Get a list of the [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) objects and their properties.|
|[Create deviceManagementReusablePolicySetting](../api/intune-devicemanagementreusablepolicysetting-create.md)|[deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md)|Create a new [deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md) object.|
|[Get deviceManagementReusablePolicySetting](../api/intune-devicemanagementreusablepolicysetting-get.md)|[deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md)|Read the properties and relationships of a [deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md) object.|
|[Update deviceManagementReusablePolicySetting](../api/intune-devicemanagementreusablepolicysetting-update.md)|[deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md)|Update the properties of a [deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md) object.|
|[Delete deviceManagementReusablePolicySetting](../api/intune-devicemanagementreusablepolicysetting-delete.md)|None|Deletes a [deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md) object.|
|[clone](../api/intune-devicemanagementreusablepolicysetting-clone.md)|[deviceManagementReusablePolicySetting](../resources/intune-devicemanagementreusablepolicysetting.md)|**TODO: Add Description**|
|[List referencingConfigurationPolicies](../api/intune-devicemanagementreusablepolicysetting-list-referencingconfigurationpolicies.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) collection|Get the deviceManagementConfigurationPolicy resources from the referencingConfigurationPolicies navigation property.|
|[Create deviceManagementConfigurationPolicy](../api/intune-devicemanagementreusablepolicysetting-post-referencingconfigurationpolicies.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md)|Create a new deviceManagementConfigurationPolicy object.|

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
  "@odata.type": "microsoft.graph.deviceManagementReusablePolicySetting",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementReusablePolicySetting",
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

