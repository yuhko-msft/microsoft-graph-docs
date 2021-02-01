---
title: "iosEasEmailProfileConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosEasEmailProfileConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosEasEmailProfileConfigurations](../api/ioseasemailprofileconfiguration-list.md)|[iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) collection|Get a list of the [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) objects and their properties.|
|[Create iosEasEmailProfileConfiguration](../api/ioseasemailprofileconfiguration-create.md)|[iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md)|Create a new [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.|
|[Get iosEasEmailProfileConfiguration](../api/ioseasemailprofileconfiguration-get.md)|[iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md)|Read the properties and relationships of an [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.|
|[Update iosEasEmailProfileConfiguration](../api/ioseasemailprofileconfiguration-update.md)|[iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md)|Update the properties of an [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.|
|[Delete iosEasEmailProfileConfiguration](../api/ioseasemailprofileconfiguration-delete.md)|None|Deletes an [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountName|String|**TODO: Add Description**|
|authenticationMethod|easAuthenticationMethod|**TODO: Add Description**. Possible values are: `usernameAndPassword`, `certificate`, `derivedCredential`.|
|blockMovingMessagesToOtherEmailAccounts|Boolean|**TODO: Add Description**|
|blockSendingEmailFromThirdPartyApps|Boolean|**TODO: Add Description**|
|blockSyncingRecentlyUsedEmailAddresses|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|customDomainName|String|**TODO: Add Description** Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|durationOfEmailToSync|emailSyncDuration|**TODO: Add Description**. Possible values are: `userDefined`, `oneDay`, `threeDays`, `oneWeek`, `twoWeeks`, `oneMonth`, `unlimited`.|
|easServices|easServices|**TODO: Add Description**. Possible values are: `none`, `calendars`, `contacts`, `email`, `notes`, `reminders`.|
|easServicesUserOverrideEnabled|Boolean|**TODO: Add Description**|
|emailAddressSource|userEmailSource|**TODO: Add Description**. Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|encryptionCertificateType|emailCertificateType|**TODO: Add Description**. Possible values are: `none`, `certificate`, `derivedCredential`.|
|hostName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|perAppVPNProfileId|String|**TODO: Add Description**|
|requireSmime|Boolean|**TODO: Add Description**|
|requireSsl|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|signingCertificateType|emailCertificateType|**TODO: Add Description**. Possible values are: `none`, `certificate`, `derivedCredential`.|
|smimeEnablePerMessageSwitch|Boolean|**TODO: Add Description**|
|smimeEncryptByDefaultEnabled|Boolean|**TODO: Add Description**|
|smimeEncryptByDefaultUserOverrideEnabled|Boolean|**TODO: Add Description**|
|smimeEncryptionCertificateUserOverrideEnabled|Boolean|**TODO: Add Description**|
|smimeSigningCertificateUserOverrideEnabled|Boolean|**TODO: Add Description**|
|smimeSigningEnabled|Boolean|**TODO: Add Description**|
|smimeSigningUserOverrideEnabled|Boolean|**TODO: Add Description**|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|useOAuth|Boolean|**TODO: Add Description**|
|userDomainNameSource|domainNameSource|**TODO: Add Description** Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `fullDomainName`, `netBiosDomainName`.|
|usernameAADSource|usernameSource|**TODO: Add Description** Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`, `samAccountName`.|
|usernameSource|userEmailSource|**TODO: Add Description** Inherited from [easEmailProfileConfigurationBase](../resources/easemailprofileconfigurationbase.md). Possible values are: `userPrincipalName`, `primarySmtpAddress`.|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|derivedCredentialSettings|[deviceManagementDerivedCredentialSettings](../resources/intune-devicemanagementderivedcredentialsettings.md)|**TODO: Add Description**|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificate|[iosCertificateProfileBase](../resources/ioscertificateprofilebase.md)|**TODO: Add Description**|
|smimeEncryptionCertificate|[iosCertificateProfile](../resources/ioscertificateprofile.md)|**TODO: Add Description**|
|smimeSigningCertificate|[iosCertificateProfile](../resources/ioscertificateprofile.md)|**TODO: Add Description**|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

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
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "usernameSource": "String",
  "usernameAADSource": "String",
  "userDomainNameSource": "String",
  "customDomainName": "String",
  "accountName": "String",
  "authenticationMethod": "String",
  "blockMovingMessagesToOtherEmailAccounts": "Boolean",
  "blockSendingEmailFromThirdPartyApps": "Boolean",
  "blockSyncingRecentlyUsedEmailAddresses": "Boolean",
  "durationOfEmailToSync": "String",
  "emailAddressSource": "String",
  "easServices": "String",
  "easServicesUserOverrideEnabled": "Boolean",
  "hostName": "String",
  "requireSmime": "Boolean",
  "smimeEnablePerMessageSwitch": "Boolean",
  "smimeEncryptByDefaultEnabled": "Boolean",
  "smimeSigningEnabled": "Boolean",
  "smimeSigningUserOverrideEnabled": "Boolean",
  "smimeEncryptByDefaultUserOverrideEnabled": "Boolean",
  "smimeSigningCertificateUserOverrideEnabled": "Boolean",
  "smimeEncryptionCertificateUserOverrideEnabled": "Boolean",
  "requireSsl": "Boolean",
  "useOAuth": "Boolean",
  "signingCertificateType": "String",
  "encryptionCertificateType": "String",
  "perAppVPNProfileId": "String"
}
```

