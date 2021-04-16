---
title: "post resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# post resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [outlookItem](../resources/outlookitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List posts](../api/post-list.md)|[post](../resources/post.md) collection|Get a list of the [post](../resources/post.md) objects and their properties.|
|[Create post](../api/post-create.md)|[post](../resources/post.md)|Create a new [post](../resources/post.md) object.|
|[Get post](../api/post-get.md)|[post](../resources/post.md)|Read the properties and relationships of a [post](../resources/post.md) object.|
|[Update post](../api/post-update.md)|[post](../resources/post.md)|Update the properties of a [post](../resources/post.md) object.|
|[Delete post](../api/post-delete.md)|None|Deletes a [post](../resources/post.md) object.|
|[List mentions](../api/post-list-mentions.md)|[mention](../resources/mention.md) collection|Get the mention resources from the mentions navigation property.|
|[Create mention](../api/post-post-mentions.md)|[mention](../resources/mention.md)|Create a new mention object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|conversationId|String|**TODO: Add Description**|
|conversationThreadId|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|from|[recipient](../resources/recipient.md)|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|importance|importance|**TODO: Add Description**. Possible values are: `low`, `normal`, `high`.|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|newParticipants|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|receivedDateTime|DateTimeOffset|**TODO: Add Description**|
|sender|[recipient](../resources/recipient.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|attachments|[attachment](../resources/attachment.md) collection|**TODO: Add Description**|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description**|
|inReplyTo|[post](../resources/post.md)|**TODO: Add Description**|
|mentions|[mention](../resources/mention.md) collection|**TODO: Add Description**|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.post",
  "baseType": "microsoft.graph.outlookItem",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.post",
  "id": "String (identifier)",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "conversationId": "String",
  "conversationThreadId": "String",
  "from": {
    "@odata.type": "microsoft.graph.recipient"
  },
  "hasAttachments": "Boolean",
  "importance": "String",
  "newParticipants": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "receivedDateTime": "String (timestamp)",
  "sender": {
    "@odata.type": "microsoft.graph.recipient"
  }
}
```

