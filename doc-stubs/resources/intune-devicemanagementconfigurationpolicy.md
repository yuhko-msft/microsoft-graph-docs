---
title: "deviceManagementConfigurationPolicy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationPolicies](../api/intune-devicemanagementconfigurationpolicy-list.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) collection|Get a list of the [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) objects and their properties.|
|[Create deviceManagementConfigurationPolicy](../api/intune-devicemanagementconfigurationpolicy-create.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md)|Create a new [deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) object.|
|[Get deviceManagementConfigurationPolicy](../api/intune-devicemanagementconfigurationpolicy-get.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md)|Read the properties and relationships of a [deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) object.|
|[Update deviceManagementConfigurationPolicy](../api/intune-devicemanagementconfigurationpolicy-update.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md)|Update the properties of a [deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) object.|
|[Delete deviceManagementConfigurationPolicy](../api/intune-devicemanagementconfigurationpolicy-delete.md)|None|Deletes a [deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md) object.|
|[createCopy](../api/intune-devicemanagementconfigurationpolicy-createcopy.md)|[deviceManagementConfigurationPolicy](../resources/intune-devicemanagementconfigurationpolicy.md)|**TODO: Add Description**|

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
|platforms|deviceManagementConfigurationPlatforms|**TODO: Add Description**. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|roleScopeTagIds|String collection|**TODO: Add Description**|
|settingCount|Int32|**TODO: Add Description**|
|technologies|deviceManagementConfigurationTechnologies|**TODO: Add Description**. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|
|templateReference|[deviceManagementConfigurationPolicyTemplateReference](../resources/intune-devicemanagementconfigurationpolicytemplatereference.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) collection|**TODO: Add Description**|
|settings|[deviceManagementConfigurationSetting](../resources/intune-devicemanagementconfigurationsetting.md) collection|**TODO: Add Description**|

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

