---
title: "exactMatchLookupJob resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# exactMatchLookupJob resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [exactMatchJobBase](../resources/exactmatchjobbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List exactMatchLookupJobs](../api/exactmatchlookupjob-list.md)|[exactMatchLookupJob](../resources/exactmatchlookupjob.md) collection|Get a list of the [exactMatchLookupJob](../resources/exactmatchlookupjob.md) objects and their properties.|
|[Create exactMatchLookupJob](../api/exactmatchlookupjob-create.md)|[exactMatchLookupJob](../resources/exactmatchlookupjob.md)|Create a new [exactMatchLookupJob](../resources/exactmatchlookupjob.md) object.|
|[Get exactMatchLookupJob](../api/exactmatchlookupjob-get.md)|[exactMatchLookupJob](../resources/exactmatchlookupjob.md)|Read the properties and relationships of an [exactMatchLookupJob](../resources/exactmatchlookupjob.md) object.|
|[Update exactMatchLookupJob](../api/exactmatchlookupjob-update.md)|[exactMatchLookupJob](../resources/exactmatchlookupjob.md)|Update the properties of an [exactMatchLookupJob](../resources/exactmatchlookupjob.md) object.|
|[Delete exactMatchLookupJob](../api/exactmatchlookupjob-delete.md)|None|Deletes an [exactMatchLookupJob](../resources/exactmatchlookupjob.md) object.|
|[List matchingRows](../api/exactmatchlookupjob-list-matchingrows.md)|[lookupResultRow](../resources/lookupresultrow.md) collection|Get the lookupResultRow resources from the matchingRows navigation property.|
|[Create lookupResultRow](../api/exactmatchlookupjob-post-matchingrows.md)|[lookupResultRow](../resources/lookupresultrow.md)|Create a new lookupResultRow object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|completionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|error|[classificationError](../resources/classificationerror.md)|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [exactMatchJobBase](../resources/exactmatchjobbase.md)|
|state|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|matchingRows|[lookupResultRow](../resources/lookupresultrow.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.exactMatchLookupJob",
  "baseType": "microsoft.graph.exactMatchJobBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exactMatchLookupJob",
  "id": "String (identifier)",
  "completionDateTime": "String (timestamp)",
  "creationDateTime": "String (timestamp)",
  "error": {
    "@odata.type": "microsoft.graph.classificationError"
  },
  "lastUpdatedDateTime": "String (timestamp)",
  "startDateTime": "String (timestamp)",
  "state": "String"
}
```

