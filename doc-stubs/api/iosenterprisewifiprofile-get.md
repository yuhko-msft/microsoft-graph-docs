---
title: "Get iosEnterpriseWifiProfile"
description: "Read the properties and relationships of an iosEnterpriseWifiProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosEnterpriseWifiProfile
Namespace: microsoft.graph

Read the properties and relationships of an [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object.

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
GET ** Entity URI for microsoft.graph.iosEnterpriseWifiProfile not found
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

If successful, this method returns a `200 OK` response code and an [iosEnterpriseWifiProfile](../resources/iosenterprisewifiprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iosenterprisewifiprofile"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosEnterpriseWifiProfile not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosEnterpriseWifiProfile"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

