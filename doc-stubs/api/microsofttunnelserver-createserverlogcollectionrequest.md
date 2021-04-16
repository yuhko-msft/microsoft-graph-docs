---
title: "microsoftTunnelServer: createServerLogCollectionRequest"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# microsoftTunnelServer: createServerLogCollectionRequest
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /deviceManagement/microsoftTunnelSites/{microsoftTunnelSiteId}/microsoftTunnelServers/{microsoftTunnelServerId}/createServerLogCollectionRequest
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "microsofttunnelserver_createserverlogcollectionrequest"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/microsoftTunnelSites/{microsoftTunnelSiteId}/microsoftTunnelServers/{microsoftTunnelServerId}/createServerLogCollectionRequest

Content-Type: application/json
Content-length: 85

{
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.microsoftTunnelServerLogCollectionResponse"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.microsoftTunnelServerLogCollectionResponse",
    "id": "String (identifier)",
    "endDateTime": "String (timestamp)",
    "expiryDateTime": "String (timestamp)",
    "requestDateTime": "String (timestamp)",
    "serverId": "String",
    "sizeInBytes": "Integer",
    "startDateTime": "String (timestamp)",
    "status": "String"
  }
}
```

