---
title: "Create singleValueLegacyExtendedProperty"
description: "Create a new singleValueLegacyExtendedProperty object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create singleValueLegacyExtendedProperty
Namespace: microsoft.graph

Create a new [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST /users/{usersId}/messages/{messageId}/singleValueExtendedProperties
POST /users/{usersId}/contacts/{contactId}/singleValueExtendedProperties
POST /users/{usersId}/messages/{messageId}/event/singleValueExtendedProperties
POST /users/{usersId}/mailFolders/{mailFolderId}/singleValueExtendedProperties
POST /users/{usersId}/contactFolders/{contactFolderId}/singleValueExtendedProperties
POST /users/{usersId}/messages/{messageId}/event/calendar/singleValueExtendedProperties
POST /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/singleValueExtendedProperties
POST /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}/singleValueExtendedProperties
POST /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/singleValueExtendedProperties
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) object.

The following table shows the properties that are required when you create the [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_singlevaluelegacyextendedproperty_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/messages/{messageId}/singleValueExtendedProperties
Content-Type: application/json
Content-length: 97

{
  "@odata.type": "#microsoft.graph.singleValueLegacyExtendedProperty",
  "value": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.singleValueLegacyExtendedProperty"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.singleValueLegacyExtendedProperty",
  "id": "b77436d5-36d5-b774-d536-74b7d53674b7",
  "value": "String"
}
```

