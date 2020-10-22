---
title: "Get urlAssessmentRequest"
description: "Read the properties and relationships of an urlAssessmentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get urlAssessmentRequest
Namespace: microsoft.graph

Read the properties and relationships of an [urlAssessmentRequest](../resources/urlassessmentrequest.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET ** Entity URI for microsoft.graph.urlAssessmentRequest not found
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

If successful, this method returns a `200 OK` response code and an [urlAssessmentRequest](../resources/urlassessmentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_urlassessmentrequest"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.urlAssessmentRequest not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.urlAssessmentRequest"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.urlAssessmentRequest",
    "id": "c168de8a-de8a-c168-8ade-68c18ade68c1",
    "createdDateTime": "String (timestamp)",
    "contentType": "String",
    "expectedAssessment": "String",
    "category": "String",
    "status": "String",
    "requestSource": "String",
    "createdBy": {
      "@odata.type": "microsoft.graph.identitySet"
    },
    "url": "String"
  }
}
```

