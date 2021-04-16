---
title: "List androidGeneralDeviceConfigurations"
description: "Get a list of the androidGeneralDeviceConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List androidGeneralDeviceConfigurations
Namespace: microsoft.graph



Get a list of the [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.androidGeneralDeviceConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_androidgeneraldeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidGeneralDeviceConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.androidGeneralDeviceConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.androidGeneralDeviceConfiguration",
      "id": "cecfc858-c858-cecf-58c8-cfce58c8cfce",
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
      "appsBlockClipboardSharing": "Boolean",
      "appsBlockCopyPaste": "Boolean",
      "appsBlockYouTube": "Boolean",
      "appsHideList": [
        {
          "@odata.type": "microsoft.graph.appListItem"
        }
      ],
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
      "bluetoothBlocked": "Boolean",
      "cameraBlocked": "Boolean",
      "cellularBlockDataRoaming": "Boolean",
      "cellularBlockMessaging": "Boolean",
      "cellularBlockVoiceRoaming": "Boolean",
      "cellularBlockWiFiTethering": "Boolean",
      "compliantAppListType": "String",
      "compliantAppsList": [
        {
          "@odata.type": "microsoft.graph.appListItem"
        }
      ],
      "dateAndTimeBlockChanges": "Boolean",
      "deviceSharingAllowed": "Boolean",
      "diagnosticDataBlockSubmission": "Boolean",
      "factoryResetBlocked": "Boolean",
      "googleAccountBlockAutoSync": "Boolean",
      "googlePlayStoreBlocked": "Boolean",
      "kioskModeApps": [
        {
          "@odata.type": "microsoft.graph.appListItem"
        }
      ],
      "kioskModeBlockSleepButton": "Boolean",
      "kioskModeBlockVolumeButtons": "Boolean",
      "locationServicesBlocked": "Boolean",
      "nfcBlocked": "Boolean",
      "passwordBlockFingerprintUnlock": "Boolean",
      "passwordBlockTrustAgents": "Boolean",
      "passwordExpirationDays": "Integer",
      "passwordMinimumLength": "Integer",
      "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
      "passwordPreviousPasswordBlockCount": "Integer",
      "passwordRequired": "Boolean",
      "passwordRequiredType": "String",
      "passwordSignInFailureCountBeforeFactoryReset": "Integer",
      "powerOffBlocked": "Boolean",
      "requiredPasswordComplexity": "String",
      "screenCaptureBlocked": "Boolean",
      "securityRequireVerifyApps": "Boolean",
      "storageBlockGoogleBackup": "Boolean",
      "storageBlockRemovableStorage": "Boolean",
      "storageRequireDeviceEncryption": "Boolean",
      "storageRequireRemovableStorageEncryption": "Boolean",
      "voiceAssistantBlocked": "Boolean",
      "voiceDialingBlocked": "Boolean",
      "webBrowserBlockAutofill": "Boolean",
      "webBrowserBlocked": "Boolean",
      "webBrowserBlockJavaScript": "Boolean",
      "webBrowserBlockPopups": "Boolean",
      "webBrowserCookieSettings": "String",
      "wiFiBlocked": "Boolean"
    }
  ]
}
```

