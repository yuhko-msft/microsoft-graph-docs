---
title: "Create externalConnection"
description: "Create a new externalConnection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create externalConnection
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [externalConnection](../resources/externalconnection.md) object.

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
POST /external/connections
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [externalConnection](../resources/externalconnection.md) object.

You can specify the following properties when creating an **externalConnection**.

|Property|Type|Description|
|:---|:---|:---|
|configuration|[configuration](../resources/configuration.md)|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|name|String|**TODO: Add Description** Optional.|
|state|connectionState|**TODO: Add Description**. The possible values are: `draft`, `ready`, `obsolete`, `limitExceeded`, `unknownFutureValue`. Optional.|



## Response

If successful, this method returns a `201 Created` response code and an [externalConnection](../resources/externalconnection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_externalconnection_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/external/connections
Content-Type: application/json
Content-length: 211

{
  "@odata.type": "#microsoft.graph.externalConnection",
  "configuration": {
    "@odata.type": "microsoft.graph.configuration"
  },
  "description": "String",
  "name": "String",
  "state": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.externalConnection"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.externalConnection",
  "id": "620fdd28-dd28-620f-28dd-0f6228dd0f62",
  "configuration": {
    "@odata.type": "microsoft.graph.configuration"
  },
  "description": "String",
  "name": "String",
  "state": "String"
}
```

