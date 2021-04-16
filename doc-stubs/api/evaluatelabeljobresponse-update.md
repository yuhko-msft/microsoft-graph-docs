---
title: "Update evaluateLabelJobResponse"
description: "Update the properties of an evaluateLabelJobResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update evaluateLabelJobResponse
Namespace: microsoft.graph



Update the properties of an [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object.

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
PATCH /evaluateLabelJobResponse
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object.

The following table shows the properties that are required when you update the [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|status|String|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|tenantId|String|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|type|String|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|result|[evaluateLabelJobResultGroup](../resources/evaluatelabeljobresultgroup.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_evaluatelabeljobresponse"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/evaluateLabelJobResponse
Content-Type: application/json
Content-length: 427

{
  "@odata.type": "#microsoft.graph.evaluateLabelJobResponse",
  "creationDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "error": {
    "@odata.type": "microsoft.graph.classificationError"
  },
  "startDateTime": "String (timestamp)",
  "status": "String",
  "tenantId": "String",
  "type": "String",
  "result": {
    "@odata.type": "microsoft.graph.evaluateLabelJobResultGroup"
  }
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
  "@odata.type": "#microsoft.graph.evaluateLabelJobResponse",
  "id": "804a772c-772c-804a-2c77-4a802c774a80",
  "creationDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "error": {
    "@odata.type": "microsoft.graph.classificationError"
  },
  "startDateTime": "String (timestamp)",
  "status": "String",
  "tenantId": "String",
  "type": "String",
  "result": {
    "@odata.type": "microsoft.graph.evaluateLabelJobResultGroup"
  }
}
```

