---
title: "Update ndesConnector"
description: "Update the properties of a ndesConnector object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update ndesConnector
Namespace: microsoft.graph



Update the properties of a [ndesConnector](../resources/ndesconnector.md) object.

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
PATCH /deviceManagement/ndesConnectors/{ndesConnectorId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [ndesConnector](../resources/ndesconnector.md) object.

The following table shows the properties that are required when you update the [ndesConnector](../resources/ndesconnector.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The friendly name of the Ndes Connector.|
|lastConnectionDateTime|DateTimeOffset|Last connection time for the Ndes Connector|
|state|ndesConnectorState|Ndes Connector Status. Possible values are: `none`, `active`, `inactive`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [ndesConnector](../resources/ndesconnector.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_ndesconnector"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/ndesConnectors/{ndesConnectorId}
Content-Type: application/json
Content-length: 156

{
  "@odata.type": "#microsoft.graph.ndesConnector",
  "displayName": "String",
  "lastConnectionDateTime": "String (timestamp)",
  "state": "String"
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
  "@odata.type": "#microsoft.graph.ndesConnector",
  "id": "710a4e66-4e66-710a-664e-0a71664e0a71",
  "displayName": "String",
  "lastConnectionDateTime": "String (timestamp)",
  "state": "String"
}
```

