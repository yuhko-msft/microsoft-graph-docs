---
title: "fileAssessmentRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileAssessmentRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [threatAssessmentRequest](../resources/threatassessmentrequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fileAssessmentRequests](../api/fileassessmentrequest-list.md)|[fileAssessmentRequest](../resources/fileassessmentrequest.md) collection|Get a list of the [fileAssessmentRequest](../resources/fileassessmentrequest.md) objects and their properties.|
|[Create fileAssessmentRequest](../api/fileassessmentrequest-create.md)|[fileAssessmentRequest](../resources/fileassessmentrequest.md)|Create a new [fileAssessmentRequest](../resources/fileassessmentrequest.md) object.|
|[Get fileAssessmentRequest](../api/fileassessmentrequest-get.md)|[fileAssessmentRequest](../resources/fileassessmentrequest.md)|Read the properties and relationships of a [fileAssessmentRequest](../resources/fileassessmentrequest.md) object.|
|[Update fileAssessmentRequest](../api/fileassessmentrequest-update.md)|[fileAssessmentRequest](../resources/fileassessmentrequest.md)|Update the properties of a [fileAssessmentRequest](../resources/fileassessmentrequest.md) object.|
|[Delete fileAssessmentRequest](../api/fileassessmentrequest-delete.md)|None|Deletes a [fileAssessmentRequest](../resources/fileassessmentrequest.md) object.|
|[List results](../api/fileassessmentrequest-list-results.md)|[threatAssessmentResult](../resources/threatassessmentresult.md) collection|Get the threatAssessmentResult resources from the results navigation property.|
|[Create threatAssessmentResult](../api/fileassessmentrequest-post-results.md)|[threatAssessmentResult](../resources/threatassessmentresult.md)|Create a new threatAssessmentResult object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|threatCategory|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `undefined`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|contentData|String|**TODO: Add Description**|
|contentType|threatAssessmentContentType|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `mail`, `url`, `file`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md).|
|expectedAssessment|threatExpectedAssessment|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `block`, `unblock`.|
|fileName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|requestSource|threatAssessmentRequestSource|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `undefined`, `user`, `administrator`.|
|status|threatAssessmentStatus|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `pending`, `completed`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|results|[threatAssessmentResult](../resources/threatassessmentresult.md) collection|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileAssessmentRequest",
  "baseType": "microsoft.graph.threatAssessmentRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileAssessmentRequest",
  "id": "String (identifier)",
  "category": "String",
  "contentType": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "expectedAssessment": "String",
  "requestSource": "String",
  "status": "String",
  "contentData": "String",
  "fileName": "String"
}
```

