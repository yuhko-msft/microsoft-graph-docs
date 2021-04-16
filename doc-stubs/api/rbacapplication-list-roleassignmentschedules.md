---
title: "List roleAssignmentSchedules"
description: "Get the unifiedRoleAssignmentSchedule resources from the roleAssignmentSchedules navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List roleAssignmentSchedules
Namespace: microsoft.graph



Get the unifiedRoleAssignmentSchedule resources from the roleAssignmentSchedules navigation property.

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
GET /roleManagement/directory/roleAssignmentSchedules
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

If successful, this method returns a `200 OK` response code and a collection of [unifiedRoleAssignmentSchedule](../resources/unifiedroleassignmentschedule.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_unifiedroleassignmentschedule"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/roleManagement/directory/roleAssignmentSchedules
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.unifiedRoleAssignmentSchedule)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

