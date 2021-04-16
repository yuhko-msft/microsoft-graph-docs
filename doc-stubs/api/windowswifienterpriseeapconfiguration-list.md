---
title: "List windowsWifiEnterpriseEAPConfigurations"
description: "Get a list of the windowsWifiEnterpriseEAPConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windowsWifiEnterpriseEAPConfigurations
Namespace: microsoft.graph



Get a list of the [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.windowsWifiEnterpriseEAPConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [windowsWifiEnterpriseEAPConfiguration](../resources/windowswifienterpriseeapconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_windowswifienterpriseeapconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsWifiEnterpriseEAPConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.windowsWifiEnterpriseEAPConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.windowsWifiEnterpriseEAPConfiguration",
      "id": "0883ff9e-ff9e-0883-9eff-83089eff8308",
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
      "connectAutomatically": "Boolean",
      "connectToPreferredNetwork": "Boolean",
      "connectWhenNetworkNameIsHidden": "Boolean",
      "forceFIPSCompliance": "Boolean",
      "meteredConnectionLimit": "String",
      "networkName": "String",
      "preSharedKey": "String",
      "proxyAutomaticConfigurationUrl": "String",
      "proxyManualAddress": "String",
      "proxyManualPort": "Integer",
      "proxySetting": "String",
      "ssid": "String",
      "wifiSecurityType": "String",
      "authenticationMethod": "String",
      "authenticationPeriodInSeconds": "Integer",
      "authenticationRetryDelayPeriodInSeconds": "Integer",
      "authenticationType": "String",
      "cacheCredentials": "Boolean",
      "disableUserPromptForServerValidation": "Boolean",
      "eapolStartPeriodInSeconds": "Integer",
      "eapType": "String",
      "enablePairwiseMasterKeyCaching": "Boolean",
      "enablePreAuthentication": "Boolean",
      "innerAuthenticationProtocolForEAPTTLS": "String",
      "maximumAuthenticationFailures": "Integer",
      "maximumAuthenticationTimeoutInSeconds": "Integer",
      "maximumEAPOLStartMessages": "Integer",
      "maximumNumberOfPairwiseMasterKeysInCache": "Integer",
      "maximumPairwiseMasterKeyCacheTimeInMinutes": "Integer",
      "maximumPreAuthenticationAttempts": "Integer",
      "networkSingleSignOn": "String",
      "outerIdentityPrivacyTemporaryValue": "String",
      "performServerValidation": "Boolean",
      "promptForAdditionalAuthenticationCredentials": "Boolean",
      "requireCryptographicBinding": "Boolean",
      "trustedServerCertificateNames": [
        "String"
      ],
      "userBasedVirtualLan": "Boolean"
    }
  ]
}
```

