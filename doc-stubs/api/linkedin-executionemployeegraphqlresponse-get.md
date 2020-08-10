---
title: "Get ExecutionEmployeeGraphQLResponse"
description: "Read the properties and relationships of an ExecutionEmployeeGraphQLResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get ExecutionEmployeeGraphQLResponse
Namespace: microsoft.graph.linkedIn

Read the properties and relationships of an [ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md) object.

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
GET /execute/{executeId}
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

If successful, this method returns a `200 OK` response code and an [ExecutionEmployeeGraphQLResponse](../resources/linkedin-executionemployeegraphqlresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_executionemployeegraphqlresponse"
}
-->
``` http
GET https://graph.microsoft.com/beta/execute/{executeId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.linkedIn.ExecutionEmployeeGraphQLResponse"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.linkedIn.ExecutionEmployeeGraphQLResponse",
    "id": "e73432fd-32fd-e734-fd32-34e7fd3234e7",
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

