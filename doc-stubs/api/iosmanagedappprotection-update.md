---
title: "Update iosManagedAppProtection"
description: "Update the properties of an iosManagedAppProtection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosManagedAppProtection
Namespace: microsoft.graph



Update the properties of an [iosManagedAppProtection](../resources/iosmanagedappprotection.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /deviceAppManagement/iosManagedAppProtections/{iosManagedAppProtectionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosManagedAppProtection](../resources/iosmanagedappprotection.md) object.

The following table shows the properties that are required when you update the [iosManagedAppProtection](../resources/iosmanagedappprotection.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the policy was created. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|description|String|The policy's description. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|displayName|String|Policy display name. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|lastModifiedDateTime|DateTimeOffset|Last time the policy was modified. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|version|String|Version of the entity. Inherited from [managedAppPolicy](../resources/managedapppolicy.md)|
|allowedDataIngestionLocations|managedAppDataIngestionLocation collection|Data storage locations where a user may store managed data. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `oneDriveForBusiness`, `sharePoint`, `camera`.|
|allowedDataStorageLocations|managedAppDataStorageLocation collection|Data storage locations where a user may store managed data. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `oneDriveForBusiness`, `sharePoint`, `box`, `localStorage`.|
|allowedInboundDataTransferSources|managedAppDataTransferLevel|Sources from which data is allowed to be transferred. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `none`.|
|allowedOutboundClipboardSharingExceptionLength|Int32|Specify the number of characters that may be cut or copied from Org data and accounts to any application. This setting overrides the AllowedOutboundClipboardSharingLevel restriction. Default value of '0' means no exception is allowed. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|allowedOutboundClipboardSharingLevel|managedAppClipboardSharingLevel|The level to which the clipboard may be shared between apps on the managed device. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedAppsWithPasteIn`, `managedApps`, `blocked`.|
|allowedOutboundDataTransferDestinations|managedAppDataTransferLevel|Destinations to which data is allowed to be transferred. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `none`.|
|appActionIfDeviceComplianceRequired|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, when the device is either rooted or jailbroken, if DeviceComplianceRequired is set to true. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|appActionIfMaximumPinRetriesExceeded|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, based on maximum number of incorrect pin retry attempts. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|appActionIfUnableToAuthenticateUser|managedAppRemediationAction|If set, it will specify what action to take in the case where the user is unable to checkin because their authentication token is invalid. This happens when the user is deleted or disabled in AAD. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `block`, `wipe`, `warn`.|
|blockDataIngestionIntoOrganizationDocuments|Boolean|Indicates whether a user can bring data into org documents. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|contactSyncBlocked|Boolean|Indicates whether contacts can be synced to the user's device. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|dataBackupBlocked|Boolean|Indicates whether the backup of a managed app's data is blocked. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|deviceComplianceRequired|Boolean|Indicates whether device compliance is required. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|dialerRestrictionLevel|managedAppPhoneNumberRedirectLevel|The classes of dialer apps that are allowed to click-to-open a phone number. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `allApps`, `managedApps`, `customApp`, `blocked`.|
|disableAppPinIfDevicePinIsSet|Boolean|Indicates whether use of the app pin is required if the device pin is set. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|fingerprintBlocked|Boolean|Indicates whether use of the fingerprint reader is allowed in place of a pin if PinRequired is set to True. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|managedBrowser|managedBrowserType|Indicates in which managed browser(s) that internet links should be opened. When this property is configured, ManagedBrowserToOpenLinksRequired should be true. Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `notConfigured`, `microsoftEdge`.|
|managedBrowserToOpenLinksRequired|Boolean|Indicates whether internet links should be opened in the managed browser app, or any custom browser specified by CustomBrowserProtocol (for iOS) or CustomBrowserPackageId/CustomBrowserDisplayName (for Android) Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumAllowedDeviceThreatLevel|managedAppDeviceThreatLevel|Maximum allowed device threat level, as reported by the MTD app Inherited from [managedAppProtection](../resources/managedappprotection.md). Possible values are: `notConfigured`, `secured`, `low`, `medium`, `high`.|
|maximumPinRetries|Int32|Maximum number of incorrect pin retry attempts before the managed app is either blocked or wiped. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumRequiredOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumWarningOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|maximumWipeOsVersion|String|Versions bigger than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumPinLength|Int32|Minimum pin length required for an app-level pin if PinRequired is set to True Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumRequiredAppVersion|String|Versions less than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumRequiredOsVersion|String|Versions less than the specified version will block the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWarningAppVersion|String|Versions less than the specified version will result in warning message on the managed app. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWarningOsVersion|String|Versions less than the specified version will result in warning message on the managed app from accessing company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWipeAppVersion|String|Versions less than or equal to the specified version will wipe the managed app and the associated company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|minimumWipeOsVersion|String|Versions less than or equal to the specified version will wipe the managed app and the associated company data. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
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
|saveAsBlocked|Boolean|Indicates whether users may use the "Save As" menu item to save a copy of protected files. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|simplePinBlocked|Boolean|Indicates whether simplePin is blocked. Inherited from [managedAppProtection](../resources/managedappprotection.md)|
|isAssigned|Boolean|Indicates if the policy is deployed to any inclusion groups or not. Inherited from [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md)|
|targetedAppManagementLevels|appManagementLevel|The intended app management levels for this policy Inherited from [targetedManagedAppProtection](../resources/targetedmanagedappprotection.md). Possible values are: `unspecified`, `unmanaged`, `mdm`, `androidEnterprise`.|
|allowedIosDeviceModels|String|Semicolon seperated list of device models allowed, as a string, for the managed app to work.|
|appActionIfIosDeviceModelNotAllowed|managedAppRemediationAction|Defines a managed app behavior, either block or wipe, if the specified device model is not allowed. Possible values are: `block`, `wipe`, `warn`.|
|appDataEncryptionType|managedAppDataEncryptionType|Type of encryption which should be used for data in a managed app. Possible values are: `useDeviceSettings`, `afterDeviceRestart`, `whenDeviceLockedExceptOpenFiles`, `whenDeviceLocked`.|
|customBrowserProtocol|String|A custom browser protocol to open weblink on iOS. When this property is configured, ManagedBrowserToOpenLinksRequired should be true.|
|customDialerAppProtocol|String|Protocol of a custom dialer app to click-to-open a phone number on iOS, for example, skype:.|
|deployedAppCount|Int32|Count of apps to which the current policy is deployed.|
|disableProtectionOfManagedOutboundOpenInData|Boolean|Disable protection of data transferred to other apps through IOS OpenIn option. This setting is only allowed to be True when AllowedOutboundDataTransferDestinations is set to ManagedApps.|
|exemptedAppProtocols|[keyValuePair](../resources/keyvaluepair.md) collection|Apps in this list will be exempt from the policy and will be able to receive data from managed apps.|
|faceIdBlocked|Boolean|Indicates whether use of the FaceID is allowed in place of a pin if PinRequired is set to True.|
|filterOpenInToOnlyManagedApps|Boolean|Defines if open-in operation is supported from the managed app to the filesharing locations selected. This setting only applies when AllowedOutboundDataTransferDestinations is set to ManagedApps and DisableProtectionOfManagedOutboundOpenInData is set to False.|
|minimumRequiredSdkVersion|String|Versions less than the specified version will block the managed app from accessing company data.|
|minimumWipeSdkVersion|String|Versions less than the specified version will block the managed app from accessing company data.|
|protectInboundDataFromUnknownSources|Boolean|Protect incoming data from unknown source. This setting is only allowed to be True when AllowedInboundDataTransferSources is set to AllApps.|
|thirdPartyKeyboardsBlocked|Boolean|Defines if third party keyboards are allowed while accessing a managed app|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosManagedAppProtection](../resources/iosmanagedappprotection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosmanagedappprotection"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/iosManagedAppProtections/{iosManagedAppProtectionId}
Content-Type: application/json
Content-length: 2895

{
  "@odata.type": "#microsoft.graph.iosManagedAppProtection",
  "description": "String",
  "displayName": "String",
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
  "allowedIosDeviceModels": "String",
  "appActionIfIosDeviceModelNotAllowed": "String",
  "appDataEncryptionType": "String",
  "customBrowserProtocol": "String",
  "customDialerAppProtocol": "String",
  "deployedAppCount": "Integer",
  "disableProtectionOfManagedOutboundOpenInData": "Boolean",
  "exemptedAppProtocols": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "faceIdBlocked": "Boolean",
  "filterOpenInToOnlyManagedApps": "Boolean",
  "minimumRequiredSdkVersion": "String",
  "minimumWipeSdkVersion": "String",
  "protectInboundDataFromUnknownSources": "Boolean",
  "thirdPartyKeyboardsBlocked": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosManagedAppProtection",
  "id": "b1bba315-a315-b1bb-15a3-bbb115a3bbb1",
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
  "allowedIosDeviceModels": "String",
  "appActionIfIosDeviceModelNotAllowed": "String",
  "appDataEncryptionType": "String",
  "customBrowserProtocol": "String",
  "customDialerAppProtocol": "String",
  "deployedAppCount": "Integer",
  "disableProtectionOfManagedOutboundOpenInData": "Boolean",
  "exemptedAppProtocols": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "faceIdBlocked": "Boolean",
  "filterOpenInToOnlyManagedApps": "Boolean",
  "minimumRequiredSdkVersion": "String",
  "minimumWipeSdkVersion": "String",
  "protectInboundDataFromUnknownSources": "Boolean",
  "thirdPartyKeyboardsBlocked": "Boolean"
}
```

