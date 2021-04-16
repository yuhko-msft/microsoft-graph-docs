---
title: "androidEasEmailProfileConfiguration resource type"
description: "By providing configurations in this profile you can instruct the native email client on KNOX devices to communicate with an Exchange server and get email, contacts, calendar, tasks, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidEasEmailProfileConfiguration resource type

Namespace: microsoft.graph



By providing configurations in this profile you can instruct the native email client on KNOX devices to communicate with an Exchange server and get email, contacts, calendar, tasks, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidEasEmailProfileConfigurations](../api/androideasemailprofileconfiguration-list.md)|[androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) collection|Get a list of the [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) objects and their properties.|
|[Create androidEasEmailProfileConfiguration](../api/androideasemailprofileconfiguration-create.md)|[androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md)|Create a new [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) object.|
|[Get androidEasEmailProfileConfiguration](../api/androideasemailprofileconfiguration-get.md)|[androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md)|Read the properties and relationships of an [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) object.|
|[Update androidEasEmailProfileConfiguration](../api/androideasemailprofileconfiguration-update.md)|[androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md)|Update the properties of an [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) object.|
|[Delete androidEasEmailProfileConfiguration](../api/androideasemailprofileconfiguration-delete.md)|None|Deletes an [androidEasEmailProfileConfiguration](../resources/androideasemailprofileconfiguration.md) object.|
|[assign](../api/androideasemailprofileconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/androideasemailprofileconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/androideasemailprofileconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/androideasemailprofileconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/androideasemailprofileconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/androideasemailprofileconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/androideasemailprofileconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/androideasemailprofileconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/androideasemailprofileconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/androideasemailprofileconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/androideasemailprofileconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/androideasemailprofileconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/androideasemailprofileconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List androidCertificateProfileBase](../api/androideasemailprofileconfiguration-list-identitycertificate.md)|[androidCertificateProfileBase](../resources/androidcertificateprofilebase.md) collection|Get the androidCertificateProfileBase resources from the identityCertificate navigation property.|
|[Add androidCertificateProfileBase](../api/androideasemailprofileconfiguration-post-identitycertificate.md)|[androidCertificateProfileBase](../resources/androidcertificateprofilebase.md)|Add identityCertificate by posting to the identityCertificate collection.|
|[List androidCertificateProfileBase](../api/androideasemailprofileconfiguration-list-smimesigningcertificate.md)|[androidCertificateProfileBase](../resources/androidcertificateprofilebase.md) collection|Get the androidCertificateProfileBase resources from the smimeSigningCertificate navigation property.|
|[Add androidCertificateProfileBase](../api/androideasemailprofileconfiguration-post-smimesigningcertificate.md)|[androidCertificateProfileBase](../resources/androidcertificateprofilebase.md)|Add smimeSigningCertificate by posting to the smimeSigningCertificate collection.|
|[List userStatuses](../api/androideasemailprofileconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/androideasemailprofileconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/androideasemailprofileconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/androideasemailprofileconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountName|String|Exchange ActiveSync account name, displayed to users as name of EAS (this) profile.|
|authenticationMethod|easAuthenticationMethod|Authentication method for Exchange ActiveSync. Possible values are: `usernameAndPassword`, `certificate`, `derivedCredential`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|customDomainName|String|Custom domain name value used while generating an email profile before installing on the device.|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|durationOfEmailToSync|emailSyncDuration|Duration of time email should be synced to. Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|emailAddressSource|userEmailSource|Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|emailSyncSchedule|emailSyncSchedule|Email sync schedule. Possible values are: `userDefined`, `asMessagesArrive`, `manual`, `fifteenMinutes`, `thirtyMinutes`, `sixtyMinutes`, `basedOnMyUsage`.|
|hostName|String|Exchange location (URL) that the native mail app connects to.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|requireSmime|Boolean|Indicates whether or not to use S/MIME certificate.|
|requireSsl|Boolean|Indicates whether or not to use SSL.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|syncCalendar|Boolean|Toggles syncing the calendar. If set to false calendar is turned off on the device.|
|syncContacts|Boolean|Toggles syncing contacts. If set to false contacts are turned off on the device.|
|syncNotes|Boolean|Toggles syncing notes. If set to false notes are turned off on the device.|
|syncTasks|Boolean|Toggles syncing tasks. If set to false tasks are turned off on the device.|
|userDomainNameSource|domainNameSource|UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `fullDomainName`, `netBiosDomainName`.|
|usernameSource|androidUsernameSource|Username attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `username`, `userPrincipalName`, `samAccountName`, `primarySmtpAddress`.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[androidCertificateProfileBase](../resources/androidcertificateprofilebase.md)|Identity certificate.|
|smimeSigningCertificate|[androidCertificateProfileBase](../resources/androidcertificateprofilebase.md)|S/MIME signing certificate.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidEasEmailProfileConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidEasEmailProfileConfiguration",
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
  "accountName": "String",
  "authenticationMethod": "String",
  "customDomainName": "String",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "emailSyncSchedule": "String",
  "hostName": "String",
  "requireSmime": "Boolean",
  "requireSsl": "Boolean",
  "syncCalendar": "Boolean",
  "syncContacts": "Boolean",
  "syncNotes": "Boolean",
  "syncTasks": "Boolean",
  "userDomainNameSource": "String",
  "usernameSource": "String"
}
```

