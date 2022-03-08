---
title: "recommendationResource: reactivate"
description: "Reactivate an accidentally dismissed, completed, or postponed recommendationResource object."
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# recommendationResource: reactivate
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Reactivate an accidentally dismissed, completed, or postponed **recommendationResource** object. This action updates the **status** of the resource to `active`. This method is relevant only if the status of the **recommendationResource** object is `dismissed`, `postponed`, or `completedByUser`. 

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
POST /directory/impactedResources/{recommendationResourceId}/reactivate
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [recommendationResource](../resources/recommendationresource.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "recommendationresourcethis.reactivate"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/impactedResources/{recommendationResourceId}/reactivate
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
    "id": "String (identifier)",
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

