---
title: "Get jobResponseBase"
description: "Read the properties and relationships of a jobResponseBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get jobResponseBase
Namespace: microsoft.graph



Read the properties and relationships of a [jobResponseBase](../resources/jobresponsebase.md) object.

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
GET /dataClassification/jobs/{jobResponseBaseId}
GET /dataClassification/classifyFileJobs/{jobResponseBaseId}
GET /dataClassification/classifyTextJobs/{jobResponseBaseId}
GET /dataClassification/evaluateLabelJobs/{jobResponseBaseId}
GET /dataClassification/evaluateDlpPoliciesJobs/{jobResponseBaseId}
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

If successful, this method returns a `200 OK` response code and a [jobResponseBase](../resources/jobresponsebase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_jobresponsebase"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/dataClassification/jobs/{jobResponseBaseId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.jobResponseBase"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

