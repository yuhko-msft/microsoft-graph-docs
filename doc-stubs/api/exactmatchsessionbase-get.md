---
title: "Get exactMatchSessionBase"
description: "Read the properties and relationships of an exactMatchSessionBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get exactMatchSessionBase
Namespace: microsoft.graph



Read the properties and relationships of an [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object.

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
GET /exactMatchSessionBase
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

If successful, this method returns a `200 OK` response code and an [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_exactmatchsessionbase"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/exactMatchSessionBase
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.exactMatchSessionBase"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.exactMatchSessionBase",
    "id": "280d545a-545a-280d-5a54-0d285a540d28",
    "completionDateTime": "String (timestamp)",
    "creationDateTime": "String (timestamp)",
    "error": {
      "@odata.type": "microsoft.graph.classificationError"
    },
    "lastUpdatedDateTime": "String (timestamp)",
    "startDateTime": "String (timestamp)",
    "dataStoreId": "String",
    "processingCompletionDateTime": "String (timestamp)",
    "remainingBlockCount": "Integer",
    "remainingJobCount": "Integer",
    "state": "String",
    "totalBlockCount": "Integer",
    "totalJobCount": "Integer",
    "uploadCompletionDateTime": "String (timestamp)"
  }
}
```

