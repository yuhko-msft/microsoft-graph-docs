---
title: "Create governanceRoleAssignmentRequest"
description: "Create a new governanceRoleAssignmentRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create governanceRoleAssignmentRequest
Namespace: microsoft.graph



Create a new governanceRoleAssignmentRequest object.

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
POST /governanceResources/{governanceResourcesId}/roleAssignmentRequests
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) object.

The following table shows the properties that are required when you create the [governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignmentState|String|**TODO: Add Description**|
|linkedEligibleRoleAssignmentId|String|**TODO: Add Description**|
|reason|String|**TODO: Add Description**|
|requestedDateTime|DateTimeOffset|**TODO: Add Description**|
|resourceId|String|**TODO: Add Description**|
|roleDefinitionId|String|**TODO: Add Description**|
|schedule|[governanceSchedule](../resources/governanceschedule.md)|**TODO: Add Description**|
|status|[governanceRoleAssignmentRequestStatus](../resources/governanceroleassignmentrequeststatus.md)|**TODO: Add Description**|
|subjectId|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [governanceRoleAssignmentRequest](../resources/governanceroleassignmentrequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_governanceroleassignmentrequest_from_governanceroleassignmentrequests"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/governanceResources/{governanceResourcesId}/roleAssignmentRequests
Content-Type: application/json
Content-length: 505

{
  "@odata.type": "#microsoft.graph.governanceRoleAssignmentRequest",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.governanceRoleAssignmentRequest"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.governanceRoleAssignmentRequest",
  "id": "8e828cca-8cca-8e82-ca8c-828eca8c828e",
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

