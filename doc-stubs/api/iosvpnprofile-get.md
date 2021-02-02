---
title: "Get iosVpnProfile"
description: "Read the properties and relationships of an iosVpnProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosVpnProfile
Namespace: microsoft.graph

Read the properties and relationships of an [iosVpnProfile](../resources/iosvpnprofile.md) object.

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
GET ** Entity URI for microsoft.graph.iosVpnProfile not found
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

If successful, this method returns a `200 OK` response code and an [iosVpnProfile](../resources/iosvpnprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iosvpnprofile"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosVpnProfile not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosVpnProfile"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosVpnProfile",
    "id": "98e20cc1-0cc1-98e2-c10c-e298c10ce298",
    "version": "Integer",
    "displayName": "String",
    "description": "String",
    "creationDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "connectionName": "String",
    "connectionSettings": {
      "@odata.type": "microsoft.graph.iosVpnConnectionSettings"
    },
    "appSettings": {
      "@odata.type": "microsoft.graph.iosVpnAppSettings"
    },
    "proxySettings": {
      "@odata.type": "microsoft.graph.iosProxySettings"
    }
  }
}
```

