---
title: "sensitiveType resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# sensitiveType resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                 | Return Type                                  | Description                                                  |
| :----------------------------------------------------- | :------------------------------------------- | :----------------------------------------------------------- |
| [List sensitiveType](../api/sensitivetype-list.md)     | [sensitiveType](sensitiveType.md) collection | List properties and relationships of a sensitiveType object. |
| [Create sensitiveType](../api/sensitivetype-create.md) | [sensitiveType](sensitiveType.md)            | Create a new sensitiveType object.                           |
| [Get sensitiveType](../api/sensitivetype-get.md)       | [sensitiveType](sensitiveType.md)            | Read properties and relationships of a sensitiveType object. |
| [Update sensitiveType](../api/sensitivetype-update.md) | [sensitiveType](sensitiveType.md)            | Update the properties of a sensitiveType object.             |
| [Delete sensitiveType](../api/sensitivetype-delete.md) |                                              | Delete a sensitiveType object.                               |

## Properties

| Property             | Type   | Description |
| :------------------- | :----- | :---------- |
| classificationMethod | String |             |
| description          | String |             |
| id                   | String | Read-only.  |
| name                 | String |             |
| publisherName        | String |             |
| rulePackageId        | String |             |
| rulePackageType      | String |             |
| scope                | String |             |
| sensitiveTypeSource  | String |             |
| state                | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sensitiveType",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.sensitiveType",
  "classificationMethod": "patternMatch | exactDataMatch | fingerprint | machineLearning",
  "description": "String",
  "id": "String (identifier)",
  "name": "String",
  "publisherName": "String",
  "rulePackageId": "String",
  "rulePackageType": "String",
  "scope": "fullDocument | partialDocument",
  "sensitiveTypeSource": "outOfBox | tenant",
  "state": "String"
}
```
