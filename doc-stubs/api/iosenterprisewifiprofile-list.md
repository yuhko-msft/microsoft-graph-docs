---
title: "List iosEnterpriseWifiProfiles"
description: "Get a list of the iosEnterpriseWifiProfile objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List iosEnterpriseWifiProfiles
Namespace: microsoft.graph

Get a list of the [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.iosEnterpriseWifiProfile not found
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

If successful, this method returns a `200 OK` response code and a collection of [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_iosenterprisewifiprofile"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.iosEnterpriseWifiProfile not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.iosEnterpriseWifiProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.iosEnterpriseWifiProfile",
      "id": "cf4dc498-c498-cf4d-98c4-4dcf98c44dcf",
      "version": "Integer",
      "displayName": "String",
      "description": "String",
      "creationDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "roleScopeTagIds": [
        "String"
      ],
      "preSharedKey": "String",
      "networkName": "String",
      "ssid": "String",
      "connectAutomatically": "Boolean",
      "connectWhenNetworkNameIsHidden": "Boolean",
      "wiFiSecurityType": "String",
      "proxySettings": {
        "@odata.type": "microsoft.graph.iosProxySettings"
      },
      "eapSettings": {
        "@odata.type": "microsoft.graph.iosEapSettings"
      },
      "trustedServerCertificateNames": [
        "String"
      ]
    }
  ]
}
```

