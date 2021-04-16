---
title: "androidManagedAppProtection resource type"
description: "Policy used to configure detailed management settings targeted to specific security groups and for a specified set of apps on an Android device"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidManagedAppProtection resource type

Namespace: microsoft.graph



Policy used to configure detailed management settings targeted to specific security groups and for a specified set of apps on an Android device


Inherits from [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidManagedAppProtections](../api/androidmanagedappprotection-list.md)|[androidManagedAppProtection](../resources/androidmanagedappprotection.md) collection|Get a list of the [androidManagedAppProtection](../resources/androidmanagedappprotection.md) objects and their properties.|
|[Create androidManagedAppProtection](../api/androidmanagedappprotection-create.md)|[androidManagedAppProtection](../resources/androidmanagedappprotection.md)|Create a new [androidManagedAppProtection](../resources/androidmanagedappprotection.md) object.|
|[Get androidManagedAppProtection](../api/androidmanagedappprotection-get.md)|[androidManagedAppProtection](../resources/androidmanagedappprotection.md)|Read the properties and relationships of an [androidManagedAppProtection](../resources/androidmanagedappprotection.md) object.|
|[Update androidManagedAppProtection](../api/androidmanagedappprotection-update.md)|[androidManagedAppProtection](../resources/androidmanagedappprotection.md)|Update the properties of an [androidManagedAppProtection](../resources/androidmanagedappprotection.md) object.|
|[Delete androidManagedAppProtection](../api/androidmanagedappprotection-delete.md)|None|Deletes an [androidManagedAppProtection](../resources/androidmanagedappprotection.md) object.|
|[hasPayloadLinks](../api/androidmanagedappprotection-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/haspayloadlinkresultitem.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedAndroidDeviceManufacturers|String|Semicolon seperated list of device manufacturers allowed, as a string, for the managed app to work.|
|allowedAndroidDeviceModels|String collection|List of device models allowed, as a string, for the managed app to work.|
|allowedDataIngestionLocations|managedAppDataIngestionLocation collection|Data storage locations where a user may store managed data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|allowedDataStorageLocations|managedAppDataStorageLocation collection|Data storage locations where a user may store managed data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|allowedInboundDataTransferSources|managedAppDataTransferLevel|Sources from which data is allowed to be transferred. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `none`.|
|allowedOutboundClipboardSharingExceptionLength|Int32|Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|allowedOutboundClipboardSharingLevel|managedAppClipboardSharingLevel|The level to which the clipboard may be shared between apps on the managed device. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedAppsWithPasteIn`, `managedApps`, `blocked`.|
|allowedOutboundDataTransferDestinations|managedAppDataTransferLevel|Destinations to which data is allowed to be transferred. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `none`.|
|appActionIfAndroidDeviceManufacturerNotAllowed|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, if the specified device manufacturer is not allowed. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfAndroidDeviceModelNotAllowed|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, if the specified device model is not allowed. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfAndroidSafetyNetAppsVerificationFailed|managedAppRemediationAction|Defines a managed app behavior, either warn or block, if the specified Android App Verification requirement fails. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfAndroidSafetyNetDeviceAttestationFailed|managedAppRemediationAction|Defines a managed app behavior, either warn or block, if the specified Android SafetyNet Attestation requirement fails. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfDeviceComplianceRequired|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, when the device is either rooted or jailbroken, if DeviceComplianceRequired is set to true. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|appActionIfDeviceLockNotSet|managedAppRemediationAction|Defines a managed app behavior, either warn, block or wipe, if the screen lock is required on android device but is not set. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfMaximumPinRetriesExceeded|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, based on maximum number of incorrect pin retry attempts. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|appActionIfUnableToAuthenticateUser|managedAppRemediationAction|If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|approvedKeyboards|[keyValuePair](../resources/keyvaluepair.md) collection|If Keyboard Restriction is enabled, only keyboards in this approved list will be allowed. A key should be Android package id for a keyboard and value should be a friendly name|
|biometricAuthenticationBlocked|Boolean|Indicates whether use of the biometric authentication is allowed in place of a pin if PinRequired is set to True.|
|blockAfterCompanyPortalUpdateDeferralInDays|Int32|Maximum number of days Company Portal update can be deferred on the device or app access will be blocked.|
|blockDataIngestionIntoOrganizationDocuments|Boolean|Indicates whether a user can bring data into org documents. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|contactSyncBlocked|Boolean|Indicates whether contacts can be synced to the user's device. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|createdDateTime|DateTimeOffset|The date and time the policy was created. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|customBrowserDisplayName|String|Friendly name of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.|
|customBrowserPackageId|String|Unique identifier of the preferred custom browser to open weblink on Android. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.|
|customDialerAppDisplayName|String|Friendly name of a custom dialer app to click-to-open a phone number on Android.|
|customDialerAppPackageId|String|PackageId of a custom dialer app to click-to-open a phone number on Android.|
|dataBackupBlocked|Boolean|Indicates whether the backup of a managed app's data is blocked. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|deployedAppCount|Int32|Count of apps to which the current policy is deployed.|
|description|String|The policy's description. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|deviceComplianceRequired|Boolean|Indicates whether device compliance is required. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|deviceLockRequired|Boolean|Defines if any kind of lock must be required on android device|
|dialerRestrictionLevel|managedAppPhoneNumberRedirectLevel|The classes of dialer apps that are allowed to click-to-open a phone number. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `customApp`, `blocked`.|
|disableAppEncryptionIfDeviceEncryptionIsEnabled|Boolean|When this setting is enabled, app level encryption is disabled if device level encryption is enabled|
|disableAppPinIfDevicePinIsSet|Boolean|Indicates whether use of the app pin is required if the device pin is set. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|displayName|String|Policy display name. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|encryptAppData|Boolean|Indicates whether application data for managed apps should be encrypted|
|exemptedAppPackages|[keyValuePair](../resources/keyvaluepair.md) collection|App packages in this list will be exempt from the policy and will be able to receive data from managed apps.|
|fingerprintBlocked|Boolean|Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isAssigned|Boolean|Indicates if the policy is deployed to any inclusion groups or not. Inherited from [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md)|
|keyboardsRestricted|Boolean|Indicates if keyboard restriction is enabled. If enabled list of approved keyboards must be provided as well.|
|lastModifiedDateTime|DateTimeOffset|Last time the policy was modified. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|managedBrowser|managedBrowserType|Indicates in which managed browser(s) that internet links should be opened. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `notConfigured`, `microsoftEdge`.|
|managedBrowserToOpenLinksRequired|Boolean|Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android) Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumAllowedDeviceThreatLevel|managedAppDeviceThreatLevel|Maximum allowed device threat level, as reported by the MTD app Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `notConfigured`, `secured`, `low`, `medium`, `high`.|
|maximumPinRetries|Int32|Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumRequiredOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumWarningOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumWipeOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumPinLength|Int32|Minimum pin length required for an app-level pin if PinRequired is set to True Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumRequiredAppVersion|String|Versions less than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumRequiredCompanyPortalVersion|String|Minimum version of the Company portal that must be installed on the device or app access will be blocked|
|minimumRequiredOsVersion|String|Versions less than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumRequiredPatchVersion|String|Define the oldest required Android security patch level a user can have to gain secure access to the app.|
|minimumWarningAppVersion|String|Versions less than the specified version will result in warning message on the managed app. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWarningCompanyPortalVersion|String|Minimum version of the Company portal that must be installed on the device or the user will receive a warning|
|minimumWarningOsVersion|String|Versions less than the specified version will result in warning message on the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWarningPatchVersion|String|Define the oldest recommended Android security patch level a user can have for secure access to the app.|
|minimumWipeAppVersion|String|Versions less than or equal to the specified version will wipe the managed app and the associated company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWipeCompanyPortalVersion|String|Minimum version of the Company portal that must be installed on the device or the company data on the app will be wiped|
|minimumWipeOsVersion|String|Versions less than or equal to the specified version will wipe the managed app and the associated company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWipePatchVersion|String|Android security patch level  less than or equal to the specified value will wipe the managed app and the associated company data.|
|mobileThreatDefenseRemediationAction|managedAppRemediationAction|Determines what action to take if the mobile threat defense threat threshold isn't met. Warn isn't a supported value for this property Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|notificationRestriction|managedAppNotificationRestriction|Specify app notification restriction Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allow`, `blockOrganizationalData`, `block`.|
|organizationalCredentialsRequired|Boolean|Indicates whether organizational credentials are required for app use. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|periodBeforePinReset|Duration|TimePeriod before the all-level pin must be reset if PinRequired is set to True. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|periodOfflineBeforeAccessCheck|Duration|The period after which access is checked when the device is not connected to the internet. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|periodOfflineBeforeWipeIsEnforced|Duration|The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|periodOnlineBeforeAccessCheck|Duration|The period after which access is checked when the device is connected to the internet. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|pinCharacterSet|managedAppPinCharacterSet|Character set which may be used for an app-level pin if PinRequired is set to True. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `numeric`, `alphanumericAndSymbol`.|
|pinRequired|Boolean|Indicates whether an app-level pin is required. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|pinRequiredInsteadOfBiometricTimeout|Duration|Timeout in minutes for an app pin instead of non biometrics passcode Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|previousPinBlockCount|Int32|Requires a pin to be unique from the number specified in this property. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|printBlocked|Boolean|Indicates whether printing is allowed from managed apps. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|requiredAndroidSafetyNetAppsVerificationType|androidManagedAppSafetyNetAppsVerificationType|Defines the Android SafetyNet Apps Verification requirement for a managed app to work. Possible values are: `none`, `enabled`.|
|requiredAndroidSafetyNetDeviceAttestationType|androidManagedAppSafetyNetDeviceAttestationType|Defines the Android SafetyNet Device Attestation requirement for a managed app to work. Possible values are: `none`, `basicIntegrity`, `basicIntegrityAndDeviceCertification`.|
|requiredAndroidSafetyNetEvaluationType|androidManagedAppSafetyNetEvaluationType|Defines the Android SafetyNet evaluation type requirement for a managed app to work. Possible values are: `basic`, `hardwareBacked`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|saveAsBlocked|Boolean|Indicates whether users may use the "Save As" menu item to save a copy of protected files. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|screenCaptureBlocked|Boolean|Indicates whether a managed user can take screen captures of managed apps|
|simplePinBlocked|Boolean|Indicates whether simplePin is blocked. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|targetedAppManagementLevels|appManagementLevel|The intended app management levels for this policy Inherited from [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md). Possible values are: `unspecified`, `unmanaged`, `mdm`, `androidEnterprise`.|
|version|String|Version of the entity. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|warnAfterCompanyPortalUpdateDeferralInDays|Int32|Maximum number of days Company Portal update can be deferred on the device or the user will receive the warning|
|wipeAfterCompanyPortalUpdateDeferralInDays|Int32|Maximum number of days Company Portal update can be deferred on the device or the company data on the app will be wiped|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|apps|[managedMobileApp](../resources/managedmobileapp.md) collection|List of apps to which the policy is deployed.|
|assignments|[targetedManagedAppPolicyAssignment](../resources/targetedmanagedapppolicyassignment.md) collection|Navigation property to list of inclusion and exclusion groups to which the policy is deployed. Inherited from [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md)|
|deploymentSummary|[managedAppPolicyDeploymentSummary](../resources/managedapppolicydeploymentsummary.md)|Navigation property to deployment summary of the configuration.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidManagedAppProtection",
  "baseType": "microsoft.graph.targetedManagedAppProtection",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidManagedAppProtection",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String",
  "allowedDataIngestionLocations": [
    "String"
  ],
  "allowedDataStorageLocations": [
    "String"
  ],
  "allowedInboundDataTransferSources": "String",
  "allowedOutboundClipboardSharingExceptionLength": "Integer",
  "allowedOutboundClipboardSharingLevel": "String",
  "allowedOutboundDataTransferDestinations": "String",
  "appActionIfDeviceComplianceRequired": "String",
  "appActionIfMaximumPinRetriesExceeded": "String",
  "appActionIfUnableToAuthenticateUser": "String",
  "blockDataIngestionIntoOrganizationDocuments": "Boolean",
  "contactSyncBlocked": "Boolean",
  "dataBackupBlocked": "Boolean",
  "deviceComplianceRequired": "Boolean",
  "dialerRestrictionLevel": "String",
  "disableAppPinIfDevicePinIsSet": "Boolean",
  "fingerprintBlocked": "Boolean",
  "managedBrowser": "String",
  "managedBrowserToOpenLinksRequired": "Boolean",
  "maximumAllowedDeviceThreatLevel": "String",
  "maximumPinRetries": "Integer",
  "maximumRequiredOsVersion": "String",
  "maximumWarningOsVersion": "String",
  "maximumWipeOsVersion": "String",
  "minimumPinLength": "Integer",
  "minimumRequiredAppVersion": "String",
  "minimumRequiredOsVersion": "String",
  "minimumWarningAppVersion": "String",
  "minimumWarningOsVersion": "String",
  "minimumWipeAppVersion": "String",
  "minimumWipeOsVersion": "String",
  "mobileThreatDefenseRemediationAction": "String",
  "notificationRestriction": "String",
  "organizationalCredentialsRequired": "Boolean",
  "periodBeforePinReset": "String (duration)",
  "periodOfflineBeforeAccessCheck": "String (duration)",
  "periodOfflineBeforeWipeIsEnforced": "String (duration)",
  "periodOnlineBeforeAccessCheck": "String (duration)",
  "pinCharacterSet": "String",
  "pinRequired": "Boolean",
  "pinRequiredInsteadOfBiometricTimeout": "String (duration)",
  "previousPinBlockCount": "Integer",
  "printBlocked": "Boolean",
  "saveAsBlocked": "Boolean",
  "simplePinBlocked": "Boolean",
  "isAssigned": "Boolean",
  "targetedAppManagementLevels": "String",
  "allowedAndroidDeviceManufacturers": "String",
  "allowedAndroidDeviceModels": [
    "String"
  ],
  "appActionIfAndroidDeviceManufacturerNotAllowed": "String",
  "appActionIfAndroidDeviceModelNotAllowed": "String",
  "appActionIfAndroidSafetyNetAppsVerificationFailed": "String",
  "appActionIfAndroidSafetyNetDeviceAttestationFailed": "String",
  "appActionIfDeviceLockNotSet": "String",
  "approvedKeyboards": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "biometricAuthenticationBlocked": "Boolean",
  "blockAfterCompanyPortalUpdateDeferralInDays": "Integer",
  "customBrowserDisplayName": "String",
  "customBrowserPackageId": "String",
  "customDialerAppDisplayName": "String",
  "customDialerAppPackageId": "String",
  "deployedAppCount": "Integer",
  "deviceLockRequired": "Boolean",
  "disableAppEncryptionIfDeviceEncryptionIsEnabled": "Boolean",
  "encryptAppData": "Boolean",
  "exemptedAppPackages": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "keyboardsRestricted": "Boolean",
  "minimumRequiredCompanyPortalVersion": "String",
  "minimumRequiredPatchVersion": "String",
  "minimumWarningCompanyPortalVersion": "String",
  "minimumWarningPatchVersion": "String",
  "minimumWipeCompanyPortalVersion": "String",
  "minimumWipePatchVersion": "String",
  "requiredAndroidSafetyNetAppsVerificationType": "String",
  "requiredAndroidSafetyNetDeviceAttestationType": "String",
  "requiredAndroidSafetyNetEvaluationType": "String",
  "screenCaptureBlocked": "Boolean",
  "warnAfterCompanyPortalUpdateDeferralInDays": "Integer",
  "wipeAfterCompanyPortalUpdateDeferralInDays": "Integer"
}
```

