---
title: "recommendation: reactivate"
description: "Reactivate a completed, dismissed, or postponed recommendation object."
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# Reactivate a recommendation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Reactivate a completed, dismissed, or postponed recommendation object. This action updates the **status** of the [recommendation](../resources/recommendation.md) to `active`. This method only works when the **status** of the recommendation is `completedByUser`, `dismissed`, or `postponed`.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|DirectoryRecommendations.ReadWrite.All|
|Delegated (personal Microsoft account)|Not supported.|
|Application|DirectoryRecommendations.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /directory/recommendations/{recommendationId}/reactivate
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [recommendation](../resources/recommendation.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "recommendationthis.reactivate"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/recommendations/{recommendationId}/reactivate
```


### Response
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
    "id": "String (identifier)",
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

