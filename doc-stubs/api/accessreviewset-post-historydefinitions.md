---
title: "Create accessReviewHistoryDefinition"
description: "Create a new accessReviewHistoryDefinition object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create accessReviewHistoryDefinition
Namespace: microsoft.graph



Create a new accessReviewHistoryDefinition object.

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
POST /identityGovernance/accessReviews/historyDefinitions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessReviewHistoryDefinition](../resources/accessreviewhistorydefinition.md) object.

The following table shows the properties that are required when you create the [accessReviewHistoryDefinition](../resources/accessreviewhistorydefinition.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdBy|[userIdentity](../resources/useridentity.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|decisions|accessReviewHistoryDecisionFilter collection|**TODO: Add Description**. Possible values are: `approve`, `deny`, `notReviewed`, `dontKnow`, `notNotified`, `unknownFutureValue`.|
|displayName|String|**TODO: Add Description**|
|downloadUri|String|**TODO: Add Description**|
|fulfilledDateTime|DateTimeOffset|**TODO: Add Description**|
|reviewHistoryPeriodEndDateTime|DateTimeOffset|**TODO: Add Description**|
|reviewHistoryPeriodStartDateTime|DateTimeOffset|**TODO: Add Description**|
|scopes|[accessReviewScope](../resources/accessreviewscope.md) collection|**TODO: Add Description**|
|status|accessReviewHistoryStatus|**TODO: Add Description**. Possible values are: `done`, `inprogress`, `error`, `requested`, `unknownFutureValue`.|



## Response

If successful, this method returns a `201 Created` response code and an [accessReviewHistoryDefinition](../resources/accessreviewhistorydefinition.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_accessreviewhistorydefinition_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identityGovernance/accessReviews/historyDefinitions
Content-Type: application/json
Content-length: 522

{
  "@odata.type": "#microsoft.graph.accessReviewHistoryDefinition",
  "createdBy": {
    "@odata.type": "microsoft.graph.userIdentity"
  },
  "decisions": [
    "String"
  ],
  "displayName": "String",
  "downloadUri": "String",
  "fulfilledDateTime": "String (timestamp)",
  "reviewHistoryPeriodEndDateTime": "String (timestamp)",
  "reviewHistoryPeriodStartDateTime": "String (timestamp)",
  "scopes": [
    {
      "@odata.type": "microsoft.graph.accessReviewScope"
    }
  ],
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.accessReviewHistoryDefinition"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.accessReviewHistoryDefinition",
  "id": "97bcdc37-dc37-97bc-37dc-bc9737dcbc97",
  "createdBy": {
    "@odata.type": "microsoft.graph.userIdentity"
  },
  "createdDateTime": "String (timestamp)",
  "decisions": [
    "String"
  ],
  "displayName": "String",
  "downloadUri": "String",
  "fulfilledDateTime": "String (timestamp)",
  "reviewHistoryPeriodEndDateTime": "String (timestamp)",
  "reviewHistoryPeriodStartDateTime": "String (timestamp)",
  "scopes": [
    {
      "@odata.type": "microsoft.graph.accessReviewScope"
    }
  ],
  "status": "String"
}
```

