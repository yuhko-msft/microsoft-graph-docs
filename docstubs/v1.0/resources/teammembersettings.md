---
title: "teamMemberSettings resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# teamMemberSettings resource type

Namespace: microsoft.graph

## Properties

| Property                          | Type    | Description |
| :-------------------------------- | :------ | :---------- |
| allowAddRemoveApps                | Boolean |             |
| allowCreatePrivateChannels        | Boolean |             |
| allowCreateUpdateChannels         | Boolean |             |
| allowCreateUpdateRemoveConnectors | Boolean |             |
| allowCreateUpdateRemoveTabs       | Boolean |             |
| allowDeleteChannels               | Boolean |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamMemberSettings",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamMemberSettings",
  "allowAddRemoveApps": "Boolean",
  "allowCreatePrivateChannels": "Boolean",
  "allowCreateUpdateChannels": "Boolean",
  "allowCreateUpdateRemoveConnectors": "Boolean",
  "allowCreateUpdateRemoveTabs": "Boolean",
  "allowDeleteChannels": "Boolean"
}
```
