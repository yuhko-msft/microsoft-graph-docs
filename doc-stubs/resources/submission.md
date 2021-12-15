---
title: "submission resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# submission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List submissions](../api/submission-list.md)|[submission](../resources/submission.md) collection|Get a list of the [submission](../resources/submission.md) objects and their properties.|
|[Get submission](../api/submission-get.md)|[submission](../resources/submission.md)|Read the properties and relationships of a [submission](../resources/submission.md) object.|
|[Update submission](../api/submission-update.md)|[submission](../resources/submission.md)|Update the properties of a [submission](../resources/submission.md) object.|
|[Delete submission](../api/submission-delete.md)|None|Deletes a [submission](../resources/submission.md) object.|
|[List emailAttachmentThreats](../api/submission-list-emailattachmentthreats.md)|[emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md) collection|Get the emailAttachmentThreatSubmission resources from the emailAttachmentThreats navigation property.|
|[Create emailAttachmentThreatSubmission](../api/submission-post-emailattachmentthreats.md)|[emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md)|Create a new emailAttachmentThreatSubmission object.|
|[List emailThreats](../api/submission-list-emailthreats.md)|[emailThreatSubmission](../resources/emailthreatsubmission.md) collection|Get the emailThreatSubmission resources from the emailThreats navigation property.|
|[Create emailThreatSubmission](../api/submission-post-emailthreats.md)|[emailThreatSubmission](../resources/emailthreatsubmission.md)|Create a new emailThreatSubmission object.|
|[List emailThreatSubmissionPolicies](../api/submission-list-emailthreatsubmissionpolicies.md)|[emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) collection|Get the emailThreatSubmissionPolicy resources from the emailThreatSubmissionPolicies navigation property.|
|[Create emailThreatSubmissionPolicy](../api/submission-post-emailthreatsubmissionpolicies.md)|[emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md)|Create a new emailThreatSubmissionPolicy object.|
|[List fileThreats](../api/submission-list-filethreats.md)|[fileThreatSubmission](../resources/filethreatsubmission.md) collection|Get the fileThreatSubmission resources from the fileThreats navigation property.|
|[Create fileThreatSubmission](../api/submission-post-filethreats.md)|[fileThreatSubmission](../resources/filethreatsubmission.md)|Create a new fileThreatSubmission object.|
|[List urlThreats](../api/submission-list-urlthreats.md)|[urlThreatSubmission](../resources/urlthreatsubmission.md) collection|Get the urlThreatSubmission resources from the urlThreats navigation property.|
|[Create urlThreatSubmission](../api/submission-post-urlthreats.md)|[urlThreatSubmission](../resources/urlthreatsubmission.md)|Create a new urlThreatSubmission object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|placeholder|String|GraML required. Will be deleted when publish.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|emailAttachmentThreats|[emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md) collection|**TODO: Add Description**|
|emailThreats|[emailThreatSubmission](../resources/emailthreatsubmission.md) collection|**TODO: Add Description**|
|emailThreatSubmissionPolicies|[emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) collection|**TODO: Add Description**|
|fileThreats|[fileThreatSubmission](../resources/filethreatsubmission.md) collection|**TODO: Add Description**|
|urlThreats|[urlThreatSubmission](../resources/urlthreatsubmission.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.submission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.submission",
  "placeholder": "String"
}
```

