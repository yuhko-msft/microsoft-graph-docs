---
title: "Create microsoftTunnelServerLogCollectionResponse"
description: "Create a new microsoftTunnelServerLogCollectionResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create microsoftTunnelServerLogCollectionResponse
Namespace: microsoft.graph



Create a new [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) object.

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
POST /deviceManagement/microsoftTunnelServerLogCollectionResponses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) object.

The following table shows the properties that are required when you create the [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|endDateTime|DateTimeOffset|The end time of the logs collected|
|expiryDateTime|DateTimeOffset|The time when the log collection is expired|
|requestDateTime|DateTimeOffset|The time when the log collection was requested|
|serverId|String|ID of the server the log collection is requested upon|
|sizeInBytes|Int64|The size of the logs in bytes|
|startDateTime|DateTimeOffset|The start time of the logs collected |
|status|microsoftTunnelLogCollectionStatus|The status of log collection. Possible values are: `pending`, `completed`, `failed`.|



## Response

If successful, this method returns a `201 Created` response code and a [microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_microsofttunnelserverlogcollectionresponse_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/microsoftTunnelServerLogCollectionResponses
Content-Type: application/json
Content-length: 330

{
  "@odata.type": "#microsoft.graph.microsoftTunnelServerLogCollectionResponse",
  "endDateTime": "String (timestamp)",
  "expiryDateTime": "String (timestamp)",
  "requestDateTime": "String (timestamp)",
  "serverId": "String",
  "sizeInBytes": "Integer",
  "startDateTime": "String (timestamp)",
  "status": "String"
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
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.microsoftTunnelServerLogCollectionResponse",
  "id": "cae6c46d-c46d-cae6-6dc4-e6ca6dc4e6ca",
  "endDateTime": "String (timestamp)",
  "expiryDateTime": "String (timestamp)",
  "requestDateTime": "String (timestamp)",
  "serverId": "String",
  "sizeInBytes": "Integer",
  "startDateTime": "String (timestamp)",
  "status": "String"
}
```

