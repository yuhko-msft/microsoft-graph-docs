---
title: "Update androidWorkProfileGeneralDeviceConfiguration"
description: "Update the properties of an androidWorkProfileGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidWorkProfileGeneralDeviceConfiguration
Namespace: microsoft.graph

Update the properties of an [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.androidWorkProfileGeneralDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object.

The following table shows the properties that are required when you create the [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md).

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
|passwordBlockFaceUnlock|Boolean|**TODO: Add Description**|
|passwordBlockFingerprintUnlock|Boolean|**TODO: Add Description**|
|passwordBlockIrisUnlock|Boolean|**TODO: Add Description**|
|passwordBlockTrustAgents|Boolean|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|passwordRequiredType|androidWorkProfileRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `lowSecurityBiometric`, `required`, `atLeastNumeric`, `numericComplex`, `atLeastAlphabetic`, `atLeastAlphanumeric`, `alphanumericWithSymbols`.|
|workProfileDataSharingType|androidWorkProfileCrossProfileDataSharingType|**TODO: Add Description**. Possible values are: `deviceDefault`, `preventAny`, `allowPersonalToWork`, `noRestrictions`.|
|workProfileBlockNotificationsWhileDeviceLocked|Boolean|**TODO: Add Description**|
|workProfileBlockAddingAccounts|Boolean|**TODO: Add Description**|
|workProfileBluetoothEnableContactSharing|Boolean|**TODO: Add Description**|
|workProfileBlockScreenCapture|Boolean|**TODO: Add Description**|
|workProfileBlockCrossProfileCallerId|Boolean|**TODO: Add Description**|
|workProfileBlockCamera|Boolean|**TODO: Add Description**|
|workProfileBlockCrossProfileContactsSearch|Boolean|**TODO: Add Description**|
|workProfileBlockCrossProfileCopyPaste|Boolean|**TODO: Add Description**|
|workProfileDefaultAppPermissionPolicy|androidWorkProfileDefaultAppPermissionPolicyType|**TODO: Add Description**. Possible values are: `deviceDefault`, `prompt`, `autoGrant`, `autoDeny`.|
|workProfilePasswordBlockFaceUnlock|Boolean|**TODO: Add Description**|
|workProfilePasswordBlockFingerprintUnlock|Boolean|**TODO: Add Description**|
|workProfilePasswordBlockIrisUnlock|Boolean|**TODO: Add Description**|
|workProfilePasswordBlockTrustAgents|Boolean|**TODO: Add Description**|
|workProfilePasswordExpirationDays|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumLength|Int32|**TODO: Add Description**|
|workProfilePasswordMinNumericCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinNonLetterCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinLetterCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinLowerCaseCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinUpperCaseCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinSymbolCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|workProfilePasswordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|workProfilePasswordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|workProfilePasswordRequiredType|androidWorkProfileRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `lowSecurityBiometric`, `required`, `atLeastNumeric`, `numericComplex`, `atLeastAlphabetic`, `atLeastAlphanumeric`, `alphanumericWithSymbols`.|
|workProfileRequirePassword|Boolean|**TODO: Add Description**|
|securityRequireVerifyApps|Boolean|**TODO: Add Description**|
|vpnAlwaysOnPackageIdentifier|String|**TODO: Add Description**|
|vpnEnableAlwaysOnLockdownMode|Boolean|**TODO: Add Description**|
|workProfileAllowWidgets|Boolean|**TODO: Add Description**|
|workProfileBlockPersonalAppInstallsFromUnknownSources|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androidworkprofilegeneraldeviceconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.androidWorkProfileGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 2864

{
  "@odata.type": "#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration",
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
  "passwordBlockFaceUnlock": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockIrisUnlock": "Boolean",
  "passwordBlockTrustAgents": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "passwordRequiredType": "String",
  "workProfileDataSharingType": "String",
  "workProfileBlockNotificationsWhileDeviceLocked": "Boolean",
  "workProfileBlockAddingAccounts": "Boolean",
  "workProfileBluetoothEnableContactSharing": "Boolean",
  "workProfileBlockScreenCapture": "Boolean",
  "workProfileBlockCrossProfileCallerId": "Boolean",
  "workProfileBlockCamera": "Boolean",
  "workProfileBlockCrossProfileContactsSearch": "Boolean",
  "workProfileBlockCrossProfileCopyPaste": "Boolean",
  "workProfileDefaultAppPermissionPolicy": "String",
  "workProfilePasswordBlockFaceUnlock": "Boolean",
  "workProfilePasswordBlockFingerprintUnlock": "Boolean",
  "workProfilePasswordBlockIrisUnlock": "Boolean",
  "workProfilePasswordBlockTrustAgents": "Boolean",
  "workProfilePasswordExpirationDays": "Integer",
  "workProfilePasswordMinimumLength": "Integer",
  "workProfilePasswordMinNumericCharacters": "Integer",
  "workProfilePasswordMinNonLetterCharacters": "Integer",
  "workProfilePasswordMinLetterCharacters": "Integer",
  "workProfilePasswordMinLowerCaseCharacters": "Integer",
  "workProfilePasswordMinUpperCaseCharacters": "Integer",
  "workProfilePasswordMinSymbolCharacters": "Integer",
  "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "workProfilePasswordPreviousPasswordBlockCount": "Integer",
  "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer",
  "workProfilePasswordRequiredType": "String",
  "workProfileRequirePassword": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "vpnAlwaysOnPackageIdentifier": "String",
  "vpnEnableAlwaysOnLockdownMode": "Boolean",
  "workProfileAllowWidgets": "Boolean",
  "workProfileBlockPersonalAppInstallsFromUnknownSources": "Boolean"
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
  "@odata.type": "#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration",
  "id": "4ef91aef-1aef-4ef9-ef1a-f94eef1af94e",
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
  "passwordBlockFaceUnlock": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockIrisUnlock": "Boolean",
  "passwordBlockTrustAgents": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "passwordRequiredType": "String",
  "workProfileDataSharingType": "String",
  "workProfileBlockNotificationsWhileDeviceLocked": "Boolean",
  "workProfileBlockAddingAccounts": "Boolean",
  "workProfileBluetoothEnableContactSharing": "Boolean",
  "workProfileBlockScreenCapture": "Boolean",
  "workProfileBlockCrossProfileCallerId": "Boolean",
  "workProfileBlockCamera": "Boolean",
  "workProfileBlockCrossProfileContactsSearch": "Boolean",
  "workProfileBlockCrossProfileCopyPaste": "Boolean",
  "workProfileDefaultAppPermissionPolicy": "String",
  "workProfilePasswordBlockFaceUnlock": "Boolean",
  "workProfilePasswordBlockFingerprintUnlock": "Boolean",
  "workProfilePasswordBlockIrisUnlock": "Boolean",
  "workProfilePasswordBlockTrustAgents": "Boolean",
  "workProfilePasswordExpirationDays": "Integer",
  "workProfilePasswordMinimumLength": "Integer",
  "workProfilePasswordMinNumericCharacters": "Integer",
  "workProfilePasswordMinNonLetterCharacters": "Integer",
  "workProfilePasswordMinLetterCharacters": "Integer",
  "workProfilePasswordMinLowerCaseCharacters": "Integer",
  "workProfilePasswordMinUpperCaseCharacters": "Integer",
  "workProfilePasswordMinSymbolCharacters": "Integer",
  "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "workProfilePasswordPreviousPasswordBlockCount": "Integer",
  "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer",
  "workProfilePasswordRequiredType": "String",
  "workProfileRequirePassword": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "vpnAlwaysOnPackageIdentifier": "String",
  "vpnEnableAlwaysOnLockdownMode": "Boolean",
  "workProfileAllowWidgets": "Boolean",
  "workProfileBlockPersonalAppInstallsFromUnknownSources": "Boolean"
}
```

