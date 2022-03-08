---
title: "Get recommendationResource"
description: "Read the properties and relationships of an Azure AD resource that's associated with a recommendation."
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# Get recommendationResource
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an Azure AD [resource](../resources/recommendationresource.md) that's associated with a [recommendation](../resources/recommendation.md).

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|DirectoryRecommendations.Read.All, DirectoryRecommendations.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|DirectoryRecommendations.Read.All, DirectoryRecommendations.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /directory/impactedResources/{recommendationResourceId}
```

## Optional query parameters
This method supports the `$select` OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [recommendationResource](../resources/recommendationresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_recommendationresource"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/impactedResources/{recommendationResourceId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.recommendationResource"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

