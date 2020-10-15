---
title: "recommendLabelAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# recommendLabelAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                    | Type                                                                                  | Description |
| :-------------------------- | :------------------------------------------------------------------------------------ | :---------- |
| actionSource                | String                                                                                |             |
| actions                     | [informationProtectionAction](../resources/informationprotectionaction.md) collection |             |
| label                       | [labelDetails](../resources/labeldetails.md)                                          |             |
| responsibleSensitiveTypeIds | Guid collection                                                                       |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.recommendLabelAction",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.recommendLabelAction",
  "actionSource": "manual | automatic | recommended | default",
  "actions": [{"@odata.type": "microsoft.graph.informationProtectionAction"}],
  "label": {"@odata.type": "microsoft.graph.labelDetails"},
  "responsibleSensitiveTypeIds": ["Guid"]
}
```
