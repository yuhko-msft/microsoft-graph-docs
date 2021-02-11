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

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [conversationMember](../resources/conversationmember.md)|
|email|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [conversationMember](../resources/conversationmember.md)|
|roles|String collection|**TODO: Add Description** Inherited from [conversationMember](../resources/conversationmember.md)|
|tenantId|String|**TODO: Add Description**|
|userId|String|**TODO: Add Description**|
|visibleHistoryStartDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [conversationMember](../resources/conversationmember.md)|

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
  "baseType": "Microsoft.Teams.GraphSvc.conversationMember",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.aadUserConversationMember",
  "id": "String (identifier)",
  "roles": [
    "String"
  ],
  "displayName": "String",
  "visibleHistoryStartDateTime": "String (timestamp)",
  "userId": "String",
  "email": "String",
  "tenantId": "String"
}
```

