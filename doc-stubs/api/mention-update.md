---
title: "Update mention"
description: "Update the properties of a mention object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mention
Namespace: microsoft.graph



Update the properties of a [mention](../resources/mention.md) object.

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
PATCH /me/mailFolders/{mailFolderId}/messages/{messageId}/mentions/{mentionId}
PATCH /users/{usersId}/mailFolders/{mailFolderId}/messages/{messageId}/mentions/{mentionId}
PATCH /groups/{groupsId}/conversations/{conversationId}/threads/{conversationThreadId}/posts/{postId}/mentions/{mentionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mention](../resources/mention.md) object.

The following table shows the properties that are required when you update the [mention](../resources/mention.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|application|String|**TODO: Add Description**|
|clientReference|String|**TODO: Add Description**|
|createdBy|[emailAddress](../resources/emailaddress.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|deepLink|String|**TODO: Add Description**|
|mentioned|[emailAddress](../resources/emailaddress.md)|**TODO: Add Description**|
|mentionText|String|**TODO: Add Description**|
|serverCreatedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [mention](../resources/mention.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mention"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/mailFolders/{mailFolderId}/messages/{messageId}/mentions/{mentionId}
Content-Type: application/json
Content-length: 362

{
  "@odata.type": "#microsoft.graph.mention",
  "application": "String",
  "clientReference": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "deepLink": "String",
  "mentioned": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "mentionText": "String",
  "serverCreatedDateTime": "String (timestamp)"
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
  "@odata.type": "#microsoft.graph.mention",
  "id": "2972a86e-a86e-2972-6ea8-72296ea87229",
  "application": "String",
  "clientReference": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "createdDateTime": "String (timestamp)",
  "deepLink": "String",
  "mentioned": {
    "@odata.type": "microsoft.graph.emailAddress"
  },
  "mentionText": "String",
  "serverCreatedDateTime": "String (timestamp)"
}
```

