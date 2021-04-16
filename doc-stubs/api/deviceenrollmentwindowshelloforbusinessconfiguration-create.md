---
title: "Create deviceEnrollmentWindowsHelloForBusinessConfiguration"
description: "Create a new deviceEnrollmentWindowsHelloForBusinessConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceEnrollmentWindowsHelloForBusinessConfiguration
Namespace: microsoft.graph



Create a new [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/deviceenrollmentwindowshelloforbusinessconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/deviceenrollmentwindowshelloforbusinessconfiguration.md) object.

The following table shows the properties that are required when you create the [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/deviceenrollmentwindowshelloforbusinessconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Created date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|description|String|The description of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|displayName|String|The display name of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified date time in UTC of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|priority|Int32|Priority is used when a user exists in multiple groups that are assigned enrollment configuration. Users are subject only to the configuration with the lowest priority value. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|Optional role scope tags for the enrollment restrictions. Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|version|Int32|The version of the device enrollment configuration Inherited from [deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md)|
|enhancedBiometricsState|enablement|Controls the ability to use the anti-spoofing features for facial recognition on devices which support it. If set to disabled, anti-spoofing features are not allowed. If set to Not Configured, the user can choose whether they want to use anti-spoofing. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|pinExpirationInDays|Int32|Controls the period of time (in days) that a PIN can be used before the system requires the user to change it. This must be set between 0 and 730, inclusive. If set to 0, the user's PIN will never expire|
|pinLowercaseCharactersUsage|windowsHelloForBusinessPinUsage|Controls the ability to use lowercase letters in the Windows Hello for Business PIN.  Allowed permits the use of lowercase letter(s), whereas Required ensures they are present. If set to Not Allowed, lowercase letters will not be permitted. Possible values are: `allowed`, `required`, `disallowed`.|
|pinMaximumLength|Int32|Controls the maximum number of characters allowed for the Windows Hello for Business PIN. This value must be between 4 and 127, inclusive. This value must be greater than or equal to the value set for the minimum PIN.|
|pinMinimumLength|Int32|Controls the minimum number of characters required for the Windows Hello for Business PIN.  This value must be between 4 and 127, inclusive, and less than or equal to the value set for the maximum PIN.|
|pinPreviousBlockCount|Int32|Controls the ability to prevent users from using past PINs. This must be set between 0 and 50, inclusive, and the current PIN of the user is included in that count. If set to 0, previous PINs are not stored. PIN history is not preserved through a PIN reset.|
|pinSpecialCharactersUsage|windowsHelloForBusinessPinUsage|Controls the ability to use special characters in the Windows Hello for Business PIN.  Allowed permits the use of special character(s), whereas Required ensures they are present. If set to Not Allowed, special character(s) will not be permitted. Possible values are: `allowed`, `required`, `disallowed`.|
|pinUppercaseCharactersUsage|windowsHelloForBusinessPinUsage|Controls the ability to use uppercase letters in the Windows Hello for Business PIN.  Allowed permits the use of uppercase letter(s), whereas Required ensures they are present. If set to Not Allowed, uppercase letters will not be permitted. Possible values are: `allowed`, `required`, `disallowed`.|
|remotePassportEnabled|Boolean|Controls the use of Remote Windows Hello for Business. Remote Windows Hello for Business provides the ability for a portable, registered device to be usable as a companion for desktop authentication. The desktop must be Azure AD joined and the companion device must have a Windows Hello for Business PIN.|
|securityDeviceRequired|Boolean|Controls whether to require a Trusted Platform Module (TPM) for provisioning Windows Hello for Business. A TPM provides an additional security benefit in that data stored on it cannot be used on other devices. If set to False, all devices can provision Windows Hello for Business even if there is not a usable TPM.|
|securityKeyForSignIn|enablement|Security key for Sign In provides the capacity for remotely turning ON/OFF Windows Hello Sercurity Keyl Not configured will honor configurations done on the clinet. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|state|enablement|Controls whether to allow the device to be configured for Windows Hello for Business. If set to disabled, the user cannot provision Windows Hello for Business except on Azure Active Directory joined mobile phones if otherwise required. If set to Not Configured, Intune will not override client defaults. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|unlockWithBiometricsEnabled|Boolean|Controls the use of biometric gestures, such as face and fingerprint, as an alternative to the Windows Hello for Business PIN.  If set to False, biometric gestures are not allowed. Users must still configure a PIN as a backup in case of failures.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/deviceenrollmentwindowshelloforbusinessconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceenrollmentwindowshelloforbusinessconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration not found
Content-Type: application/json
Content-length: 742

{
  "@odata.type": "#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration",
  "description": "String",
  "displayName": "String",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "enhancedBiometricsState": "String",
  "pinExpirationInDays": "Integer",
  "pinLowercaseCharactersUsage": "String",
  "pinMaximumLength": "Integer",
  "pinMinimumLength": "Integer",
  "pinPreviousBlockCount": "Integer",
  "pinSpecialCharactersUsage": "String",
  "pinUppercaseCharactersUsage": "String",
  "remotePassportEnabled": "Boolean",
  "securityDeviceRequired": "Boolean",
  "securityKeyForSignIn": "String",
  "state": "String",
  "unlockWithBiometricsEnabled": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration",
  "id": "327a297d-297d-327a-7d29-7a327d297a32",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "priority": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "enhancedBiometricsState": "String",
  "pinExpirationInDays": "Integer",
  "pinLowercaseCharactersUsage": "String",
  "pinMaximumLength": "Integer",
  "pinMinimumLength": "Integer",
  "pinPreviousBlockCount": "Integer",
  "pinSpecialCharactersUsage": "String",
  "pinUppercaseCharactersUsage": "String",
  "remotePassportEnabled": "Boolean",
  "securityDeviceRequired": "Boolean",
  "securityKeyForSignIn": "String",
  "state": "String",
  "unlockWithBiometricsEnabled": "Boolean"
}
```

