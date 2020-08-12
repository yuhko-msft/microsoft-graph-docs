---
title: "Delete multiValueLegacyExtendedProperty"
description: "Deletes a multiValueLegacyExtendedProperty object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Delete multiValueLegacyExtendedProperty
Namespace: microsoft.graph

Deletes a [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) object.

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
DELETE /users/{usersId}/messages/{messageId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
DELETE /users/{usersId}/contacts/{contactId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
DELETE /users/{usersId}/messages/{messageId}/event/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
DELETE /users/{usersId}/mailFolders/{mailFolderId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
DELETE /users/{usersId}/contactFolders/{contactFolderId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
DELETE /users/{usersId}/messages/{messageId}/event/calendar/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
DELETE /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
DELETE /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
DELETE /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "delete_multivaluelegacyextendedproperty"
}
-->
``` http
DELETE https://graph.microsoft.com/beta/users/{usersId}/messages/{messageId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```

