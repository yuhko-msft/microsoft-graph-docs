---
title: "dataLossPreventionPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# dataLossPreventionPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                       | Return Type                                                                       | Description                                                             |
| :--------------------------------------------------------------------------- | :-------------------------------------------------------------------------------- | :---------------------------------------------------------------------- |
| [List dataLossPreventionPolicy](../api/datalosspreventionpolicy-list.md)     | [dataLossPreventionPolicy](dataLossPreventionPolicy.md) collection                | List properties and relationships of a dataLossPreventionPolicy object. |
| [Create dataLossPreventionPolicy](../api/datalosspreventionpolicy-create.md) | [dataLossPreventionPolicy](dataLossPreventionPolicy.md)                           | Create a new dataLossPreventionPolicy object.                           |
| [Get dataLossPreventionPolicy](../api/datalosspreventionpolicy-get.md)       | [dataLossPreventionPolicy](dataLossPreventionPolicy.md)                           | Read properties and relationships of a dataLossPreventionPolicy object. |
| [Update dataLossPreventionPolicy](../api/datalosspreventionpolicy-update.md) | [dataLossPreventionPolicy](dataLossPreventionPolicy.md)                           | Update the properties of a dataLossPreventionPolicy object.             |
| [Delete dataLossPreventionPolicy](../api/datalosspreventionpolicy-delete.md) |                                                                                   | Delete a dataLossPreventionPolicy object.                               |
| [evaluate](../api/datalosspreventionpolicy-evaluate.md)                      | [dlpEvaluatePoliciesJobResponse](../resources/-dlpevaluatepoliciesjobresponse.md) |                                                                         |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |
| name     | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.dataLossPreventionPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.dataLossPreventionPolicy",
  "id": "String (identifier)",
  "name": "String"
}
```
