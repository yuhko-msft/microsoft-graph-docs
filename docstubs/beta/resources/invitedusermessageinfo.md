---
title: "invitedUserMessageInfo resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# invitedUserMessageInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property              | Type                                              | Description |
| :-------------------- | :------------------------------------------------ | :---------- |
| ccRecipients          | [recipient](../resources/recipient.md) collection |             |
| customizedMessageBody | String                                            |             |
| messageLanguage       | String                                            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.invitedUserMessageInfo",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.invitedUserMessageInfo",
  "ccRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "customizedMessageBody": "String",
  "messageLanguage": "String"
}
```