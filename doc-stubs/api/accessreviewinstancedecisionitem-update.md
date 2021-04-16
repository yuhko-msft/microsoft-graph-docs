---
title: "Update accessReviewInstanceDecisionItem"
description: "Update the properties of an accessReviewInstanceDecisionItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update accessReviewInstanceDecisionItem
Namespace: microsoft.graph



Update the properties of an [accessReviewInstanceDecisionItem](../resources/accessreviewinstancedecisionitem.md) object.

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
PATCH /me/pendingAccessReviewInstances/{accessReviewInstanceId}/decisions/{accessReviewInstanceDecisionItemId}
PATCH /users/{usersId}/pendingAccessReviewInstances/{accessReviewInstanceId}/decisions/{accessReviewInstanceDecisionItemId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessReviewInstanceDecisionItem](../resources/accessreviewinstancedecisionitem.md) object.

The following table shows the properties that are required when you update the [accessReviewInstanceDecisionItem](../resources/accessreviewinstancedecisionitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessReviewId|String|**TODO: Add Description**|
|appliedBy|[userIdentity](../resources/useridentity.md)|**TODO: Add Description**|
|appliedDateTime|DateTimeOffset|**TODO: Add Description**|
|applyResult|String|**TODO: Add Description**|
|decision|String|**TODO: Add Description**|
|justification|String|**TODO: Add Description**|
|principal|[identity](../resources/identity.md)|**TODO: Add Description**|
|principalLink|String|**TODO: Add Description**|
|recommendation|String|**TODO: Add Description**|
|resource|[accessReviewInstanceDecisionItemResource](../resources/accessreviewinstancedecisionitemresource.md)|**TODO: Add Description**|
|resourceLink|String|**TODO: Add Description**|
|reviewedBy|[userIdentity](../resources/useridentity.md)|**TODO: Add Description**|
|reviewedDateTime|DateTimeOffset|**TODO: Add Description**|
|target|[accessReviewInstanceDecisionItemTarget](../resources/accessreviewinstancedecisionitemtarget.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [accessReviewInstanceDecisionItem](../resources/accessreviewinstancedecisionitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_accessreviewinstancedecisionitem"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/pendingAccessReviewInstances/{accessReviewInstanceId}/decisions/{accessReviewInstanceDecisionItemId}
Content-Type: application/json
Content-length: 789

{
  "@odata.type": "#microsoft.graph.accessReviewInstanceDecisionItem",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```

