---
title: "Create privateEndpointConnection"
description: "Create a new privateEndpointConnection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create privateEndpointConnection
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [privateEndpointConnection](../resources/privateendpointconnection.md) object.

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
POST /privateLinkPolicy/privateEndpointConnections
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privateEndpointConnection](../resources/privateendpointconnection.md) object.

You can specify the following properties when creating a **privateEndpointConnection**.

|Property|Type|Description|
|:---|:---|:---|
|externalPrivateEndpointId|String|**TODO: Add Description** Required.|
|privateLinkIds|Int32 collection|**TODO: Add Description** Required.|



## Response

If successful, this method returns a `201 Created` response code and a [privateEndpointConnection](../resources/privateendpointconnection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_privateendpointconnection_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/privateLinkPolicy/privateEndpointConnections
Content-Type: application/json
Content-length: 165

{
  "@odata.type": "#Microsoft.DirectoryServices.privateEndpointConnection",
  "externalPrivateEndpointId": "String",
  "privateLinkIds": [
    "Integer"
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.DirectoryServices.privateEndpointConnection"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.DirectoryServices.privateEndpointConnection",
  "id": "5543b42f-b42f-5543-2fb4-43552fb44355",
  "externalPrivateEndpointId": "String",
  "privateLinkIds": [
    "Integer"
  ]
}
```

