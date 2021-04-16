---
title: "Get windowsIdentityProtectionConfiguration"
description: "Read the properties and relationships of a windowsIdentityProtectionConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windowsIdentityProtectionConfiguration
Namespace: microsoft.graph



Read the properties and relationships of a [windowsIdentityProtectionConfiguration](../resources/windowsidentityprotectionconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.windowsIdentityProtectionConfiguration not found
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

If successful, this method returns a `200 OK` response code and a [windowsIdentityProtectionConfiguration](../resources/windowsidentityprotectionconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsidentityprotectionconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windowsIdentityProtectionConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsIdentityProtectionConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.windowsIdentityProtectionConfiguration",
    "id": "75f5992c-992c-75f5-2c99-f5752c99f575",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "version": "Integer",
    "enhancedAntiSpoofingForFacialFeaturesEnabled": "Boolean",
    "pinExpirationInDays": "Integer",
    "pinLowercaseCharactersUsage": "String",
    "pinMaximumLength": "Integer",
    "pinMinimumLength": "Integer",
    "pinPreviousBlockCount": "Integer",
    "pinRecoveryEnabled": "Boolean",
    "pinSpecialCharactersUsage": "String",
    "pinUppercaseCharactersUsage": "String",
    "securityDeviceRequired": "Boolean",
    "unlockWithBiometricsEnabled": "Boolean",
    "useCertificatesForOnPremisesAuthEnabled": "Boolean",
    "useSecurityKeyForSignin": "Boolean",
    "windowsHelloForBusinessBlocked": "Boolean"
  }
}
```

