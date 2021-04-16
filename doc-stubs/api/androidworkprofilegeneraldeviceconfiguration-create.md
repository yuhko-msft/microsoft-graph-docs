---
title: "Create androidWorkProfileGeneralDeviceConfiguration"
description: "Create a new androidWorkProfileGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidWorkProfileGeneralDeviceConfiguration
Namespace: microsoft.graph



Create a new [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.androidWorkProfileGeneralDeviceConfiguration not found
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
|passwordBlockFaceUnlock|Boolean|Indicates whether or not to block face unlock.|
|passwordBlockFingerprintUnlock|Boolean|Indicates whether or not to block fingerprint unlock.|
|passwordBlockIrisUnlock|Boolean|Indicates whether or not to block iris unlock.|
|passwordBlockTrustAgents|Boolean|Indicates whether or not to block Smart Lock and other trust agents.|
|passwordExpirationDays|Int32|Number of days before the password expires. Valid values 1 to 365|
|passwordMinimumLength|Int32|Minimum length of passwords. Valid values 4 to 16|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 0 to 24|
|passwordRequiredType|androidWorkProfileRequiredPasswordType|Type of password that is required. Possible values are: `deviceDefault`, `lowSecurityBiometric`, `required`, `atLeastNumeric`, `numericComplex`, `atLeastAlphabetic`, `atLeastAlphanumeric`, `alphanumericWithSymbols`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Number of sign in failures allowed before factory reset. Valid values 1 to 16|
|securityRequireVerifyApps|Boolean|Require the Android Verify apps feature is turned on.|
|vpnAlwaysOnPackageIdentifier|String|Enable lockdown mode for always-on VPN.|
|vpnEnableAlwaysOnLockdownMode|Boolean|Enable lockdown mode for always-on VPN.|
|workProfileAllowAppInstallsFromUnknownSources|Boolean|Indicates whether to allow installation of apps from unknown sources.|
|workProfileAllowWidgets|Boolean|Allow widgets from work profile apps.|
|workProfileBlockAddingAccounts|Boolean|Block users from adding/removing accounts in work profile.|
|workProfileBlockCamera|Boolean|Block work profile camera.|
|workProfileBlockCrossProfileCallerId|Boolean|Block display work profile caller ID in personal profile.|
|workProfileBlockCrossProfileContactsSearch|Boolean|Block work profile contacts availability in personal profile.|
|workProfileBlockCrossProfileCopyPaste|Boolean|Boolean that indicates if the setting disallow cross profile copy/paste is enabled.|
|workProfileBlockNotificationsWhileDeviceLocked|Boolean|Indicates whether or not to block notifications while device locked.|
|workProfileBlockPersonalAppInstallsFromUnknownSources|Boolean|Prevent app installations from unknown sources in the personal profile.|
|workProfileBlockScreenCapture|Boolean|Block screen capture in work profile.|
|workProfileBluetoothEnableContactSharing|Boolean|Allow bluetooth devices to access enterprise contacts.|
|workProfileDataSharingType|androidWorkProfileCrossProfileDataSharingType|Type of data sharing that is allowed. Possible values are: `deviceDefault`, `preventAny`, `allowPersonalToWork`, `noRestrictions`.|
|workProfileDefaultAppPermissionPolicy|androidWorkProfileDefaultAppPermissionPolicyType|Type of password that is required. Possible values are: `deviceDefault`, `prompt`, `autoGrant`, `autoDeny`.|
|workProfilePasswordBlockFaceUnlock|Boolean|Indicates whether or not to block face unlock for work profile.|
|workProfilePasswordBlockFingerprintUnlock|Boolean|Indicates whether or not to block fingerprint unlock for work profile.|
|workProfilePasswordBlockIrisUnlock|Boolean|Indicates whether or not to block iris unlock for work profile.|
|workProfilePasswordBlockTrustAgents|Boolean|Indicates whether or not to block Smart Lock and other trust agents for work profile.|
|workProfilePasswordExpirationDays|Int32|Number of days before the work profile password expires. Valid values 1 to 365|
|workProfilePasswordMinimumLength|Int32|Minimum length of work profile password. Valid values 4 to 16|
|workProfilePasswordMinLetterCharacters|Int32|Minimum # of letter characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinLowerCaseCharacters|Int32|Minimum # of lower-case characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinNonLetterCharacters|Int32|Minimum # of non-letter characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinNumericCharacters|Int32|Minimum # of numeric characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinSymbolCharacters|Int32|Minimum # of symbols required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinUpperCaseCharacters|Int32|Minimum # of upper-case characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|workProfilePasswordPreviousPasswordBlockCount|Int32|Number of previous work profile passwords to block. Valid values 0 to 24|
|workProfilePasswordRequiredType|androidWorkProfileRequiredPasswordType|Type of work profile password that is required. Possible values are: `deviceDefault`, `lowSecurityBiometric`, `required`, `atLeastNumeric`, `numericComplex`, `atLeastAlphabetic`, `atLeastAlphanumeric`, `alphanumericWithSymbols`.|
|workProfilePasswordSignInFailureCountBeforeFactoryReset|Int32|Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16|
|workProfileRequirePassword|Boolean|Password is required or not for work profile|



## Response

If successful, this method returns a `201 Created` response code and an [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidworkprofilegeneraldeviceconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidWorkProfileGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 2927

{
  "@odata.type": "#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

