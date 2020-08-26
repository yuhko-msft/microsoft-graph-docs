---
title: "List extensions"
description: "Get the extensions from the extensions navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List extensions
Namespace: microsoft.graph

Get the extensions from the extensions navigation property.

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
GET /me/extensions
GET /users/{usersId}/extensions
GET /lists/{listsId}/extensions
GET /tasks/{tasksId}/extensions
GET /groups/{groupsId}/extensions
GET /devices/{devicesId}/extensions
GET /organization/{organizationId}/extensions
GET /administrativeUnits/{administrativeUnitsId}/extensions
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

If successful, this method returns a `200 OK` response code and a collection of [extension](../resources/extension.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_extension"
}
-->
``` http
GET https://graph.microsoft.com/beta/me/extensions
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.extension)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.extension",
      "id": "21b4c74b-c74b-21b4-4bc7-b4214bc7b421"
    }
  ]
}
```

