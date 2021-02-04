---
title: "Create linkedResource"
description: "Create a new linkedResource object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create linkedResource
Namespace: microsoft.graph

Create a new [linkedResource](../resources/linkedresource.md) object.

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
POST /user/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/linkedResources
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [linkedResource](../resources/linkedresource.md) object.

The following table shows the properties that are required when you create the [linkedResource](../resources/linkedresource.md).

|Property|Type|Description|
|:---|:---|:---|
|webUrl|String|**TODO: Add Description**|
|applicationName|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [linkedResource](../resources/linkedresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_linkedresource_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/user/todo/lists/{todoTaskListId}/tasks/{todoTaskId}/linkedResources
Content-Type: application/json
Content-length: 165

{
  "@odata.type": "#microsoft.toDo.linkedResource",
  "webUrl": "String",
  "applicationName": "String",
  "displayName": "String",
  "externalId": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.toDo.linkedResource"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.toDo.linkedResource",
  "webUrl": "String",
  "applicationName": "String",
  "displayName": "String",
  "externalId": "String",
  "id": "e93bb94f-b94f-e93b-4fb9-3be94fb93be9"
}
```

