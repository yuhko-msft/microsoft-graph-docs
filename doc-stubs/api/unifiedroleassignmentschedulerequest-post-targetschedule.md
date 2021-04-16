---
title: "Add unifiedRoleAssignmentSchedule"
description: "Add targetSchedule by posting to the targetSchedule collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add unifiedRoleAssignmentSchedule
Namespace: microsoft.graph



Add targetSchedule by posting to the targetSchedule collection.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /roleManagement/directory/roleAssignmentScheduleRequests/{unifiedRoleAssignmentScheduleRequestId}/targetSchedule/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleAssignmentSchedule](../resources/unifiedroleassignmentschedule.md) object.

The following table shows the properties that are required when you create the [unifiedRoleAssignmentSchedule](../resources/unifiedroleassignmentschedule.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appScopeId|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|createdUsing|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|directoryScopeId|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|principalId|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|roleDefinitionId|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|status|String|**TODO: Add Description** Inherited from [unifiedRoleScheduleBase](../resources/unifiedroleschedulebase.md)|
|assignmentType|String|**TODO: Add Description**|
|memberType|String|**TODO: Add Description**|
|scheduleInfo|[requestSchedule](../resources/requestschedule.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and an [unifiedRoleAssignmentSchedule](../resources/unifiedroleassignmentschedule.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_unifiedroleassignmentschedule_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/roleManagement/directory/roleAssignmentScheduleRequests/{unifiedRoleAssignmentScheduleRequestId}/targetSchedule/$ref
Content-Type: application/json
Content-length: 383

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentSchedule",
  "appScopeId": "String",
  "createdUsing": "String",
  "directoryScopeId": "String",
  "principalId": "String",
  "roleDefinitionId": "String",
  "status": "String",
  "assignmentType": "String",
  "memberType": "String",
  "scheduleInfo": {
    "@odata.type": "microsoft.graph.requestSchedule"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRoleAssignmentSchedule"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentSchedule",
  "id": "af2b1510-1510-af2b-1015-2baf10152baf",
  "appScopeId": "String",
  "createdDateTime": "String (timestamp)",
  "createdUsing": "String",
  "directoryScopeId": "String",
  "modifiedDateTime": "String (timestamp)",
  "principalId": "String",
  "roleDefinitionId": "String",
  "status": "String",
  "assignmentType": "String",
  "memberType": "String",
  "scheduleInfo": {
    "@odata.type": "microsoft.graph.requestSchedule"
  }
}
```

