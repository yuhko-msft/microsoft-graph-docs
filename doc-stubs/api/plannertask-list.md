---
title: "List plannerTasks"
description: "Get a list of the plannerTask objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List plannerTasks
Namespace: microsoft.graph



Get a list of the [plannerTask](../resources/plannertask.md) objects and their properties.

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
GET /planner/tasks
GET /me/planner/tasks
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

If successful, this method returns a `200 OK` response code and a collection of [plannerTask](../resources/plannertask.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_plannertask"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/planner/tasks
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.plannerTask)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.plannerTask",
      "id": "6b610e56-0e56-6b61-560e-616b560e616b",
      "activeChecklistItemCount": "Integer",
      "appliedCategories": {
        "@odata.type": "microsoft.graph.plannerAppliedCategories"
      },
      "assigneePriority": "String",
      "assignments": {
        "@odata.type": "microsoft.graph.plannerAssignments"
      },
      "bucketId": "String",
      "checklistItemCount": "Integer",
      "completedBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "completedDateTime": "String (timestamp)",
      "conversationThreadId": "String",
      "createdBy": {
        "@odata.type": "microsoft.graph.identitySet"
      },
      "createdDateTime": "String (timestamp)",
      "creationSource": {
        "@odata.type": "microsoft.graph.plannerTaskCreation"
      },
      "dueDateTime": "String (timestamp)",
      "hasDescription": "Boolean",
      "orderHint": "String",
      "percentComplete": "Integer",
      "planId": "String",
      "previewType": "String",
      "priority": "Integer",
      "referenceCount": "Integer",
      "startDateTime": "String (timestamp)",
      "title": "String"
    }
  ]
}
```

