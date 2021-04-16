---
title: "Get accessReviewInstanceDecisionItem"
description: "Read the properties and relationships of an accessReviewInstanceDecisionItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get accessReviewInstanceDecisionItem
Namespace: microsoft.graph



Read the properties and relationships of an [accessReviewInstanceDecisionItem](../resources/accessreviewinstancedecisionitem.md) object.

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
GET /me/pendingAccessReviewInstances/{accessReviewInstanceId}/decisions/{accessReviewInstanceDecisionItemId}
GET /users/{usersId}/pendingAccessReviewInstances/{accessReviewInstanceId}/decisions/{accessReviewInstanceDecisionItemId}
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

If successful, this method returns a `200 OK` response code and an [accessReviewInstanceDecisionItem](../resources/accessreviewinstancedecisionitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_accessreviewinstancedecisionitem"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/pendingAccessReviewInstances/{accessReviewInstanceId}/decisions/{accessReviewInstanceDecisionItemId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.accessReviewInstanceDecisionItem"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.accessReviewInstanceDecisionItem",
    "id": "c6298f88-8f88-c629-888f-29c6888f29c6",
    "accessReviewId": "String",
    "appliedBy": {
      "@odata.type": "microsoft.graph.userIdentity"
    },
    "appliedDateTime": "String (timestamp)",
    "applyResult": "String",
    "decision": "String",
    "justification": "String",
    "principal": {
      "@odata.type": "microsoft.graph.identity"
    },
    "principalLink": "String",
    "recommendation": "String",
    "resource": {
      "@odata.type": "microsoft.graph.accessReviewInstanceDecisionItemResource"
    },
    "resourceLink": "String",
    "reviewedBy": {
      "@odata.type": "microsoft.graph.userIdentity"
    },
    "reviewedDateTime": "String (timestamp)",
    "target": {
      "@odata.type": "microsoft.graph.accessReviewInstanceDecisionItemTarget"
    }
  }
}
```

