---
title: "List multiValueLegacyExtendedProperties"
description: "Get a list of the multiValueLegacyExtendedProperty objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List multiValueLegacyExtendedProperties
Namespace: microsoft.graph

Get a list of the [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) objects and their properties.

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
GET /users/{usersId}/messages/{messageId}/multiValueExtendedProperties
GET /users/{usersId}/contacts/{contactId}/multiValueExtendedProperties
GET /users/{usersId}/messages/{messageId}/event/multiValueExtendedProperties
GET /users/{usersId}/mailFolders/{mailFolderId}/multiValueExtendedProperties
GET /users/{usersId}/contactFolders/{contactFolderId}/multiValueExtendedProperties
GET /users/{usersId}/messages/{messageId}/event/calendar/multiValueExtendedProperties
GET /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/multiValueExtendedProperties
GET /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}/multiValueExtendedProperties
GET /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/multiValueExtendedProperties
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

If successful, this method returns a `200 OK` response code and a collection of [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_multivaluelegacyextendedproperty"
}
-->
``` http
GET https://graph.microsoft.com/beta/users/{usersId}/messages/{messageId}/multiValueExtendedProperties
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.multiValueLegacyExtendedProperty)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.multiValueLegacyExtendedProperty",
      "id": "24e89013-9013-24e8-1390-e8241390e824",
      "value": [
        "String"
      ]
    }
  ]
}
```

