---
title: "deviceManagementConfigurationWindowsSettingApplicability resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationWindowsSettingApplicability resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationServiceProviderVersion|String|Version of CSP setting is a part of|
|description|String|description of the setting Inherited from [deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md)|
|deviceMode|deviceManagementConfigurationDeviceMode|Device Mode that setting can be applied on Inherited from [deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md). Possible values are: `none`, `kiosk`.|
|maximumSupportedVersion|String|Maximum supported version of Windows|
|minimumSupportedVersion|String|Minimum supported version of Windows|
|platform|deviceManagementConfigurationPlatforms|Platform setting can be applied on Inherited from [deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md). Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|requiredAzureAdTrustType|deviceManagementConfigurationAzureAdTrustType|Required AzureAD trust type. Possible values are: `none`, `azureAdJoined`, `addWorkAccount`, `mdmOnly`.|
|requiresAzureAd|Boolean|AzureAD setting requirement|
|technologies|deviceManagementConfigurationTechnologies|Which technology channels this setting can be deployed through Inherited from [deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md). Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|
|windowsSkus|deviceManagementConfigurationWindowsSkus collection|List of Windows SKUs that the setting is applicable for|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationWindowsSettingApplicability"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationWindowsSettingApplicability",
  "description": "String",
  "deviceMode": "String",
  "platform": "String",
  "technologies": "String",
  "configurationServiceProviderVersion": "String",
  "maximumSupportedVersion": "String",
  "minimumSupportedVersion": "String",
  "requiredAzureAdTrustType": "String",
  "requiresAzureAd": "Boolean",
  "windowsSkus": [
    "String"
  ]
}
```

