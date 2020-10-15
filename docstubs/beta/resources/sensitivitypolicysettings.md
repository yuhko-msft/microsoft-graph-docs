---
title: "sensitivityPolicySettings resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# sensitivityPolicySettings resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                         | Return Type                                                          | Description                                                              |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :----------------------------------------------------------------------- |
| [List sensitivityPolicySettings](../api/sensitivitypolicysettings-list.md)     | [sensitivityPolicySettings](sensitivityPolicySettings.md) collection | List properties and relationships of a sensitivityPolicySettings object. |
| [Create sensitivityPolicySettings](../api/sensitivitypolicysettings-create.md) | [sensitivityPolicySettings](sensitivityPolicySettings.md)            | Create a new sensitivityPolicySettings object.                           |
| [Get sensitivityPolicySettings](../api/sensitivitypolicysettings-get.md)       | [sensitivityPolicySettings](sensitivityPolicySettings.md)            | Read properties and relationships of a sensitivityPolicySettings object. |
| [Update sensitivityPolicySettings](../api/sensitivitypolicysettings-update.md) | [sensitivityPolicySettings](sensitivityPolicySettings.md)            | Update the properties of a sensitivityPolicySettings object.             |
| [Delete sensitivityPolicySettings](../api/sensitivitypolicysettings-delete.md) |                                                                      | Delete a sensitivityPolicySettings object.                               |

## Properties

| Property                                  | Type    | Description |
| :---------------------------------------- | :------ | :---------- |
| applicableTo                              | String  |             |
| downgradeSensitivityRequiresJustification | Boolean |             |
| helpWebUrl                                | String  |             |
| id                                        | String  | Read-only.  |
| isMandatory                               | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sensitivityPolicySettings",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.sensitivityPolicySettings",
  "applicableTo": "email | site | unifiedGroup | unknownFutureValue",
  "downgradeSensitivityRequiresJustification": "Boolean",
  "helpWebUrl": "String",
  "id": "String (identifier)",
  "isMandatory": "Boolean"
}
```
