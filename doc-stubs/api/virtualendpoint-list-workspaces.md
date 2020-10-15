---
title: "List workspaces"
description: "Get the WorkspaceResponseModel resources from the workspaces navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List workspaces
Namespace: microsoft.graph

Get the WorkspaceResponseModel resources from the workspaces navigation property.

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
GET /workspaces
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

If successful, this method returns a `200 OK` response code and a collection of [WorkspaceResponseModel](../resources/workspaceresponsemodel.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_workspaceresponsemodel"
}
-->
``` http
GET https://graph.microsoft.com/beta/workspaces
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.WorkspaceResponseModel)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.WorkspaceResponseModel",
      "id": "1eec3ba2-3ba2-1eec-a23b-ec1ea23bec1e",
      "image": "String",
      "servicePlanName": "String",
      "deviceName": "String",
      "servicePlanId": "String",
      "displayName": "String",
      "status": "String",
      "userPrincipalName": "String",
      "lastModifiedDateTime": "String (timestamp)"
    }
  ]
}
```

