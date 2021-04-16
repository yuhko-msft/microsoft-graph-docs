---
title: "List userExperienceAnalyticsScoreHistory"
description: "Get the userExperienceAnalyticsScoreHistory resources from the userExperienceAnalyticsScoreHistory navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List userExperienceAnalyticsScoreHistory
Namespace: microsoft.graph



Get the userExperienceAnalyticsScoreHistory resources from the userExperienceAnalyticsScoreHistory navigation property.

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
GET /deviceManagement/userExperienceAnalyticsScoreHistory
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

If successful, this method returns a `200 OK` response code and a collection of [userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_userexperienceanalyticsscorehistory"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsScoreHistory
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.userExperienceAnalyticsScoreHistory)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.userExperienceAnalyticsScoreHistory",
      "id": "446ef65b-f65b-446e-5bf6-6e445bf66e44",
      "coreBootScore": "Integer",
      "coreSigninScore": "Integer",
      "recommendedSoftwareScore": "Integer",
      "restartScore": "Integer",
      "startupDateTime": "String (timestamp)",
      "startupScore": "Integer"
    }
  ]
}
```

