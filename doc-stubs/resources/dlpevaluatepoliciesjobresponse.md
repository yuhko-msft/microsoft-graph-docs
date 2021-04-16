---
title: "dlpEvaluatePoliciesJobResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dlpEvaluatePoliciesJobResponse resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [jobResponseBase](../resources/jobresponsebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List dlpEvaluatePoliciesJobResponses](../api/dlpevaluatepoliciesjobresponse-list.md)|[dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) collection|Get a list of the [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) objects and their properties.|
|[Create dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-create.md)|[dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md)|Create a new [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) object.|
|[Get dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-get.md)|[dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md)|Read the properties and relationships of a [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) object.|
|[Update dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-update.md)|[dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md)|Update the properties of a [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) object.|
|[Delete dlpEvaluatePoliciesJobResponse](../api/dlpevaluatepoliciesjobresponse-delete.md)|None|Deletes a [dlpEvaluatePoliciesJobResponse](../resources/dlpevaluatepoliciesjobresponse.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|result|[dlpPoliciesJobResult](../resources/dlppoliciesjobresult.md)|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|status|String|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|tenantId|String|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|type|String|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dlpEvaluatePoliciesJobResponse",
  "baseType": "microsoft.graph.jobResponseBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dlpEvaluatePoliciesJobResponse",
  "id": "String (identifier)",
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

