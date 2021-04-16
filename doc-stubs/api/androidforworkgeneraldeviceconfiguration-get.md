---
title: "Get androidForWorkGeneralDeviceConfiguration"
description: "Read the properties and relationships of an androidForWorkGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get androidForWorkGeneralDeviceConfiguration
Namespace: microsoft.graph



Read the properties and relationships of an [androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.androidForWorkGeneralDeviceConfiguration not found
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

If successful, this method returns a `200 OK` response code and an [androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androidforworkgeneraldeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.androidForWorkGeneralDeviceConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidForWorkGeneralDeviceConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.androidForWorkGeneralDeviceConfiguration",
    "id": "96d7db5a-db5a-96d7-5adb-d7965adbd796",
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
    "passwordBlockFaceUnlock": "Boolean",
    "passwordBlockFingerprintUnlock": "Boolean",
    "passwordBlockIrisUnlock": "Boolean",
    "passwordBlockTrustAgents": "Boolean",
    "passwordExpirationDays": "Integer",
    "passwordMinimumLength": "Integer",
    "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
    "passwordPreviousPasswordBlockCount": "Integer",
    "passwordRequiredType": "String",
    "passwordSignInFailureCountBeforeFactoryReset": "Integer",
    "securityRequireVerifyApps": "Boolean",
    "vpnAlwaysOnPackageIdentifier": "String",
    "vpnEnableAlwaysOnLockdownMode": "Boolean",
    "workProfileAllowWidgets": "Boolean",
    "workProfileBlockAddingAccounts": "Boolean",
    "workProfileBlockCamera": "Boolean",
    "workProfileBlockCrossProfileCallerId": "Boolean",
    "workProfileBlockCrossProfileContactsSearch": "Boolean",
    "workProfileBlockCrossProfileCopyPaste": "Boolean",
    "workProfileBlockNotificationsWhileDeviceLocked": "Boolean",
    "workProfileBlockPersonalAppInstallsFromUnknownSources": "Boolean",
    "workProfileBlockScreenCapture": "Boolean",
    "workProfileBluetoothEnableContactSharing": "Boolean",
    "workProfileDataSharingType": "String",
    "workProfileDefaultAppPermissionPolicy": "String",
    "workProfilePasswordBlockFaceUnlock": "Boolean",
    "workProfilePasswordBlockFingerprintUnlock": "Boolean",
    "workProfilePasswordBlockIrisUnlock": "Boolean",
    "workProfilePasswordBlockTrustAgents": "Boolean",
    "workProfilePasswordExpirationDays": "Integer",
    "workProfilePasswordMinimumLength": "Integer",
    "workProfilePasswordMinLetterCharacters": "Integer",
    "workProfilePasswordMinLowerCaseCharacters": "Integer",
    "workProfilePasswordMinNonLetterCharacters": "Integer",
    "workProfilePasswordMinNumericCharacters": "Integer",
    "workProfilePasswordMinSymbolCharacters": "Integer",
    "workProfilePasswordMinUpperCaseCharacters": "Integer",
    "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout": "Integer",
    "workProfilePasswordPreviousPasswordBlockCount": "Integer",
    "workProfilePasswordRequiredType": "String",
    "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer",
    "workProfileRequirePassword": "Boolean"
  }
}
```

