---
title: "matchingLabel resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# matchingLabel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                    | Type                                                          | Description |
| :-------------------------- | :------------------------------------------------------------ | :---------- |
| applicationMode             | String                                                        |             |
| description                 | String                                                        |             |
| displayName                 | String                                                        |             |
| id                          | String                                                        |             |
| isEndpointProtectionEnabled | Boolean                                                       |             |
| labelActions                | [labelActionBase](../resources/labelactionbase.md) collection |             |
| name                        | String                                                        |             |
| policyTip                   | String                                                        |             |
| priority                    | Int32                                                         |             |
| toolTip                     | String                                                        |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.matchingLabel",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.matchingLabel",
  "applicationMode": "manual | automatic | recommended",
  "description": "String",
  "displayName": "String",
  "id": "String",
  "isEndpointProtectionEnabled": "Boolean",
  "labelActions": [{"@odata.type": "microsoft.graph.labelActionBase"}],
  "name": "String",
  "policyTip": "String",
  "priority": "Int32",
  "toolTip": "String"
}
```
