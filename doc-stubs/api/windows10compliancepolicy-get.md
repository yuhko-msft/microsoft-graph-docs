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
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windows10CompliancePolicy not found
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
    "id": "2c598d61-8d61-2c59-618d-592c618d592c",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "version": "Integer",
    "activeFirewallRequired": "Boolean",
    "antiSpywareRequired": "Boolean",
    "antivirusRequired": "Boolean",
    "bitLockerEnabled": "Boolean",
    "codeIntegrityEnabled": "Boolean",
    "configurationManagerComplianceRequired": "Boolean",
    "defenderEnabled": "Boolean",
    "defenderVersion": "String",
    "deviceCompliancePolicyScript": {
      "@odata.type": "microsoft.graph.deviceCompliancePolicyScript"
    },
    "deviceThreatProtectionEnabled": "Boolean",
    "deviceThreatProtectionRequiredSecurityLevel": "String",
    "earlyLaunchAntiMalwareDriverEnabled": "Boolean",
    "mobileOsMaximumVersion": "String",
    "mobileOsMinimumVersion": "String",
    "osMaximumVersion": "String",
    "osMinimumVersion": "String",
    "passwordBlockSimple": "Boolean",
    "passwordExpirationDays": "Integer",
    "passwordMinimumCharacterSetCount": "Integer",
    "passwordMinimumLength": "Integer",
    "passwordMinutesOfInactivityBeforeLock": "Integer",
    "passwordPreviousPasswordBlockCount": "Integer",
    "passwordRequired": "Boolean",
    "passwordRequiredToUnlockFromIdle": "Boolean",
    "passwordRequiredType": "String",
    "requireHealthyDeviceReport": "Boolean",
    "rtpEnabled": "Boolean",
    "secureBootEnabled": "Boolean",
    "signatureOutOfDate": "Boolean",
    "storageRequireEncryption": "Boolean",
    "tpmRequired": "Boolean",
    "validOperatingSystemBuildRanges": [
      {
        "@odata.type": "microsoft.graph.operatingSystemVersionRange"
      }
    ]
  }
}
```

