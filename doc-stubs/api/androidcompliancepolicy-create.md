---
title: "Create androidCompliancePolicy"
description: "Create a new androidCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidCompliancePolicy
Namespace: microsoft.graph



Create a new [androidCompliancePolicy](../resources/androidcompliancepolicy.md) object.

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
POST ** Collection URI for microsoft.graph.androidCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidCompliancePolicy](../resources/androidcompliancepolicy.md) object.

The following table shows the properties that are required when you create the [androidCompliancePolicy](../resources/androidcompliancepolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|MDATP Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|conditionStatementId|String|Condition statement id.|
|deviceThreatProtectionEnabled|Boolean|Require that devices have enabled device threat protection.|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|minAndroidSecurityPatchLevel|String|Minimum Android security patch level.|
|osMaximumVersion|String|Maximum Android version.|
|osMinimumVersion|String|Minimum Android version.|
|passwordExpirationDays|Int32|Number of days before the password expires. Valid values 1 to 365|
|passwordMinimumLength|Int32|Minimum password length. Valid values 4 to 16|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 1 to 24|
|passwordRequired|Boolean|Require a password to unlock device.|
|passwordRequiredType|androidRequiredPasswordType|Type of characters in password. Possible values are: `deviceDefault`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `numeric`, `numericComplex`, `any`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Number of sign-in failures allowed before factory reset. Valid values 1 to 16|
|requiredPasswordComplexity|androidRequiredPasswordComplexity|Indicates the required password complexity on Android. One of: NONE, LOW, MEDIUM, HIGH. This is a new API targeted to Android 11+. Possible values are: `none`, `low`, `medium`, `high`.|
|restrictedApps|[appListItem](../resources/applistitem.md) collection|Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.|
|securityBlockDeviceAdministratorManagedDevices|Boolean|Block device administrator managed devices.|
|securityBlockJailbrokenDevices|Boolean|Devices must not be jailbroken or rooted.|
|securityDisableUsbDebugging|Boolean|Disable USB debugging on Android devices.|
|securityPreventInstallAppsFromUnknownSources|Boolean|Require that devices disallow installation of apps from unknown sources.|
|securityRequireCompanyPortalAppIntegrity|Boolean|Require the device to pass the Company Portal client app runtime integrity check.|
|securityRequireGooglePlayServices|Boolean|Require Google Play Services to be installed and enabled on the device.|
|securityRequireSafetyNetAttestationBasicIntegrity|Boolean|Require the device to pass the SafetyNet basic integrity check.|
|securityRequireSafetyNetAttestationCertifiedDevice|Boolean|Require the device to pass the SafetyNet certified device check.|
|securityRequireUpToDateSecurityProviders|Boolean|Require the device to have up to date security providers. The device will require Google Play Services to be enabled and up to date.|
|securityRequireVerifyApps|Boolean|Require the Android Verify apps feature is turned on.|
|storageRequireEncryption|Boolean|Require encryption on Android devices.|



## Response

If successful, this method returns a `201 Created` response code and an [androidCompliancePolicy](../resources/androidcompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidcompliancepolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidCompliancePolicy not found
Content-Type: application/json
Content-length: 1570

{
  "@odata.type": "#microsoft.graph.androidCompliancePolicy",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "conditionStatementId": "String",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "minAndroidSecurityPatchLevel": "String",
  "osMaximumVersion": "String",
  "osMinimumVersion": "String",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "requiredPasswordComplexity": "String",
  "restrictedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "securityBlockDeviceAdministratorManagedDevices": "Boolean",
  "securityBlockJailbrokenDevices": "Boolean",
  "securityDisableUsbDebugging": "Boolean",
  "securityPreventInstallAppsFromUnknownSources": "Boolean",
  "securityRequireCompanyPortalAppIntegrity": "Boolean",
  "securityRequireGooglePlayServices": "Boolean",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "securityRequireUpToDateSecurityProviders": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "storageRequireEncryption": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidCompliancePolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidCompliancePolicy",
  "id": "3ef6ea20-ea20-3ef6-20ea-f63e20eaf63e",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "conditionStatementId": "String",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "minAndroidSecurityPatchLevel": "String",
  "osMaximumVersion": "String",
  "osMinimumVersion": "String",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "requiredPasswordComplexity": "String",
  "restrictedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "securityBlockDeviceAdministratorManagedDevices": "Boolean",
  "securityBlockJailbrokenDevices": "Boolean",
  "securityDisableUsbDebugging": "Boolean",
  "securityPreventInstallAppsFromUnknownSources": "Boolean",
  "securityRequireCompanyPortalAppIntegrity": "Boolean",
  "securityRequireGooglePlayServices": "Boolean",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "securityRequireUpToDateSecurityProviders": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "storageRequireEncryption": "Boolean"
}
```

