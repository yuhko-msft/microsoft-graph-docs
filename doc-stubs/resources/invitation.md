---
title: "invitation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# invitation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List invitations](../api/invitation-list.md)|[invitation](../resources/invitation.md) collection|Get a list of the [invitation](../resources/invitation.md) objects and their properties.|
|[Create invitation](../api/invitation-post-invitations.md)|[invitation](../resources/invitation.md)|Create a new [invitation](../resources/invitation.md) object.|
|[Get invitation](../api/invitation-get.md)|[invitation](../resources/invitation.md)|Read the properties and relationships of an [invitation](../resources/invitation.md) object.|
|[Update invitation](../api/invitation-update.md)|[invitation](../resources/invitation.md)|Update the properties of an [invitation](../resources/invitation.md) object.|
|[Delete invitation](../api/invitation-delete.md)|None|Deletes an [invitation](../resources/invitation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|invitedUserDisplayName|String|**TODO: Add Description**|
|invitedUserEmailAddress|String|**TODO: Add Description**|
|invitedUserMessageInfo|[invitedUserMessageInfo](../resources/invitedusermessageinfo.md)|**TODO: Add Description**|
|invitedUserType|String|**TODO: Add Description**|
|inviteRedeemUrl|String|**TODO: Add Description**|
|inviteRedirectUrl|String|**TODO: Add Description**|
|resetRedemption|Boolean|**TODO: Add Description**|
|sendInvitationMessage|Boolean|**TODO: Add Description**|
|status|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|invitedUser|[user](../resources/user.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.invitation",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.invitation",
  "id": "String (identifier)",
  "invitedUserDisplayName": "String",
  "invitedUserEmailAddress": "String",
  "invitedUserMessageInfo": {
    "@odata.type": "microsoft.graph.invitedUserMessageInfo"
  },
  "invitedUserType": "String",
  "inviteRedeemUrl": "String",
  "inviteRedirectUrl": "String",
  "resetRedemption": "Boolean",
  "sendInvitationMessage": "Boolean",
  "status": "String"
}
```

