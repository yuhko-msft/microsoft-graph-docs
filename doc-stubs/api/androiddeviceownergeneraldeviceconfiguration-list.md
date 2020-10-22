---
title: "List androidDeviceOwnerGeneralDeviceConfigurations"
description: "Get a list of the androidDeviceOwnerGeneralDeviceConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List androidDeviceOwnerGeneralDeviceConfigurations
Namespace: microsoft.graph

Get a list of the [androidDeviceOwnerGeneralDeviceConfiguration](../resources/androiddeviceownergeneraldeviceconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [androidDeviceOwnerGeneralDeviceConfiguration](../resources/androiddeviceownergeneraldeviceconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androiddeviceownergeneraldeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration",
      "id": "0a652f70-2f70-0a65-702f-650a702f650a",
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
      "accountsBlockModification": "Boolean",
      "appsAllowInstallFromUnknownSources": "Boolean",
      "appsAutoUpdatePolicy": "String",
      "appsDefaultPermissionPolicy": "String",
      "appsRecommendSkippingFirstUseHints": "Boolean",
      "bluetoothBlockConfiguration": "Boolean",
      "bluetoothBlockContactSharing": "Boolean",
      "cameraBlocked": "Boolean",
      "cellularBlockWiFiTethering": "Boolean",
      "certificateCredentialConfigurationDisabled": "Boolean",
      "microsoftLauncherConfigurationEnabled": "Boolean",
      "microsoftLauncherCustomWallpaperEnabled": "Boolean",
      "microsoftLauncherCustomWallpaperImageUrl": "String",
      "microsoftLauncherCustomWallpaperAllowUserModification": "Boolean",
      "microsoftLauncherFeedEnabled": "Boolean",
      "microsoftLauncherFeedAllowUserModification": "Boolean",
      "microsoftLauncherDockPresenceConfiguration": "String",
      "microsoftLauncherDockPresenceAllowUserModification": "Boolean",
      "microsoftLauncherSearchBarPlacementConfiguration": "String",
      "enrollmentProfile": "String",
      "dataRoamingBlocked": "Boolean",
      "dateTimeConfigurationBlocked": "Boolean",
      "factoryResetDeviceAdministratorEmails": [
        "String"
      ],
      "factoryResetBlocked": "Boolean",
      "globalProxy": {
        "@odata.type": "microsoft.graph.androidDeviceOwnerGlobalProxy"
      },
      "googleAccountsBlocked": "Boolean",
      "kioskModeScreenSaverConfigurationEnabled": "Boolean",
      "kioskModeScreenSaverImageUrl": "String",
      "kioskModeScreenSaverDisplayTimeInSeconds": "Integer",
      "kioskModeScreenSaverStartDelayInSeconds": "Integer",
      "kioskModeScreenSaverDetectMediaDisabled": "Boolean",
      "kioskModeApps": [
        {
          "@odata.type": "microsoft.graph.appListItem"
        }
      ],
      "kioskModeWallpaperUrl": "String",
      "kioskModeExitCode": "String",
      "kioskModeVirtualHomeButtonEnabled": "Boolean",
      "kioskModeVirtualHomeButtonType": "String",
      "kioskModeBluetoothConfigurationEnabled": "Boolean",
      "kioskModeWiFiConfigurationEnabled": "Boolean",
      "kioskModeFlashlightConfigurationEnabled": "Boolean",
      "kioskModeMediaVolumeConfigurationEnabled": "Boolean",
      "kioskModeShowDeviceInfo": "Boolean",
      "kioskModeManagedSettingsEntryDisabled": "Boolean",
      "kioskModeDebugMenuEasyAccessEnabled": "Boolean",
      "kioskModeShowAppNotificationBadge": "Boolean",
      "kioskModeScreenOrientation": "String",
      "kioskModeIconSize": "String",
      "kioskModeFolderIcon": "String",
      "kioskModeWifiAllowedSsids": [
        "String"
      ],
      "microphoneForceMute": "Boolean",
      "networkEscapeHatchAllowed": "Boolean",
      "nfcBlockOutgoingBeam": "Boolean",
      "passwordBlockKeyguard": "Boolean",
      "passwordBlockKeyguardFeatures": [
        "String"
      ],
      "passwordExpirationDays": "Integer",
      "passwordMinimumLength": "Integer",
      "passwordMinimumLetterCharacters": "Integer",
      "passwordMinimumLowerCaseCharacters": "Integer",
      "passwordMinimumNonLetterCharacters": "Integer",
      "passwordMinimumNumericCharacters": "Integer",
      "passwordMinimumSymbolCharacters": "Integer",
      "passwordMinimumUpperCaseCharacters": "Integer",
      "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
      "passwordPreviousPasswordCountToBlock": "Integer",
      "passwordRequiredType": "String",
      "passwordSignInFailureCountBeforeFactoryReset": "Integer",
      "playStoreMode": "String",
      "safeBootBlocked": "Boolean",
      "screenCaptureBlocked": "Boolean",
      "securityAllowDebuggingFeatures": "Boolean",
      "securityRequireVerifyApps": "Boolean",
      "statusBarBlocked": "Boolean",
      "stayOnModes": [
        "String"
      ],
      "storageAllowUsb": "Boolean",
      "storageBlockExternalMedia": "Boolean",
      "storageBlockUsbFileTransfer": "Boolean",
      "systemUpdateWindowStartMinutesAfterMidnight": "Integer",
      "systemUpdateWindowEndMinutesAfterMidnight": "Integer",
      "systemUpdateInstallType": "String",
      "systemWindowsBlocked": "Boolean",
      "usersBlockAdd": "Boolean",
      "usersBlockRemove": "Boolean",
      "volumeBlockAdjustment": "Boolean",
      "vpnAlwaysOnLockdownMode": "Boolean",
      "vpnAlwaysOnPackageIdentifier": "String",
      "wifiBlockEditConfigurations": "Boolean",
      "wifiBlockEditPolicyDefinedConfigurations": "Boolean",
      "personalProfileAppsAllowInstallFromUnknownSources": "Boolean",
      "personalProfileCameraBlocked": "Boolean",
      "personalProfileScreenCaptureBlocked": "Boolean",
      "workProfilePasswordExpirationDays": "Integer",
      "workProfilePasswordMinimumLength": "Integer",
      "workProfilePasswordMinimumNumericCharacters": "Integer",
      "workProfilePasswordMinimumNonLetterCharacters": "Integer",
      "workProfilePasswordMinimumLetterCharacters": "Integer",
      "workProfilePasswordMinimumLowerCaseCharacters": "Integer",
      "workProfilePasswordMinimumUpperCaseCharacters": "Integer",
      "workProfilePasswordMinimumSymbolCharacters": "Integer",
      "workProfilePasswordPreviousPasswordCountToBlock": "Integer",
      "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer",
      "workProfilePasswordRequiredType": "String"
    }
  ]
}
```

