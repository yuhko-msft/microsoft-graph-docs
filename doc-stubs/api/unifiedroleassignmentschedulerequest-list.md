---
title: "List unifiedRoleAssignmentScheduleRequests"
description: "Get a list of the unifiedRoleAssignmentScheduleRequest objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List unifiedRoleAssignmentScheduleRequests
Namespace: microsoft.graph



Get a list of the [unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) objects and their properties.

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
GET /roleManagement/directory/roleAssignmentScheduleRequests
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

If successful, this method returns a `200 OK` response code and a collection of [unifiedRoleAssignmentScheduleRequest](../resources/unifiedroleassignmentschedulerequest.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_unifiedroleassignmentschedulerequest"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/roleManagement/directory/roleAssignmentScheduleRequests
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.unifiedRoleAssignmentScheduleRequest)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

