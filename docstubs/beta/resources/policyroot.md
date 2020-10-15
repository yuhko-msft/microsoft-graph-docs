---
title: "policyRoot resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# policyRoot resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                  | Return Type                                                           | Description                                                                                   |
| :-------------------------------------------------------------------------------------- | :-------------------------------------------------------------------- | :-------------------------------------------------------------------------------------------- |
| [List policyRoot](../api/policyroot-list.md)                                            | [policyRoot](policyRoot.md) collection                                | List properties and relationships of a policyRoot object.                                     |
| [Create policyRoot](../api/policyroot-create.md)                                        | [policyRoot](policyRoot.md)                                           | Create a new policyRoot object.                                                               |
| [Get policyRoot](../api/policyroot-get.md)                                              | [policyRoot](policyRoot.md)                                           | Read properties and relationships of a policyRoot object.                                     |
| [Update policyRoot](../api/policyroot-update.md)                                        | [policyRoot](policyRoot.md)                                           | Update the properties of a policyRoot object.                                                 |
| [Delete policyRoot](../api/policyroot-delete.md)                                        |                                                                       | Delete a policyRoot object.                                                                   |
| [List deviceRegistrationPolicy](../api/policyroot-list-deviceregistrationpolicy.md)     | [deviceRegistrationPolicy](../resources/-deviceregistrationpolicy.md) | Get the deviceRegistrationPolicy objects from a deviceRegistrationPolicy navigation property. |
| [Create deviceRegistrationPolicy](../api/policyroot-post-deviceregistrationpolicy.md)   | [deviceRegistrationPolicy](../resources/-deviceregistrationpolicy.md) | Create a new deviceRegistrationPolicy object.                                                 |
| [Get deviceRegistrationPolicy](../api/policyroot-get-deviceregistrationpolicy.md)       | [deviceRegistrationPolicy](../resources/-deviceregistrationpolicy.md) | Read the properties and relationships of a deviceRegistrationPolicy object.                   |
| [Update deviceRegistrationPolicy](../api/policyroot-update-deviceregistrationpolicy.md) | [deviceRegistrationPolicy](../resources/-deviceregistrationpolicy.md) | Update the properties of a deviceRegistrationPolicy object.                                   |
| [Delete deviceRegistrationPolicy](../api/policyroot-delete-deviceregistrationpolicy.md) |                                                                       | Delete a deviceRegistrationPolicy object.                                                     |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship             | Type                                                                 | Description |
| :----------------------- | :------------------------------------------------------------------- | :---------- |
| deviceRegistrationPolicy | [deviceRegistrationPolicy](../resources/deviceregistrationpolicy.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policyRoot",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.policyRoot",
}
```
