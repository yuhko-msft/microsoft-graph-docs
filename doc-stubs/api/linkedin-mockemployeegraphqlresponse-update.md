---
title: "Update MockEmployeeGraphQLResponse"
description: "Update the properties of a MockEmployeeGraphQLResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update MockEmployeeGraphQLResponse
Namespace: microsoft.graph.linkedIn

Update the properties of a [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object.

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
PATCH /discover/{discoverId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object.

The following table shows the properties that are required when you create the [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/linkedin-entity.md)|
|data|[EmployeeResponseData](../resources/linkedin-employeeresponsedata.md)|**TODO: Add Description** Inherited from [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|
|errors|[ResponseError](../resources/linkedin-responseerror.md) collection|**TODO: Add Description** Inherited from [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|
|extensions|[ResponseExtensions](../resources/linkedin-responseextensions.md)|**TODO: Add Description** Inherited from [EmployeeGraphQLResponse](../resources/linkedin-employeegraphqlresponse.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [MockEmployeeGraphQLResponse](../resources/linkedin-mockemployeegraphqlresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mockemployeegraphqlresponse"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/discover/{discoverId}
Content-Type: application/json
Content-length: 354

{
  "@odata.type": "#microsoft.graph.linkedIn.MockEmployeeGraphQLResponse",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
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
```

