---
title: "Get evaluateLabelJobResponse"
description: "Read the properties and relationships of an evaluateLabelJobResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get evaluateLabelJobResponse
Namespace: microsoft.graph



Read the properties and relationships of an [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object.

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
GET /evaluateLabelJobResponse
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

If successful, this method returns a `200 OK` response code and an [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_evaluatelabeljobresponse"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/evaluateLabelJobResponse
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.evaluateLabelJobResponse"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.evaluateLabelJobResponse",
    "id": "804a772c-772c-804a-2c77-4a802c774a80",
    "creationDateTime": "String (timestamp)",
    "endDateTime": "String (timestamp)",
    "error": {
      "@odata.type": "microsoft.graph.classificationError"
    },
    "startDateTime": "String (timestamp)",
    "status": "String",
    "tenantId": "String",
    "type": "String",
    "result": {
      "@odata.type": "microsoft.graph.evaluateLabelJobResultGroup"
    }
  }
}
```

