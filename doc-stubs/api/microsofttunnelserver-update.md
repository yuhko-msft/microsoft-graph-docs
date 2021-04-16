---
title: "Update microsoftTunnelServer"
description: "Update the properties of a microsoftTunnelServer object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update microsoftTunnelServer
Namespace: microsoft.graph



Update the properties of a [microsoftTunnelServer](../resources/microsofttunnelserver.md) object.

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
PATCH /deviceManagement/microsoftTunnelSites/{microsoftTunnelSiteId}/microsoftTunnelServers/{microsoftTunnelServerId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftTunnelServer](../resources/microsofttunnelserver.md) object.

The following table shows the properties that are required when you update the [microsoftTunnelServer](../resources/microsofttunnelserver.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The MicrosoftTunnelServer's display name|
|lastCheckinDateTime|DateTimeOffset|When the MicrosoftTunnelServer last checked in|
|tunnelServerHealthStatus|microsoftTunnelServerHealthStatus|The MicrosoftTunnelServer's health status. Possible values are: `unknown`, `healthy`, `unhealthy`, `warning`, `offline`, `upgradeInProgress`, `upgradeFailed`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [microsoftTunnelServer](../resources/microsofttunnelserver.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_microsofttunnelserver"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/microsoftTunnelSites/{microsoftTunnelSiteId}/microsoftTunnelServers/{microsoftTunnelServerId}
Content-Type: application/json
Content-length: 180

{
  "@odata.type": "#microsoft.graph.microsoftTunnelServer",
  "displayName": "String",
  "lastCheckinDateTime": "String (timestamp)",
  "tunnelServerHealthStatus": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.microsoftTunnelServer",
  "id": "7fe24244-4244-7fe2-4442-e27f4442e27f",
  "displayName": "String",
  "lastCheckinDateTime": "String (timestamp)",
  "tunnelServerHealthStatus": "String"
}
```

