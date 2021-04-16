---
title: "Get androidWorkProfileGeneralDeviceConfiguration"
description: "Read the properties and relationships of an androidWorkProfileGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get androidWorkProfileGeneralDeviceConfiguration
Namespace: microsoft.graph



Read the properties and relationships of an [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.androidWorkProfileGeneralDeviceConfiguration not found
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

If successful, this method returns a `200 OK` response code and an [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androidworkprofilegeneraldeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.androidWorkProfileGeneralDeviceConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidWorkProfileGeneralDeviceConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration",
    "id": "0eee7a3d-7a3d-0eee-3d7a-ee0e3d7aee0e",
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
    "workProfileAllowAppInstallsFromUnknownSources": "Boolean",
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

