---
title: "Update recommendation"
description: "Update the properties of a recommendation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update recommendation
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [recommendation](../resources/recommendation.md) object.

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
PATCH /directory/recommendations/{recommendationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|actionSteps|[actionStep](../resources/actionstep.md) collection|**TODO: Add Description** Optional.|
|benefits|String|**TODO: Add Description** Optional.|
|category|recommendationCategory|**TODO: Add Description**. The possible values are: `usageAndCompliance`, `security`, `productivity`, `health`, `configuration`, `unknownFutureValue`. Required.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|currentScore|Double|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Required.|
|featureArea|String|**TODO: Add Description** Optional.|
|impactType|String|**TODO: Add Description** Optional.|
|impactStartDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|implementationCost|implementationCost|**TODO: Add Description**. The possible values are: `low`, `moderate`, `high`. Optional.|
|insights|String|**TODO: Add Description** Optional.|
|lastCheckedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|lastModifiedBy|String|**TODO: Add Description** Optional.|
|maxScore|Double|**TODO: Add Description** Optional.|
|postponeUntilDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|priority|recommendationPriority|**TODO: Add Description**. The possible values are: `low`, `medium`, `high`. Required.|
|provider|String|**TODO: Add Description** Optional.|
|status|recommendationStatus|**TODO: Add Description**. The possible values are: `active`, `completedBySystem`, `completedByUser`, `dismissed`, `postponed`, `unknownFutureValue`. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [recommendation](../resources/recommendation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_recommendation"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/directory/recommendations/{recommendationId}
Content-Type: application/json
Content-length: 613

{
  "@odata.type": "#microsoft.graph.recommendation",
  "actionSteps": [
    {
      "@odata.type": "microsoft.graph.actionStep"
    }
  ],
  "benefits": "String",
  "category": "String",
  "currentScore": "Double",
  "displayName": "String",
  "featureArea": "String",
  "impactType": "String",
  "impactStartDateTime": "String (timestamp)",
  "implementationCost": "String",
  "insights": "String",
  "lastCheckedDateTime": "String (timestamp)",
  "maxScore": "Double",
  "postponeUntilDateTime": "String (timestamp)",
  "priority": "String",
  "provider": "String",
  "status": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

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
```

