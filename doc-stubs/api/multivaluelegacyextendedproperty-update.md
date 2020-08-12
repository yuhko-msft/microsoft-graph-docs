---
title: "Update multiValueLegacyExtendedProperty"
description: "Update the properties of a multiValueLegacyExtendedProperty object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update multiValueLegacyExtendedProperty
Namespace: microsoft.graph

Update the properties of a [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) object.

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
PATCH /users/{usersId}/messages/{messageId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
PATCH /users/{usersId}/contacts/{contactId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
PATCH /users/{usersId}/messages/{messageId}/event/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
PATCH /users/{usersId}/mailFolders/{mailFolderId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
PATCH /users/{usersId}/contactFolders/{contactFolderId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
PATCH /users/{usersId}/messages/{messageId}/event/calendar/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
PATCH /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
PATCH /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
PATCH /users/{usersId}/outlook/taskGroups/{outlookTaskGroupId}/taskFolders/{outlookTaskFolderId}/tasks/{outlookTaskId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) object.

The following table shows the properties that are required when you create the [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_multivaluelegacyextendedproperty"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/users/{usersId}/messages/{messageId}/multiValueExtendedProperties/{multiValueLegacyExtendedPropertyId}
Content-Type: application/json
Content-length: 108

{
  "@odata.type": "#microsoft.graph.multiValueLegacyExtendedProperty",
  "value": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.multiValueLegacyExtendedProperty",
  "id": "24e89013-9013-24e8-1390-e8241390e824",
  "value": [
    "String"
  ]
}
```

