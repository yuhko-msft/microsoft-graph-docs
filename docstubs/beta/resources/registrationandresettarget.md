---
title: "registrationAndResetTarget resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# registrationAndResetTarget resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                 | Type   | Description |
| :----------------------- | :----- | :---------- |
| id                       | String |             |
| minAuthMethodsToRegister | Int32  |             |
| minAuthMethodsToReset    | Int32  |             |
| targetType               | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.registrationAndResetTarget",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.registrationAndResetTarget",
  "id": "String",
  "minAuthMethodsToRegister": "Int32",
  "minAuthMethodsToReset": "Int32",
  "targetType": "user | group | unknownFutureValue"
}
```
