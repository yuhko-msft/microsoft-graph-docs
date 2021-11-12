---
title: "List recommendations"
description: "Get a list of the recommendation objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List recommendations
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [recommendation](../resources/recommendation.md) objects and their properties.

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
GET /directory/recommendations
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

If successful, this method returns a `200 OK` response code and a collection of [recommendation](../resources/recommendation.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_recommendation"
}
-->
``` http
GET https://graph.microsoft.com/beta/directory/recommendations
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.recommendation)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
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
  ]
}
```

