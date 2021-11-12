---
title: "Dismiss a recommendation"
description: "Updates the status of a recommendation to dismissed"
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: apiPageType
---

# Dismiss a recommendation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Updates the status of a [recommendation](../resources/recommendation.md) to `dismissed` if you deem the recommendation inapplicable.

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
POST /directory/recommendations/{recommendationId}/dismiss
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|dismissReason|String|Audited reason for deeming a recommendation inapplicable to you.|



## Response

If successful, this action returns a `200 OK` response code and a [recommendation](../resources/recommendation.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "recommendationthis.dismiss"
}
-->
``` http
POST https://graph.microsoft.com/beta/directory/recommendations/{recommendationId}/dismiss
Content-Type: application/json
Content-length: 33

{
  "dismissReason": "String"
}
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

