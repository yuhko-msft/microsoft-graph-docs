---
title: "Update androidWorkProfileCompliancePolicy"
description: "Update the properties of an androidWorkProfileCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidWorkProfileCompliancePolicy
Namespace: microsoft.graph

Update the properties of an [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) object.

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
PATCH ** Entity URI for microsoft.graph.androidWorkProfileCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) object.

The following table shows the properties that are required when you create the [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md).

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
|osMinimumVersion|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|minAndroidSecurityPatchLevel|String|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|securityRequireSafetyNetAttestationBasicIntegrity|Boolean|**TODO: Add Description**|
|securityRequireSafetyNetAttestationCertifiedDevice|Boolean|**TODO: Add Description**|
|securityRequireGooglePlayServices|Boolean|**TODO: Add Description**|
|securityRequireUpToDateSecurityProviders|Boolean|**TODO: Add Description**|
|securityRequireCompanyPortalAppIntegrity|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidWorkProfileCompliancePolicy](../resources/androidworkprofilecompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androidworkprofilecompliancepolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.androidWorkProfileCompliancePolicy not found
Content-Type: application/json
Content-length: 1342

{
  "@odata.type": "#microsoft.graph.androidWorkProfileCompliancePolicy",
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "passwordRequired": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordRequiredType": "String",
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
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "minAndroidSecurityPatchLevel": "String",
  "storageRequireEncryption": "Boolean",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "securityRequireGooglePlayServices": "Boolean",
  "securityRequireUpToDateSecurityProviders": "Boolean",
  "securityRequireCompanyPortalAppIntegrity": "Boolean"
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
  "@odata.type": "#microsoft.graph.androidWorkProfileCompliancePolicy",
  "id": "179e4251-4251-179e-5142-9e1751429e17",
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
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "minAndroidSecurityPatchLevel": "String",
  "storageRequireEncryption": "Boolean",
  "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
  "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
  "securityRequireGooglePlayServices": "Boolean",
  "securityRequireUpToDateSecurityProviders": "Boolean",
  "securityRequireCompanyPortalAppIntegrity": "Boolean"
}
```

