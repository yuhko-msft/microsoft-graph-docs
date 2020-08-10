---
title: "Get EmployeeGraphQLResponse"
description: "Read the properties and relationships of an EmployeeGraphQLResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get EmployeeGraphQLResponse
Namespace: microsoft.graph.linkedIn

Read the properties and relationships of an [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object.

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
GET /EmployeeGraphQLResponse
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

If successful, this method returns a `200 OK` response code and an [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_employeegraphqlresponse"
}
-->
``` http
GET https://graph.microsoft.com/beta/EmployeeGraphQLResponse
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.linkedIn.EmployeeGraphQLResponse"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.linkedIn.EmployeeGraphQLResponse",
    "id": "4370c552-c552-4370-52c5-704352c57043",
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

