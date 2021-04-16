---
title: "Create educationFeedbackOutcome"
description: "Create a new educationFeedbackOutcome object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create educationFeedbackOutcome
Namespace: microsoft.graph



Create a new [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) object.

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
POST ** Collection URI for microsoft.graph.educationFeedbackOutcome not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) object.

The following table shows the properties that are required when you create the [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|feedback|[educationFeedback](../resources/educationfeedback.md)|**TODO: Add Description**|
|publishedFeedback|[educationFeedback](../resources/educationfeedback.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_educationfeedbackoutcome_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.educationFeedbackOutcome not found
Content-Type: application/json
Content-length: 233

{
  "@odata.type": "#microsoft.graph.educationFeedbackOutcome",
  "feedback": {
    "@odata.type": "microsoft.graph.educationFeedback"
  },
  "publishedFeedback": {
    "@odata.type": "microsoft.graph.educationFeedback"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.educationFeedbackOutcome"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.educationFeedbackOutcome",
  "id": "11150967-0967-1115-6709-151167091511",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "feedback": {
    "@odata.type": "microsoft.graph.educationFeedback"
  },
  "publishedFeedback": {
    "@odata.type": "microsoft.graph.educationFeedback"
  }
}
```

