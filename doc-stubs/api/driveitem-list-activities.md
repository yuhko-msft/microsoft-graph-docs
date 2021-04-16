---
title: "List activities"
description: "Get the itemActivityOLD resources from the activities navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List activities
Namespace: microsoft.graph



Get the itemActivityOLD resources from the activities navigation property.

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
GET /workbooks/{workbooksId}/activities
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

If successful, this method returns a `200 OK` response code and a collection of [itemActivityOLD](../resources/itemactivityold.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_itemactivityold"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/workbooks/{workbooksId}/activities
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.itemActivityOLD)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.itemActivityOLD",
      "id": "a68c92f1-92f1-a68c-f192-8ca6f1928ca6",
      "action": {
        "@odata.type": "microsoft.graph.itemActionSet"
      },
      "actor": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "times": {
        "@odata.type": "microsoft.graph.itemActivityTimeSet"
      }
    }
  ]
}
```

