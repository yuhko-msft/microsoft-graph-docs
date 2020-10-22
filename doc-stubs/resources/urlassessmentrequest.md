---
title: "urlAssessmentRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# urlAssessmentRequest resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [threatAssessmentRequest](../resources/threatassessmentrequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List urlAssessmentRequests](../api/urlassessmentrequest-list.md)|[urlAssessmentRequest](../resources/urlassessmentrequest.md) collection|Get a list of the [urlAssessmentRequest](../resources/urlassessmentrequest.md) objects and their properties.|
|[Create urlAssessmentRequest](../api/urlassessmentrequest-create.md)|[urlAssessmentRequest](../resources/urlassessmentrequest.md)|Create a new [urlAssessmentRequest](../resources/urlassessmentrequest.md) object.|
|[Get urlAssessmentRequest](../api/urlassessmentrequest-get.md)|[urlAssessmentRequest](../resources/urlassessmentrequest.md)|Read the properties and relationships of an [urlAssessmentRequest](../resources/urlassessmentrequest.md) object.|
|[Update urlAssessmentRequest](../api/urlassessmentrequest-update.md)|[urlAssessmentRequest](../resources/urlassessmentrequest.md)|Update the properties of an [urlAssessmentRequest](../resources/urlassessmentrequest.md) object.|
|[Delete urlAssessmentRequest](../api/urlassessmentrequest-delete.md)|None|Deletes an [urlAssessmentRequest](../resources/urlassessmentrequest.md) object.|
|[List results](../api/urlassessmentrequest-list-results.md)|[threatAssessmentResult](../resources/threatassessmentresult.md) collection|Get the threatAssessmentResult resources from the results navigation property.|
|[Create results](../api/urlassessmentrequest-post-results.md)|[threatAssessmentResult](../resources/threatassessmentresult.md)|Create a new threatAssessmentResult object.|
|[Get results](../api/urlassessmentrequest-get-threatassessmentresult.md)|[threatAssessmentResult](../resources/threatassessmentresult.md)|Read the properties and relationships of a [threatAssessmentResult](../resources/threatassessmentresult.md) object.|
|[Update results](../api/urlassessmentrequest-update-results.md)|[threatAssessmentResult](../resources/threatassessmentresult.md)|Update the properties of a results object.|
|[Delete results](../api/urlassessmentrequest-delete-results.md)|None|Delete a [threatAssessmentResult](../resources/threatassessmentresult.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|threatCategory|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `undefined`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|contentType|threatAssessmentContentType|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `mail`, `url`, `file`.|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md)|
|expectedAssessment|threatExpectedAssessment|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `block`, `unblock`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|requestSource|threatAssessmentRequestSource|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `undefined`, `user`, `administrator`.|
|status|threatAssessmentStatus|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md). Possible values are: `pending`, `completed`.|
|url|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|results|[threatAssessmentResult](../resources/threatassessmentresult.md) collection|**TODO: Add Description** Inherited from [threatAssessmentRequest](../resources/threatassessmentrequest.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.urlAssessmentRequest",
  "baseType": "microsoft.graph.threatAssessmentRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.urlAssessmentRequest",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "expectedAssessment": "String",
  "category": "String",
  "status": "String",
  "requestSource": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "url": "String"
}
```

