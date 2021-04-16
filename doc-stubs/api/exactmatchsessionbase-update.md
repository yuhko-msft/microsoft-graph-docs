---
title: "Update exactMatchSessionBase"
description: "Update the properties of an exactMatchSessionBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update exactMatchSessionBase
Namespace: microsoft.graph



Update the properties of an [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object.

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
PATCH /exactMatchSessionBase
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object.

The following table shows the properties that are required when you update the [exactMatchSessionBase](../resources/exactmatchsessionbase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|completionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|dataStoreId|String|**TODO: Add Description**|
|processingCompletionDateTime|DateTimeOffset|**TODO: Add Description**|
|remainingBlockCount|Int32|**TODO: Add Description**|
|remainingJobCount|Int32|**TODO: Add Description**|
|state|String|**TODO: Add Description**|
|totalBlockCount|Int32|**TODO: Add Description**|
|totalJobCount|Int32|**TODO: Add Description**|
|uploadCompletionDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [exactMatchSessionBase](../resources/exactmatchsessionbase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_exactmatchsessionbase"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/exactMatchSessionBase
Content-Type: application/json
Content-length: 619

{
  "@odata.type": "#microsoft.graph.exactMatchSessionBase",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```

