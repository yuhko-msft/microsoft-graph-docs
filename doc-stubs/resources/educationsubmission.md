---
title: "educationSubmission resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationSubmission resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationSubmissions](../api/educationsubmission-list.md)|[educationSubmission](../resources/educationsubmission.md) collection|Get a list of the [educationSubmission](../resources/educationsubmission.md) objects and their properties.|
|[Create educationSubmission](../api/educationsubmission-create.md)|[educationSubmission](../resources/educationsubmission.md)|Create a new [educationSubmission](../resources/educationsubmission.md) object.|
|[Get educationSubmission](../api/educationsubmission-get.md)|[educationSubmission](../resources/educationsubmission.md)|Read the properties and relationships of an [educationSubmission](../resources/educationsubmission.md) object.|
|[Update educationSubmission](../api/educationsubmission-update.md)|[educationSubmission](../resources/educationsubmission.md)|Update the properties of an [educationSubmission](../resources/educationsubmission.md) object.|
|[Delete educationSubmission](../api/educationsubmission-delete.md)|None|Deletes an [educationSubmission](../resources/educationsubmission.md) object.|
|[return](../api/educationsubmission-return.md)|[educationSubmission](../resources/educationsubmission.md)|**TODO: Add Description**|
|[submit](../api/educationsubmission-submit.md)|[educationSubmission](../resources/educationsubmission.md)|**TODO: Add Description**|
|[unsubmit](../api/educationsubmission-unsubmit.md)|[educationSubmission](../resources/educationsubmission.md)|**TODO: Add Description**|
|[List outcomes](../api/educationsubmission-list-outcomes.md)|[educationOutcome](../resources/educationoutcome.md) collection|Get the educationOutcome resources from the outcomes navigation property.|
|[Create educationOutcome](../api/educationsubmission-post-outcomes.md)|[educationOutcome](../resources/educationoutcome.md)|Create a new educationOutcome object.|
|[List resources](../api/educationsubmission-list-resources.md)|[educationSubmissionResource](../resources/educationsubmissionresource.md) collection|Get the educationSubmissionResource resources from the resources navigation property.|
|[Create educationSubmissionResource](../api/educationsubmission-post-resources.md)|[educationSubmissionResource](../resources/educationsubmissionresource.md)|Create a new educationSubmissionResource object.|
|[List submittedResources](../api/educationsubmission-list-submittedresources.md)|[educationSubmissionResource](../resources/educationsubmissionresource.md) collection|Get the educationSubmissionResource resources from the submittedResources navigation property.|
|[Create educationSubmissionResource](../api/educationsubmission-post-submittedresources.md)|[educationSubmissionResource](../resources/educationsubmissionresource.md)|Create a new educationSubmissionResource object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|recipient|[educationSubmissionRecipient](../resources/educationsubmissionrecipient.md)|**TODO: Add Description**|
|releasedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|releasedDateTime|DateTimeOffset|**TODO: Add Description**|
|resourcesFolderUrl|String|**TODO: Add Description**|
|returnedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|returnedDateTime|DateTimeOffset|**TODO: Add Description**|
|status|educationSubmissionStatus|**TODO: Add Description**. Possible values are: `working`, `submitted`, `released`, `returned`, `unknownFutureValue`.|
|submittedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|submittedDateTime|DateTimeOffset|**TODO: Add Description**|
|unsubmittedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|unsubmittedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|outcomes|[educationOutcome](../resources/educationoutcome.md) collection|**TODO: Add Description**|
|resources|[educationSubmissionResource](../resources/educationsubmissionresource.md) collection|**TODO: Add Description**|
|submittedResources|[educationSubmissionResource](../resources/educationsubmissionresource.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationSubmission",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationSubmission",
  "id": "String (identifier)",
  "recipient": {
    "@odata.type": "microsoft.graph.educationSubmissionRecipient"
  },
  "releasedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "releasedDateTime": "String (timestamp)",
  "resourcesFolderUrl": "String",
  "returnedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "returnedDateTime": "String (timestamp)",
  "status": "String",
  "submittedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "submittedDateTime": "String (timestamp)",
  "unsubmittedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "unsubmittedDateTime": "String (timestamp)"
}
```

