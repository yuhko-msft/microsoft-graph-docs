---
title: "deviceManagementTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementTemplate resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementTemplates](../api/intune-devicemanagementtemplate-list.md)|[deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md) collection|Get a list of the [deviceManagementTemplate](../resources/devicemanagementtemplate.md) objects and their properties.|
|[Create deviceManagementTemplate](../api/intune-devicemanagementtemplate-create.md)|[deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|Create a new [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md) object.|
|[Get deviceManagementTemplate](../api/intune-devicemanagementtemplate-get.md)|[deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|Read the properties and relationships of a [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md) object.|
|[Update deviceManagementTemplate](../api/intune-devicemanagementtemplate-update.md)|[deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md)|Update the properties of a [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md) object.|
|[Delete deviceManagementTemplate](../api/intune-devicemanagementtemplate-delete.md)|None|Deletes a [deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md) object.|
|[importOffice365DeviceConfigurationPolicies](../api/intune-devicemanagementtemplate-importoffice365deviceconfigurationpolicies.md)|[deviceManagementIntent](../resources/intune-devicemanagementintent.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intentCount|Int32|**TODO: Add Description**|
|isDeprecated|Boolean|**TODO: Add Description**|
|platformType|policyPlatformType|**TODO: Add Description**. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `windows10XProfile`, `all`.|
|publishedDateTime|DateTimeOffset|**TODO: Add Description**|
|templateSubtype|deviceManagementTemplateSubtype|**TODO: Add Description**. Possible values are: `none`, `firewall`, `diskEncryption`, `attackSurfaceReduction`, `endpointDetectionReponse`, `accountProtection`, `antivirus`.|
|templateType|deviceManagementTemplateType|**TODO: Add Description**. Possible values are: `securityBaseline`, `specializedDevices`, `advancedThreatProtectionSecurityBaseline`, `deviceConfiguration`, `custom`, `securityTemplate`, `microsoftEdgeSecurityBaseline`, `microsoftOffice365ProPlusSecurityBaseline`, `deviceCompliance`, `deviceConfigurationForOffice365`.|
|versionInfo|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|categories|[deviceManagementTemplateSettingCategory](../resources/intune-devicemanagementtemplatesettingcategory.md) collection|**TODO: Add Description**|
|migratableTo|[deviceManagementTemplate](../resources/intune-devicemanagementtemplate.md) collection|**TODO: Add Description**|
|settings|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) collection|**TODO: Add Description**|

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
  "displayName": "String",
  "description": "String",
  "versionInfo": "String",
  "isDeprecated": "Boolean",
  "intentCount": "Integer",
  "templateType": "String",
  "platformType": "String",
  "templateSubtype": "String",
  "publishedDateTime": "String (timestamp)"
}
```

