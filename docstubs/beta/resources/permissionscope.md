---
title: "permissionScope resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# permissionScope resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                | Type    | Description |
| :---------------------- | :------ | :---------- |
| adminConsentDescription | String  |             |
| adminConsentDisplayName | String  |             |
| id                      | Guid    |             |
| isEnabled               | Boolean |             |
| origin                  | String  |             |
| type                    | String  |             |
| userConsentDescription  | String  |             |
| userConsentDisplayName  | String  |             |
| value                   | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.permissionScope",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.permissionScope",
  "adminConsentDescription": "String",
  "adminConsentDisplayName": "String",
  "id": "Guid",
  "isEnabled": "Boolean",
  "origin": "String",
  "type": "String",
  "userConsentDescription": "String",
  "userConsentDisplayName": "String",
  "value": "String"
}
```
