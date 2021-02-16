---
title: "evaluateLabelsAndPoliciesJobResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# evaluateLabelsAndPoliciesJobResponse resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [jobResponseBase](../resources/jobresponsebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List evaluateLabelsAndPoliciesJobResponses](../api/evaluatelabelsandpoliciesjobresponse-list.md)|[evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md) collection|Get a list of the [evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md) objects and their properties.|
|[Create evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-create.md)|[evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md)|Create a new [evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md) object.|
|[Get evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-get.md)|[evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md)|Read the properties and relationships of an [evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md) object.|
|[Update evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-update.md)|[evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md)|Update the properties of an [evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md) object.|
|[Delete evaluateLabelsAndPoliciesJobResponse](../api/evaluatelabelsandpoliciesjobresponse-delete.md)|None|Deletes an [evaluateLabelsAndPoliciesJobResponse](../resources/evaluatelabelsandpoliciesjobresponse.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|result|[evaluateLabelsAndPoliciesResult](../resources/evaluatelabelsandpoliciesresult.md)|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.evaluateLabelsAndPoliciesJobResponse",
  "baseType": "microsoft.graph.jobResponseBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.evaluateLabelsAndPoliciesJobResponse",
  "id": "String (identifier)",
  "type": "String",
  "status": "String",
  "tenantId": "String",
  "creationDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "error": {
    "@odata.type": "microsoft.graph.classificationError"
  },
  "result": {
    "@odata.type": "microsoft.graph.evaluateLabelsAndPoliciesResult"
  }
}
```

