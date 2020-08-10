---
title: "List LegacyMockEmployeeGraphQLResponses"
description: "Get a list of the LegacyMockEmployeeGraphQLResponse objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List LegacyMockEmployeeGraphQLResponses
Namespace: microsoft.graph.linkedIn

Get a list of the [LegacyMockEmployeeGraphQLResponse](../resources/legacymockemployeegraphqlresponse.md) objects and their properties.

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
GET /graphSandbox
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

If successful, this method returns a `200 OK` response code and a collection of [LegacyMockEmployeeGraphQLResponse](../resources/legacymockemployeegraphqlresponse.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_legacymockemployeegraphqlresponse"
}
-->
``` http
GET https://graph.microsoft.com/beta/graphSandbox
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.linkedIn.LegacyMockEmployeeGraphQLResponse)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.linkedIn.LegacyMockEmployeeGraphQLResponse",
      "id": "272319bf-19bf-2723-bf19-2327bf192327",
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
  ]
}
```

