---
title: "EmployeeGraphQLResponse: discovery"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# EmployeeGraphQLResponse: discovery
Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

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
POST ** Collection URI for microsoft.graph.linkedIn.EmployeeGraphQLResponse not found/discovery
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|queryId|String|**TODO: Add Description**|
|query|String|**TODO: Add Description**|
|operationName|String|**TODO: Add Description**|
|variables|[Any](../resources/linkedin-any.md)|**TODO: Add Description**|
|version|Int32|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "employeegraphqlresponse_discovery"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.linkedIn.EmployeeGraphQLResponse not found/discovery

Content-Type: application/json
Content-length: 179

{
  "queryId": "String",
  "query": "String",
  "operationName": "String",
  "variables": {
    "@odata.type": "microsoft.graph.linkedIn.Any"
  },
  "version": "Integer"
}
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
    "id": "String (identifier)",
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

