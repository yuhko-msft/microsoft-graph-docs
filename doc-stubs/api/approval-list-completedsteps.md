---
title: "List completedSteps"
description: "Get the approvalStep resources from the completedSteps navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List completedSteps
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the approvalStep resources from the completedSteps navigation property.

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
GET /users/{usersId}/approvals/{approvalId}/completedSteps
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

If successful, this method returns a `200 OK` response code and a collection of [approvalStep](../resources/approvalstep.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_approvalstep"
}
-->
``` http
GET https://graph.microsoft.com/beta/users/{usersId}/approvals/{approvalId}/completedSteps
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.approvalStep)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.approvalStep",
      "id": "c4f8f097-f097-c4f8-97f0-f8c497f0f8c4",
      "displayName": "String",
      "reviewedBy": {
        "@odata.type": "microsoft.graph.identity"
      },
      "reviewedDateTime": "String (timestamp)",
      "reviewResult": "String",
      "justification": "String"
    }
  ]
}
```

