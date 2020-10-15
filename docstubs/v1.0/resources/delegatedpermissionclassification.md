---
title: "delegatedPermissionClassification resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# delegatedPermissionClassification resource type

Namespace: microsoft.graph

## Methods

| Method                                                                                         | Return Type                                                                          | Description                                                                      |
| :--------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- |
| [List delegatedPermissionClassification](../api/delegatedpermissionclassification-list.md)     | [delegatedPermissionClassification](delegatedPermissionClassification.md) collection | List properties and relationships of a delegatedPermissionClassification object. |
| [Create delegatedPermissionClassification](../api/delegatedpermissionclassification-create.md) | [delegatedPermissionClassification](delegatedPermissionClassification.md)            | Create a new delegatedPermissionClassification object.                           |
| [Get delegatedPermissionClassification](../api/delegatedpermissionclassification-get.md)       | [delegatedPermissionClassification](delegatedPermissionClassification.md)            | Read properties and relationships of a delegatedPermissionClassification object. |
| [Update delegatedPermissionClassification](../api/delegatedpermissionclassification-update.md) | [delegatedPermissionClassification](delegatedPermissionClassification.md)            | Update the properties of a delegatedPermissionClassification object.             |
| [Delete delegatedPermissionClassification](../api/delegatedpermissionclassification-delete.md) |                                                                                      | Delete a delegatedPermissionClassification object.                               |

## Properties

| Property       | Type   | Description |
| :------------- | :----- | :---------- |
| classification | String |             |
| id             | String | Read-only.  |
| permissionId   | String |             |
| permissionName | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.delegatedPermissionClassification",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.delegatedPermissionClassification",
  "classification": "low | medium | high | unknownFutureValue",
  "id": "String (identifier)",
  "permissionId": "String",
  "permissionName": "String"
}
```
