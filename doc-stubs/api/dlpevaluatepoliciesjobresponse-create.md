---
title: "Create dlpEvaluatePoliciesJobResponse"
description: "Create a new dlpEvaluatePoliciesJobResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create dlpEvaluatePoliciesJobResponse
Namespace: microsoft.graph



Create a new [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) object.

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
POST ** Collection URI for microsoft.graph.dlpEvaluatePoliciesJobResponse not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) object.

The following table shows the properties that are required when you create the [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md).

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
|result|[dlpPoliciesJobResult](../resources/dlppoliciesjobresult.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_dlpevaluatepoliciesjobresponse_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.dlpEvaluatePoliciesJobResponse not found
Content-Type: application/json
Content-length: 426

{
  "@odata.type": "#microsoft.graph.dlpEvaluatePoliciesJobResponse",
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
    "@odata.type": "microsoft.graph.dlpPoliciesJobResult"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.dlpEvaluatePoliciesJobResponse"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.dlpEvaluatePoliciesJobResponse",
  "id": "8b34d6b5-d6b5-8b34-b5d6-348bb5d6348b",
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
    "@odata.type": "microsoft.graph.dlpPoliciesJobResult"
  }
}
```

