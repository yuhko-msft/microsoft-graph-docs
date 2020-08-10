---
title: "Get MockEmployeeGraphQLResponse"
description: "Read the properties and relationships of a MockEmployeeGraphQLResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get MockEmployeeGraphQLResponse
Namespace: microsoft.graph.linkedIn

Read the properties and relationships of a [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /discover/{discoverId}
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

If successful, this method returns a `200 OK` response code and a [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_mockemployeegraphqlresponse"
}
-->
``` http
GET https://graph.microsoft.com/beta/discover/{discoverId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.linkedIn.MockEmployeeGraphQLResponse"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.linkedIn.MockEmployeeGraphQLResponse",
    "id": "252e62aa-62aa-252e-aa62-2e25aa622e25",
    "data": {
      "@odata.type": "microsoft.graph.linkedIn.EmployeeResponseData"
    },
    "errors": [
      {
        "@odata.type": "microsoft.graph.linkedIn.ResponseError"
      }
    ],
    "extensions": {
      "@odata.type": "microsoft.graph.linkedIn.ResponseExtensions"
    }
  }
}
```

