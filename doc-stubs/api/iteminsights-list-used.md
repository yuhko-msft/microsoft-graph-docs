---
title: "List used"
description: "Get the usedInsight resources from the used navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List used
Namespace: microsoft.graph



Get the usedInsight resources from the used navigation property.

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
GET /users/{usersId}/insights/used
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

If successful, this method returns a `200 OK` response code and a collection of [usedInsight](../resources/usedinsight.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_usedinsight"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/users/{usersId}/insights/used
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.usedInsight)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.usedInsight",
      "id": "1958eb08-eb08-1958-08eb-581908eb5819",
      "lastUsed": {
        "@odata.type": "microsoft.graph.usageDetails"
      },
      "resourceReference": {
        "@odata.type": "microsoft.graph.resourceReference"
      },
      "resourceVisualization": {
        "@odata.type": "microsoft.graph.resourceVisualization"
      }
    }
  ]
}
```

