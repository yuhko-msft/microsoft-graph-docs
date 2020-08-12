---
title: "Create group"
description: "Create a new group object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create group
Namespace: microsoft.graph

Create a new [group](../resources/group.md) object.

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
POST /groups
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [group](../resources/group.md) object.

The following table shows the properties that are required when you create the [group](../resources/group.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessType|groupAccessType|**TODO: Add Description**. Possible values are: `none`, `private`, `secret`, `public`.|
|allowExternalSenders|Boolean|**TODO: Add Description**|
|autoSubscribeNewMembers|Boolean|**TODO: Add Description**|
|isFavorite|Boolean|**TODO: Add Description**|
|isSubscribedByMail|Boolean|**TODO: Add Description**|
|unseenCount|Int32|**TODO: Add Description**|
|unseenConversationsCount|Int32|**TODO: Add Description**|
|unseenMessagesCount|Int32|**TODO: Add Description**|
|hideFromOutlookClients|Boolean|**TODO: Add Description**|
|hideFromAddressLists|Boolean|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [group](../resources/group.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_group_from_groups"
}
-->
``` http
POST https://graph.microsoft.com/beta/groups
Content-Type: application/json
Content-length: 403

{
  "@odata.type": "#microsoft.graph.group",
  "accessType": "String",
  "allowExternalSenders": "Boolean",
  "autoSubscribeNewMembers": "Boolean",
  "isFavorite": "Boolean",
  "isSubscribedByMail": "Boolean",
  "unseenCount": "Integer",
  "unseenConversationsCount": "Integer",
  "unseenMessagesCount": "Integer",
  "hideFromOutlookClients": "Boolean",
  "hideFromAddressLists": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.group"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.group",
  "id": "35183b7e-3b7e-3518-7e3b-18357e3b1835",
  "accessType": "String",
  "allowExternalSenders": "Boolean",
  "autoSubscribeNewMembers": "Boolean",
  "isFavorite": "Boolean",
  "isSubscribedByMail": "Boolean",
  "unseenCount": "Integer",
  "unseenConversationsCount": "Integer",
  "unseenMessagesCount": "Integer",
  "hideFromOutlookClients": "Boolean",
  "hideFromAddressLists": "Boolean"
}
```

