---
title: "groupSettingTemplate resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# groupSettingTemplate resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                            | Return Type                                                | Description                                                         |
| :------------------------------------------------------------------------------------------------ | :--------------------------------------------------------- | :------------------------------------------------------------------ |
| [List groupSettingTemplate](../api/groupsettingtemplate-list.md)                                  | [groupSettingTemplate](groupSettingTemplate.md) collection | List properties and relationships of a groupSettingTemplate object. |
| [Create groupSettingTemplate](../api/groupsettingtemplate-create.md)                              | [groupSettingTemplate](groupSettingTemplate.md)            | Create a new groupSettingTemplate object.                           |
| [Get groupSettingTemplate](../api/groupsettingtemplate-get.md)                                    | [groupSettingTemplate](groupSettingTemplate.md)            | Read properties and relationships of a groupSettingTemplate object. |
| [Update groupSettingTemplate](../api/groupsettingtemplate-update.md)                              | [groupSettingTemplate](groupSettingTemplate.md)            | Update the properties of a groupSettingTemplate object.             |
| [Delete groupSettingTemplate](../api/groupsettingtemplate-delete.md)                              |                                                            | Delete a groupSettingTemplate object.                               |
| [checkMemberGroups](../api/groupsettingtemplate-checkMemberGroups.md)                             |                                                            |                                                                     |
| [checkMemberObjects](../api/groupsettingtemplate-checkMemberObjects.md)                           |                                                            |                                                                     |
| [getAvailableExtensionProperties](../api/groupsettingtemplate-getAvailableExtensionProperties.md) |                                                            |                                                                     |
| [getByIds](../api/groupsettingtemplate-getByIds.md)                                               |                                                            |                                                                     |
| [getMemberGroups](../api/groupsettingtemplate-getMemberGroups.md)                                 |                                                            |                                                                     |
| [getMemberObjects](../api/groupsettingtemplate-getMemberObjects.md)                               |                                                            |                                                                     |
| [restore](../api/groupsettingtemplate-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)        |                                                                     |
| [validateProperties](../api/groupsettingtemplate-validateProperties.md)                           |                                                            |                                                                     |

## Properties

| Property        | Type                                                                    | Description |
| :-------------- | :---------------------------------------------------------------------- | :---------- |
| deletedDateTime | DateTimeOffset                                                          |             |
| description     | String                                                                  |             |
| displayName     | String                                                                  |             |
| id              | String                                                                  | Read-only.  |
| values          | [settingTemplateValue](../resources/settingtemplatevalue.md) collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupSettingTemplate",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.groupSettingTemplate",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "values": [{"@odata.type": "microsoft.graph.settingTemplateValue"}]
}
```
