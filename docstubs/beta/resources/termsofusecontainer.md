---
title: "termsOfUseContainer resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# termsOfUseContainer resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                   | Return Type                                                 | Description                                                                           |
| :--------------------------------------------------------------------------------------- | :---------------------------------------------------------- | :------------------------------------------------------------------------------------ |
| [List termsOfUseContainer](../api/termsofusecontainer-list.md)                           | [termsOfUseContainer](termsOfUseContainer.md) collection    | List properties and relationships of a termsOfUseContainer object.                    |
| [Create termsOfUseContainer](../api/termsofusecontainer-create.md)                       | [termsOfUseContainer](termsOfUseContainer.md)               | Create a new termsOfUseContainer object.                                              |
| [Get termsOfUseContainer](../api/termsofusecontainer-get.md)                             | [termsOfUseContainer](termsOfUseContainer.md)               | Read properties and relationships of a termsOfUseContainer object.                    |
| [Update termsOfUseContainer](../api/termsofusecontainer-update.md)                       | [termsOfUseContainer](termsOfUseContainer.md)               | Update the properties of a termsOfUseContainer object.                                |
| [Delete termsOfUseContainer](../api/termsofusecontainer-delete.md)                       |                                                             | Delete a termsOfUseContainer object.                                                  |
| [List agreementAcceptances](../api/termsofusecontainer-list-agreementacceptances.md)     | [agreementAcceptance](../resources/-agreementacceptance.md) | Get the agreementAcceptance objects from an agreementAcceptances navigation property. |
| [Create agreementAcceptances](../api/termsofusecontainer-post-agreementacceptances.md)   | [agreementAcceptance](../resources/-agreementacceptance.md) | Create a new agreementAcceptance object.                                              |
| [Get agreementAcceptances](../api/termsofusecontainer-get-agreementacceptances.md)       | [agreementAcceptance](../resources/-agreementacceptance.md) | Read the properties and relationships of an agreementAcceptance object.               |
| [Update agreementAcceptances](../api/termsofusecontainer-update-agreementacceptances.md) | [agreementAcceptance](../resources/-agreementacceptance.md) | Update the properties of an agreementAcceptance object.                               |
| [Delete agreementAcceptances](../api/termsofusecontainer-delete-agreementacceptances.md) |                                                             | Delete an agreementAcceptance object.                                                 |
| [List agreements](../api/termsofusecontainer-list-agreements.md)                         | [agreement](../resources/-agreement.md)                     | Get the agreement objects from an agreements navigation property.                     |
| [Create agreements](../api/termsofusecontainer-post-agreements.md)                       | [agreement](../resources/-agreement.md)                     | Create a new agreement object.                                                        |
| [Get agreements](../api/termsofusecontainer-get-agreements.md)                           | [agreement](../resources/-agreement.md)                     | Read the properties and relationships of an agreement object.                         |
| [Update agreements](../api/termsofusecontainer-update-agreements.md)                     | [agreement](../resources/-agreement.md)                     | Update the properties of an agreement object.                                         |
| [Delete agreements](../api/termsofusecontainer-delete-agreements.md)                     |                                                             | Delete an agreement object.                                                           |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship         | Type                                                                  | Description |
| :------------------- | :-------------------------------------------------------------------- | :---------- |
| agreementAcceptances | [agreementAcceptance](../resources/agreementacceptance.md) collection |             |
| agreements           | [agreement](../resources/agreement.md) collection                     |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.termsOfUseContainer",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.termsOfUseContainer",
}
```
