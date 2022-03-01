---
title: "List impactedResources for a given recommendation"
description: "List the recommendationResource resources from the impactedResources navigation property."
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# List impactedResources for a given recommendation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

List the recommendationResource resources from the impactedResources navigation property.

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
GET /directory/recommendations/{recommendationId}?$expand=impactedResources
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
GET https://graph.microsoft.com/beta/directory/recommendations/{recommendationId}?$expand=impactedResources
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