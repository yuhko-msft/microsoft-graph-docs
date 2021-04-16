---
title: "windowsPhoneEASEmailProfileConfiguration resource type"
description: "By providing configurations in this profile you can instruct the native email client on Windows Phone to communicate with an Exchange server and get email, contacts, calendar, and tasks. Furthermore, you can also specify how much email to sync and how often the device should sync."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsPhoneEASEmailProfileConfiguration resource type

Namespace: microsoft.graph



By providing configurations in this profile you can instruct the native email client on Windows Phone to communicate with an Exchange server and get email, contacts, calendar, and tasks. Furthermore, you can also specify how much email to sync and how often the device should sync.


Inherits from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsPhoneEASEmailProfileConfigurations](../api/windowsphoneeasemailprofileconfiguration-list.md)|[windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md) collection|Get a list of the [windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md) objects and their properties.|
|[Create windowsPhoneEASEmailProfileConfiguration](../api/windowsphoneeasemailprofileconfiguration-create.md)|[windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md)|Create a new [windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md) object.|
|[Get windowsPhoneEASEmailProfileConfiguration](../api/windowsphoneeasemailprofileconfiguration-get.md)|[windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md)|Read the properties and relationships of a [windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md) object.|
|[Update windowsPhoneEASEmailProfileConfiguration](../api/windowsphoneeasemailprofileconfiguration-update.md)|[windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md)|Update the properties of a [windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md) object.|
|[Delete windowsPhoneEASEmailProfileConfiguration](../api/windowsphoneeasemailprofileconfiguration-delete.md)|None|Deletes a [windowsPhoneEASEmailProfileConfiguration](../resources/windowsphoneeasemailprofileconfiguration.md) object.|
|[List assignments](../api/windowsphoneeasemailprofileconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windowsphoneeasemailprofileconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windowsphoneeasemailprofileconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windowsphoneeasemailprofileconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windowsphoneeasemailprofileconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windowsphoneeasemailprofileconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windowsphoneeasemailprofileconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windowsphoneeasemailprofileconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windowsphoneeasemailprofileconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windowsphoneeasemailprofileconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/windowsphoneeasemailprofileconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windowsphoneeasemailprofileconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windowsphoneeasemailprofileconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windowsphoneeasemailprofileconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountName|String|Account name.|
|applyOnlyToWindowsPhone81|Boolean|Value indicating whether this policy only applies to Windows 8.1. This property is read-only.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|customDomainName|String|Custom domain name value used while generating an email profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|durationOfEmailToSync|emailSyncDuration|Duration of email to sync. Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|emailAddressSource|userEmailSource|Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|emailSyncSchedule|emailSyncSchedule|Email sync schedule. Possible values are: `userDefined`, `asMessagesArrive`, `manual`, `fifteenMinutes`, `thirtyMinutes`, `sixtyMinutes`, `basedOnMyUsage`.|
|hostName|String|Exchange location that (URL) that the native mail app connects to.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|requireSsl|Boolean|Indicates whether or not to use SSL.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|syncCalendar|Boolean|Whether or not to sync the calendar.|
|syncContacts|Boolean|Whether or not to sync contacts.|
|syncTasks|Boolean|Whether or not to sync tasks.|
|userDomainNameSource|domainNameSource|UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `fullDomainName`, `netBiosDomainName`.|
|usernameAADSource|usernameSource|Name of the AAD field, that will be used to retrieve UserName for email profile. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`, `samAccountName`.|
|usernameSource|userEmailSource|Username attribute that is picked from AAD and injected into this profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
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
  "@odata.type": "microsoft.graph.windowsPhoneEASEmailProfileConfiguration",
  "baseType": "microsoft.graph.easEmailProfileConfigurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsPhoneEASEmailProfileConfiguration",
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
  "customDomainName": "String",
  "userDomainNameSource": "String",
  "usernameAADSource": "String",
  "usernameSource": "String",
  "accountName": "String",
  "applyOnlyToWindowsPhone81": "Boolean",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "emailSyncSchedule": "String",
  "hostName": "String",
  "requireSsl": "Boolean",
  "syncCalendar": "Boolean",
  "syncContacts": "Boolean",
  "syncTasks": "Boolean"
}
```

