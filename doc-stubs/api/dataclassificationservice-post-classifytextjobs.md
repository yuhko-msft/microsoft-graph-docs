---
title: "Create jobResponseBase"
description: "Create a new jobResponseBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create jobResponseBase
Namespace: microsoft.graph



Create a new jobResponseBase object.

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
POST /dataClassification/classifyTextJobs
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [jobResponseBase](../resources/jobresponsebase.md) object.

The following table shows the properties that are required when you create the [jobResponseBase](../resources/jobresponsebase.md).

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

If successful, this method returns a `201 Created` response code and a [jobResponseBase](../resources/jobresponsebase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_jobresponsebase_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/dataClassification/classifyTextJobs
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
  "truncated": true,
  "@odata.type": "microsoft.graph.jobResponseBase"
}
-->
``` http
HTTP/1.1 201 Created
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

