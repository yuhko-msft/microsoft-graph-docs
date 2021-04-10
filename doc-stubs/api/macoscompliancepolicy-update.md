---
title: "Update macOSCompliancePolicy"
description: "Update the properties of a macOSCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSCompliancePolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.

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
PATCH ** Entity URI for microsoft.graph.macOSCompliancePolicy not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.

The following table shows the properties that are required when you update the [macOSCompliancePolicy](../resources/macoscompliancepolicy.md).

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
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passwordRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|osMinimumVersion|String|**TODO: Add Description**|
|osMaximumVersion|String|**TODO: Add Description**|
|osMinimumBuildVersion|String|**TODO: Add Description**|
|osMaximumBuildVersion|String|**TODO: Add Description**|
|systemIntegrityProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceThreatProtectionEnabled|Boolean|**TODO: Add Description**|
|deviceThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|advancedThreatProtectionRequiredSecurityLevel|deviceThreatProtectionLevel|**TODO: Add Description**. Possible values are: `unavailable`, `secured`, `low`, `medium`, `high`, `notSet`.|
|storageRequireEncryption|Boolean|**TODO: Add Description**|
|gatekeeperAllowedAppSource|macOSGatekeeperAppSources|**TODO: Add Description**. Possible values are: `notConfigured`, `macAppStore`, `macAppStoreAndIdentifiedDevelopers`, `anywhere`.|
|firewallEnabled|Boolean|**TODO: Add Description**|
|firewallBlockAllIncoming|Boolean|**TODO: Add Description**|
|firewallEnableStealthMode|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macoscompliancepolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.macOSCompliancePolicy not found
Content-Type: application/json
Content-length: 1096

{
  "@odata.type": "#microsoft.graph.macOSCompliancePolicy",
  "roleScopeTagIds": [
    "String"
  ],
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "passwordRequired": "Boolean",
  "passwordBlockSimple": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMaximumBuildVersion": "String",
  "systemIntegrityProtectionEnabled": "Boolean",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "storageRequireEncryption": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "firewallEnabled": "Boolean",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnableStealthMode": "Boolean"
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
  "@odata.type": "#microsoft.graph.macOSCompliancePolicy",
  "id": "1ce7527b-527b-1ce7-7b52-e71c7b52e71c",
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
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeLock": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordRequiredType": "String",
  "osMinimumVersion": "String",
  "osMaximumVersion": "String",
  "osMinimumBuildVersion": "String",
  "osMaximumBuildVersion": "String",
  "systemIntegrityProtectionEnabled": "Boolean",
  "deviceThreatProtectionEnabled": "Boolean",
  "deviceThreatProtectionRequiredSecurityLevel": "String",
  "advancedThreatProtectionRequiredSecurityLevel": "String",
  "storageRequireEncryption": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "firewallEnabled": "Boolean",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnableStealthMode": "Boolean"
}
```

