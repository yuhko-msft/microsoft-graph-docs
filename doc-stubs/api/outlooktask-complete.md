---
title: "outlookTask: complete"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# outlookTask: complete
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
POST /me/outlook/tasks/{outlookTaskId}/complete
POST /users/{usersId}/outlook/tasks/{outlookTaskId}/complete
POST /me/outlook/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/complete
POST /users/{usersId}/outlook/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/complete
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `200 OK` response code and a [outlookTask](../resources/outlooktask.md) collection in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "outlooktask_complete"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/outlook/tasks/{outlookTaskId}/complete
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.outlookTask)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.outlookTask",
      "id": "String (identifier)",
      "categories": [
        "String"
      ],
      "changeKey": "String",
      "createdDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "assignedTo": "String",
      "body": {
        "@odata.type": "microsoft.graph.itemBody"
      },
      "completedDateTime": {
        "@odata.type": "microsoft.graph.dateTimeTimeZone"
      },
      "dueDateTime": {
        "@odata.type": "microsoft.graph.dateTimeTimeZone"
      },
      "hasAttachments": "Boolean",
      "importance": "String",
      "isReminderOn": "Boolean",
      "owner": "String",
      "parentFolderId": "String",
      "recurrence": {
        "@odata.type": "microsoft.graph.patternedRecurrence"
      },
      "reminderDateTime": {
        "@odata.type": "microsoft.graph.dateTimeTimeZone"
      },
      "sensitivity": "String",
      "startDateTime": {
        "@odata.type": "microsoft.graph.dateTimeTimeZone"
      },
      "status": "String",
      "subject": "String"
    }
  ]
}
```

