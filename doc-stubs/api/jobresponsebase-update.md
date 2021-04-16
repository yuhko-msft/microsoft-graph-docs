---
title: "Update jobResponseBase"
description: "Update the properties of a jobResponseBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update jobResponseBase
Namespace: microsoft.graph



Update the properties of a [jobResponseBase](../resources/jobresponsebase.md) object.

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
PATCH /dataClassification/jobs/{jobResponseBaseId}
PATCH /dataClassification/classifyFileJobs/{jobResponseBaseId}
PATCH /dataClassification/classifyTextJobs/{jobResponseBaseId}
PATCH /dataClassification/evaluateLabelJobs/{jobResponseBaseId}
PATCH /dataClassification/evaluateDlpPoliciesJobs/{jobResponseBaseId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [jobResponseBase](../resources/jobresponsebase.md) object.

The following table shows the properties that are required when you update the [jobResponseBase](../resources/jobresponsebase.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [jobResponseBase](../resources/jobresponsebase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_jobresponsebase"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/dataClassification/jobs/{jobResponseBaseId}
Content-Type: application/json
Content-length: 331

{
  "@odata.type": "#microsoft.graph.jobResponseBase",
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
```

