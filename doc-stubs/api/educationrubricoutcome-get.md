---
title: "Get educationRubricOutcome"
description: "Read the properties and relationships of an educationRubricOutcome object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get educationRubricOutcome
Namespace: microsoft.graph



Read the properties and relationships of an [educationRubricOutcome](../resources/educationrubricoutcome.md) object.

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
GET /educationRubricOutcome
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

If successful, this method returns a `200 OK` response code and an [educationRubricOutcome](../resources/educationrubricoutcome.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_educationrubricoutcome"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/educationRubricOutcome
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.educationRubricOutcome"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

