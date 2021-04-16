---
title: "governanceRoleAssignmentRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# governanceRoleAssignmentRequest resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List governanceRoleAssignmentRequests](../api/governanceroleassignmentrequest-list.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) collection|Get a list of the [governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) objects and their properties.|
|[Create governanceRoleAssignmentRequest](../api/governanceroleassignmentrequest-post-governanceroleassignmentrequests.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md)|Create a new [governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) object.|
|[Get governanceRoleAssignmentRequest](../api/governanceroleassignmentrequest-get.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md)|Read the properties and relationships of a [governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) object.|
|[Update governanceRoleAssignmentRequest](../api/governanceroleassignmentrequest-update.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md)|Update the properties of a [governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) object.|
|[Delete governanceRoleAssignmentRequest](../api/governanceroleassignmentrequest-delete.md)|None|Deletes a [governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) object.|
|[cancel](../api/governanceroleassignmentrequest-cancel.md)|None|**TODO: Add Description**|
|[updateRequest](../api/governanceroleassignmentrequest-updaterequest.md)|[governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md)|**TODO: Add Description**|
|[List governanceResource](../api/governanceroleassignmentrequest-list-resource.md)|[governanceResource](../resources/governanceresource.md) collection|Get the governanceResource resources from the resource navigation property.|
|[Create governanceResource](../api/governanceroleassignmentrequest-post-resource.md)|[governanceResource](../resources/governanceresource.md)|Create a new governanceResource object.|
|[List governanceRoleDefinition](../api/governanceroleassignmentrequest-list-roledefinition.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md) collection|Get the governanceRoleDefinition resources from the roleDefinition navigation property.|
|[Create governanceRoleDefinition](../api/governanceroleassignmentrequest-post-roledefinition.md)|[governanceRoleDefinition](../resources/governanceroledefinition.md)|Create a new governanceRoleDefinition object.|
|[List governanceSubject](../api/governanceroleassignmentrequest-list-subject.md)|[governanceSubject](../resources/governancesubject.md) collection|Get the governanceSubject resources from the subject navigation property.|
|[Create governanceSubject](../api/governanceroleassignmentrequest-post-subject.md)|[governanceSubject](../resources/governancesubject.md)|Create a new governanceSubject object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignmentState|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|linkedEligibleRoleAssignmentId|String|**TODO: Add Description**|
|reason|String|**TODO: Add Description**|
|requestedDateTime|DateTimeOffset|**TODO: Add Description**|
|resourceId|String|**TODO: Add Description**|
|roleDefinitionId|String|**TODO: Add Description**|
|schedule|[governanceSchedule](../resources/governanceschedule.md)|**TODO: Add Description**|
|status|[governanceRoleAssignmentRequestStatus](../resources/governanceroleassignmentrequeststatus.md)|**TODO: Add Description**|
|subjectId|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resource|[governanceResource](../resources/governanceresource.md)|**TODO: Add Description**|
|roleDefinition|[governanceRoleDefinition](../resources/governanceroledefinition.md)|**TODO: Add Description**|
|subject|[governanceSubject](../resources/governancesubject.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.governanceRoleAssignmentRequest",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.governanceRoleAssignmentRequest",
  "id": "String (identifier)",
  "assignmentState": "String",
  "linkedEligibleRoleAssignmentId": "String",
  "reason": "String",
  "requestedDateTime": "String (timestamp)",
  "resourceId": "String",
  "roleDefinitionId": "String",
  "schedule": {
    "@odata.type": "microsoft.graph.governanceSchedule"
  },
  "status": {
    "@odata.type": "microsoft.graph.governanceRoleAssignmentRequestStatus"
  },
  "subjectId": "String",
  "type": "String"
}
```

