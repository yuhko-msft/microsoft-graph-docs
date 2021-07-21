---
title: "deviceManagementReusablePolicySetting resource type"
description: "Graph model for a reusable setting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementReusablePolicySetting resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Graph model for a reusable setting


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementReusablePolicySettings](../api/devicemanagementreusablepolicysetting-list.md)|[deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) collection|Get a list of the [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) objects and their properties.|
|[Create deviceManagementReusablePolicySetting](../api/devicemanagementreusablepolicysetting-create.md)|[deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md)|Create a new [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) object.|
|[Get deviceManagementReusablePolicySetting](../api/devicemanagementreusablepolicysetting-get.md)|[deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md)|Read the properties and relationships of a [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) object.|
|[Update deviceManagementReusablePolicySetting](../api/devicemanagementreusablepolicysetting-update.md)|[deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md)|Update the properties of a [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) object.|
|[Delete deviceManagementReusablePolicySetting](../api/devicemanagementreusablepolicysetting-delete.md)|None|Deletes a [deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md) object.|
|[clone](../api/devicemanagementreusablepolicysetting-clone.md)|[deviceManagementReusablePolicySetting](../resources/devicemanagementreusablepolicysetting.md)|**TODO: Add Description**|
|[List referencingConfigurationPolicies](../api/devicemanagementreusablepolicysetting-list-referencingconfigurationpolicies.md)|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) collection|Get the deviceManagementConfigurationPolicy resources from the referencingConfigurationPolicies navigation property.|
|[Create deviceManagementConfigurationPolicy](../api/devicemanagementreusablepolicysetting-post-referencingconfigurationpolicies.md)|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md)|Create a new deviceManagementConfigurationPolicy object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|reusable setting creation date and time. This property is read-only.|
|description|String|reusable setting description supplied by user.|
|displayName|String|reusable setting display name supplied by user.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|date and time when reusable setting was last modified. This property is read-only.|
|referencingConfigurationPolicyCount|Int32|count of configuration policies referencing the current reusable setting. Valid values 0 to 2147483647. This property is read-only.|
|settingDefinitionId|String|setting definition id associated with this reusable setting.|
|settingInstance|[deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md)|reusable setting configuration instance|
|version|Int32|version number for reusable setting. Valid values 0 to 2147483647. This property is read-only.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|referencingConfigurationPolicies|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) collection|configuration policies referencing the current reusable setting|

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
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "referencingConfigurationPolicyCount": "Integer",
  "settingDefinitionId": "String",
  "settingInstance": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
  },
  "version": "Integer"
}
```

