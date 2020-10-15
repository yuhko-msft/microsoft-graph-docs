---
title: "mention resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# mention resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                     | Return Type                      | Description                                            |
| :----------------------------------------- | :------------------------------- | :----------------------------------------------------- |
| [List mention](../api/mention-list.md)     | [mention](mention.md) collection | List properties and relationships of a mention object. |
| [Create mention](../api/mention-create.md) | [mention](mention.md)            | Create a new mention object.                           |
| [Get mention](../api/mention-get.md)       | [mention](mention.md)            | Read properties and relationships of a mention object. |
| [Update mention](../api/mention-update.md) | [mention](mention.md)            | Update the properties of a mention object.             |
| [Delete mention](../api/mention-delete.md) |                                  | Delete a mention object.                               |

## Properties

| Property              | Type                                         | Description |
| :-------------------- | :------------------------------------------- | :---------- |
| application           | String                                       |             |
| clientReference       | String                                       |             |
| createdBy             | [emailAddress](../resources/emailaddress.md) |             |
| createdDateTime       | DateTimeOffset                               |             |
| deepLink              | String                                       |             |
| id                    | String                                       | Read-only.  |
| mentionText           | String                                       |             |
| mentioned             | [emailAddress](../resources/emailaddress.md) |             |
| serverCreatedDateTime | DateTimeOffset                               |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mention",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.mention",
  "application": "String",
  "clientReference": "String",
  "createdBy": {"@odata.type": "microsoft.graph.emailAddress"},
  "createdDateTime": "DateTimeOffset",
  "deepLink": "String",
  "id": "String (identifier)",
  "mentionText": "String",
  "mentioned": {"@odata.type": "microsoft.graph.emailAddress"},
  "serverCreatedDateTime": "DateTimeOffset"
}
```
