---
title: "Update educationRubricOutcome"
description: "Update the properties of an educationRubricOutcome object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update educationRubricOutcome
Namespace: microsoft.graph



Update the properties of an [educationRubricOutcome](../resources/educationrubricoutcome.md) object.

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
PATCH /educationRubricOutcome
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationRubricOutcome](../resources/educationrubricoutcome.md) object.

The following table shows the properties that are required when you update the [educationRubricOutcome](../resources/educationrubricoutcome.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|publishedRubricQualityFeedback|[rubricQualityFeedbackModel](../resources/rubricqualityfeedbackmodel.md) collection|**TODO: Add Description**|
|publishedRubricQualitySelectedLevels|[rubricQualitySelectedColumnModel](../resources/rubricqualityselectedcolumnmodel.md) collection|**TODO: Add Description**|
|rubricQualityFeedback|[rubricQualityFeedbackModel](../resources/rubricqualityfeedbackmodel.md) collection|**TODO: Add Description**|
|rubricQualitySelectedLevels|[rubricQualitySelectedColumnModel](../resources/rubricqualityselectedcolumnmodel.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [educationRubricOutcome](../resources/educationrubricoutcome.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_educationrubricoutcome"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/educationRubricOutcome
Content-Type: application/json
Content-length: 574

{
  "@odata.type": "#microsoft.graph.educationRubricOutcome",
  "publishedRubricQualityFeedback": [
    {
      "@odata.type": "microsoft.graph.rubricQualityFeedbackModel"
    }
  ],
  "publishedRubricQualitySelectedLevels": [
    {
      "@odata.type": "microsoft.graph.rubricQualitySelectedColumnModel"
    }
  ],
  "rubricQualityFeedback": [
    {
      "@odata.type": "microsoft.graph.rubricQualityFeedbackModel"
    }
  ],
  "rubricQualitySelectedLevels": [
    {
      "@odata.type": "microsoft.graph.rubricQualitySelectedColumnModel"
    }
  ]
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
  "@odata.type": "#microsoft.graph.educationRubricOutcome",
  "id": "258df925-f925-258d-25f9-8d2525f98d25",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "publishedRubricQualityFeedback": [
    {
      "@odata.type": "microsoft.graph.rubricQualityFeedbackModel"
    }
  ],
  "publishedRubricQualitySelectedLevels": [
    {
      "@odata.type": "microsoft.graph.rubricQualitySelectedColumnModel"
    }
  ],
  "rubricQualityFeedback": [
    {
      "@odata.type": "microsoft.graph.rubricQualityFeedbackModel"
    }
  ],
  "rubricQualitySelectedLevels": [
    {
      "@odata.type": "microsoft.graph.rubricQualitySelectedColumnModel"
    }
  ]
}
```

