---
title: "approvalWorkflowProvider resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# approvalWorkflowProvider resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List approvalWorkflowProviders](../api/approvalworkflowprovider-list.md)|[approvalWorkflowProvider](../resources/approvalworkflowprovider.md) collection|Get a list of the [approvalWorkflowProvider](../resources/approvalworkflowprovider.md) objects and their properties.|
|[Create approvalWorkflowProvider](../api/approvalworkflowprovider-post-approvalworkflowproviders.md)|[approvalWorkflowProvider](../resources/approvalworkflowprovider.md)|Create a new [approvalWorkflowProvider](../resources/approvalworkflowprovider.md) object.|
|[Get approvalWorkflowProvider](../api/approvalworkflowprovider-get.md)|[approvalWorkflowProvider](../resources/approvalworkflowprovider.md)|Read the properties and relationships of an [approvalWorkflowProvider](../resources/approvalworkflowprovider.md) object.|
|[Update approvalWorkflowProvider](../api/approvalworkflowprovider-update.md)|[approvalWorkflowProvider](../resources/approvalworkflowprovider.md)|Update the properties of an [approvalWorkflowProvider](../resources/approvalworkflowprovider.md) object.|
|[Delete approvalWorkflowProvider](../api/approvalworkflowprovider-delete.md)|None|Deletes an [approvalWorkflowProvider](../resources/approvalworkflowprovider.md) object.|
|[List businessFlows](../api/approvalworkflowprovider-list-businessflows.md)|[businessFlow](../resources/businessflow.md) collection|Get the businessFlow resources from the businessFlows navigation property.|
|[Create businessFlows](../api/approvalworkflowprovider-post-businessflows.md)|[businessFlow](../resources/businessflow.md)|Create a new businessFlow object.|
|[Get businessFlows](../api/approvalworkflowprovider-get-businessflow.md)|[businessFlow](../resources/businessflow.md)|Read the properties and relationships of a [businessFlow](../resources/businessflow.md) object.|
|[Update businessFlows](../api/approvalworkflowprovider-update-businessflows.md)|[businessFlow](../resources/businessflow.md)|Update the properties of a businessFlows object.|
|[Delete businessFlows](../api/approvalworkflowprovider-delete-businessflows.md)|None|Delete a [businessFlow](../resources/businessflow.md) object.|
|[List businessFlowsWithRequestsAwaitingMyDecision](../api/approvalworkflowprovider-list-businessflowswithrequestsawaitingmydecision.md)|[businessFlow](../resources/businessflow.md) collection|Get the businessFlow resources from the businessFlowsWithRequestsAwaitingMyDecision navigation property.|
|[Create businessFlowsWithRequestsAwaitingMyDecision](../api/approvalworkflowprovider-post-businessflowswithrequestsawaitingmydecision.md)|[businessFlow](../resources/businessflow.md)|Create a new businessFlow object.|
|[Get businessFlowsWithRequestsAwaitingMyDecision](../api/approvalworkflowprovider-get-businessflow.md)|[businessFlow](../resources/businessflow.md)|Read the properties and relationships of a [businessFlow](../resources/businessflow.md) object.|
|[Update businessFlowsWithRequestsAwaitingMyDecision](../api/approvalworkflowprovider-update-businessflowswithrequestsawaitingmydecision.md)|[businessFlow](../resources/businessflow.md)|Update the properties of a businessFlowsWithRequestsAwaitingMyDecision object.|
|[Delete businessFlowsWithRequestsAwaitingMyDecision](../api/approvalworkflowprovider-delete-businessflowswithrequestsawaitingmydecision.md)|None|Delete a [businessFlow](../resources/businessflow.md) object.|
|[List policyTemplates](../api/approvalworkflowprovider-list-policytemplates.md)|[governancePolicyTemplate](../resources/governancepolicytemplate.md) collection|Get the governancePolicyTemplate resources from the policyTemplates navigation property.|
|[Create policyTemplates](../api/approvalworkflowprovider-post-policytemplates.md)|[governancePolicyTemplate](../resources/governancepolicytemplate.md)|Create a new governancePolicyTemplate object.|
|[Get policyTemplates](../api/approvalworkflowprovider-get-governancepolicytemplate.md)|[governancePolicyTemplate](../resources/governancepolicytemplate.md)|Read the properties and relationships of a [governancePolicyTemplate](../resources/governancepolicytemplate.md) object.|
|[Update policyTemplates](../api/approvalworkflowprovider-update-policytemplates.md)|[governancePolicyTemplate](../resources/governancepolicytemplate.md)|Update the properties of a policyTemplates object.|
|[Delete policyTemplates](../api/approvalworkflowprovider-delete-policytemplates.md)|None|Delete a [governancePolicyTemplate](../resources/governancepolicytemplate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|businessFlows|[businessFlow](../resources/businessflow.md) collection|**TODO: Add Description**|
|businessFlowsWithRequestsAwaitingMyDecision|[businessFlow](../resources/businessflow.md) collection|**TODO: Add Description**|
|policyTemplates|[governancePolicyTemplate](../resources/governancepolicytemplate.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.approvalWorkflowProvider",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.approvalWorkflowProvider",
  "id": "String (identifier)",
  "displayName": "String"
}
```

