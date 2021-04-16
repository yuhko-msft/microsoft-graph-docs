---
title: "Get macOSGeneralDeviceConfiguration"
description: "Read the properties and relationships of a macOSGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get macOSGeneralDeviceConfiguration
Namespace: microsoft.graph



Read the properties and relationships of a [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.macOSGeneralDeviceConfiguration not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [macOSGeneralDeviceConfiguration](../resources/macosgeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_macosgeneraldeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSGeneralDeviceConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOSGeneralDeviceConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

