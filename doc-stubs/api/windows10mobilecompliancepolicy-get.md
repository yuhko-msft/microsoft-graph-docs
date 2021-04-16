---
title: "Get windows10MobileCompliancePolicy"
description: "Read the properties and relationships of a windows10MobileCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windows10MobileCompliancePolicy
Namespace: microsoft.graph



Read the properties and relationships of a [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object.

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
GET ** Entity URI for microsoft.graph.windows10MobileCompliancePolicy not found
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

If successful, this method returns a `200 OK` response code and a [windows10MobileCompliancePolicy](../resources/windows10mobilecompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windows10mobilecompliancepolicy"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windows10MobileCompliancePolicy not found
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

