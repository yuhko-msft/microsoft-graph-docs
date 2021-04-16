---
title: "Update iosCompliancePolicy"
description: "Update the properties of an iosCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosCompliancePolicy
Namespace: microsoft.graph



Update the properties of an [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object.

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
PATCH ** Entity URI for microsoft.graph.iosCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object.

The following table shows the properties that are required when you update the [iosCompliancePolicy](../resources/ioscompliancepolicy.md).

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
|deviceThreatProtectionEnabled|Boolean|Require that devices have enabled device threat protection .|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|Require Mobile Threat Protection minimum risk level to report noncompliance. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|managedEmailProfileRequired|Boolean|Indicates whether or not to require a managed email profile.|
|osMaximumBuildVersion|String|Maximum IOS build version.|
|osMaximumVersion|String|Maximum IOS version.|
|osMinimumBuildVersion|String|Minimum IOS build version.|
|osMinimumVersion|String|Minimum IOS version.|
|passcodeBlockSimple|Boolean|Indicates whether or not to block simple passcodes.|
|passcodeExpirationDays|Int32|Number of days before the passcode expires. Valid values 1 to 65535|
|passcodeMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passcodeMinimumLength|Int32|Minimum length of passcode. Valid values 4 to 14|
|passcodeMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a passcode is required.|
|passcodeMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|passcodePreviousPasscodeBlockCount|Int32|Number of previous passcodes to block. Valid values 1 to 24|
|passcodeRequired|Boolean|Indicates whether or not to require a passcode.|
|passcodeRequiredType|requiredPasswordType|The required passcode type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|restrictedApps|[appListItem](../resources/applistitem.md) collection|Require the device to not have the specified apps installed. This collection can contain a maximum of 100 elements.|
|securityBlockJailbrokenDevices|Boolean|Devices must not be jailbroken or rooted.|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_ioscompliancepolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.iosCompliancePolicy not found
Content-Type: application/json
Content-length: 1093

{
  "@odata.type": "#microsoft.graph.iosCompliancePolicy",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "managedEmailProfileRequired": "Boolean",
  "osMaximumBuildVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMinimumVersion": "String",
  "passcodeBlockSimple": "Boolean",
  "passcodeExpirationDays": "Integer",
  "passcodeMinimumCharacterSetCount": "Integer",
  "passcodeMinimumLength": "Integer",
  "passcodeMinutesOfInactivityBeforeLock": "Integer",
  "passcodeMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passcodePreviousPasscodeBlockCount": "Integer",
  "passcodeRequired": "Boolean",
  "passcodeRequiredType": "String",
  "restrictedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "securityBlockJailbrokenDevices": "Boolean"
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
  "@odata.type": "#microsoft.graph.iosCompliancePolicy",
  "id": "dde272d3-72d3-dde2-d372-e2ddd372e2dd",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "managedEmailProfileRequired": "Boolean",
  "osMaximumBuildVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMinimumVersion": "String",
  "passcodeBlockSimple": "Boolean",
  "passcodeExpirationDays": "Integer",
  "passcodeMinimumCharacterSetCount": "Integer",
  "passcodeMinimumLength": "Integer",
  "passcodeMinutesOfInactivityBeforeLock": "Integer",
  "passcodeMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passcodePreviousPasscodeBlockCount": "Integer",
  "passcodeRequired": "Boolean",
  "passcodeRequiredType": "String",
  "restrictedApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "securityBlockJailbrokenDevices": "Boolean"
}
```

