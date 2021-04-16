---
title: "Create deviceAppManagementTask"
description: "Create a new deviceAppManagementTask object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create deviceAppManagementTask
Namespace: microsoft.graph



Create a new deviceAppManagementTask object.

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
POST /deviceAppManagement/deviceAppManagementTasks
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceAppManagementTask](../resources/deviceappmanagementtask.md) object.

The following table shows the properties that are required when you create the [deviceAppManagementTask](../resources/deviceappmanagementtask.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|assignedTo|String|The name or email of the admin this task is assigned to.|
|category|deviceAppManagementTaskCategory|The category. Possible values are: `unknown`, `advancedThreatProtection`.|
|createdDateTime|DateTimeOffset|The created date.|
|creator|String|The email address of the creator.|
|creatorNotes|String|Notes from the creator.|
|description|String|The description.|
|displayName|String|The name.|
|dueDateTime|DateTimeOffset|The due date.|
|priority|deviceAppManagementTaskPriority|The priority. Possible values are: `none`, `high`, `low`.|
|status|deviceAppManagementTaskStatus|The status. Possible values are: `unknown`, `pending`, `active`, `completed`, `rejected`.|



## Response

If successful, this method returns a `201 Created` response code and a [deviceAppManagementTask](../resources/deviceappmanagementtask.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_deviceappmanagementtask_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/deviceAppManagementTasks
Content-Type: application/json
Content-length: 314

{
  "@odata.type": "#microsoft.graph.deviceAppManagementTask",
  "assignedTo": "String",
  "category": "String",
  "creator": "String",
  "creatorNotes": "String",
  "description": "String",
  "displayName": "String",
  "dueDateTime": "String (timestamp)",
  "priority": "String",
  "status": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceAppManagementTask"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceAppManagementTask",
  "id": "42ba064e-064e-42ba-4e06-ba424e06ba42",
  "assignedTo": "String",
  "category": "String",
  "createdDateTime": "String (timestamp)",
  "creator": "String",
  "creatorNotes": "String",
  "description": "String",
  "displayName": "String",
  "dueDateTime": "String (timestamp)",
  "priority": "String",
  "status": "String"
}
```

