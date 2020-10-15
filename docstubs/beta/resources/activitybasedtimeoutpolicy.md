---
title: "activityBasedTimeoutPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# activityBasedTimeoutPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [stsPolicy](stspolicy.md)

## Methods

| Method                                                                           | Return Type                                                            | Description                                                                |
| :------------------------------------------------------------------------------- | :--------------------------------------------------------------------- | :------------------------------------------------------------------------- |
| [List activityBasedTimeoutPolicy](../api/activitybasedtimeoutpolicy-list.md)     | [activityBasedTimeoutPolicy](activityBasedTimeoutPolicy.md) collection | List properties and relationships of an activityBasedTimeoutPolicy object. |
| [Create activityBasedTimeoutPolicy](../api/activitybasedtimeoutpolicy-create.md) | [activityBasedTimeoutPolicy](activityBasedTimeoutPolicy.md)            | Create a new activityBasedTimeoutPolicy object.                            |
| [Get activityBasedTimeoutPolicy](../api/activitybasedtimeoutpolicy-get.md)       | [activityBasedTimeoutPolicy](activityBasedTimeoutPolicy.md)            | Read properties and relationships of an activityBasedTimeoutPolicy object. |
| [Update activityBasedTimeoutPolicy](../api/activitybasedtimeoutpolicy-update.md) | [activityBasedTimeoutPolicy](activityBasedTimeoutPolicy.md)            | Update the properties of an activityBasedTimeoutPolicy object.             |
| [Delete activityBasedTimeoutPolicy](../api/activitybasedtimeoutpolicy-delete.md) |                                                                        | Delete an activityBasedTimeoutPolicy object.                               |
| [checkMemberGroups](../api/activitybasedtimeoutpolicy-checkMemberGroups.md)      |                                                                        |                                                                            |
| [checkMemberObjects](../api/activitybasedtimeoutpolicy-checkMemberObjects.md)    |                                                                        |                                                                            |
| [getByIds](../api/activitybasedtimeoutpolicy-getByIds.md)                        |                                                                        |                                                                            |
| [getMemberGroups](../api/activitybasedtimeoutpolicy-getMemberGroups.md)          |                                                                        |                                                                            |
| [getMemberObjects](../api/activitybasedtimeoutpolicy-getMemberObjects.md)        |                                                                        |                                                                            |
| [getUserOwnedObjects](../api/activitybasedtimeoutpolicy-getUserOwnedObjects.md)  | [directoryObject](../resources/-directoryobject.md)                    |                                                                            |
| [restore](../api/activitybasedtimeoutpolicy-restore.md)                          | [directoryObject](../resources/-directoryobject.md)                    |                                                                            |
| [validateProperties](../api/activitybasedtimeoutpolicy-validateProperties.md)    |                                                                        |                                                                            |

## Properties

| Property              | Type              | Description |
| :-------------------- | :---------------- | :---------- |
| definition            | String collection |             |
| deletedDateTime       | DateTimeOffset    |             |
| description           | String            |             |
| displayName           | String            |             |
| id                    | String            | Read-only.  |
| isOrganizationDefault | Boolean           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.activityBasedTimeoutPolicy",
  "baseType": "microsoft.graph.stsPolicy",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.activityBasedTimeoutPolicy",
  "definition": ["String"],
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "isOrganizationDefault": "Boolean"
}
```
