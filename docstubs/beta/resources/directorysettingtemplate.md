---
title: "directorySettingTemplate resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# directorySettingTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                        | Return Type                                                        | Description                                                             |
| :---------------------------------------------------------------------------- | :----------------------------------------------------------------- | :---------------------------------------------------------------------- |
| [List directorySettingTemplate](../api/directorysettingtemplate-list.md)      | [directorySettingTemplate](directorySettingTemplate.md) collection | List properties and relationships of a directorySettingTemplate object. |
| [Create directorySettingTemplate](../api/directorysettingtemplate-create.md)  | [directorySettingTemplate](directorySettingTemplate.md)            | Create a new directorySettingTemplate object.                           |
| [Get directorySettingTemplate](../api/directorysettingtemplate-get.md)        | [directorySettingTemplate](directorySettingTemplate.md)            | Read properties and relationships of a directorySettingTemplate object. |
| [Update directorySettingTemplate](../api/directorysettingtemplate-update.md)  | [directorySettingTemplate](directorySettingTemplate.md)            | Update the properties of a directorySettingTemplate object.             |
| [Delete directorySettingTemplate](../api/directorysettingtemplate-delete.md)  |                                                                    | Delete a directorySettingTemplate object.                               |
| [checkMemberGroups](../api/directorysettingtemplate-checkMemberGroups.md)     |                                                                    |                                                                         |
| [checkMemberObjects](../api/directorysettingtemplate-checkMemberObjects.md)   |                                                                    |                                                                         |
| [getByIds](../api/directorysettingtemplate-getByIds.md)                       |                                                                    |                                                                         |
| [getMemberGroups](../api/directorysettingtemplate-getMemberGroups.md)         |                                                                    |                                                                         |
| [getMemberObjects](../api/directorysettingtemplate-getMemberObjects.md)       |                                                                    |                                                                         |
| [getUserOwnedObjects](../api/directorysettingtemplate-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md)                |                                                                         |
| [restore](../api/directorysettingtemplate-restore.md)                         | [directoryObject](../resources/-directoryobject.md)                |                                                                         |
| [validateProperties](../api/directorysettingtemplate-validateProperties.md)   |                                                                    |                                                                         |

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
  "@odata.type": "microsoft.graph.directorySettingTemplate",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directorySettingTemplate",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "values": [{"@odata.type": "microsoft.graph.settingTemplateValue"}]
}
```
