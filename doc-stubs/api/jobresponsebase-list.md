---
title: "List jobResponseBases"
description: "Get a list of the jobResponseBase objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List jobResponseBases
Namespace: microsoft.graph



Get a list of the [jobResponseBase](../resources/jobresponsebase.md) objects and their properties.

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
GET /dataClassification/jobs
GET /dataClassification/classifyFileJobs
GET /dataClassification/classifyTextJobs
GET /dataClassification/evaluateLabelJobs
GET /dataClassification/evaluateDlpPoliciesJobs
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

If successful, this method returns a `200 OK` response code and a collection of [jobResponseBase](../resources/jobresponsebase.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_jobresponsebase"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/dataClassification/jobs
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.jobResponseBase)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.jobResponseBase",
      "id": "5a29e3a9-e3a9-5a29-a9e3-295aa9e3295a",
      "creationDateTime": "String (timestamp)",
      "endDateTime": "String (timestamp)",
      "error": {
        "@odata.type": "microsoft.graph.classificationError"
      },
      "startDateTime": "String (timestamp)",
      "status": "String",
      "tenantId": "String",
      "type": "String"
    }
  ]
}
```

