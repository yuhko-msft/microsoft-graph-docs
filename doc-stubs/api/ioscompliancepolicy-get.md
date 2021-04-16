---
title: "Get iosCompliancePolicy"
description: "Read the properties and relationships of an iosCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosCompliancePolicy
Namespace: microsoft.graph



Read the properties and relationships of an [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object.

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
GET ** Entity URI for microsoft.graph.iosCompliancePolicy not found
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

If successful, this method returns a `200 OK` response code and an [iosCompliancePolicy](../resources/ioscompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_ioscompliancepolicy"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.iosCompliancePolicy not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosCompliancePolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

