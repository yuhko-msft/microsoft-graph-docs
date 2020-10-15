---
title: "groupSetting resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# groupSetting resource type

Namespace: microsoft.graph

## Methods

| Method                                               | Return Type                                | Description                                                 |
| :--------------------------------------------------- | :----------------------------------------- | :---------------------------------------------------------- |
| [List groupSetting](../api/groupsetting-list.md)     | [groupSetting](groupSetting.md) collection | List properties and relationships of a groupSetting object. |
| [Create groupSetting](../api/groupsetting-create.md) | [groupSetting](groupSetting.md)            | Create a new groupSetting object.                           |
| [Get groupSetting](../api/groupsetting-get.md)       | [groupSetting](groupSetting.md)            | Read properties and relationships of a groupSetting object. |
| [Update groupSetting](../api/groupsetting-update.md) | [groupSetting](groupSetting.md)            | Update the properties of a groupSetting object.             |
| [Delete groupSetting](../api/groupsetting-delete.md) |                                            | Delete a groupSetting object.                               |

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
  "@odata.type": "microsoft.graph.groupSetting",
  "baseType": "microsoft.graph.entity",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.groupSetting",
  "displayName": "String",
  "id": "String (identifier)",
  "templateId": "String",
  "values": [{"@odata.type": "microsoft.graph.settingValue"}]
}
```
