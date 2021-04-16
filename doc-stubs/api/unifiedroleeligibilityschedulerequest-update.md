---
title: "Update unifiedRoleEligibilityScheduleRequest"
description: "Update the properties of an unifiedRoleEligibilityScheduleRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update unifiedRoleEligibilityScheduleRequest
Namespace: microsoft.graph



Update the properties of an [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) object.

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
PATCH /roleManagement/directory/roleEligibilityScheduleRequests/{unifiedRoleEligibilityScheduleRequestId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) object.

The following table shows the properties that are required when you update the [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md).

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

If successful, this method returns a `200 OK` response code and an updated [unifiedRoleEligibilityScheduleRequest](../resources/unifiedroleeligibilityschedulerequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_unifiedroleeligibilityschedulerequest"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/roleManagement/directory/roleEligibilityScheduleRequests/{unifiedRoleEligibilityScheduleRequestId}
Content-Type: application/json
Content-length: 672

{
  "@odata.type": "#microsoft.graph.unifiedRoleEligibilityScheduleRequest",
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
  "@odata.type": "#microsoft.graph.unifiedRoleEligibilityScheduleRequest",
  "id": "2224a2b8-a2b8-2224-b8a2-2422b8a22422",
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

