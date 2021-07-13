---
title: "aadUserConversationMember resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# aadUserConversationMember resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [conversationMember](../resources/conversationmember.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List aadUserConversationMembers](../api/aaduserconversationmember-list.md)|[aadUserConversationMember](../resources/aaduserconversationmember.md) collection|Get a list of the [aadUserConversationMember](../resources/aaduserconversationmember.md) objects and their properties.|
|[Create aadUserConversationMember](../api/aaduserconversationmember-create.md)|[aadUserConversationMember](../resources/aaduserconversationmember.md)|Create a new [aadUserConversationMember](../resources/aaduserconversationmember.md) object.|
|[Get aadUserConversationMember](../api/aaduserconversationmember-get.md)|[aadUserConversationMember](../resources/aaduserconversationmember.md)|Read the properties and relationships of an [aadUserConversationMember](../resources/aaduserconversationmember.md) object.|
|[Update aadUserConversationMember](../api/aaduserconversationmember-update.md)|[aadUserConversationMember](../resources/aaduserconversationmember.md)|Update the properties of an [aadUserConversationMember](../resources/aaduserconversationmember.md) object.|
|[Delete aadUserConversationMember](../api/aaduserconversationmember-delete.md)|None|Deletes an [aadUserConversationMember](../resources/aaduserconversationmember.md) object.|
|[List user](../api/aaduserconversationmember-list-user.md)|[user](../resources/user.md) collection|Get the user resources from the user navigation property.|
|[Add user](../api/aaduserconversationmember-post-user.md)|[user](../resources/user.md)|Add user by posting to the user collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [conversationMember](../resources/conversationmember.md).|
|email|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|roles|String collection|**TODO: Add Description** Inherited from [conversationMember](../resources/conversationmember.md).|
|tenantId|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|visibleHistoryStartDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [conversationMember](../resources/conversationmember.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|user|[user](../resources/user.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.aadUserConversationMember",
  "baseType": "microsoft.graph.conversationMember",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.aadUserConversationMember",
  "id": "String (identifier)",
  "displayName": "String",
  "roles": [
    "String"
  ],
  "visibleHistoryStartDateTime": "String (timestamp)",
  "email": "String",
  "tenantId": "String",
  "userId": "String"
}
```

