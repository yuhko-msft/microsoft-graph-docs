---
title: "dataClassificationService resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# dataClassificationService resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get dataClassificationService](../api/dataclassificationservice-get.md)|[dataClassificationService](../resources/dataclassificationservice.md)|Read the properties and relationships of a [dataClassificationService](../resources/dataclassificationservice.md) object.|
|[Update dataClassificationService](../api/dataclassificationservice-update.md)|[dataClassificationService](../resources/dataclassificationservice.md)|Update the properties of a [dataClassificationService](../resources/dataclassificationservice.md) object.|
|[classifyExactMatches](../api/dataclassificationservice-classifyexactmatches.md)|[exactMatchClassificationResult](../resources/exactmatchclassificationresult.md)|**TODO: Add Description**|
|[List classifyFile](../api/dataclassificationservice-list-classifyfile.md)|[fileClassificationRequest](../resources/fileclassificationrequest.md) collection|Get the fileClassificationRequest resources from the classifyFile navigation property.|
|[Create fileClassificationRequest](../api/dataclassificationservice-post-classifyfile.md)|[fileClassificationRequest](../resources/fileclassificationrequest.md)|Create a new fileClassificationRequest object.|
|[List classifyFileJobs](../api/dataclassificationservice-list-classifyfilejobs.md)|[jobResponseBase](../resources/jobresponsebase.md) collection|Get the jobResponseBase resources from the classifyFileJobs navigation property.|
|[Create jobResponseBase](../api/dataclassificationservice-post-classifyfilejobs.md)|[jobResponseBase](../resources/jobresponsebase.md)|Create a new jobResponseBase object.|
|[List classifyText](../api/dataclassificationservice-list-classifytext.md)|[textClassificationRequest](../resources/textclassificationrequest.md) collection|Get the textClassificationRequest resources from the classifyText navigation property.|
|[Create textClassificationRequest](../api/dataclassificationservice-post-classifytext.md)|[textClassificationRequest](../resources/textclassificationrequest.md)|Create a new textClassificationRequest object.|
|[List classifyTextJobs](../api/dataclassificationservice-list-classifytextjobs.md)|[jobResponseBase](../resources/jobresponsebase.md) collection|Get the jobResponseBase resources from the classifyTextJobs navigation property.|
|[Create jobResponseBase](../api/dataclassificationservice-post-classifytextjobs.md)|[jobResponseBase](../resources/jobresponsebase.md)|Create a new jobResponseBase object.|
|[List evaluateDlpPoliciesJobs](../api/dataclassificationservice-list-evaluatedlppoliciesjobs.md)|[jobResponseBase](../resources/jobresponsebase.md) collection|Get the jobResponseBase resources from the evaluateDlpPoliciesJobs navigation property.|
|[Create jobResponseBase](../api/dataclassificationservice-post-evaluatedlppoliciesjobs.md)|[jobResponseBase](../resources/jobresponsebase.md)|Create a new jobResponseBase object.|
|[List evaluateLabelJobs](../api/dataclassificationservice-list-evaluatelabeljobs.md)|[jobResponseBase](../resources/jobresponsebase.md) collection|Get the jobResponseBase resources from the evaluateLabelJobs navigation property.|
|[Create jobResponseBase](../api/dataclassificationservice-post-evaluatelabeljobs.md)|[jobResponseBase](../resources/jobresponsebase.md)|Create a new jobResponseBase object.|
|[List exactMatchDataStores](../api/dataclassificationservice-list-exactmatchdatastores.md)|[exactMatchDataStore](../resources/exactmatchdatastore.md) collection|Get the exactMatchDataStore resources from the exactMatchDataStores navigation property.|
|[Create exactMatchDataStore](../api/dataclassificationservice-post-exactmatchdatastores.md)|[exactMatchDataStore](../resources/exactmatchdatastore.md)|Create a new exactMatchDataStore object.|
|[List exactMatchUploadAgents](../api/dataclassificationservice-list-exactmatchuploadagents.md)|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md) collection|Get the exactMatchUploadAgent resources from the exactMatchUploadAgents navigation property.|
|[Create exactMatchUploadAgent](../api/dataclassificationservice-post-exactmatchuploadagents.md)|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md)|Create a new exactMatchUploadAgent object.|
|[List jobs](../api/dataclassificationservice-list-jobs.md)|[jobResponseBase](../resources/jobresponsebase.md) collection|Get the jobResponseBase resources from the jobs navigation property.|
|[Create jobResponseBase](../api/dataclassificationservice-post-jobs.md)|[jobResponseBase](../resources/jobresponsebase.md)|Create a new jobResponseBase object.|
|[List sensitiveTypes](../api/dataclassificationservice-list-sensitivetypes.md)|[sensitiveType](../resources/sensitivetype.md) collection|Get the sensitiveType resources from the sensitiveTypes navigation property.|
|[Create sensitiveType](../api/dataclassificationservice-post-sensitivetypes.md)|[sensitiveType](../resources/sensitivetype.md)|Create a new sensitiveType object.|
|[List sensitivityLabels](../api/dataclassificationservice-list-sensitivitylabels.md)|[sensitivityLabel](../resources/sensitivitylabel.md) collection|Get the sensitivityLabel resources from the sensitivityLabels navigation property.|
|[Create sensitivityLabel](../api/dataclassificationservice-post-sensitivitylabels.md)|[sensitivityLabel](../resources/sensitivitylabel.md)|Create a new sensitivityLabel object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|classifyFile|[fileClassificationRequest](../resources/fileclassificationrequest.md) collection|**TODO: Add Description**|
|classifyFileJobs|[jobResponseBase](../resources/jobresponsebase.md) collection|**TODO: Add Description**|
|classifyText|[textClassificationRequest](../resources/textclassificationrequest.md) collection|**TODO: Add Description**|
|classifyTextJobs|[jobResponseBase](../resources/jobresponsebase.md) collection|**TODO: Add Description**|
|evaluateDlpPoliciesJobs|[jobResponseBase](../resources/jobresponsebase.md) collection|**TODO: Add Description**|
|evaluateLabelJobs|[jobResponseBase](../resources/jobresponsebase.md) collection|**TODO: Add Description**|
|exactMatchDataStores|[exactMatchDataStore](../resources/exactmatchdatastore.md) collection|**TODO: Add Description**|
|exactMatchUploadAgents|[exactMatchUploadAgent](../resources/exactmatchuploadagent.md) collection|**TODO: Add Description**|
|jobs|[jobResponseBase](../resources/jobresponsebase.md) collection|**TODO: Add Description**|
|privacyMatchDataStores|[privacyMatchDataStore](../resources/privacymatchdatastore.md) collection|**TODO: Add Description**|
|sensitiveTypes|[sensitiveType](../resources/sensitivetype.md) collection|**TODO: Add Description**|
|sensitivityLabels|[sensitivityLabel](../resources/sensitivitylabel.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dataClassificationService",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.dataClassificationService",
  "id": "String (identifier)"
}
```

