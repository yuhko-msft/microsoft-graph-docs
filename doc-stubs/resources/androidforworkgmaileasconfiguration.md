---
title: "androidForWorkGmailEasConfiguration resource type"
description: "By providing configurations in this profile you can instruct the Gmail email client on Android For Work devices to communicate with an Exchange server and get email, contacts, calendar, tasks, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidForWorkGmailEasConfiguration resource type

Namespace: microsoft.graph



By providing configurations in this profile you can instruct the Gmail email client on Android For Work devices to communicate with an Exchange server and get email, contacts, calendar, tasks, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync.


Inherits from [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidForWorkGmailEasConfigurations](../api/androidforworkgmaileasconfiguration-list.md)|[androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md) collection|Get a list of the [androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md) objects and their properties.|
|[Create androidForWorkGmailEasConfiguration](../api/androidforworkgmaileasconfiguration-create.md)|[androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md)|Create a new [androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md) object.|
|[Get androidForWorkGmailEasConfiguration](../api/androidforworkgmaileasconfiguration-get.md)|[androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md)|Read the properties and relationships of an [androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md) object.|
|[Update androidForWorkGmailEasConfiguration](../api/androidforworkgmaileasconfiguration-update.md)|[androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md)|Update the properties of an [androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md) object.|
|[Delete androidForWorkGmailEasConfiguration](../api/androidforworkgmaileasconfiguration-delete.md)|None|Deletes an [androidForWorkGmailEasConfiguration](../resources/androidforworkgmaileasconfiguration.md) object.|
|[List assignments](../api/androidforworkgmaileasconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/androidforworkgmaileasconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/androidforworkgmaileasconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/androidforworkgmaileasconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/androidforworkgmaileasconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/androidforworkgmaileasconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/androidforworkgmaileasconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/androidforworkgmaileasconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/androidforworkgmaileasconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/androidforworkgmaileasconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List androidForWorkCertificateProfileBase](../api/androidforworkgmaileasconfiguration-list-identitycertificate.md)|[androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md) collection|Get the androidForWorkCertificateProfileBase resources from the identityCertificate navigation property.|
|[Add androidForWorkCertificateProfileBase](../api/androidforworkgmaileasconfiguration-post-identitycertificate.md)|[androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md)|Add identityCertificate by posting to the identityCertificate collection.|
|[List userStatuses](../api/androidforworkgmaileasconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/androidforworkgmaileasconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/androidforworkgmaileasconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/androidforworkgmaileasconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|easAuthenticationMethod|Authentication method for Exchange ActiveSync. Inherited from [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md). Possible values are: `usernameAndPassword`, `certificate`, `derivedCredential`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|durationOfEmailToSync|emailSyncDuration|Duration of time email should be synced to. Inherited from [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md). Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|emailAddressSource|userEmailSource|Email attribute that is picked from AAD and injected into this profile before installing on the device. Inherited from [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|hostName|String|Exchange location (URL) that the mail app connects to. Inherited from [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|requireSsl|Boolean|Indicates whether or not to use SSL. Inherited from [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|usernameSource|androidUsernameSource|Username attribute that is picked from AAD and injected into this profile before installing on the device. Inherited from [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md). Possible values are: `username`, `userPrincipalName`, `samAccountName`, `primarySmtpAddress`.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[androidForWorkCertificateProfileBase](../resources/androidforworkcertificateprofilebase.md)|Identity certificate. Inherited from [androidForWorkEasEmailProfileBase](../resources/androidforworkeasemailprofilebase.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidForWorkGmailEasConfiguration",
  "baseType": "microsoft.graph.androidForWorkEasEmailProfileBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidForWorkGmailEasConfiguration",
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
  "authenticationMethod": "String",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "hostName": "String",
  "requireSsl": "Boolean",
  "usernameSource": "String"
}
```

