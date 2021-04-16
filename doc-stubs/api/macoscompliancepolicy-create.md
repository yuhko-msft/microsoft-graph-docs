---
title: "Create macOSCompliancePolicy"
description: "Create a new macOSCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create macOSCompliancePolicy
Namespace: microsoft.graph



Create a new [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.

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
POST ** Collection URI for microsoft.graph.macOSCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.

The following table shows the properties that are required when you create the [macOSCompliancePolicy](../resources/macoscompliancepolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|
|deviceThreatProtectionEnabled|Boolean|Require that devices have enabled device threat protection.|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|firewallBlockAllIncoming|Boolean|Corresponds to the “Block all incoming connections” option.|
|firewallEnabled|Boolean|Whether the firewall should be enabled or not.|
|firewallEnableStealthMode|Boolean|Corresponds to “Enable stealth mode.”|
|gatekeeperAllowedAppSource|macOSGatekeeperAppSources|System and Privacy setting that determines which download locations apps can be run from on a macOS device. Possible values are: `notConfigured`, `macAppStore`, `macAppStoreAndIdentifiedDevelopers`, `anywhere`.|
|osMaximumBuildVersion|String|Maximum MacOS build version.|
|osMaximumVersion|String|Maximum MacOS version.|
|osMinimumBuildVersion|String|Minimum MacOS build version.|
|osMinimumVersion|String|Minimum MacOS version.|
|passwordBlockSimple|Boolean|Indicates whether or not to block simple passwords.|
|passwordExpirationDays|Int32|Number of days before the password expires. Valid values 1 to 65535|
|passwordMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passwordMinimumLength|Int32|Minimum length of password. Valid values 4 to 14|
|passwordMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a password is required.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 1 to 24|
|passwordRequired|Boolean|Whether or not to require a password.|
|passwordRequiredType|requiredPasswordType|The required password type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|storageRequireEncryption|Boolean|Require encryption on Mac OS devices.|
|systemIntegrityProtectionEnabled|Boolean|Require that devices have enabled system integrity protection.|



## Response

If successful, this method returns a `201 Created` response code and a [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_macoscompliancepolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.macOSCompliancePolicy not found
Content-Type: application/json
Content-length: 1034

{
  "@odata.type": "#microsoft.graph.macOSCompliancePolicy",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "osMaximumBuildVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMinimumVersion": "String",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "storageRequireEncryption": "Boolean",
  "systemIntegrityProtectionEnabled": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOSCompliancePolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.macOSCompliancePolicy",
  "id": "1ce7527b-527b-1ce7-7b52-e71c7b52e71c",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "osMaximumBuildVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMinimumVersion": "String",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "storageRequireEncryption": "Boolean",
  "systemIntegrityProtectionEnabled": "Boolean"
}
```

