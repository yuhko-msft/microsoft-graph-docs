---
title: "deviceManagementConfigurationLinuxSettingApplicability resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationLinuxSettingApplicability resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingApplicability](../resources/intune-devicemanagementconfigurationsettingapplicability.md)|
|deviceMode|deviceManagementConfigurationDeviceMode|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingApplicability](../resources/intune-devicemanagementconfigurationsettingapplicability.md). Possible values are: `none`, `kiosk`.|
|platform|deviceManagementConfigurationPlatforms|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingApplicability](../resources/intune-devicemanagementconfigurationsettingapplicability.md). Possible values are: `none`, `android`, `androidEnterprise`, `iOS`, `macOS`, `windows10X`, `windows10`.|
|technologies|deviceManagementConfigurationTechnologies|**TODO: Add Description** Inherited from [deviceManagementConfigurationSettingApplicability](../resources/intune-devicemanagementconfigurationsettingapplicability.md). Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`, `intuneManagementExtension`, `thirdParty`, `documentGateway`, `appleRemoteManagement`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationLinuxSettingApplicability"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationLinuxSettingApplicability",
  "description": "String",
  "platform": "String",
  "deviceMode": "String",
  "technologies": "String"
}
```

