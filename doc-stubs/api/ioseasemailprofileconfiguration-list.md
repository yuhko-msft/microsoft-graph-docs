---
title: "List iosEasEmailProfileConfigurations"
description: "Get a list of the iosEasEmailProfileConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List iosEasEmailProfileConfigurations
Namespace: microsoft.graph

Get a list of the [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.iosEasEmailProfileConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [iosEasEmailProfileConfiguration](../resources/ioseasemailprofileconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_ioseasemailprofileconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.iosEasEmailProfileConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.iosEasEmailProfileConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.iosEasEmailProfileConfiguration",
      "id": "11fd3696-3696-11fd-9636-fd119636fd11",
      "lastModifiedDateTime": "String (timestamp)",
      "roleScopeTagIds": [
        "String"
      ],
      "supportsScopeTags": "Boolean",
      "deviceManagementApplicabilityRuleOsEdition": {
        "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
      },
      "deviceManagementApplicabilityRuleOsVersion": {
        "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
      },
      "deviceManagementApplicabilityRuleDeviceMode": {
        "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
      },
      "createdDateTime": "String (timestamp)",
      "description": "String",
      "displayName": "String",
      "version": "Integer",
      "usernameSource": "String",
      "usernameAADSource": "String",
      "userDomainNameSource": "String",
      "customDomainName": "String",
      "accountName": "String",
      "authenticationMethod": "String",
      "blockMovingMessagesToOtherEmailAccounts": "Boolean",
      "blockSendingEmailFromThirdPartyApps": "Boolean",
      "blockSyncingRecentlyUsedEmailAddresses": "Boolean",
      "durationOfEmailToSync": "String",
      "emailAddressSource": "String",
      "easServices": "String",
      "easServicesUserOverrideEnabled": "Boolean",
      "hostName": "String",
      "requireSmime": "Boolean",
      "smimeEnablePerMessageSwitch": "Boolean",
      "smimeEncryptByDefaultEnabled": "Boolean",
      "smimeSigningEnabled": "Boolean",
      "smimeSigningUserOverrideEnabled": "Boolean",
      "smimeEncryptByDefaultUserOverrideEnabled": "Boolean",
      "smimeSigningCertificateUserOverrideEnabled": "Boolean",
      "smimeEncryptionCertificateUserOverrideEnabled": "Boolean",
      "requireSsl": "Boolean",
      "useOAuth": "Boolean",
      "signingCertificateType": "String",
      "encryptionCertificateType": "String",
      "perAppVPNProfileId": "String"
    }
  ]
}
```

