---
title: "evaluateLabelJobResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# evaluateLabelJobResponse resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [jobResponseBase](../resources/jobresponsebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List evaluateLabelJobResponses](../api/evaluatelabeljobresponse-list.md)|[evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) collection|Get a list of the [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) objects and their properties.|
|[Create evaluateLabelJobResponse](../api/evaluatelabeljobresponse-create.md)|[evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md)|Create a new [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object.|
|[Get evaluateLabelJobResponse](../api/evaluatelabeljobresponse-get.md)|[evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md)|Read the properties and relationships of an [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object.|
|[Update evaluateLabelJobResponse](../api/evaluatelabeljobresponse-update.md)|[evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md)|Update the properties of an [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object.|
|[Delete evaluateLabelJobResponse](../api/evaluatelabeljobresponse-delete.md)|None|Deletes an [evaluateLabelJobResponse](../resources/evaluatelabeljobresponse.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|result|[evaluateLabelJobResultGroup](../resources/evaluatelabeljobresultgroup.md)|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.evaluateLabelJobResponse",
  "baseType": "microsoft.graph.jobResponseBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.evaluateLabelJobResponse",
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
    "@odata.type": "microsoft.graph.evaluateLabelJobResultGroup"
  }
}
```

