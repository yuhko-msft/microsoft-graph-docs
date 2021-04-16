---
title: "Update unifiedRoleAssignmentScheduleRequest"
description: "Update the properties of an unifiedRoleAssignmentScheduleRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update unifiedRoleAssignmentScheduleRequest
Namespace: microsoft.graph



Update the properties of an [unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) object.

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
PATCH /roleManagement/directory/roleAssignmentScheduleRequests/{unifiedRoleAssignmentScheduleRequestId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) object.

The following table shows the properties that are required when you update the [unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|approvalId|String|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|completedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|customData|String|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|status|String|**TODO: Add Description** Inherited from [request](../resources/request.md)|
|action|String|**TODO: Add Description**|
|appScopeId|String|**TODO: Add Description**|
|directoryScopeId|String|**TODO: Add Description**|
|isValidationOnly|Boolean|**TODO: Add Description**|
|justification|String|**TODO: Add Description**|
|principalId|String|**TODO: Add Description**|
|roleDefinitionId|String|**TODO: Add Description**|
|scheduleInfo|[requestSchedule](../resources/requestschedule.md)|**TODO: Add Description**|
|targetScheduleId|String|**TODO: Add Description**|
|ticketInfo|[ticketInfo](../resources/ticketinfo.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_unifiedroleassignmentschedulerequest"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/roleManagement/directory/roleAssignmentScheduleRequests/{unifiedRoleAssignmentScheduleRequestId}
Content-Type: application/json
Content-length: 671

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentScheduleRequest",
  "approvalId": "String",
  "completedDateTime": "String (timestamp)",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.unifiedRoleAssignmentScheduleRequest",
  "id": "8de3d3f3-d3f3-8de3-f3d3-e38df3d3e38d",
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

