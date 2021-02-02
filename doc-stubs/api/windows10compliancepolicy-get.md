---
title: "Get windows10CompliancePolicy"
description: "Read the properties and relationships of a windows10CompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windows10CompliancePolicy
Namespace: microsoft.graph

Read the properties and relationships of a [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object.

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
GET ** Entity URI for microsoft.graph.windows10CompliancePolicy not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [windows10CompliancePolicy](../resources/windows10compliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windows10compliancepolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windows10CompliancePolicy not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10CompliancePolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

