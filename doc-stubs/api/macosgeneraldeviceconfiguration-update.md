---
title: "Update macOSGeneralDeviceConfiguration"
description: "Update the properties of a macOSGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSGeneralDeviceConfiguration
Namespace: microsoft.graph



Update the properties of a [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.macOSGeneralDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object.

The following table shows the properties that are required when you update the [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|airDropBlocked|Boolean|Indicates whether or not to allow AirDrop.|
|airPrintBlocked|Boolean|Indicates whether or not AirPrint is blocked (macOS 10.12 and later).|
|airPrintBlockiBeaconDiscovery|Boolean|Indicates whether or not iBeacon discovery of AirPrint printers is blocked. This prevents spurious AirPrint Bluetooth beacons from phishing for network traffic (macOS 10.3 and later).|
|airPrintForceTrustedTLS|Boolean|Indicates if trusted certificates are required for TLS printing communication (macOS 10.13 and later).|
|appleWatchBlockAutoUnlock|Boolean|Indicates whether or to block users from unlocking their Mac with Apple Watch.|
|cameraBlocked|Boolean|Indicates whether or not to block the user from accessing the camera of the device.|
|classroomAppBlockRemoteScreenObservation|Boolean|Indicates whether or not to allow remote screen observation by Classroom app. Requires MDM enrollment via Apple School Manager or Apple Business Manager.|
|classroomAppForceUnpromptedScreenObservation|Boolean|Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting. Requires MDM enrollment via Apple School Manager or Apple Business Manager.|
|classroomForceAutomaticallyJoinClasses|Boolean|Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.|
|classroomForceRequestPermissionToLeaveClasses|Boolean|Indicates whether a student enrolled in an unmanaged course via Classroom will be required to request permission from the teacher when attempting to leave the course. Requires MDM enrollment via Apple School Manager or Apple Business Manager.|
|classroomForceUnpromptedAppAndDeviceLock|Boolean|Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Requires MDM enrollment via Apple School Manager or Apple Business Manager.|
|compliantAppListType|appListType|List that is in the CompliantAppsList. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|compliantAppsList|[appListItem](../resources/applistitem.md) collection|List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.|
|contentCachingBlocked|Boolean|Indicates whether or not to allow content caching.|
|definitionLookupBlocked|Boolean|Indicates whether or not to block definition lookup.|
|emailInDomainSuffixes|String collection|An email address lacking a suffix that matches any of these strings will be considered out-of-domain.|
|iCloudBlockActivityContinuation|Boolean|Indicates whether or not to block the user from continuing work that they started on a MacOS device on another iOS or MacOS device (MacOS 10.15 or later).|
|iCloudBlockAddressBook|Boolean|Indicates whether or not to block iCloud from syncing contacts.|
|iCloudBlockBookmarks|Boolean|Indicates whether or not to block iCloud from syncing bookmarks.|
|iCloudBlockCalendar|Boolean|Indicates whether or not to block iCloud from syncing calendars.|
|iCloudBlockDocumentSync|Boolean|Indicates whether or not to block iCloud document sync.|
|iCloudBlockMail|Boolean|Indicates whether or not to block iCloud from syncing mail.|
|iCloudBlockNotes|Boolean|Indicates whether or not to block iCloud from syncing notes.|
|iCloudBlockPhotoLibrary|Boolean|Indicates whether or not to block iCloud Photo Library.|
|iCloudBlockReminders|Boolean|Indicates whether or not to block iCloud from syncing reminders.|
|iTunesBlockFileSharing|Boolean|Indicates whether or not to block files from being transferred using iTunes.|
|iTunesBlockMusicService|Boolean|Indicates whether or not to block Music service and revert Music app to classic mode.|
|keyboardBlockDictation|Boolean|Indicates whether or not to block the user from using dictation input.|
|keychainBlockCloudSync|Boolean|Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).|
|passwordBlockAirDropSharing|Boolean|Indicates whether or not to block sharing passwords with the AirDrop passwords feature.|
|passwordBlockAutoFill|Boolean|Indicates whether or not to block the AutoFill Passwords feature.|
|passwordBlockFingerprintUnlock|Boolean|Indicates whether or not to block fingerprint unlock.|
|passwordBlockModification|Boolean|Indicates whether or not to allow passcode modification.|
|passwordBlockProximityRequests|Boolean|Indicates whether or not to block requesting passwords from nearby devices.|
|passwordBlockSimple|Boolean|Block simple passwords.|
|passwordExpirationDays|Int32|Number of days before the password expires.|
|passwordMaximumAttemptCount|Int32|The number of allowed failed attempts to enter the passcode at the device's lock screen. Valid values 2 to 11|
|passwordMinimumCharacterSetCount|Int32|Number of character sets a password must contain. Valid values 0 to 4|
|passwordMinimumLength|Int32|Minimum length of passwords.|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity required before a password is required.|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity required before the screen times out.|
|passwordMinutesUntilFailedLoginReset|Int32|The number of minutes before the login is reset after the maximum number of unsuccessful login attempts is reached.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block.|
|passwordRequired|Boolean|Whether or not to require a password.|
|passwordRequiredType|requiredPasswordType|Type of password that is required. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|privacyAccessControls|[macOSPrivacyAccessControlItem](../resources/macosprivacyaccesscontrolitem.md) collection|List of privacy preference policy controls. This collection can contain a maximum of 10000 elements.|
|safariBlockAutofill|Boolean|Indicates whether or not to block the user from using Auto fill in Safari.|
|screenCaptureBlocked|Boolean|Indicates whether or not to block the user from taking Screenshots.|
|softwareUpdatesEnforcedDelayInDays|Int32|Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90|
|spotlightBlockInternetResults|Boolean|Indicates whether or not to block Spotlight from returning any results from an Internet search.|
|updateDelayPolicy|macOSSoftwareUpdateDelayPolicy|Determines whether to delay OS and/or app updates for macOS. Possible values are: `none`, `delayOSUpdateVisibility`, `delayAppUpdateVisibility`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macosgeneraldeviceconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 3008

{
  "@odata.type": "#microsoft.graph.macOSGeneralDeviceConfiguration",
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
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "airDropBlocked": "Boolean",
  "airPrintBlocked": "Boolean",
  "airPrintBlockiBeaconDiscovery": "Boolean",
  "airPrintForceTrustedTLS": "Boolean",
  "appleWatchBlockAutoUnlock": "Boolean",
  "cameraBlocked": "Boolean",
  "classroomAppBlockRemoteScreenObservation": "Boolean",
  "classroomAppForceUnpromptedScreenObservation": "Boolean",
  "classroomForceAutomaticallyJoinClasses": "Boolean",
  "classroomForceRequestPermissionToLeaveClasses": "Boolean",
  "classroomForceUnpromptedAppAndDeviceLock": "Boolean",
  "compliantAppListType": "String",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "contentCachingBlocked": "Boolean",
  "definitionLookupBlocked": "Boolean",
  "emailInDomainSuffixes": [
    "String"
  ],
  "iCloudBlockActivityContinuation": "Boolean",
  "iCloudBlockAddressBook": "Boolean",
  "iCloudBlockBookmarks": "Boolean",
  "iCloudBlockCalendar": "Boolean",
  "iCloudBlockDocumentSync": "Boolean",
  "iCloudBlockMail": "Boolean",
  "iCloudBlockNotes": "Boolean",
  "iCloudBlockPhotoLibrary": "Boolean",
  "iCloudBlockReminders": "Boolean",
  "iTunesBlockFileSharing": "Boolean",
  "iTunesBlockMusicService": "Boolean",
  "keyboardBlockDictation": "Boolean",
  "keychainBlockCloudSync": "Boolean",
  "passwordBlockAirDropSharing": "Boolean",
  "passwordBlockAutoFill": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockModification": "Boolean",
  "passwordBlockProximityRequests": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMaximumAttemptCount": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordMinutesUntilFailedLoginReset": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "privacyAccessControls": [
    {
      "@odata.type": "microsoft.graph.macOSPrivacyAccessControlItem"
    }
  ],
  "safariBlockAutofill": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "softwareUpdatesEnforcedDelayInDays": "Integer",
  "spotlightBlockInternetResults": "Boolean",
  "updateDelayPolicy": "String"
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
  "@odata.type": "#microsoft.graph.macOSGeneralDeviceConfiguration",
  "id": "30388683-8683-3038-8386-383083863830",
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
  "airDropBlocked": "Boolean",
  "airPrintBlocked": "Boolean",
  "airPrintBlockiBeaconDiscovery": "Boolean",
  "airPrintForceTrustedTLS": "Boolean",
  "appleWatchBlockAutoUnlock": "Boolean",
  "cameraBlocked": "Boolean",
  "classroomAppBlockRemoteScreenObservation": "Boolean",
  "classroomAppForceUnpromptedScreenObservation": "Boolean",
  "classroomForceAutomaticallyJoinClasses": "Boolean",
  "classroomForceRequestPermissionToLeaveClasses": "Boolean",
  "classroomForceUnpromptedAppAndDeviceLock": "Boolean",
  "compliantAppListType": "String",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "contentCachingBlocked": "Boolean",
  "definitionLookupBlocked": "Boolean",
  "emailInDomainSuffixes": [
    "String"
  ],
  "iCloudBlockActivityContinuation": "Boolean",
  "iCloudBlockAddressBook": "Boolean",
  "iCloudBlockBookmarks": "Boolean",
  "iCloudBlockCalendar": "Boolean",
  "iCloudBlockDocumentSync": "Boolean",
  "iCloudBlockMail": "Boolean",
  "iCloudBlockNotes": "Boolean",
  "iCloudBlockPhotoLibrary": "Boolean",
  "iCloudBlockReminders": "Boolean",
  "iTunesBlockFileSharing": "Boolean",
  "iTunesBlockMusicService": "Boolean",
  "keyboardBlockDictation": "Boolean",
  "keychainBlockCloudSync": "Boolean",
  "passwordBlockAirDropSharing": "Boolean",
  "passwordBlockAutoFill": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockModification": "Boolean",
  "passwordBlockProximityRequests": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMaximumAttemptCount": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordMinutesUntilFailedLoginReset": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "privacyAccessControls": [
    {
      "@odata.type": "microsoft.graph.macOSPrivacyAccessControlItem"
    }
  ],
  "safariBlockAutofill": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "softwareUpdatesEnforcedDelayInDays": "Integer",
  "spotlightBlockInternetResults": "Boolean",
  "updateDelayPolicy": "String"
}
```

