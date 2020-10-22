---
title: "Update androidGeneralDeviceConfiguration"
description: "Update the properties of an androidGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidGeneralDeviceConfiguration
Namespace: microsoft.graph

Update the properties of an [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH ** Entity URI for microsoft.graph.androidGeneralDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md) object.

The following table shows the properties that are required when you create the [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|appsBlockClipboardSharing|Boolean|**TODO: Add Description**|
|appsBlockCopyPaste|Boolean|**TODO: Add Description**|
|appsBlockYouTube|Boolean|**TODO: Add Description**|
|bluetoothBlocked|Boolean|**TODO: Add Description**|
|cameraBlocked|Boolean|**TODO: Add Description**|
|cellularBlockDataRoaming|Boolean|**TODO: Add Description**|
|cellularBlockMessaging|Boolean|**TODO: Add Description**|
|cellularBlockVoiceRoaming|Boolean|**TODO: Add Description**|
|cellularBlockWiFiTethering|Boolean|**TODO: Add Description**|
|compliantAppsList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|compliantAppListType|appListType|**TODO: Add Description**. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|diagnosticDataBlockSubmission|Boolean|**TODO: Add Description**|
|locationServicesBlocked|Boolean|**TODO: Add Description**|
|googleAccountBlockAutoSync|Boolean|**TODO: Add Description**|
|googlePlayStoreBlocked|Boolean|**TODO: Add Description**|
|kioskModeBlockSleepButton|Boolean|**TODO: Add Description**|
|kioskModeBlockVolumeButtons|Boolean|**TODO: Add Description**|
|dateAndTimeBlockChanges|Boolean|**TODO: Add Description**|
|kioskModeApps|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|nfcBlocked|Boolean|**TODO: Add Description**|
|passwordBlockFingerprintUnlock|Boolean|**TODO: Add Description**|
|passwordBlockTrustAgents|Boolean|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|passwordRequiredType|androidRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `numeric`, `numericComplex`, `any`.|
|requiredPasswordComplexity|androidRequiredPasswordComplexity|**TODO: Add Description**. Possible values are: `none`, `low`, `medium`, `high`.|
|passwordRequired|Boolean|**TODO: Add Description**|
|powerOffBlocked|Boolean|**TODO: Add Description**|
|factoryResetBlocked|Boolean|**TODO: Add Description**|
|screenCaptureBlocked|Boolean|**TODO: Add Description**|
|deviceSharingAllowed|Boolean|**TODO: Add Description**|
|storageBlockGoogleBackup|Boolean|**TODO: Add Description**|
|storageBlockRemovableStorage|Boolean|**TODO: Add Description**|
|storageRequireDeviceEncryption|Boolean|**TODO: Add Description**|
|storageRequireRemovableStorageEncryption|Boolean|**TODO: Add Description**|
|voiceAssistantBlocked|Boolean|**TODO: Add Description**|
|voiceDialingBlocked|Boolean|**TODO: Add Description**|
|webBrowserBlockPopups|Boolean|**TODO: Add Description**|
|webBrowserBlockAutofill|Boolean|**TODO: Add Description**|
|webBrowserBlockJavaScript|Boolean|**TODO: Add Description**|
|webBrowserBlocked|Boolean|**TODO: Add Description**|
|webBrowserCookieSettings|webBrowserCookieSettings|**TODO: Add Description**. Possible values are: `browserDefault`, `blockAlways`, `allowCurrentWebSite`, `allowFromWebsitesVisited`, `allowAlways`.|
|wiFiBlocked|Boolean|**TODO: Add Description**|
|appsInstallAllowList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|appsLaunchBlockList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|appsHideList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|securityRequireVerifyApps|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androidgeneraldeviceconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.androidGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 2998

{
  "@odata.type": "#microsoft.graph.androidGeneralDeviceConfiguration",
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
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "appsBlockClipboardSharing": "Boolean",
  "appsBlockCopyPaste": "Boolean",
  "appsBlockYouTube": "Boolean",
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockDataRoaming": "Boolean",
  "cellularBlockMessaging": "Boolean",
  "cellularBlockVoiceRoaming": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "compliantAppListType": "String",
  "diagnosticDataBlockSubmission": "Boolean",
  "locationServicesBlocked": "Boolean",
  "googleAccountBlockAutoSync": "Boolean",
  "googlePlayStoreBlocked": "Boolean",
  "kioskModeBlockSleepButton": "Boolean",
  "kioskModeBlockVolumeButtons": "Boolean",
  "dateAndTimeBlockChanges": "Boolean",
  "kioskModeApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "nfcBlocked": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockTrustAgents": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "passwordRequiredType": "String",
  "requiredPasswordComplexity": "String",
  "passwordRequired": "Boolean",
  "powerOffBlocked": "Boolean",
  "factoryResetBlocked": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "deviceSharingAllowed": "Boolean",
  "storageBlockGoogleBackup": "Boolean",
  "storageBlockRemovableStorage": "Boolean",
  "storageRequireDeviceEncryption": "Boolean",
  "storageRequireRemovableStorageEncryption": "Boolean",
  "voiceAssistantBlocked": "Boolean",
  "voiceDialingBlocked": "Boolean",
  "webBrowserBlockPopups": "Boolean",
  "webBrowserBlockAutofill": "Boolean",
  "webBrowserBlockJavaScript": "Boolean",
  "webBrowserBlocked": "Boolean",
  "webBrowserCookieSettings": "String",
  "wiFiBlocked": "Boolean",
  "appsInstallAllowList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsLaunchBlockList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsHideList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "securityRequireVerifyApps": "Boolean"
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
  "@odata.type": "#microsoft.graph.androidGeneralDeviceConfiguration",
  "id": "0616d37e-d37e-0616-7ed3-16067ed31606",
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
  "appsBlockClipboardSharing": "Boolean",
  "appsBlockCopyPaste": "Boolean",
  "appsBlockYouTube": "Boolean",
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockDataRoaming": "Boolean",
  "cellularBlockMessaging": "Boolean",
  "cellularBlockVoiceRoaming": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "compliantAppListType": "String",
  "diagnosticDataBlockSubmission": "Boolean",
  "locationServicesBlocked": "Boolean",
  "googleAccountBlockAutoSync": "Boolean",
  "googlePlayStoreBlocked": "Boolean",
  "kioskModeBlockSleepButton": "Boolean",
  "kioskModeBlockVolumeButtons": "Boolean",
  "dateAndTimeBlockChanges": "Boolean",
  "kioskModeApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "nfcBlocked": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockTrustAgents": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "passwordRequiredType": "String",
  "requiredPasswordComplexity": "String",
  "passwordRequired": "Boolean",
  "powerOffBlocked": "Boolean",
  "factoryResetBlocked": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "deviceSharingAllowed": "Boolean",
  "storageBlockGoogleBackup": "Boolean",
  "storageBlockRemovableStorage": "Boolean",
  "storageRequireDeviceEncryption": "Boolean",
  "storageRequireRemovableStorageEncryption": "Boolean",
  "voiceAssistantBlocked": "Boolean",
  "voiceDialingBlocked": "Boolean",
  "webBrowserBlockPopups": "Boolean",
  "webBrowserBlockAutofill": "Boolean",
  "webBrowserBlockJavaScript": "Boolean",
  "webBrowserBlocked": "Boolean",
  "webBrowserCookieSettings": "String",
  "wiFiBlocked": "Boolean",
  "appsInstallAllowList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsLaunchBlockList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsHideList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "securityRequireVerifyApps": "Boolean"
}
```

