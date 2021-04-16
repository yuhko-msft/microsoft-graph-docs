---
title: "deviceManagementConfigurationSettingApplicability resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingApplicability resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|description|String|description of the setting|
|deviceMode|deviceManagementConfigurationDeviceMode|Device Mode that setting can be applied on. Possible values are: `none`, `kiosk`.|
|platform|deviceManagementConfigurationPlatforms|Platform setting can be applied on. Possible values are: `none`, `macOS`, `windows10X`, `windows10`.|
|technologies|deviceManagementConfigurationTechnologies|Which technology channels this setting can be deployed through. Possible values are: `none`, `mdm`, `windows10XManagement`, `configManager`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingApplicability"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingApplicability",
  "description": "String",
  "deviceMode": "String",
  "platform": "String",
  "technologies": "String"
}
```

