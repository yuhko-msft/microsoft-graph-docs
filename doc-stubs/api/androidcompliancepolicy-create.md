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
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|description|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|
|passwordRequired|Boolean|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordRequiredType|androidRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `numeric`, `numericComplex`, `any`.|
|requiredPasswordComplexity|androidRequiredPasswordComplexity|**TODO: Add Description**. Possible values are: `none`, `low`, `medium`, `high`.|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|securityPreventInstallAppsFromUnknownSources|Boolean|**TODO: Add Description**|
|securityDisableUsbDebugging|Boolean|**TODO: Add Description**|
|securityRequireVerifyApps|Boolean|**TODO: Add Description**|
|deviceThreatProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|securityBlockJailbrokenDevices|Boolean|**TODO: Add Description**|
|securityBlockDeviceAdministratorManagedDevices|Boolean|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|minAndroidSecurityPatchLevel|String|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|securityRequireSafetyNetAttestationBasicIntegrity|Boolean|**TODO: Add Description**|
|securityRequireSafetyNetAttestationCertifiedDevice|Boolean|**TODO: Add Description**|
|securityRequireGooglePlayServices|Boolean|**TODO: Add Description**|
|securityRequireUpToDateSecurityProviders|Boolean|**TODO: Add Description**|
|securityRequireCompanyPortalAppIntegrity|Boolean|**TODO: Add Description**|
|conditionStatementId|String|**TODO: Add Description**|
|restrictedApps|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|androidCompanyPortalMinimumVersion|String|**TODO: Add Description**|



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
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.androidCompliancePolicy not found
Content-Type: application/json
Content-length: 1621

{
  "@odata.type": "#microsoft.graph.androidCompliancePolicy",
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "passwordRequired": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordRequiredType": "String",
  "requiredPasswordComplexity": "String",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "securityPreventInstallAppsFromUnknownSources": "Boolean",
  "securityDisableUsbDebugging": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "securityBlockJailbrokenDevices": "Boolean",
  "securityBlockDeviceAdministratorManagedDevices": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "minAndroidSecurityPatchLevel": "String",
  "storageRequireEncryption": "Boolean",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "securityRequireGooglePlayServices": "Boolean",
  "securityRequireUpToDateSecurityProviders": "Boolean",
  "securityRequireCompanyPortalAppIntegrity": "Boolean",
  "conditionStatementId": "String",
  "restrictedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "androidCompanyPortalMinimumVersion": "String"
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
  "id": "c7017db3-7db3-c701-b37d-01c7b37d01c7",
  "roleScopeTagIds": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer",
  "passwordRequired": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordRequiredType": "String",
  "requiredPasswordComplexity": "String",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "securityPreventInstallAppsFromUnknownSources": "Boolean",
  "securityDisableUsbDebugging": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "securityBlockJailbrokenDevices": "Boolean",
  "securityBlockDeviceAdministratorManagedDevices": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "minAndroidSecurityPatchLevel": "String",
  "storageRequireEncryption": "Boolean",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "securityRequireGooglePlayServices": "Boolean",
  "securityRequireUpToDateSecurityProviders": "Boolean",
  "securityRequireCompanyPortalAppIntegrity": "Boolean",
  "conditionStatementId": "String",
  "restrictedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "androidCompanyPortalMinimumVersion": "String"
}
```

