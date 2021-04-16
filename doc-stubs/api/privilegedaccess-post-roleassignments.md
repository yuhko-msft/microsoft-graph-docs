---
title: "Create governanceRoleAssignment"
description: "Create a new governanceRoleAssignment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create governanceRoleAssignment
Namespace: microsoft.graph



Create a new governanceRoleAssignment object.

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
POST /privilegedAccess/{privilegedAccessId}/roleAssignments
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [governanceRoleAssignment](../resources/governanceroleassignment.md) object.

The following table shows the properties that are required when you create the [governanceRoleAssignment](../resources/governanceroleassignment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignmentState|String|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|linkedEligibleRoleAssignmentId|String|**TODO: Add Description**|
|memberType|String|**TODO: Add Description**|
|resourceId|String|**TODO: Add Description**|
|roleDefinitionId|String|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|status|String|**TODO: Add Description**|
|subjectId|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [governanceRoleAssignment](../resources/governanceroleassignment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_governanceroleassignment_from_governanceroleassignments"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/privilegedAccess/{privilegedAccessId}/roleAssignments
Content-Type: application/json
Content-length: 390

{
  "@odata.type": "#microsoft.graph.governanceRoleAssignment",
  "assignmentState": "String",
  "endDateTime": "String (timestamp)",
  "externalId": "String",
  "linkedEligibleRoleAssignmentId": "String",
  "memberType": "String",
  "resourceId": "String",
  "roleDefinitionId": "String",
  "startDateTime": "String (timestamp)",
  "status": "String",
  "subjectId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.governanceRoleAssignment"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.governanceRoleAssignment",
  "id": "dfe032e1-32e1-dfe0-e132-e0dfe132e0df",
  "assignmentState": "String",
  "endDateTime": "String (timestamp)",
  "externalId": "String",
  "linkedEligibleRoleAssignmentId": "String",
  "memberType": "String",
  "resourceId": "String",
  "roleDefinitionId": "String",
  "startDateTime": "String (timestamp)",
  "status": "String",
  "subjectId": "String"
}
```

