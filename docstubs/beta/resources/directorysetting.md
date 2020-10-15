---
title: "directorySetting resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# directorySetting resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                       | Return Type                                        | Description                                                     |
| :----------------------------------------------------------- | :------------------------------------------------- | :-------------------------------------------------------------- |
| [List directorySetting](../api/directorysetting-list.md)     | [directorySetting](directorySetting.md) collection | List properties and relationships of a directorySetting object. |
| [Create directorySetting](../api/directorysetting-create.md) | [directorySetting](directorySetting.md)            | Create a new directorySetting object.                           |
| [Get directorySetting](../api/directorysetting-get.md)       | [directorySetting](directorySetting.md)            | Read properties and relationships of a directorySetting object. |
| [Update directorySetting](../api/directorysetting-update.md) | [directorySetting](directorySetting.md)            | Update the properties of a directorySetting object.             |
| [Delete directorySetting](../api/directorysetting-delete.md) |                                                    | Delete a directorySetting object.                               |

## Properties

| Property    | Type                                                    | Description |
| :---------- | :------------------------------------------------------ | :---------- |
| displayName | String                                                  |             |
| id          | String                                                  | Read-only.  |
| templateId  | String                                                  |             |
| values      | [settingValue](../resources/settingvalue.md) collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directorySetting",
  "baseType": "microsoft.graph.entity",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directorySetting",
  "displayName": "String",
  "id": "String (identifier)",
  "templateId": "String",
  "values": [{"@odata.type": "microsoft.graph.settingValue"}]
}
```
