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

|Permission type|Permissions (from most to least privileged)|
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
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windows10MobileCompliancePolicy not found
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
    "id": "f75d07a6-07a6-f75d-a607-5df7a6075df7",
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
    "validOperatingSystemBuildRanges": [
      {
        "@odata.type": "microsoft.graph.operatingSystemVersionRange"
      }
    ]
  }
}
```

