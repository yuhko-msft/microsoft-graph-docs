---
title: "Create task"
description: "Create a new task object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create task
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new task object.

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
POST /user/tasks/lists/{wellKnownTaskListId}/tasks/{taskId}/parentList/tasks
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [task](../resources/task.md) object.

The following table shows the properties that are required when you create the [task](../resources/task.md).

|Property|Type|Description|
|:---|:---|:---|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|bodyLastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|completedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|dueDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|startDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|importance|importance|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md). The possible values are: `low`, `normal`, `high`.|
|recurrence|[patternedRecurrence](../resources/patternedrecurrence.md)|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|displayName|String|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|status|taskStatus_v2|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md). The possible values are: `notStarted`, `inProgress`, `completed`, `unknownFutureValue`.|
|personalProperties|[personalTaskProperties](../resources/personaltaskproperties.md)|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|
|id|String|**TODO: Add Description** Inherited from [baseTask](../resources/basetask.md)|



## Response

If successful, this method returns a `201 Created` response code and a [task](../resources/task.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_task_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/user/tasks/lists/{wellKnownTaskListId}/tasks/{taskId}/parentList/tasks
Content-Type: application/json
Content-length: 630

{
  "@odata.type": "#microsoft.graph.task",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "bodyLastModifiedDateTime": "String (timestamp)",
  "completedDateTime": "String (timestamp)",
  "dueDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "startDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "importance": "String",
  "recurrence": {
    "@odata.type": "microsoft.graph.patternedRecurrence"
  },
  "displayName": "String",
  "status": "String",
  "personalProperties": {
    "@odata.type": "microsoft.graph.personalTaskProperties"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.task"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.task",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "bodyLastModifiedDateTime": "String (timestamp)",
  "completedDateTime": "String (timestamp)",
  "dueDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "startDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "importance": "String",
  "recurrence": {
    "@odata.type": "microsoft.graph.patternedRecurrence"
  },
  "displayName": "String",
  "status": "String",
  "personalProperties": {
    "@odata.type": "microsoft.graph.personalTaskProperties"
  },
  "id": "f3371abc-1abc-f337-bc1a-37f3bc1a37f3"
}
```

