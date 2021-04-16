---
title: "Get androidWorkProfileVpnConfiguration"
description: "Read the properties and relationships of an androidWorkProfileVpnConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get androidWorkProfileVpnConfiguration
Namespace: microsoft.graph



Read the properties and relationships of an [androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.androidWorkProfileVpnConfiguration not found
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

If successful, this method returns a `200 OK` response code and an [androidWorkProfileVpnConfiguration](../resources/androidworkprofilevpnconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_androidworkprofilevpnconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.androidWorkProfileVpnConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidWorkProfileVpnConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.androidWorkProfileVpnConfiguration",
    "id": "f9150b30-0b30-f915-300b-15f9300b15f9",
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
    "alwaysOn": "Boolean",
    "alwaysOnLockdown": "Boolean",
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
    "fingerprint": "String",
    "microsoftTunnelSiteId": "String",
    "proxyServer": {
      "@odata.type": "microsoft.graph.vpnProxyServer"
    },
    "realm": "String",
    "role": "String",
    "servers": [
      {
        "@odata.type": "microsoft.graph.vpnServer"
      }
    ],
    "targetedMobileApps": [
      {
        "@odata.type": "microsoft.graph.appListItem"
      }
    ],
    "targetedPackageIds": [
      "String"
    ]
  }
}
```

