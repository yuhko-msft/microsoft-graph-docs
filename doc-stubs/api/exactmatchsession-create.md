---
title: "Create exactMatchSession"
description: "Create a new exactMatchSession object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create exactMatchSession
Namespace: microsoft.graph



Create a new [exactMatchSession](../resources/exactmatchsession.md) object.

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
POST /dataClassification/exactMatchDataStores/{exactMatchDataStoreId}/sessions
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [exactMatchSession](../resources/exactmatchsession.md) object.

The following table shows the properties that are required when you create the [exactMatchSession](../resources/exactmatchsession.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|completionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|dataStoreId|String|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|processingCompletionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|remainingBlockCount|Int32|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|remainingJobCount|Int32|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|state|String|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|totalBlockCount|Int32|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|totalJobCount|Int32|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|uploadCompletionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchSessionBase](../resources/exactmatchsessionbase.md)|
|checksum|String|**TODO: Add Description**|
|dataUploadURI|String|**TODO: Add Description**|
|fields|String collection|**TODO: Add Description**|
|fileName|String|**TODO: Add Description**|
|rowsPerBlock|Int32|**TODO: Add Description**|
|salt|String|**TODO: Add Description**|
|uploadAgentId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [exactMatchSession](../resources/exactmatchsession.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_exactmatchsession_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/dataClassification/exactMatchDataStores/{exactMatchDataStoreId}/sessions
Content-Type: application/json
Content-length: 811

{
  "@odata.type": "#microsoft.graph.exactMatchSession",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.exactMatchSession",
  "id": "951ca0f8-a0f8-951c-f8a0-1c95f8a01c95",
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
```

