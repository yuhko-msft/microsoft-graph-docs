---
title: "threatAssessmentRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# threatAssessmentRequest resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List threatAssessmentRequests](../api/threatassessmentrequest-list.md)|[threatAssessmentRequest](../resources/threatassessmentrequest.md) collection|Get a list of the [threatAssessmentRequest](../resources/threatassessmentrequest.md) objects and their properties.|
|[Create threatAssessmentRequest](../api/threatassessmentrequest-create.md)|[threatAssessmentRequest](../resources/threatassessmentrequest.md)|Create a new [threatAssessmentRequest](../resources/threatassessmentrequest.md) object.|
|[Get threatAssessmentRequest](../api/threatassessmentrequest-get.md)|[threatAssessmentRequest](../resources/threatassessmentrequest.md)|Read the properties and relationships of a [threatAssessmentRequest](../resources/threatassessmentrequest.md) object.|
|[Update threatAssessmentRequest](../api/threatassessmentrequest-update.md)|[threatAssessmentRequest](../resources/threatassessmentrequest.md)|Update the properties of a [threatAssessmentRequest](../resources/threatassessmentrequest.md) object.|
|[Delete threatAssessmentRequest](../api/threatassessmentrequest-delete.md)|None|Deletes a [threatAssessmentRequest](../resources/threatassessmentrequest.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|threatCategory|**TODO: Add Description**. Possible values are: `undefined`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|contentType|threatAssessmentContentType|**TODO: Add Description**. Possible values are: `mail`, `url`, `file`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|expectedAssessment|threatExpectedAssessment|**TODO: Add Description**. Possible values are: `block`, `unblock`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|requestSource|threatAssessmentRequestSource|**TODO: Add Description**. Possible values are: `undefined`, `user`, `administrator`.|
|status|threatAssessmentStatus|**TODO: Add Description**. Possible values are: `pending`, `completed`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|results|[threatAssessmentResult](../resources/threatassessmentresult.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.threatAssessmentRequest",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.threatAssessmentRequest",
  "id": "String (identifier)",
  "category": "String",
  "contentType": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "expectedAssessment": "String",
  "requestSource": "String",
  "status": "String"
}
```

