---
title: "List playPromptOperations"
description: "Get a list of the playPromptOperation objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List playPromptOperations
Namespace: microsoft.graph



Get a list of the [playPromptOperation](../resources/playpromptoperation.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.playPromptOperation not found
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

If successful, this method returns a `200 OK` response code and a collection of [playPromptOperation](../resources/playpromptoperation.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_playpromptoperation"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.playPromptOperation not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.playPromptOperation)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.playPromptOperation",
      "id": "4ed33b9f-3b9f-4ed3-9f3b-d34e9f3bd34e",
      "clientContext": "String",
      "resultInfo": {
        "@odata.type": "microsoft.graph.resultInfo"
      },
      "status": "String",
      "completionReason": "String"
    }
  ]
}
```

