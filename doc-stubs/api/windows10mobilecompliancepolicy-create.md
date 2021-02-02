---
title: "Create windows10MobileCompliancePolicy"
description: "Create a new windows10MobileCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows10MobileCompliancePolicy
Namespace: microsoft.graph

Create a new [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.

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
POST ** Collection URI for microsoft.graph.windows10MobileCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.

The following table shows the properties that are required when you create the [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md).

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
|passwordBlockSimple|Boolean|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passwordRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordRequireToUnlockFromIdle|Boolean|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|earlyLaunchAntiMalwareDriverEnabled|Boolean|**TODO: Add Description**|
|bitLockerEnabled|Boolean|**TODO: Add Description**|
|secureBootEnabled|Boolean|**TODO: Add Description**|
|codeIntegrityEnabled|Boolean|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|activeFirewallRequired|Boolean|**TODO: Add Description**|
|uacRequired|Boolean|**TODO: Add Description**|
|validOperatingSystemBuildRanges|[operatingSystemVersionRange](../resources/intune-operatingsystemversionrange.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows10mobilecompliancepolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windows10MobileCompliancePolicy not found
Content-Type: application/json
Content-length: 1056

{
  "@odata.type": "#microsoft.graph.windows10MobileCompliancePolicy",
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "passwordRequired": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordRequireToUnlockFromIdle": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "bitLockerEnabled": "Boolean",
  "secureBootEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "activeFirewallRequired": "Boolean",
  "uacRequired": "Boolean",
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
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10MobileCompliancePolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows10MobileCompliancePolicy",
  "id": "5677175b-175b-5677-5b17-77565b177756",
  "roleScopeTagIds": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "version": "Integer",
  "passwordRequired": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordRequireToUnlockFromIdle": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "bitLockerEnabled": "Boolean",
  "secureBootEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "activeFirewallRequired": "Boolean",
  "uacRequired": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ]
}
```

