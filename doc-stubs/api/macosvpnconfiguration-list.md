---
title: "List macOSVpnConfigurations"
description: "Get a list of the macOSVpnConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List macOSVpnConfigurations
Namespace: microsoft.graph



Get a list of the [macOSVpnConfiguration](../resources/macosvpnconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.macOSVpnConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [macOSVpnConfiguration](../resources/macosvpnconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_macosvpnconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.macOSVpnConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.macOSVpnConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.macOSVpnConfiguration",
      "id": "84a17f83-7f83-84a1-837f-a184837fa184",
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
      }
    }
  ]
}
```

