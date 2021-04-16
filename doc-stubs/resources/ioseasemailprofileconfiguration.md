---
title: "iosEasEmailProfileConfiguration resource type"
description: "By providing configurations in this profile you can instruct the native email client on iOS devices to communicate with an Exchange server and get email, contacts, calendar, reminders, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosEasEmailProfileConfiguration resource type

Namespace: microsoft.graph



By providing configurations in this profile you can instruct the native email client on iOS devices to communicate with an Exchange server and get email, contacts, calendar, reminders, and notes. Furthermore, you can also specify how much email to sync and how often the device should sync.


Inherits from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosEasEmailProfileConfigurations](../api/ioseasemailprofileconfiguration-list.md)|[iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) collection|Get a list of the [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) objects and their properties.|
|[Create iosEasEmailProfileConfiguration](../api/ioseasemailprofileconfiguration-create.md)|[iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md)|Create a new [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.|
|[Get iosEasEmailProfileConfiguration](../api/ioseasemailprofileconfiguration-get.md)|[iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md)|Read the properties and relationships of an [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.|
|[Update iosEasEmailProfileConfiguration](../api/ioseasemailprofileconfiguration-update.md)|[iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md)|Update the properties of an [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.|
|[Delete iosEasEmailProfileConfiguration](../api/ioseasemailprofileconfiguration-delete.md)|None|Deletes an [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.|
|[List assignments](../api/ioseasemailprofileconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/ioseasemailprofileconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceManagementDerivedCredentialSettings](../api/ioseasemailprofileconfiguration-list-derivedcredentialsettings.md)|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md) collection|Get the deviceManagementDerivedCredentialSettings resources from the derivedCredentialSettings navigation property.|
|[Add deviceManagementDerivedCredentialSettings](../api/ioseasemailprofileconfiguration-post-derivedcredentialsettings.md)|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md)|Add derivedCredentialSettings by posting to the derivedCredentialSettings collection.|
|[List deviceSettingStateSummaries](../api/ioseasemailprofileconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/ioseasemailprofileconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/ioseasemailprofileconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/ioseasemailprofileconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/ioseasemailprofileconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/ioseasemailprofileconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/ioseasemailprofileconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/ioseasemailprofileconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List iosCertificateProfileBase](../api/ioseasemailprofileconfiguration-list-identitycertificate.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md) collection|Get the iosCertificateProfileBase resources from the identityCertificate navigation property.|
|[Add iosCertificateProfileBase](../api/ioseasemailprofileconfiguration-post-identitycertificate.md)|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|Add identityCertificate by posting to the identityCertificate collection.|
|[List iosCertificateProfile](../api/ioseasemailprofileconfiguration-list-smimeencryptioncertificate.md)|[iosCertificateProfile](../resources/ioscertificateprofile.md) collection|Get the iosCertificateProfile resources from the smimeEncryptionCertificate navigation property.|
|[Add iosCertificateProfile](../api/ioseasemailprofileconfiguration-post-smimeencryptioncertificate.md)|[iosCertificateProfile](../resources/ioscertificateprofile.md)|Add smimeEncryptionCertificate by posting to the smimeEncryptionCertificate collection.|
|[List iosCertificateProfile](../api/ioseasemailprofileconfiguration-list-smimesigningcertificate.md)|[iosCertificateProfile](../resources/ioscertificateprofile.md) collection|Get the iosCertificateProfile resources from the smimeSigningCertificate navigation property.|
|[Add iosCertificateProfile](../api/ioseasemailprofileconfiguration-post-smimesigningcertificate.md)|[iosCertificateProfile](../resources/ioscertificateprofile.md)|Add smimeSigningCertificate by posting to the smimeSigningCertificate collection.|
|[List userStatuses](../api/ioseasemailprofileconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/ioseasemailprofileconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/ioseasemailprofileconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/ioseasemailprofileconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountName|String|Account name.|
|authenticationMethod|easAuthenticationMethod|Authentication method for this Email profile. Possible values are: `usernameAndPassword`, `certificate`, `derivedCredential`.|
|blockMovingMessagesToOtherEmailAccounts|Boolean|Indicates whether or not to block moving messages to other email accounts.|
|blockSendingEmailFromThirdPartyApps|Boolean|Indicates whether or not to block sending email from third party apps.|
|blockSyncingRecentlyUsedEmailAddresses|Boolean|Indicates whether or not to block syncing recently used email addresses, for instance - when composing new email.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|customDomainName|String|Custom domain name value used while generating an email profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|durationOfEmailToSync|emailSyncDuration|Duration of time email should be synced back to. . Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|easServices|easServices|Exchange data to sync. Possible values are: `none`, `calendars`, `contacts`, `email`, `notes`, `reminders`.|
|easServicesUserOverrideEnabled|Boolean|Allow users to change sync settings.|
|emailAddressSource|userEmailSource|Email attribute that is picked from AAD and injected into this profile before installing on the device. Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|encryptionCertificateType|emailCertificateType|Encryption Certificate type for this Email profile. Possible values are: `none`, `certificate`, `derivedCredential`.|
|hostName|String|Exchange location that (URL) that the native mail app connects to.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|perAppVPNProfileId|String|Profile ID of the Per-App VPN policy to be used to access emails from the native Mail client|
|requireSmime|Boolean|Indicates whether or not to use S/MIME certificate.|
|requireSsl|Boolean|Indicates whether or not to use SSL.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|signingCertificateType|emailCertificateType|Signing Certificate type for this Email profile. Possible values are: `none`, `certificate`, `derivedCredential`.|
|smimeEnablePerMessageSwitch|Boolean|Indicates whether or not to allow unencrypted emails.|
|smimeEncryptByDefaultEnabled|Boolean|If set to true S/MIME encryption is enabled by default.|
|smimeEncryptByDefaultUserOverrideEnabled|Boolean|If set to true, the user can toggle the encryption by default setting.|
|smimeEncryptionCertificateUserOverrideEnabled|Boolean|If set to true the user can select the S/MIME encryption identity. |
|smimeSigningCertificateUserOverrideEnabled|Boolean|If set to true, the user can select the signing identity.|
|smimeSigningEnabled|Boolean|If set to true S/MIME signing is enabled for this account|
|smimeSigningUserOverrideEnabled|Boolean|If set to true, the user can toggle S/MIME signing on or off.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|useOAuth|Boolean|Specifies whether the connection should use OAuth for authentication.|
|userDomainNameSource|domainNameSource|UserDomainname attribute that is picked from AAD and injected into this profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `fullDomainName`, `netBiosDomainName`.|
|usernameAADSource|usernameSource|Name of the AAD field, that will be used to retrieve UserName for email profile. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`, `samAccountName`.|
|usernameSource|userEmailSource|Username attribute that is picked from AAD and injected into this profile before installing on the device. Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|derivedCredentialSettings|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md)|Tenant level settings for the Derived Credentials to be used for authentication.|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|Identity certificate.|
|smimeEncryptionCertificate|[iosCertificateProfile](../resources/ioscertificateprofile.md)|S/MIME encryption certificate.|
|smimeSigningCertificate|[iosCertificateProfile](../resources/ioscertificateprofile.md)|S/MIME signing certificate.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosEasEmailProfileConfiguration",
  "baseType": "microsoft.graph.easEmailProfileConfigurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosEasEmailProfileConfiguration",
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
  "authenticationMethod": "String",
  "blockMovingMessagesToOtherEmailAccounts": "Boolean",
  "blockSendingEmailFromThirdPartyApps": "Boolean",
  "blockSyncingRecentlyUsedEmailAddresses": "Boolean",
  "durationOfEmailToSync": "String",
  "easServices": "String",
  "easServicesUserOverrideEnabled": "Boolean",
  "emailAddressSource": "String",
  "encryptionCertificateType": "String",
  "hostName": "String",
  "perAppVPNProfileId": "String",
  "requireSmime": "Boolean",
  "requireSsl": "Boolean",
  "signingCertificateType": "String",
  "smimeEnablePerMessageSwitch": "Boolean",
  "smimeEncryptByDefaultEnabled": "Boolean",
  "smimeEncryptByDefaultUserOverrideEnabled": "Boolean",
  "smimeEncryptionCertificateUserOverrideEnabled": "Boolean",
  "smimeSigningCertificateUserOverrideEnabled": "Boolean",
  "smimeSigningEnabled": "Boolean",
  "smimeSigningUserOverrideEnabled": "Boolean",
  "useOAuth": "Boolean"
}
```

