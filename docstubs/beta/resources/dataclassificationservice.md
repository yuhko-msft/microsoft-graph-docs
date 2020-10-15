---
title: "dataClassificationService resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# dataClassificationService resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                                               | Return Type                                                             | Description                                                                                 |
| :------------------------------------------------------------------------------------------------------------------- | :---------------------------------------------------------------------- | :------------------------------------------------------------------------------------------ |
| [List dataClassificationService](../api/dataclassificationservice-list.md)                                           | [dataClassificationService](dataClassificationService.md) collection    | List properties and relationships of a dataClassificationService object.                    |
| [Create dataClassificationService](../api/dataclassificationservice-create.md)                                       | [dataClassificationService](dataClassificationService.md)               | Create a new dataClassificationService object.                                              |
| [Get dataClassificationService](../api/dataclassificationservice-get.md)                                             | [dataClassificationService](dataClassificationService.md)               | Read properties and relationships of a dataClassificationService object.                    |
| [Update dataClassificationService](../api/dataclassificationservice-update.md)                                       | [dataClassificationService](dataClassificationService.md)               | Update the properties of a dataClassificationService object.                                |
| [Delete dataClassificationService](../api/dataclassificationservice-delete.md)                                       |                                                                         | Delete a dataClassificationService object.                                                  |
| [List classifyFile](../api/dataclassificationservice-list-classifyfile.md)                                           | [fileClassificationRequest](../resources/-fileclassificationrequest.md) | Get the fileClassificationRequest objects from a classifyFile navigation property.          |
| [Create classifyFile](../api/dataclassificationservice-post-classifyfile.md)                                         | [fileClassificationRequest](../resources/-fileclassificationrequest.md) | Create a new fileClassificationRequest object.                                              |
| [Get classifyFile](../api/dataclassificationservice-get-classifyfile.md)                                             | [fileClassificationRequest](../resources/-fileclassificationrequest.md) | Read the properties and relationships of a fileClassificationRequest object.                |
| [Update classifyFile](../api/dataclassificationservice-update-classifyfile.md)                                       | [fileClassificationRequest](../resources/-fileclassificationrequest.md) | Update the properties of a fileClassificationRequest object.                                |
| [Delete classifyFile](../api/dataclassificationservice-delete-classifyfile.md)                                       |                                                                         | Delete a fileClassificationRequest object.                                                  |
| [List classifyFileJobs](../api/dataclassificationservice-list-classifyfilejobs.md)                                   | [jobResponseBase](../resources/-jobresponsebase.md)                     | Get the jobResponseBase objects from a classifyFileJobs navigation property.                |
| [Create classifyFileJobs](../api/dataclassificationservice-post-classifyfilejobs.md)                                 | [jobResponseBase](../resources/-jobresponsebase.md)                     | Create a new jobResponseBase object.                                                        |
| [Get classifyFileJobs](../api/dataclassificationservice-get-classifyfilejobs.md)                                     | [jobResponseBase](../resources/-jobresponsebase.md)                     | Read the properties and relationships of a jobResponseBase object.                          |
| [Update classifyFileJobs](../api/dataclassificationservice-update-classifyfilejobs.md)                               | [jobResponseBase](../resources/-jobresponsebase.md)                     | Update the properties of a jobResponseBase object.                                          |
| [Delete classifyFileJobs](../api/dataclassificationservice-delete-classifyfilejobs.md)                               |                                                                         | Delete a jobResponseBase object.                                                            |
| [List classifyText](../api/dataclassificationservice-list-classifytext.md)                                           | [textClassificationRequest](../resources/-textclassificationrequest.md) | Get the textClassificationRequest objects from a classifyText navigation property.          |
| [Create classifyText](../api/dataclassificationservice-post-classifytext.md)                                         | [textClassificationRequest](../resources/-textclassificationrequest.md) | Create a new textClassificationRequest object.                                              |
| [Get classifyText](../api/dataclassificationservice-get-classifytext.md)                                             | [textClassificationRequest](../resources/-textclassificationrequest.md) | Read the properties and relationships of a textClassificationRequest object.                |
| [Update classifyText](../api/dataclassificationservice-update-classifytext.md)                                       | [textClassificationRequest](../resources/-textclassificationrequest.md) | Update the properties of a textClassificationRequest object.                                |
| [Delete classifyText](../api/dataclassificationservice-delete-classifytext.md)                                       |                                                                         | Delete a textClassificationRequest object.                                                  |
| [List classifyTextJobs](../api/dataclassificationservice-list-classifytextjobs.md)                                   | [jobResponseBase](../resources/-jobresponsebase.md)                     | Get the jobResponseBase objects from a classifyTextJobs navigation property.                |
| [Create classifyTextJobs](../api/dataclassificationservice-post-classifytextjobs.md)                                 | [jobResponseBase](../resources/-jobresponsebase.md)                     | Create a new jobResponseBase object.                                                        |
| [Get classifyTextJobs](../api/dataclassificationservice-get-classifytextjobs.md)                                     | [jobResponseBase](../resources/-jobresponsebase.md)                     | Read the properties and relationships of a jobResponseBase object.                          |
| [Update classifyTextJobs](../api/dataclassificationservice-update-classifytextjobs.md)                               | [jobResponseBase](../resources/-jobresponsebase.md)                     | Update the properties of a jobResponseBase object.                                          |
| [Delete classifyTextJobs](../api/dataclassificationservice-delete-classifytextjobs.md)                               |                                                                         | Delete a jobResponseBase object.                                                            |
| [List evaluateDlpPoliciesJobs](../api/dataclassificationservice-list-evaluatedlppoliciesjobs.md)                     | [jobResponseBase](../resources/-jobresponsebase.md)                     | Get the jobResponseBase objects from an evaluateDlpPoliciesJobs navigation property.        |
| [Create evaluateDlpPoliciesJobs](../api/dataclassificationservice-post-evaluatedlppoliciesjobs.md)                   | [jobResponseBase](../resources/-jobresponsebase.md)                     | Create a new jobResponseBase object.                                                        |
| [Get evaluateDlpPoliciesJobs](../api/dataclassificationservice-get-evaluatedlppoliciesjobs.md)                       | [jobResponseBase](../resources/-jobresponsebase.md)                     | Read the properties and relationships of a jobResponseBase object.                          |
| [Update evaluateDlpPoliciesJobs](../api/dataclassificationservice-update-evaluatedlppoliciesjobs.md)                 | [jobResponseBase](../resources/-jobresponsebase.md)                     | Update the properties of a jobResponseBase object.                                          |
| [Delete evaluateDlpPoliciesJobs](../api/dataclassificationservice-delete-evaluatedlppoliciesjobs.md)                 |                                                                         | Delete a jobResponseBase object.                                                            |
| [List evaluateLabelJobs](../api/dataclassificationservice-list-evaluatelabeljobs.md)                                 | [jobResponseBase](../resources/-jobresponsebase.md)                     | Get the jobResponseBase objects from an evaluateLabelJobs navigation property.              |
| [Create evaluateLabelJobs](../api/dataclassificationservice-post-evaluatelabeljobs.md)                               | [jobResponseBase](../resources/-jobresponsebase.md)                     | Create a new jobResponseBase object.                                                        |
| [Get evaluateLabelJobs](../api/dataclassificationservice-get-evaluatelabeljobs.md)                                   | [jobResponseBase](../resources/-jobresponsebase.md)                     | Read the properties and relationships of a jobResponseBase object.                          |
| [Update evaluateLabelJobs](../api/dataclassificationservice-update-evaluatelabeljobs.md)                             | [jobResponseBase](../resources/-jobresponsebase.md)                     | Update the properties of a jobResponseBase object.                                          |
| [Delete evaluateLabelJobs](../api/dataclassificationservice-delete-evaluatelabeljobs.md)                             |                                                                         | Delete a jobResponseBase object.                                                            |
| [List jobs](../api/dataclassificationservice-list-jobs.md)                                                           | [jobResponseBase](../resources/-jobresponsebase.md)                     | Get the jobResponseBase objects from a jobs navigation property.                            |
| [Create jobs](../api/dataclassificationservice-post-jobs.md)                                                         | [jobResponseBase](../resources/-jobresponsebase.md)                     | Create a new jobResponseBase object.                                                        |
| [Get jobs](../api/dataclassificationservice-get-jobs.md)                                                             | [jobResponseBase](../resources/-jobresponsebase.md)                     | Read the properties and relationships of a jobResponseBase object.                          |
| [Update jobs](../api/dataclassificationservice-update-jobs.md)                                                       | [jobResponseBase](../resources/-jobresponsebase.md)                     | Update the properties of a jobResponseBase object.                                          |
| [Delete jobs](../api/dataclassificationservice-delete-jobs.md)                                                       |                                                                         | Delete a jobResponseBase object.                                                            |
| [List labelsAndPoliciesEvaluationJobs](../api/dataclassificationservice-list-labelsandpoliciesevaluationjobs.md)     | [jobResponseBase](../resources/-jobresponsebase.md)                     | Get the jobResponseBase objects from a labelsAndPoliciesEvaluationJobs navigation property. |
| [Create labelsAndPoliciesEvaluationJobs](../api/dataclassificationservice-post-labelsandpoliciesevaluationjobs.md)   | [jobResponseBase](../resources/-jobresponsebase.md)                     | Create a new jobResponseBase object.                                                        |
| [Get labelsAndPoliciesEvaluationJobs](../api/dataclassificationservice-get-labelsandpoliciesevaluationjobs.md)       | [jobResponseBase](../resources/-jobresponsebase.md)                     | Read the properties and relationships of a jobResponseBase object.                          |
| [Update labelsAndPoliciesEvaluationJobs](../api/dataclassificationservice-update-labelsandpoliciesevaluationjobs.md) | [jobResponseBase](../resources/-jobresponsebase.md)                     | Update the properties of a jobResponseBase object.                                          |
| [Delete labelsAndPoliciesEvaluationJobs](../api/dataclassificationservice-delete-labelsandpoliciesevaluationjobs.md) |                                                                         | Delete a jobResponseBase object.                                                            |
| [List sensitiveTypes](../api/dataclassificationservice-list-sensitivetypes.md)                                       | [sensitiveType](../resources/-sensitivetype.md)                         | Get the sensitiveType objects from a sensitiveTypes navigation property.                    |
| [Create sensitiveTypes](../api/dataclassificationservice-post-sensitivetypes.md)                                     | [sensitiveType](../resources/-sensitivetype.md)                         | Create a new sensitiveType object.                                                          |
| [Get sensitiveTypes](../api/dataclassificationservice-get-sensitivetypes.md)                                         | [sensitiveType](../resources/-sensitivetype.md)                         | Read the properties and relationships of a sensitiveType object.                            |
| [Update sensitiveTypes](../api/dataclassificationservice-update-sensitivetypes.md)                                   | [sensitiveType](../resources/-sensitivetype.md)                         | Update the properties of a sensitiveType object.                                            |
| [Delete sensitiveTypes](../api/dataclassificationservice-delete-sensitivetypes.md)                                   |                                                                         | Delete a sensitiveType object.                                                              |
| [List sensitivityLabels](../api/dataclassificationservice-list-sensitivitylabels.md)                                 | [sensitivityLabel](../resources/-sensitivitylabel.md)                   | Get the sensitivityLabel objects from a sensitivityLabels navigation property.              |
| [Create sensitivityLabels](../api/dataclassificationservice-post-sensitivitylabels.md)                               | [sensitivityLabel](../resources/-sensitivitylabel.md)                   | Create a new sensitivityLabel object.                                                       |
| [Get sensitivityLabels](../api/dataclassificationservice-get-sensitivitylabels.md)                                   | [sensitivityLabel](../resources/-sensitivitylabel.md)                   | Read the properties and relationships of a sensitivityLabel object.                         |
| [Update sensitivityLabels](../api/dataclassificationservice-update-sensitivitylabels.md)                             | [sensitivityLabel](../resources/-sensitivitylabel.md)                   | Update the properties of a sensitivityLabel object.                                         |
| [Delete sensitivityLabels](../api/dataclassificationservice-delete-sensitivitylabels.md)                             |                                                                         | Delete a sensitivityLabel object.                                                           |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship                    | Type                                                                              | Description |
| :------------------------------ | :-------------------------------------------------------------------------------- | :---------- |
| classifyFile                    | [fileClassificationRequest](../resources/fileclassificationrequest.md) collection |             |
| classifyFileJobs                | [jobResponseBase](../resources/jobresponsebase.md) collection                     |             |
| classifyText                    | [textClassificationRequest](../resources/textclassificationrequest.md) collection |             |
| classifyTextJobs                | [jobResponseBase](../resources/jobresponsebase.md) collection                     |             |
| evaluateDlpPoliciesJobs         | [jobResponseBase](../resources/jobresponsebase.md) collection                     |             |
| evaluateLabelJobs               | [jobResponseBase](../resources/jobresponsebase.md) collection                     |             |
| jobs                            | [jobResponseBase](../resources/jobresponsebase.md) collection                     |             |
| labelsAndPoliciesEvaluationJobs | [jobResponseBase](../resources/jobresponsebase.md) collection                     |             |
| sensitiveTypes                  | [sensitiveType](../resources/sensitivetype.md) collection                         |             |
| sensitivityLabels               | [sensitivityLabel](../resources/sensitivitylabel.md) collection                   |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dataClassificationService",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.dataClassificationService",
  "id": "String (identifier)"
}
```
