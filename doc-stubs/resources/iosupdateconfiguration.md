---
title: "iosUpdateConfiguration resource type"
description: "IOS Update Configuration, allows you to configure time window within week to install iOS updates"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosUpdateConfiguration resource type

Namespace: microsoft.graph



IOS Update Configuration, allows you to configure time window within week to install iOS updates


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosUpdateConfigurations](../api/iosupdateconfiguration-list.md)|[iosUpdateConfiguration](../resources/iosupdateconfiguration.md) collection|Get a list of the [iosUpdateConfiguration](../resources/iosupdateconfiguration.md) objects and their properties.|
|[Create iosUpdateConfiguration](../api/iosupdateconfiguration-create.md)|[iosUpdateConfiguration](../resources/iosupdateconfiguration.md)|Create a new [iosUpdateConfiguration](../resources/iosupdateconfiguration.md) object.|
|[Get iosUpdateConfiguration](../api/iosupdateconfiguration-get.md)|[iosUpdateConfiguration](../resources/iosupdateconfiguration.md)|Read the properties and relationships of an [iosUpdateConfiguration](../resources/iosupdateconfiguration.md) object.|
|[Update iosUpdateConfiguration](../api/iosupdateconfiguration-update.md)|[iosUpdateConfiguration](../resources/iosupdateconfiguration.md)|Update the properties of an [iosUpdateConfiguration](../resources/iosupdateconfiguration.md) object.|
|[Delete iosUpdateConfiguration](../api/iosupdateconfiguration-delete.md)|None|Deletes an [iosUpdateConfiguration](../resources/iosupdateconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeHoursEnd|TimeOfDay|Active Hours End (active hours mean the time window when updates install should not happen)|
|activeHoursStart|TimeOfDay|Active Hours Start (active hours mean the time window when updates install should not happen)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|customUpdateTimeWindows|[customUpdateTimeWindow](../resources/customupdatetimewindow.md) collection|If update schedule type is set to use time window scheduling, custom time windows when updates will be scheduled. This collection can contain a maximum of 20 elements.|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|desiredOsVersion|String|If left unspecified, devices will update to the latest version of the OS.|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|enforcedSoftwareUpdateDelayInDays|Int32|Days before software updates are visible to iOS devices ranging from 0 to 90 inclusive|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isEnabled|Boolean|Is setting enabled in UI|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|scheduledInstallDays|dayOfWeek collection|Days in week for which active hours are configured. This collection can contain a maximum of 7 elements.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|updateScheduleType|iosSoftwareUpdateScheduleType|Update schedule type. Possible values are: `updateOutsideOfActiveHours`, `alwaysUpdate`, `updateDuringTimeWindows`, `updateOutsideOfTimeWindows`.|
|utcTimeOffsetInMinutes|Int32|UTC Time Offset indicated in minutes|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosUpdateConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosUpdateConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "activeHoursEnd": "String (time of day)",
  "activeHoursStart": "String (time of day)",
  "customUpdateTimeWindows": [
    {
      "@odata.type": "microsoft.graph.customUpdateTimeWindow"
    }
  ],
  "desiredOsVersion": "String",
  "enforcedSoftwareUpdateDelayInDays": "Integer",
  "isEnabled": "Boolean",
  "scheduledInstallDays": [
    "String"
  ],
  "updateScheduleType": "String",
  "utcTimeOffsetInMinutes": "Integer"
}
```

