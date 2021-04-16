---
title: "Add privilegedRoleAssignmentRequest"
description: "Add request by posting to the request collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add privilegedRoleAssignmentRequest
Namespace: microsoft.graph



Add request by posting to the request collection.

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
POST /privilegedApproval/{privilegedApprovalId}/request/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [privilegedRoleAssignmentRequest](../resources/privilegedroleassignmentrequest.md) object.

The following table shows the properties that are required when you create the [privilegedRoleAssignmentRequest](../resources/privilegedroleassignmentrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignmentState|String|**TODO: Add Description**|
|duration|String|**TODO: Add Description**|
|reason|String|**TODO: Add Description**|
|requestedDateTime|DateTimeOffset|**TODO: Add Description**|
|roleId|String|**TODO: Add Description**|
|schedule|[governanceSchedule](../resources/governanceschedule.md)|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|ticketNumber|String|**TODO: Add Description**|
|ticketSystem|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [privilegedRoleAssignmentRequest](../resources/privilegedroleassignmentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_privilegedroleassignmentrequest_from_privilegedroleassignmentrequests"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/privilegedApproval/{privilegedApprovalId}/request/$ref
Content-Type: application/json
Content-length: 427

{
  "@odata.type": "#microsoft.graph.privilegedRoleAssignmentRequest",
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
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.privilegedRoleAssignmentRequest",
  "id": "990453ec-53ec-9904-ec53-0499ec530499",
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
```

