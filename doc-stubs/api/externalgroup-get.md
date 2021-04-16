---
title: "Get externalGroup"
description: "Read the properties and relationships of an externalGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get externalGroup
Namespace: microsoft.graph



Read the properties and relationships of an [externalGroup](../resources/externalgroup.md) object.

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
GET /external/connections/{externalConnectionId}/groups/{externalGroupId}
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

If successful, this method returns a `200 OK` response code and an [externalGroup](../resources/externalgroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_externalgroup"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/external/connections/{externalConnectionId}/groups/{externalGroupId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.externalGroup"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.externalGroup",
    "id": "305b27cc-27cc-305b-cc27-5b30cc275b30",
    "description": "String",
    "displayName": "String"
  }
}
```

