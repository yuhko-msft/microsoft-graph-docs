---
title: "Get exactMatchLookupJob"
description: "Read the properties and relationships of an exactMatchLookupJob object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get exactMatchLookupJob
Namespace: microsoft.graph



Read the properties and relationships of an [exactMatchLookupJob](../resources/exactmatchlookupjob.md) object.

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
GET /exactMatchLookupJob
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

If successful, this method returns a `200 OK` response code and an [exactMatchLookupJob](../resources/exactmatchlookupjob.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_exactmatchlookupjob"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/exactMatchLookupJob
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.exactMatchLookupJob"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.exactMatchLookupJob",
    "id": "523fc9d9-c9d9-523f-d9c9-3f52d9c93f52",
    "completionDateTime": "String (timestamp)",
    "creationDateTime": "String (timestamp)",
    "error": {
      "@odata.type": "microsoft.graph.classificationError"
    },
    "lastUpdatedDateTime": "String (timestamp)",
    "startDateTime": "String (timestamp)",
    "state": "String"
  }
}
```

