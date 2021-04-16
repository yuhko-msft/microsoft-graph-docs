---
title: "Update windows10MobileCompliancePolicy"
description: "Update the properties of a windows10MobileCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windows10MobileCompliancePolicy
Namespace: microsoft.graph



Update the properties of a [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.

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
PATCH ** Entity URI for microsoft.graph.windows10MobileCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.

The following table shows the properties that are required when you update the [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|activeFirewallRequired|Boolean|Require active firewall on Windows devices.|
|bitLockerEnabled|Boolean|Require devices to be reported healthy by Windows Device Health Attestation - bit locker is enabled|
|codeIntegrityEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation.|
|earlyLaunchAntiMalwareDriverEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation - early launch antimalware driver is enabled.|
|osMaximumVersion|String|Maximum Windows Phone version.|
|osMinimumVersion|String|Minimum Windows Phone version.|
|passwordBlockSimple|Boolean|Whether or not to block syncing the calendar.|
|passwordExpirationDays|Int32|Number of days before password expiration. Valid values 1 to 255|
|passwordMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passwordMinimumLength|Int32|Minimum password length. Valid values 4 to 16|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordBlockCount|Int32|The number of previous passwords to prevent re-use of.|
|passwordRequired|Boolean|Require a password to unlock Windows Phone device.|
|passwordRequiredType|requiredPasswordType|The required password type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordRequireToUnlockFromIdle|Boolean|Require a password to unlock an idle device.|
|secureBootEnabled|Boolean|Require devices to be reported as healthy by Windows Device Health Attestation - secure boot is enabled.|
|storageRequireEncryption|Boolean|Require encryption on windows devices.|
|validOperatingSystemBuildRanges|[operatingSystemVersionRange](../resources/operatingsystemversionrange.md) collection|The valid operating system build ranges on Windows devices. This collection can contain a maximum of 10000 elements.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windows10mobilecompliancepolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windows10MobileCompliancePolicy not found
Content-Type: application/json
Content-length: 1027

{
  "@odata.type": "#microsoft.graph.windows10MobileCompliancePolicy",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "activeFirewallRequired": "Boolean",
  "bitLockerEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "osMaximumVersion": "String",
  "osMinimumVersion": "String",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordRequireToUnlockFromIdle": "Boolean",
  "secureBootEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ]
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
  "@odata.type": "#microsoft.graph.windows10MobileCompliancePolicy",
  "id": "915ea771-a771-915e-71a7-5e9171a75e91",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "activeFirewallRequired": "Boolean",
  "bitLockerEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "osMaximumVersion": "String",
  "osMinimumVersion": "String",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordRequireToUnlockFromIdle": "Boolean",
  "secureBootEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ]
}
```

