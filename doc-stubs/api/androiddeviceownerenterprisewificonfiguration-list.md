---
title: "List androidDeviceOwnerEnterpriseWiFiConfigurations"
description: "Get a list of the androidDeviceOwnerEnterpriseWiFiConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List androidDeviceOwnerEnterpriseWiFiConfigurations
Namespace: microsoft.graph



Get a list of the [androidDeviceOwnerEnterpriseWiFiConfiguration](../resources/androiddeviceownerenterprisewificonfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.androidDeviceOwnerEnterpriseWiFiConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [androidDeviceOwnerEnterpriseWiFiConfiguration](../resources/androiddeviceownerenterprisewificonfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_androiddeviceownerenterprisewificonfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidDeviceOwnerEnterpriseWiFiConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.androidDeviceOwnerEnterpriseWiFiConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.androidDeviceOwnerEnterpriseWiFiConfiguration",
      "id": "f80f2cee-2cee-f80f-ee2c-0ff8ee2c0ff8",
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
      "connectWhenNetworkNameIsHidden": "Boolean",
      "networkName": "String",
      "preSharedKey": "String",
      "preSharedKeyIsSet": "Boolean",
      "ssid": "String",
      "wiFiSecurityType": "String",
      "authenticationMethod": "String",
      "eapType": "String",
      "innerAuthenticationProtocolForEapTtls": "String",
      "innerAuthenticationProtocolForPeap": "String",
      "outerIdentityPrivacyTemporaryValue": "String"
    }
  ]
}
```

