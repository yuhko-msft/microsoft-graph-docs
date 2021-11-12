---
title: "List impactedResources"
description: "Get the recommendationResource resources from the impactedResources navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List impactedResources
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the recommendationResource resources from the impactedResources navigation property.

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
GET /directory/recommendations/{recommendationId}/impactedResources
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

If successful, this method returns a `200 OK` response code and a collection of [recommendationResource](../resources/recommendationresource.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_recommendationresource"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/recommendations/{recommendationId}/impactedResources
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.recommendationResource)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.recommendationResource",
      "id": "4ce28e9b-3260-5d4e-0b4f-860d5ff18fa2",
      "recommendationId": "String",
      "addedDateTime": "String (timestamp)",
      "portalUrl": "String",
      "apiUrl": "String",
      "displayName": "String",
      "resourceType": "String",
      "owner": "String",
      "rank": "Integer",
      "status": "String",
      "additionalDetails": [
        {
          "@odata.type": "microsoft.graph.keyValue"
        }
      ]
    }
  ]
}
```

