---
title: "Get androidForWorkCompliancePolicy"
description: "Read the properties and relationships of an androidForWorkCompliancePolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get androidForWorkCompliancePolicy
Namespace: microsoft.graph



Read the properties and relationships of an [androidForWorkCompliancePolicy](../resources/androidforworkcompliancepolicy.md) object.

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
GET ** Entity URI for microsoft.graph.androidForWorkCompliancePolicy not found
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

If successful, this method returns a `200 OK` response code and an [androidForWorkCompliancePolicy](../resources/androidforworkcompliancepolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androidforworkcompliancepolicy"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.androidForWorkCompliancePolicy not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidForWorkCompliancePolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.androidForWorkCompliancePolicy",
    "id": "ae3d9cf2-9cf2-ae3d-f29c-3daef29c3dae",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "version": "Integer",
    "deviceThreatProtectionEnabled": "Boolean",
    "deviceThreatProtectionRequiredSecurityLevel": "String",
    "minAndroidSecurityPatchLevel": "String",
    "osMaximumVersion": "String",
    "osMinimumVersion": "String",
    "passwordExpirationDays": "Integer",
    "passwordMinimumLength": "Integer",
    "passwordMinutesOfInactivityBeforeLock": "Integer",
    "passwordPreviousPasswordBlockCount": "Integer",
    "passwordRequired": "Boolean",
    "passwordRequiredType": "String",
    "passwordSignInFailureCountBeforeFactoryReset": "Integer",
    "securityBlockJailbrokenDevices": "Boolean",
    "securityDisableUsbDebugging": "Boolean",
    "securityPreventInstallAppsFromUnknownSources": "Boolean",
    "securityRequireCompanyPortalAppIntegrity": "Boolean",
    "securityRequireGooglePlayServices": "Boolean",
    "securityRequireSafetyNetAttestationBasicIntegrity": "Boolean",
    "securityRequireSafetyNetAttestationCertifiedDevice": "Boolean",
    "securityRequireUpToDateSecurityProviders": "Boolean",
    "securityRequireVerifyApps": "Boolean",
    "storageRequireEncryption": "Boolean"
  }
}
```

