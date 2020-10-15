---
title: "mailTips resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# mailTips resource type

Namespace: microsoft.graph

## Properties

| Property             | Type                                                                 | Description |
| :------------------- | :------------------------------------------------------------------- | :---------- |
| automaticReplies     | [automaticRepliesMailTips](../resources/automaticrepliesmailtips.md) |             |
| customMailTip        | String                                                               |             |
| deliveryRestricted   | Boolean                                                              |             |
| emailAddress         | [emailAddress](../resources/emailaddress.md)                         |             |
| error                | [mailTipsError](../resources/mailtipserror.md)                       |             |
| externalMemberCount  | Int32                                                                |             |
| isModerated          | Boolean                                                              |             |
| mailboxFull          | Boolean                                                              |             |
| maxMessageSize       | Int32                                                                |             |
| recipientScope       | String                                                               |             |
| recipientSuggestions | [recipient](../resources/recipient.md) collection                    |             |
| totalMemberCount     | Int32                                                                |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mailTips",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.mailTips",
  "automaticReplies": {"@odata.type": "microsoft.graph.automaticRepliesMailTips"},
  "customMailTip": "String",
  "deliveryRestricted": "Boolean",
  "emailAddress": {"@odata.type": "microsoft.graph.emailAddress"},
  "error": {"@odata.type": "microsoft.graph.mailTipsError"},
  "externalMemberCount": "Int32",
  "isModerated": "Boolean",
  "mailboxFull": "Boolean",
  "maxMessageSize": "Int32",
  "recipientScope": "none | internal | external | externalPartner | externalNonPartner",
  "recipientSuggestions": [{"@odata.type": "microsoft.graph.recipient"}],
  "totalMemberCount": "Int32"
}
```
