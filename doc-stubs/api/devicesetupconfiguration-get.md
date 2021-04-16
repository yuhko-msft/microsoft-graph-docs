---
title: "Get deviceSetupConfiguration"
description: "Read the properties and relationships of a deviceSetupConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceSetupConfiguration
Namespace: microsoft.graph



Read the properties and relationships of a [deviceSetupConfiguration](../resources/devicesetupconfiguration.md) object.

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
GET /deviceSetupConfiguration
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

If successful, this method returns a `200 OK` response code and a [deviceSetupConfiguration](../resources/devicesetupconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicesetupconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceSetupConfiguration
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceSetupConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceSetupConfiguration",
    "id": "ab859210-9210-ab85-1092-85ab109285ab",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "version": "Integer"
  }
}
```

