---
title: "rbacApplication resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# rbacApplication resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List rbacApplications](../api/rbacapplication-list.md)|[rbacApplication](../resources/rbacapplication.md) collection|Get a list of the [rbacApplication](../resources/rbacapplication.md) objects and their properties.|
|[Create rbacApplication](../api/rbacapplication-create.md)|[rbacApplication](../resources/rbacapplication.md)|Create a new [rbacApplication](../resources/rbacapplication.md) object.|
|[Get rbacApplication](../api/rbacapplication-get.md)|[rbacApplication](../resources/rbacapplication.md)|Read the properties and relationships of a [rbacApplication](../resources/rbacapplication.md) object.|
|[Update rbacApplication](../api/rbacapplication-update.md)|[rbacApplication](../resources/rbacapplication.md)|Update the properties of a [rbacApplication](../resources/rbacapplication.md) object.|
|[Delete rbacApplication](../api/rbacapplication-delete.md)|None|Deletes a [rbacApplication](../resources/rbacapplication.md) object.|
|[roleScheduleInstances](../api/rbacapplication-rolescheduleinstances.md)|[unifiedRoleScheduleInstanceBase](../resources/unifiedrolescheduleinstancebase.md) collection|**TODO: Add Description**|
|[roleSchedules](../api/rbacapplication-roleschedules.md)|[unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md) collection|**TODO: Add Description**|
|[List resourceNamespaces](../api/rbacapplication-list-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection|Get the unifiedRbacResourceNamespace resources from the resourceNamespaces navigation property.|
|[Create unifiedRbacResourceNamespace](../api/rbacapplication-post-resourcenamespaces.md)|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md)|Create a new unifiedRbacResourceNamespace object.|
|[List roleAssignmentApprovals](../api/rbacapplication-list-roleassignmentapprovals.md)|[approval](../resources/approval.md) collection|Get the approval resources from the roleAssignmentApprovals navigation property.|
|[Create approval](../api/rbacapplication-post-roleassignmentapprovals.md)|[approval](../resources/approval.md)|Create a new approval object.|
|[List roleAssignmentScheduleInstances](../api/rbacapplication-list-roleassignmentscheduleinstances.md)|[unifiedRoleAssignmentScheduleInstance](../resources/unifiedroleassignmentscheduleinstance.md) collection|Get the unifiedRoleAssignmentScheduleInstance resources from the roleAssignmentScheduleInstances navigation property.|
|[Create unifiedRoleAssignmentScheduleInstance](../api/rbacapplication-post-roleassignmentscheduleinstances.md)|[unifiedRoleAssignmentScheduleInstance](../resources/unifiedroleassignmentscheduleinstance.md)|Create a new unifiedRoleAssignmentScheduleInstance object.|
|[List roleAssignmentScheduleRequests](../api/rbacapplication-list-roleassignmentschedulerequests.md)|[unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) collection|Get the unifiedRoleAssignmentScheduleRequest resources from the roleAssignmentScheduleRequests navigation property.|
|[Create unifiedRoleAssignmentScheduleRequest](../api/rbacapplication-post-roleassignmentschedulerequests.md)|[unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md)|Create a new unifiedRoleAssignmentScheduleRequest object.|
|[List roleAssignmentSchedules](../api/rbacapplication-list-roleassignmentschedules.md)|[unifiedRoleAssignmentSchedule](../resources/unifiedroleassignmentschedule.md) collection|Get the unifiedRoleAssignmentSchedule resources from the roleAssignmentSchedules navigation property.|
|[Create unifiedRoleAssignmentSchedule](../api/rbacapplication-post-roleassignmentschedules.md)|[unifiedRoleAssignmentSchedule](../resources/unifiedroleassignmentschedule.md)|Create a new unifiedRoleAssignmentSchedule object.|
|[List roleEligibilityScheduleInstances](../api/rbacapplication-list-roleeligibilityscheduleinstances.md)|[unifiedRoleEligibilityScheduleInstance](../resources/unifiedroleeligibilityscheduleinstance.md) collection|Get the unifiedRoleEligibilityScheduleInstance resources from the roleEligibilityScheduleInstances navigation property.|
|[Create unifiedRoleEligibilityScheduleInstance](../api/rbacapplication-post-roleeligibilityscheduleinstances.md)|[unifiedRoleEligibilityScheduleInstance](../resources/unifiedroleeligibilityscheduleinstance.md)|Create a new unifiedRoleEligibilityScheduleInstance object.|
|[List roleEligibilityScheduleRequests](../api/rbacapplication-list-roleeligibilityschedulerequests.md)|[unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) collection|Get the unifiedRoleEligibilityScheduleRequest resources from the roleEligibilityScheduleRequests navigation property.|
|[Create unifiedRoleEligibilityScheduleRequest](../api/rbacapplication-post-roleeligibilityschedulerequests.md)|[unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md)|Create a new unifiedRoleEligibilityScheduleRequest object.|
|[List roleEligibilitySchedules](../api/rbacapplication-list-roleeligibilityschedules.md)|[unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md) collection|Get the unifiedRoleEligibilitySchedule resources from the roleEligibilitySchedules navigation property.|
|[Create unifiedRoleEligibilitySchedule](../api/rbacapplication-post-roleeligibilityschedules.md)|[unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md)|Create a new unifiedRoleEligibilitySchedule object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|resourceNamespaces|[unifiedRbacResourceNamespace](../resources/unifiedrbacresourcenamespace.md) collection|**TODO: Add Description**|
|roleAssignmentApprovals|[approval](../resources/approval.md) collection|**TODO: Add Description**|
|roleAssignments|[unifiedRoleAssignment](../resources/unifiedroleassignment.md) collection|**TODO: Add Description**|
|roleAssignmentScheduleInstances|[unifiedRoleAssignmentScheduleInstance](../resources/unifiedroleassignmentscheduleinstance.md) collection|**TODO: Add Description**|
|roleAssignmentScheduleRequests|[unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) collection|**TODO: Add Description**|
|roleAssignmentSchedules|[unifiedRoleAssignmentSchedule](../resources/unifiedroleassignmentschedule.md) collection|**TODO: Add Description**|
|roleDefinitions|[unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection|**TODO: Add Description**|
|roleEligibilityScheduleInstances|[unifiedRoleEligibilityScheduleInstance](../resources/unifiedroleeligibilityscheduleinstance.md) collection|**TODO: Add Description**|
|roleEligibilityScheduleRequests|[unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) collection|**TODO: Add Description**|
|roleEligibilitySchedules|[unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.rbacApplication",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.rbacApplication",
  "id": "String (identifier)"
}
```

