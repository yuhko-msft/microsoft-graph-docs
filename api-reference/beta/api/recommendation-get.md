---
title: "Get recommendation"
description: "Retrieve a single Azure AD recommendation object."
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# Get a recommendation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Retrieve a single Azure AD [recommendation](../resources/recommendation.md) object.

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
GET /directory/recommendations/{recommendationId}
```

## Optional query parameters
This method supports the `$select` and `$expand` OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [recommendation](../resources/recommendation.md) object in the response body.

## Examples

### Example 1: Get a recommendation object without its associated resources

#### Request
<!-- {
  "blockType": "request",
  "name": "get_recommendation"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/recommendations/{recommendationId}
```


#### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.recommendation"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.recommendation",
    "id": "d98332df-8837-eece-3036-9e0c3579ad01",
    "actionSteps": [
      {
        "@odata.type": "microsoft.graph.actionStep"
      }
    ],
    "benefits": "String",
    "category": "String",
    "createdDateTime": "String (timestamp)",
    "currentScore": "Double",
    "displayName": "String",
    "featureArea": "String",
    "impactType": "String",
    "impactStartDateTime": "String (timestamp)",
    "implementationCost": "String",
    "insights": "String",
    "lastCheckedDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "lastModifiedBy": "String",
    "maxScore": "Double",
    "postponeUntilDateTime": "String (timestamp)",
    "priority": "String",
    "provider": "String",
    "status": "String"
  }
}
```

### Example 2: Get a recommendation object with its associated resources

#### Request
<!-- {
  "blockType": "request",
  "name": "get_recommendation_expand_impactedresources"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/recommendations/{recommendationId}?$expand=impactedResources
```


#### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.recommendation"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.recommendation",
    "id": "d98332df-8837-eece-3036-9e0c3579ad01",
    "createdDateTime": "String (timestamp)", 
    "impactStartDateTime": "String (timestamp)",
    "postponeUntilDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "lastModifiedBy": "String",
    "displayName": "String",
    "insights": "String",
    "benefits": "String",
    "category": "String",
    "status": "String",
    "priority": "String",
    "impactType": "String",   
    "actionSteps": [
      {
        "@odata.type": "microsoft.graph.actionStep"
      }
    ],
    "impactedResources@odata.context" : "String",
    "impactedResources" : [],
    "currentScore": "Double",
    "featureArea": "String",
    "implementationCost": "String",
    "lastCheckedDateTime": "String (timestamp)",
    "maxScore": "Double",
    "provider": "String",
  }
}
```