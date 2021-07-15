---
title: "Get iosVpnConfiguration"
description: "Read the properties and relationships of an iosVpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosVpnConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.iosVpnConfiguration not found
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

If successful, this method returns a `200 OK` response code and an [iosVpnConfiguration](../resources/iosvpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iosvpnconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosVpnConfiguration not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosVpnConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosVpnConfiguration",
    "id": "f47638d9-38d9-f476-d938-76f4d93876f4",
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
    "associatedDomains": [
      "String"
    ],
    "authenticationMethod": "String",
    "connectionName": "String",
    "connectionType": "String",
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
    "disableOnDemandUserOverride": "Boolean",
    "disconnectOnIdle": "Boolean",
    "disconnectOnIdleTimerInSeconds": "Integer",
    "enablePerApp": "Boolean",
    "enableSplitTunneling": "Boolean",
    "excludedDomains": [
      "String"
    ],
    "identifier": "String",
    "loginGroupOrDomain": "String",
    "onDemandRules": [
      {
        "@odata.type": "microsoft.graph.vpnOnDemandRule"
      }
    ],
    "optInToDeviceIdSharing": "Boolean",
    "providerType": "String",
    "proxyServer": {
      "@odata.type": "microsoft.graph.vpnProxyServer"
    },
    "realm": "String",
    "role": "String",
    "safariDomains": [
      "String"
    ],
    "server": {
      "@odata.type": "microsoft.graph.vpnServer"
    },
    "cloudName": "String",
    "excludeList": [
      "String"
    ],
    "microsoftTunnelSiteId": "String",
    "strictEnforcement": "Boolean",
    "targetedMobileApps": [
      {
        "@odata.type": "microsoft.graph.appListItem"
      }
    ],
    "userDomain": "String"
  }
}
```

