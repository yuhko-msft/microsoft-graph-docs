---
title: "post resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# post resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [outlookItem](outlookitem.md)

## Methods

| Method                                                                                      | Return Type                                                                             | Description                                                                                                 |
| :------------------------------------------------------------------------------------------ | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List post](../api/post-list.md)                                                            | [post](post.md) collection                                                              | List properties and relationships of a post object.                                                         |
| [Create post](../api/post-create.md)                                                        | [post](post.md)                                                                         | Create a new post object.                                                                                   |
| [Get post](../api/post-get.md)                                                              | [post](post.md)                                                                         | Read properties and relationships of a post object.                                                         |
| [Update post](../api/post-update.md)                                                        | [post](post.md)                                                                         | Update the properties of a post object.                                                                     |
| [Delete post](../api/post-delete.md)                                                        |                                                                                         | Delete a post object.                                                                                       |
| [forward](../api/post-forward.md)                                                           |                                                                                         |                                                                                                             |
| [reply](../api/post-reply.md)                                                               |                                                                                         |                                                                                                             |
| [List attachments](../api/post-list-attachments.md)                                         | [attachment](../resources/-attachment.md)                                               | Get the attachment objects from an attachments navigation property.                                         |
| [Create attachments](../api/post-post-attachments.md)                                       | [attachment](../resources/-attachment.md)                                               | Create a new attachment object.                                                                             |
| [Get attachments](../api/post-get-attachments.md)                                           | [attachment](../resources/-attachment.md)                                               | Read the properties and relationships of an attachment object.                                              |
| [Update attachments](../api/post-update-attachments.md)                                     | [attachment](../resources/-attachment.md)                                               | Update the properties of an attachment object.                                                              |
| [Delete attachments](../api/post-delete-attachments.md)                                     |                                                                                         | Delete an attachment object.                                                                                |
| [List extensions](../api/post-list-extensions.md)                                           | [extension](../resources/-extension.md)                                                 | Get the extension objects from an extensions navigation property.                                           |
| [Create extensions](../api/post-post-extensions.md)                                         | [extension](../resources/-extension.md)                                                 | Create a new extension object.                                                                              |
| [Get extensions](../api/post-get-extensions.md)                                             | [extension](../resources/-extension.md)                                                 | Read the properties and relationships of an extension object.                                               |
| [Update extensions](../api/post-update-extensions.md)                                       | [extension](../resources/-extension.md)                                                 | Update the properties of an extension object.                                                               |
| [Delete extensions](../api/post-delete-extensions.md)                                       |                                                                                         | Delete an extension object.                                                                                 |
| [List inReplyTo](../api/post-list-inreplyto.md)                                             | [post](../resources/-post.md)                                                           | Get the post objects from an inReplyTo navigation property.                                                 |
| [Create inReplyTo](../api/post-post-inreplyto.md)                                           | [post](../resources/-post.md)                                                           | Create a new post object.                                                                                   |
| [Get inReplyTo](../api/post-get-inreplyto.md)                                               | [post](../resources/-post.md)                                                           | Read the properties and relationships of a post object.                                                     |
| [Update inReplyTo](../api/post-update-inreplyto.md)                                         | [post](../resources/-post.md)                                                           | Update the properties of a post object.                                                                     |
| [Delete inReplyTo](../api/post-delete-inreplyto.md)                                         |                                                                                         | Delete a post object.                                                                                       |
| [List mentions](../api/post-list-mentions.md)                                               | [mention](../resources/-mention.md)                                                     | Get the mention objects from a mentions navigation property.                                                |
| [Create mentions](../api/post-post-mentions.md)                                             | [mention](../resources/-mention.md)                                                     | Create a new mention object.                                                                                |
| [Get mentions](../api/post-get-mentions.md)                                                 | [mention](../resources/-mention.md)                                                     | Read the properties and relationships of a mention object.                                                  |
| [Update mentions](../api/post-update-mentions.md)                                           | [mention](../resources/-mention.md)                                                     | Update the properties of a mention object.                                                                  |
| [Delete mentions](../api/post-delete-mentions.md)                                           |                                                                                         | Delete a mention object.                                                                                    |
| [List multiValueExtendedProperties](../api/post-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/post-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/post-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/post-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/post-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List singleValueExtendedProperties](../api/post-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/post-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/post-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/post-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/post-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |

## Properties

| Property             | Type                                              | Description |
| :------------------- | :------------------------------------------------ | :---------- |
| body                 | [itemBody](../resources/itembody.md)              |             |
| categories           | String collection                                 |             |
| changeKey            | String                                            |             |
| conversationId       | String                                            |             |
| conversationThreadId | String                                            |             |
| createdDateTime      | DateTimeOffset                                    |             |
| from                 | [recipient](../resources/recipient.md)            |             |
| hasAttachments       | Boolean                                           |             |
| id                   | String                                            | Read-only.  |
| importance           | String                                            |             |
| lastModifiedDateTime | DateTimeOffset                                    |             |
| newParticipants      | [recipient](../resources/recipient.md) collection |             |
| receivedDateTime     | DateTimeOffset                                    |             |
| sender               | [recipient](../resources/recipient.md)            |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| attachments                   | [attachment](../resources/attachment.md) collection                                               |             |
| extensions                    | [extension](../resources/extension.md) collection                                                 |             |
| inReplyTo                     | [post](../resources/post.md)                                                                      |             |
| mentions                      | [mention](../resources/mention.md) collection                                                     |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.post",
  "baseType": "microsoft.graph.outlookItem",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.post",
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "categories": ["String"],
  "changeKey": "String",
  "conversationId": "String",
  "conversationThreadId": "String",
  "createdDateTime": "DateTimeOffset",
  "from": {"@odata.type": "microsoft.graph.recipient"},
  "hasAttachments": "Boolean",
  "id": "String (identifier)",
  "importance": "low | normal | high",
  "lastModifiedDateTime": "DateTimeOffset",
  "newParticipants": [{"@odata.type": "microsoft.graph.recipient"}],
  "receivedDateTime": "DateTimeOffset",
  "sender": {"@odata.type": "microsoft.graph.recipient"}
}
```
