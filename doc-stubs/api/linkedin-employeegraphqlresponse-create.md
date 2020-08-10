---
title: "Create EmployeeGraphQLResponse"
description: "Create a new EmployeeGraphQLResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create EmployeeGraphQLResponse
Namespace: microsoft.graph.linkedIn

Create a new [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object.

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
POST ** Collection URI for microsoft.graph.linkedIn.EmployeeGraphQLResponse not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object.

The following table shows the properties that are required when you create the [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/linkedin-entity.md)|
|data|[EmployeeResponseData](../resources/linkedin-employeeresponsedata.md)|**TODO: Add Description**|
|errors|[ResponseError](../resources/linkedin-responseerror.md) collection|**TODO: Add Description**|
|extensions|[ResponseExtensions](../resources/linkedin-responseextensions.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_employeegraphqlresponse_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.linkedIn.EmployeeGraphQLResponse not found
Content-Type: application/json
Content-length: 350

{
  "@odata.type": "#microsoft.graph.linkedIn.EmployeeGraphQLResponse",
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
HTTP/1.1 201 Created

Content-Type: application/json
{
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
```

