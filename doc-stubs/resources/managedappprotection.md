---
title: "managedAppProtection resource type"
description: "Policy used to configure detailed management settings for a specified set of apps"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedAppProtection resource type

Namespace: microsoft.graph



Policy used to configure detailed management settings for a specified set of apps


Inherits from [managedAppPolicy](../resources/managedapppolicy.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedAppProtections](../api/managedappprotection-list.md)|[managedAppProtection](../resources/managedappprotection.md) collection|Get a list of the [managedAppProtection](../resources/managedappprotection.md) objects and their properties.|
|[Create managedAppProtection](../api/managedappprotection-create.md)|[managedAppProtection](../resources/managedappprotection.md)|Create a new [managedAppProtection](../resources/managedappprotection.md) object.|
|[Get managedAppProtection](../api/managedappprotection-get.md)|[managedAppProtection](../resources/managedappprotection.md)|Read the properties and relationships of a [managedAppProtection](../resources/managedappprotection.md) object.|
|[Update managedAppProtection](../api/managedappprotection-update.md)|[managedAppProtection](../resources/managedappprotection.md)|Update the properties of a [managedAppProtection](../resources/managedappprotection.md) object.|
|[Delete managedAppProtection](../api/managedappprotection-delete.md)|None|Deletes a [managedAppProtection](../resources/managedappprotection.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowedDataIngestionLocations|managedAppDataIngestionLocation collection|Data storage locations where a user may store managed data.|
|allowedDataStorageLocations|managedAppDataStorageLocation collection|Data storage locations where a user may store managed data.|
|allowedInboundDataTransferSources|managedAppDataTransferLevel|Sources from which data is allowed to be transferred. Possible values are: `allApps`, `managedApps`, `none`.|
|allowedOutboundClipboardSharingExceptionLength|Int32|Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed.|
|allowedOutboundClipboardSharingLevel|managedAppClipboardSharingLevel|The level to which the clipboard may be shared between apps on the managed device. Possible values are: `allApps`, `managedAppsWithPasteIn`, `managedApps`, `blocked`.|
|allowedOutboundDataTransferDestinations|managedAppDataTransferLevel|Destinations to which data is allowed to be transferred. Possible values are: `allApps`, `managedApps`, `none`.|
|appActionIfDeviceComplianceRequired|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, when the device is either rooted or jailbroken, if DeviceComplianceRequired is set to true. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfMaximumPinRetriesExceeded|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, based on maximum number of incorrect pin retry attempts. Possible values are: `block`, `wipe`, `warn`.|
|appActionIfUnableToAuthenticateUser|managedAppRemediationAction|If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Possible values are: `block`, `wipe`, `warn`.|
|blockDataIngestionIntoOrganizationDocuments|Boolean|Indicates whether a user can bring data into org documents.|
|contactSyncBlocked|Boolean|Indicates whether contacts can be synced to the user's device.|
|createdDateTime|DateTimeOffset|The date and time the policy was created. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|dataBackupBlocked|Boolean|Indicates whether the backup of a managed app's data is blocked.|
|description|String|The policy's description. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|deviceComplianceRequired|Boolean|Indicates whether device compliance is required.|
|dialerRestrictionLevel|managedAppPhoneNumberRedirectLevel|The classes of dialer apps that are allowed to click-to-open a phone number. Possible values are: `allApps`, `managedApps`, `customApp`, `blocked`.|
|disableAppPinIfDevicePinIsSet|Boolean|Indicates whether use of the app pin is required if the device pin is set.|
|displayName|String|Policy display name. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|fingerprintBlocked|Boolean|Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|Last time the policy was modified. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|managedBrowser|managedBrowserType|Indicates in which managed browser(s) that internet links should be opened. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. Possible values are: `notConfigured`, `microsoftEdge`.|
|managedBrowserToOpenLinksRequired|Boolean|Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android)|
|maximumAllowedDeviceThreatLevel|managedAppDeviceThreatLevel|Maximum allowed device threat level, as reported by the MTD app. Possible values are: `notConfigured`, `secured`, `low`, `medium`, `high`.|
|maximumPinRetries|Int32|Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped.|
|maximumRequiredOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data.|
|maximumWarningOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data.|
|maximumWipeOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data.|
|minimumPinLength|Int32|Minimum pin length required for an app-level pin if PinRequired is set to True|
|minimumRequiredAppVersion|String|Versions less than the specified version will block the managed app from accessing company data.|
|minimumRequiredOsVersion|String|Versions less than the specified version will block the managed app from accessing company data.|
|minimumWarningAppVersion|String|Versions less than the specified version will result in warning message on the managed app.|
|minimumWarningOsVersion|String|Versions less than the specified version will result in warning message on the managed app from accessing company data.|
|minimumWipeAppVersion|String|Versions less than or equal to the specified version will wipe the managed app and the associated company data.|
|minimumWipeOsVersion|String|Versions less than or equal to the specified version will wipe the managed app and the associated company data.|
|mobileThreatDefenseRemediationAction|managedAppRemediationAction|Determines what action to take if the mobile threat defense threat threshold isn't met. Warn isn't a supported value for this property. Possible values are: `block`, `wipe`, `warn`.|
|notificationRestriction|managedAppNotificationRestriction|Specify app notification restriction. Possible values are: `allow`, `blockOrganizationalData`, `block`.|
|organizationalCredentialsRequired|Boolean|Indicates whether organizational credentials are required for app use.|
|periodBeforePinReset|Duration|TimePeriod before the all-level pin must be reset if PinRequired is set to True.|
|periodOfflineBeforeAccessCheck|Duration|The period after which access is checked when the device is not connected to the internet.|
|periodOfflineBeforeWipeIsEnforced|Duration|The amount of time an app is allowed to remain disconnected from the internet before all managed data it is wiped.|
|periodOnlineBeforeAccessCheck|Duration|The period after which access is checked when the device is connected to the internet.|
|pinCharacterSet|managedAppPinCharacterSet|Character set which may be used for an app-level pin if PinRequired is set to True. Possible values are: `numeric`, `alphanumericAndSymbol`.|
|pinRequired|Boolean|Indicates whether an app-level pin is required.|
|pinRequiredInsteadOfBiometricTimeout|Duration|Timeout in minutes for an app pin instead of non biometrics passcode|
|previousPinBlockCount|Int32|Requires a pin to be unique from the number specified in this property.|
|printBlocked|Boolean|Indicates whether printing is allowed from managed apps.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|saveAsBlocked|Boolean|Indicates whether users may use the "Save As" menu item to save a copy of protected files.|
|simplePinBlocked|Boolean|Indicates whether simplePin is blocked.|
|version|String|Version of the entity. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedAppProtection",
  "baseType": "microsoft.graph.managedAppPolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedAppProtection",
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
  "simplePinBlocked": "Boolean"
}
```

