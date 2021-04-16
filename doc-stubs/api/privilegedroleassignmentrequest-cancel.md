---
title: "privilegedRoleAssignmentRequest: cancel"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# privilegedRoleAssignmentRequest: cancel
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /privilegedRoleAssignmentRequests/{privilegedRoleAssignmentRequestsId}/cancel
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [privilegedRoleAssignmentRequest](../resources/privilegedroleassignmentrequest.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "privilegedroleassignmentrequest_cancel"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/privilegedRoleAssignmentRequests/{privilegedRoleAssignmentRequestsId}/cancel
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.privilegedRoleAssignmentRequest"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.privilegedRoleAssignmentRequest",
    "id": "String (identifier)",
    "assignmentState": "String",
    "duration": "String",
    "reason": "String",
    "requestedDateTime": "String (timestamp)",
    "roleId": "String",
    "schedule": {
      "@odata.type": "microsoft.graph.governanceSchedule"
    },
    "status": "String",
    "ticketNumber": "String",
    "ticketSystem": "String",
    "type": "String",
    "userId": "String"
  }
}
```

