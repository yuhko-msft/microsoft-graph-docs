---
title: "deviceManagementConfigurationSettingOccurrence resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingOccurrence resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|maxDeviceOccurrence|Int32|Maximum times setting can be set on device. |
|minDeviceOccurrence|Int32|Minimum times setting can be set on device. A MinDeviceOccurrence of 0 means setting is optional|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingOccurrence"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingOccurrence",
  "maxDeviceOccurrence": "Integer",
  "minDeviceOccurrence": "Integer"
}
```

