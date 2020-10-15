---
title: "message resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# message resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [outlookItem](outlookitem.md)

## Methods

| Method                                                                                         | Return Type                                                                             | Description                                                                                                 |
| :--------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List message](../api/message-list.md)                                                         | [message](message.md) collection                                                        | List properties and relationships of a message object.                                                      |
| [Create message](../api/message-create.md)                                                     | [message](message.md)                                                                   | Create a new message object.                                                                                |
| [Get message](../api/message-get.md)                                                           | [message](message.md)                                                                   | Read properties and relationships of a message object.                                                      |
| [Update message](../api/message-update.md)                                                     | [message](message.md)                                                                   | Update the properties of a message object.                                                                  |
| [Delete message](../api/message-delete.md)                                                     |                                                                                         | Delete a message object.                                                                                    |
| [copy](../api/message-copy.md)                                                                 | [message](../resources/-message.md)                                                     |                                                                                                             |
| [createForward](../api/message-createForward.md)                                               | [message](../resources/-message.md)                                                     |                                                                                                             |
| [createReply](../api/message-createReply.md)                                                   | [message](../resources/-message.md)                                                     |                                                                                                             |
| [createReplyAll](../api/message-createReplyAll.md)                                             | [message](../resources/-message.md)                                                     |                                                                                                             |
| [forward](../api/message-forward.md)                                                           |                                                                                         |                                                                                                             |
| [move](../api/message-move.md)                                                                 | [message](../resources/-message.md)                                                     |                                                                                                             |
| [reply](../api/message-reply.md)                                                               |                                                                                         |                                                                                                             |
| [replyAll](../api/message-replyAll.md)                                                         |                                                                                         |                                                                                                             |
| [send](../api/message-send.md)                                                                 |                                                                                         |                                                                                                             |
| [unsubscribe](../api/message-unsubscribe.md)                                                   |                                                                                         |                                                                                                             |
| [delta](../api/message-delta.md)                                                               |                                                                                         |                                                                                                             |
| [List attachments](../api/message-list-attachments.md)                                         | [attachment](../resources/-attachment.md)                                               | Get the attachment objects from an attachments navigation property.                                         |
| [Create attachments](../api/message-post-attachments.md)                                       | [attachment](../resources/-attachment.md)                                               | Create a new attachment object.                                                                             |
| [Get attachments](../api/message-get-attachments.md)                                           | [attachment](../resources/-attachment.md)                                               | Read the properties and relationships of an attachment object.                                              |
| [Update attachments](../api/message-update-attachments.md)                                     | [attachment](../resources/-attachment.md)                                               | Update the properties of an attachment object.                                                              |
| [Delete attachments](../api/message-delete-attachments.md)                                     |                                                                                         | Delete an attachment object.                                                                                |
| [List extensions](../api/message-list-extensions.md)                                           | [extension](../resources/-extension.md)                                                 | Get the extension objects from an extensions navigation property.                                           |
| [Create extensions](../api/message-post-extensions.md)                                         | [extension](../resources/-extension.md)                                                 | Create a new extension object.                                                                              |
| [Get extensions](../api/message-get-extensions.md)                                             | [extension](../resources/-extension.md)                                                 | Read the properties and relationships of an extension object.                                               |
| [Update extensions](../api/message-update-extensions.md)                                       | [extension](../resources/-extension.md)                                                 | Update the properties of an extension object.                                                               |
| [Delete extensions](../api/message-delete-extensions.md)                                       |                                                                                         | Delete an extension object.                                                                                 |
| [List mentions](../api/message-list-mentions.md)                                               | [mention](../resources/-mention.md)                                                     | Get the mention objects from a mentions navigation property.                                                |
| [Create mentions](../api/message-post-mentions.md)                                             | [mention](../resources/-mention.md)                                                     | Create a new mention object.                                                                                |
| [Get mentions](../api/message-get-mentions.md)                                                 | [mention](../resources/-mention.md)                                                     | Read the properties and relationships of a mention object.                                                  |
| [Update mentions](../api/message-update-mentions.md)                                           | [mention](../resources/-mention.md)                                                     | Update the properties of a mention object.                                                                  |
| [Delete mentions](../api/message-delete-mentions.md)                                           |                                                                                         | Delete a mention object.                                                                                    |
| [List multiValueExtendedProperties](../api/message-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/message-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/message-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/message-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/message-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List singleValueExtendedProperties](../api/message-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/message-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/message-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/message-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/message-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |

## Properties

| Property                   | Type                                                                      | Description |
| :------------------------- | :------------------------------------------------------------------------ | :---------- |
| bccRecipients              | [recipient](../resources/recipient.md) collection                         |             |
| body                       | [itemBody](../resources/itembody.md)                                      |             |
| bodyPreview                | String                                                                    |             |
| categories                 | String collection                                                         |             |
| ccRecipients               | [recipient](../resources/recipient.md) collection                         |             |
| changeKey                  | String                                                                    |             |
| conversationId             | String                                                                    |             |
| conversationIndex          | Binary                                                                    |             |
| createdDateTime            | DateTimeOffset                                                            |             |
| flag                       | [followupFlag](../resources/followupflag.md)                              |             |
| from                       | [recipient](../resources/recipient.md)                                    |             |
| hasAttachments             | Boolean                                                                   |             |
| id                         | String                                                                    | Read-only.  |
| importance                 | String                                                                    |             |
| inferenceClassification    | String                                                                    |             |
| internetMessageHeaders     | [internetMessageHeader](../resources/internetmessageheader.md) collection |             |
| internetMessageId          | String                                                                    |             |
| isDeliveryReceiptRequested | Boolean                                                                   |             |
| isDraft                    | Boolean                                                                   |             |
| isRead                     | Boolean                                                                   |             |
| isReadReceiptRequested     | Boolean                                                                   |             |
| lastModifiedDateTime       | DateTimeOffset                                                            |             |
| mentionsPreview            | [mentionsPreview](../resources/mentionspreview.md)                        |             |
| parentFolderId             | String                                                                    |             |
| receivedDateTime           | DateTimeOffset                                                            |             |
| replyTo                    | [recipient](../resources/recipient.md) collection                         |             |
| sender                     | [recipient](../resources/recipient.md)                                    |             |
| sentDateTime               | DateTimeOffset                                                            |             |
| subject                    | String                                                                    |             |
| toRecipients               | [recipient](../resources/recipient.md) collection                         |             |
| uniqueBody                 | [itemBody](../resources/itembody.md)                                      |             |
| unsubscribeData            | String collection                                                         |             |
| unsubscribeEnabled         | Boolean                                                                   |             |
| webLink                    | String                                                                    |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| attachments                   | [attachment](../resources/attachment.md) collection                                               |             |
| extensions                    | [extension](../resources/extension.md) collection                                                 |             |
| mentions                      | [mention](../resources/mention.md) collection                                                     |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.message",
  "baseType": "microsoft.graph.outlookItem",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.message",
  "bccRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "bodyPreview": "String",
  "categories": ["String"],
  "ccRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "changeKey": "String",
  "conversationId": "String",
  "conversationIndex": "Binary",
  "createdDateTime": "DateTimeOffset",
  "flag": {"@odata.type": "microsoft.graph.followupFlag"},
  "from": {"@odata.type": "microsoft.graph.recipient"},
  "hasAttachments": "Boolean",
  "id": "String (identifier)",
  "importance": "low | normal | high",
  "inferenceClassification": "focused | other",
  "internetMessageHeaders": [{"@odata.type": "microsoft.graph.internetMessageHeader"}],
  "internetMessageId": "String",
  "isDeliveryReceiptRequested": "Boolean",
  "isDraft": "Boolean",
  "isRead": "Boolean",
  "isReadReceiptRequested": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "mentionsPreview": {"@odata.type": "microsoft.graph.mentionsPreview"},
  "parentFolderId": "String",
  "receivedDateTime": "DateTimeOffset",
  "replyTo": [{"@odata.type": "microsoft.graph.recipient"}],
  "sender": {"@odata.type": "microsoft.graph.recipient"},
  "sentDateTime": "DateTimeOffset",
  "subject": "String",
  "toRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "uniqueBody": {"@odata.type": "microsoft.graph.itemBody"},
  "unsubscribeData": ["String"],
  "unsubscribeEnabled": "Boolean",
  "webLink": "String"
}
```
