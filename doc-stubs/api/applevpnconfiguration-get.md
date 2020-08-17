---
title: "Get appleVpnConfiguration"
description: "Read the properties and relationships of an appleVpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get appleVpnConfiguration
Namespace: microsoft.graph

Read the properties and relationships of an [appleVpnConfiguration](../resources/applevpnconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.appleVpnConfiguration not found
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

If successful, this method returns a `200 OK` response code and an [appleVpnConfiguration](../resources/applevpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_applevpnconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.appleVpnConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.appleVpnConfiguration"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.appleVpnConfiguration",
    "id": "02e7565f-565f-02e7-5f56-e7025f56e702",
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
    "connectionName": "String",
    "connectionType": "String",
    "loginGroupOrDomain": "String",
    "role": "String",
    "realm": "String",
    "server": {
      "@odata.type": "microsoft.graph.vpnServer"
    },
    "identifier": "String",
    "customData": [
      {
        "@odata.type": "microsoft.graph.keyValue"
      }
    ],
    "customKeyValueData": [
      {
        "@odata.type": "microsoft.graph.keyValuePair"
      }
    ],
    "enableSplitTunneling": "Boolean",
    "authenticationMethod": "String",
    "enablePerApp": "Boolean",
    "safariDomains": [
      "String"
    ],
    "onDemandRules": [
      {
        "@odata.type": "microsoft.graph.vpnOnDemandRule"
      }
    ],
    "providerType": "String",
    "proxyServer": {
      "@odata.type": "microsoft.graph.vpnProxyServer"
    },
    "optInToDeviceIdSharing": "Boolean"
  }
}
```

