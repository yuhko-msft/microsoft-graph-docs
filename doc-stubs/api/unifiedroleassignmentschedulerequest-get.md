---
title: "Get unifiedRoleAssignmentScheduleRequest"
description: "Read the properties and relationships of an unifiedRoleAssignmentScheduleRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get unifiedRoleAssignmentScheduleRequest
Namespace: microsoft.graph



Read the properties and relationships of an [unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) object.

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
GET /roleManagement/directory/roleAssignmentScheduleRequests/{unifiedRoleAssignmentScheduleRequestId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_unifiedroleassignmentschedulerequest"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/roleManagement/directory/roleAssignmentScheduleRequests/{unifiedRoleAssignmentScheduleRequestId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.unifiedRoleAssignmentScheduleRequest"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

