---
title: "Update windows10CompliancePolicy"
description: "Update the properties of a windows10CompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windows10CompliancePolicy
Namespace: microsoft.graph

Update the properties of a [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object.

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
PATCH ** Entity URI for microsoft.graph.windows10CompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object.

The following table shows the properties that are required when you update the [windows10CompliancePolicy](../resources/windows10compliancepolicy.md).

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
|passwordRequiredToUnlockFromIdle|Boolean|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passwordRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|requireHealthyDeviceReport|Boolean|**TODO: Add Description**|
|osMinimumVersion|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|mobileOsMinimumVersion|String|**TODO: Add Description**|
|mobileOsMaximumVersion|String|**TODO: Add Description**|
|earlyLaunchAntiMalwareDriverEnabled|Boolean|**TODO: Add Description**|
|bitLockerEnabled|Boolean|**TODO: Add Description**|
|secureBootEnabled|Boolean|**TODO: Add Description**|
|codeIntegrityEnabled|Boolean|**TODO: Add Description**|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|activeFirewallRequired|Boolean|**TODO: Add Description**|
|uacRequired|Boolean|**TODO: Add Description**|
|defenderEnabled|Boolean|**TODO: Add Description**|
|defenderVersion|String|**TODO: Add Description**|
|signatureOutOfDate|Boolean|**TODO: Add Description**|
|rtpEnabled|Boolean|**TODO: Add Description**|
|antivirusRequired|Boolean|**TODO: Add Description**|
|antivirusRequireCurrentSignature|Boolean|**TODO: Add Description**|
|antiSpywareRequired|Boolean|**TODO: Add Description**|
|antiSpywareRequireCurrentSignature|Boolean|**TODO: Add Description**|
|validOperatingSystemBuildRanges|[operatingSystemVersionRange](../resources/intune-operatingsystemversionrange.md) collection|**TODO: Add Description**|
|deviceThreatProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|configurationManagerComplianceRequired|Boolean|**TODO: Add Description**|
|tpmRequired|Boolean|**TODO: Add Description**|
|deviceCompliancePolicyScript|[deviceCompliancePolicyScript](../resources/intune-devicecompliancepolicyscript.md)|**TODO: Add Description**|
|windows10CompanyPortalMinimumVersion|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windows10compliancepolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windows10CompliancePolicy not found
Content-Type: application/json
Content-length: 1893

{
  "@odata.type": "#microsoft.graph.windows10CompliancePolicy",
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "passwordRequired": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordRequiredToUnlockFromIdle": "Boolean",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "passwordPreviousPasswordBlockCount": "Integer",
  "requireHealthyDeviceReport": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "mobileOsMinimumVersion": "String",
  "mobileOsMaximumVersion": "String",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "bitLockerEnabled": "Boolean",
  "secureBootEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "activeFirewallRequired": "Boolean",
  "uacRequired": "Boolean",
  "defenderEnabled": "Boolean",
  "defenderVersion": "String",
  "signatureOutOfDate": "Boolean",
  "rtpEnabled": "Boolean",
  "antivirusRequired": "Boolean",
  "antivirusRequireCurrentSignature": "Boolean",
  "antiSpywareRequired": "Boolean",
  "antiSpywareRequireCurrentSignature": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ],
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "configurationManagerComplianceRequired": "Boolean",
  "tpmRequired": "Boolean",
  "deviceCompliancePolicyScript": {
    "@odata.type": "microsoft.graph.deviceCompliancePolicyScript"
  },
  "windows10CompanyPortalMinimumVersion": "String"
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
  "@odata.type": "#microsoft.graph.windows10CompliancePolicy",
  "id": "91c674fc-74fc-91c6-fc74-c691fc74c691",
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
  "passwordRequiredToUnlockFromIdle": "Boolean",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "passwordPreviousPasswordBlockCount": "Integer",
  "requireHealthyDeviceReport": "Boolean",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "mobileOsMinimumVersion": "String",
  "mobileOsMaximumVersion": "String",
  "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
  "bitLockerEnabled": "Boolean",
  "secureBootEnabled": "Boolean",
  "codeIntegrityEnabled": "Boolean",
  "storageRequireEncryption": "Boolean",
  "activeFirewallRequired": "Boolean",
  "uacRequired": "Boolean",
  "defenderEnabled": "Boolean",
  "defenderVersion": "String",
  "signatureOutOfDate": "Boolean",
  "rtpEnabled": "Boolean",
  "antivirusRequired": "Boolean",
  "antivirusRequireCurrentSignature": "Boolean",
  "antiSpywareRequired": "Boolean",
  "antiSpywareRequireCurrentSignature": "Boolean",
  "validOperatingSystemBuildRanges": [
    {
      "@odata.type": "microsoft.graph.operatingSystemVersionRange"
    }
  ],
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "configurationManagerComplianceRequired": "Boolean",
  "tpmRequired": "Boolean",
  "deviceCompliancePolicyScript": {
    "@odata.type": "microsoft.graph.deviceCompliancePolicyScript"
  },
  "windows10CompanyPortalMinimumVersion": "String"
}
```

