---
title: "List governanceResource"
description: "Get the governanceResource resources from the resource navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List governanceResource
Namespace: microsoft.graph



Get the governanceResource resources from the resource navigation property.

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
GET /governanceRoleAssignments/{governanceRoleAssignmentsId}/resource
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

If successful, this method returns a `200 OK` response code and a collection of [governanceResource](../resources/governanceresource.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_governanceresource"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/governanceRoleAssignments/{governanceRoleAssignmentsId}/resource
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.governanceResource)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.governanceResource",
      "id": "8c721898-1898-8c72-9818-728c9818728c",
      "displayName": "String",
      "externalId": "String",
      "registeredDateTime": "String (timestamp)",
      "registeredRoot": "String",
      "status": "String",
      "type": "String"
    }
  ]
}
```

