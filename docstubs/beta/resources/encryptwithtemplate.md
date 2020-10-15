---
title: "encryptWithTemplate resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# encryptWithTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property               | Type    | Description |
| :--------------------- | :------ | :---------- |
| availableForEncryption | Boolean |             |
| encryptWith            | String  |             |
| name                   | String  |             |
| templateId             | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.encryptWithTemplate",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.encryptWithTemplate",
  "availableForEncryption": "Boolean",
  "encryptWith": "template | userDefinedRights",
  "name": "String",
  "templateId": "String"
}
```
