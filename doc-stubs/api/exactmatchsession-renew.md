---
title: "exactMatchSession: renew"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# exactMatchSession: renew
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /dataClassification/exactMatchDataStores/{exactMatchDataStoreId}/sessions/{exactMatchSessionId}/renew
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [exactMatchSession](../resources/exactmatchsession.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "exactmatchsession_renew"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/dataClassification/exactMatchDataStores/{exactMatchDataStoreId}/sessions/{exactMatchSessionId}/renew
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.exactMatchSession"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.exactMatchSession",
    "id": "String (identifier)",
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
    "uploadCompletionDateTime": "String (timestamp)",
    "checksum": "String",
    "dataUploadURI": "String",
    "fields": [
      "String"
    ],
    "fileName": "String",
    "rowsPerBlock": "Integer",
    "salt": "String",
    "uploadAgentId": "String"
  }
}
```

