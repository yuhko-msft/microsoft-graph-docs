---
title: "macOSGeneralDeviceConfiguration resource type"
description: "This topic provides descriptions of the declared methods, properties and relationships exposed by the macOSGeneralDeviceConfiguration resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSGeneralDeviceConfiguration resource type

Namespace: microsoft.graph



This topic provides descriptions of the declared methods, properties and relationships exposed by the macOSGeneralDeviceConfiguration resource.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSGeneralDeviceConfigurations](../api/macosgeneraldeviceconfiguration-list.md)|[macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) collection|Get a list of the [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) objects and their properties.|
|[Create macOSGeneralDeviceConfiguration](../api/macosgeneraldeviceconfiguration-create.md)|[macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md)|Create a new [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object.|
|[Get macOSGeneralDeviceConfiguration](../api/macosgeneraldeviceconfiguration-get.md)|[macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md)|Read the properties and relationships of a [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object.|
|[Update macOSGeneralDeviceConfiguration](../api/macosgeneraldeviceconfiguration-update.md)|[macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md)|Update the properties of a [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object.|
|[Delete macOSGeneralDeviceConfiguration](../api/macosgeneraldeviceconfiguration-delete.md)|None|Deletes a [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
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
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|definitionLookupBlocked|Boolean|Indicates whether or not to block definition lookup.|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iTunesBlockFileSharing|Boolean|Indicates whether or not to block files from being transferred using iTunes.|
|iTunesBlockMusicService|Boolean|Indicates whether or not to block Music service and revert Music app to classic mode.|
|keyboardBlockDictation|Boolean|Indicates whether or not to block the user from using dictation input.|
|keychainBlockCloudSync|Boolean|Indicates whether or not iCloud keychain synchronization is blocked (macOS 10.12 and later).|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
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
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|safariBlockAutofill|Boolean|Indicates whether or not to block the user from using Auto fill in Safari.|
|screenCaptureBlocked|Boolean|Indicates whether or not to block the user from taking Screenshots.|
|softwareUpdatesEnforcedDelayInDays|Int32|Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90|
|spotlightBlockInternetResults|Boolean|Indicates whether or not to block Spotlight from returning any results from an Internet search.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|updateDelayPolicy|macOSSoftwareUpdateDelayPolicy|Determines whether to delay OS and/or app updates for macOS. Possible values are: `none`, `delayOSUpdateVisibility`, `delayAppUpdateVisibility`.|
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
  "@odata.type": "microsoft.graph.macOSGeneralDeviceConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSGeneralDeviceConfiguration",
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

