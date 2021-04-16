---
title: "unifiedRoleEligibilityScheduleRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# unifiedRoleEligibilityScheduleRequest resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [request](../resources/request.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List unifiedRoleEligibilityScheduleRequests](../api/unifiedroleeligibilityschedulerequest-list.md)|[unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) collection|Get a list of the [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) objects and their properties.|
|[Create unifiedRoleEligibilityScheduleRequest](../api/unifiedroleeligibilityschedulerequest-create.md)|[unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md)|Create a new [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) object.|
|[Get unifiedRoleEligibilityScheduleRequest](../api/unifiedroleeligibilityschedulerequest-get.md)|[unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md)|Read the properties and relationships of an [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) object.|
|[Update unifiedRoleEligibilityScheduleRequest](../api/unifiedroleeligibilityschedulerequest-update.md)|[unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md)|Update the properties of an [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) object.|
|[Delete unifiedRoleEligibilityScheduleRequest](../api/unifiedroleeligibilityschedulerequest-delete.md)|None|Deletes an [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) object.|
|[cancel](../api/unifiedroleeligibilityschedulerequest-cancel.md)|None|**TODO: Add Description**|
|[recordDecisions](../api/unifiedroleeligibilityschedulerequest-recorddecisions.md)|None|**TODO: Add Description**|
|[stop](../api/unifiedroleeligibilityschedulerequest-stop.md)|None|**TODO: Add Description**|
|[filterByCurrentUser](../api/unifiedroleeligibilityschedulerequest-filterbycurrentuser.md)|[unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) collection|**TODO: Add Description**|
|[List appScope](../api/unifiedroleeligibilityschedulerequest-list-appscope.md)|[appScope](../resources/appscope.md) collection|Get the appScope resources from the appScope navigation property.|
|[Add appScope](../api/unifiedroleeligibilityschedulerequest-post-appscope.md)|[appScope](../resources/appscope.md)|Add appScope by posting to the appScope collection.|
|[List directoryScope](../api/unifiedroleeligibilityschedulerequest-list-directoryscope.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the directoryScope navigation property.|
|[Add directoryScope](../api/unifiedroleeligibilityschedulerequest-post-directoryscope.md)|[directoryObject](../resources/directoryobject.md)|Add directoryScope by posting to the directoryScope collection.|
|[List principal](../api/unifiedroleeligibilityschedulerequest-list-principal.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObject resources from the principal navigation property.|
|[Add principal](../api/unifiedroleeligibilityschedulerequest-post-principal.md)|[directoryObject](../resources/directoryobject.md)|Add principal by posting to the principal collection.|
|[List unifiedRoleDefinition](../api/unifiedroleeligibilityschedulerequest-list-roledefinition.md)|[unifiedRoleDefinition](../resources/unifiedroledefinition.md) collection|Get the unifiedRoleDefinition resources from the roleDefinition navigation property.|
|[Add unifiedRoleDefinition](../api/unifiedroleeligibilityschedulerequest-post-roledefinition.md)|[unifiedRoleDefinition](../resources/unifiedroledefinition.md)|Add roleDefinition by posting to the roleDefinition collection.|
|[List unifiedRoleEligibilitySchedule](../api/unifiedroleeligibilityschedulerequest-list-targetschedule.md)|[unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md) collection|Get the unifiedRoleEligibilitySchedule resources from the targetSchedule navigation property.|
|[Add unifiedRoleEligibilitySchedule](../api/unifiedroleeligibilityschedulerequest-post-targetschedule.md)|[unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md)|Add targetSchedule by posting to the targetSchedule collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|String|**TODO: Add Description**|
|approvalId|String|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|appScopeId|String|**TODO: Add Description**|
|completedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|customData|String|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|directoryScopeId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isValidationOnly|Boolean|**TODO: Add Description**|
|justification|String|**TODO: Add Description**|
|principalId|String|**TODO: Add Description**|
|roleDefinitionId|String|**TODO: Add Description**|
|scheduleInfo|[requestSchedule](../resources/requestschedule.md)|**TODO: Add Description**|
|status|String|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|targetScheduleId|String|**TODO: Add Description**|
|ticketInfo|[ticketInfo](../resources/ticketinfo.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|appScope|[appScope](../resources/appscope.md)|**TODO: Add Description**|
|directoryScope|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|
|principal|[directoryObject](../resources/directoryobject.md)|**TODO: Add Description**|
|roleDefinition|[unifiedRoleDefinition](../resources/unifiedroledefinition.md)|**TODO: Add Description**|
|targetSchedule|[unifiedRoleEligibilitySchedule](../resources/unifiedroleeligibilityschedule.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unifiedRoleEligibilityScheduleRequest",
  "baseType": "microsoft.graph.request",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.unifiedRoleEligibilityScheduleRequest",
  "id": "String (identifier)",
  "approvalId": "String",
  "completedDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "customData": "String",
  "status": "String",
  "action": "String",
  "appScopeId": "String",
  "directoryScopeId": "String",
  "isValidationOnly": "Boolean",
  "justification": "String",
  "principalId": "String",
  "roleDefinitionId": "String",
  "scheduleInfo": {
    "@odata.type": "microsoft.graph.requestSchedule"
  },
  "targetScheduleId": "String",
  "ticketInfo": {
    "@odata.type": "microsoft.graph.ticketInfo"
  }
}
```

