---
title: "Get macOSCompliancePolicy"
description: "Read the properties and relationships of a macOSCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get macOSCompliancePolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object.

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
GET ** Entity URI for microsoft.graph.macOSCompliancePolicy not found
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

If successful, this method returns a `200 OK` response code and a [macOSCompliancePolicy](../resources/macoscompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_macoscompliancepolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.macOSCompliancePolicy not found
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

