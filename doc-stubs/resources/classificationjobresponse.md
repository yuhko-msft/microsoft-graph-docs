---
title: "classificationJobResponse resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# classificationJobResponse resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [jobResponseBase](../resources/jobresponsebase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List classificationJobResponses](../api/classificationjobresponse-list.md)|[classificationJobResponse](../resources/classificationjobresponse.md) collection|Get a list of the [classificationJobResponse](../resources/classificationjobresponse.md) objects and their properties.|
|[Create classificationJobResponse](../api/classificationjobresponse-create.md)|[classificationJobResponse](../resources/classificationjobresponse.md)|Create a new [classificationJobResponse](../resources/classificationjobresponse.md) object.|
|[Get classificationJobResponse](../api/classificationjobresponse-get.md)|[classificationJobResponse](../resources/classificationjobresponse.md)|Read the properties and relationships of a [classificationJobResponse](../resources/classificationjobresponse.md) object.|
|[Update classificationJobResponse](../api/classificationjobresponse-update.md)|[classificationJobResponse](../resources/classificationjobresponse.md)|Update the properties of a [classificationJobResponse](../resources/classificationjobresponse.md) object.|
|[Delete classificationJobResponse](../api/classificationjobresponse-delete.md)|None|Deletes a [classificationJobResponse](../resources/classificationjobresponse.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [jobResponseBase](../resources/jobresponsebase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|result|[detectedSensitiveContentWrapper](../resources/detectedsensitivecontentwrapper.md)|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.classificationJobResponse",
  "baseType": "microsoft.graph.jobResponseBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.classificationJobResponse",
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
    "@odata.type": "microsoft.graph.detectedSensitiveContentWrapper"
  }
}
```

