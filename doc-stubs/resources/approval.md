---
title: "approval resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# approval resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List approval](../api/request-list-approval.md)|[approval](../resources/approval.md) collection|Get the approval resources from the approval navigation property.|
|[Create approval](../api/request-post-approval.md)|[approval](../resources/approval.md)|Create a new approval object.|
|[Update approval](../api/request-update-approval.md)|[approval](../resources/approval.md)|Update the properties of an approval object.|
|[Get approval](../api/request-get-approval.md)|[approval](../resources/approval.md)|Read the properties and relationships of an [approval](../resources/approval.md) object.|
|[Delete approval](../api/request-delete-approval.md)|None|Delete an [approval](../resources/approval.md) object.|
|[List approvals](../api/approval-list.md)|[approval](../resources/approval.md) collection|Get a list of the [approval](../resources/approval.md) objects and their properties.|
|[Create approval](../api/approval-create.md)|[approval](../resources/approval.md)|Create a new [approval](../resources/approval.md) object.|
|[Get approval](../api/approval-get.md)|[approval](../resources/approval.md)|Read the properties and relationships of an [approval](../resources/approval.md) object.|
|[Update approval](../api/approval-update.md)|[approval](../resources/approval.md)|Update the properties of an [approval](../resources/approval.md) object.|
|[Delete approval](../api/approval-delete.md)|None|Deletes an [approval](../resources/approval.md) object.|
|[List completedSteps](../api/approval-list-completedsteps.md)|[approvalStep](../resources/approvalstep.md) collection|Get the approvalStep resources from the completedSteps navigation property.|
|[Create completedSteps](../api/approval-post-completedsteps.md)|[approvalStep](../resources/approvalstep.md)|Create a new approvalStep object.|
|[Get completedSteps](../api/approval-get-approvalstep.md)|[approvalStep](../resources/approvalstep.md)|Read the properties and relationships of an [approvalStep](../resources/approvalstep.md) object.|
|[Update completedSteps](../api/approval-update-completedsteps.md)|[approvalStep](../resources/approvalstep.md)|Update the properties of a completedSteps object.|
|[Delete completedSteps](../api/approval-delete-completedsteps.md)|None|Delete an [approvalStep](../resources/approvalstep.md) object.|
|[List pendingSteps](../api/approval-list-pendingsteps.md)|[approvalStep](../resources/approvalstep.md) collection|Get the approvalStep resources from the pendingSteps navigation property.|
|[Create pendingSteps](../api/approval-post-pendingsteps.md)|[approvalStep](../resources/approvalstep.md)|Create a new approvalStep object.|
|[Get pendingSteps](../api/approval-get-approvalstep.md)|[approvalStep](../resources/approvalstep.md)|Read the properties and relationships of an [approvalStep](../resources/approvalstep.md) object.|
|[Update pendingSteps](../api/approval-update-pendingsteps.md)|[approvalStep](../resources/approvalstep.md)|Update the properties of a pendingSteps object.|
|[Delete pendingSteps](../api/approval-delete-pendingsteps.md)|None|Delete an [approvalStep](../resources/approvalstep.md) object.|
|[List request](../api/approval-list-request.md)|[request](../resources/request.md) collection|Get the request resources from the request navigation property.|
|[Add request](../api/approval-post-request.md)|[request](../resources/request.md)|Add request by posting to the request collection.|
|[Remove request](../api/approval-delete-request.md)|None|Remove a [request](../resources/request.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|completedSteps|[approvalStep](../resources/approvalstep.md) collection|**TODO: Add Description**|
|pendingSteps|[approvalStep](../resources/approvalstep.md) collection|**TODO: Add Description**|
|request|[request](../resources/request.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.approval",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.approval",
  "id": "String (identifier)"
}
```

