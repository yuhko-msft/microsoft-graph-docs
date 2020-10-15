---
title: "identityGovernance resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# identityGovernance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                              | Return Type                                                 | Description                                                                |
| :------------------------------------------------------------------ | :---------------------------------------------------------- | :------------------------------------------------------------------------- |
| [List identityGovernance](../api/identitygovernance-list.md)        | [identityGovernance](identityGovernance.md) collection      | List properties and relationships of an identityGovernance object.         |
| [Create identityGovernance](../api/identitygovernance-create.md)    | [identityGovernance](identityGovernance.md)                 | Create a new identityGovernance object.                                    |
| [Get identityGovernance](../api/identitygovernance-get.md)          | [identityGovernance](identityGovernance.md)                 | Read properties and relationships of an identityGovernance object.         |
| [Update identityGovernance](../api/identitygovernance-update.md)    | [identityGovernance](identityGovernance.md)                 | Update the properties of an identityGovernance object.                     |
| [Delete identityGovernance](../api/identitygovernance-delete.md)    |                                                             | Delete an identityGovernance object.                                       |
| [List termsOfUse](../api/identitygovernance-list-termsofuse.md)     | [termsOfUseContainer](../resources/-termsofusecontainer.md) | Get the termsOfUseContainer objects from a termsOfUse navigation property. |
| [Create termsOfUse](../api/identitygovernance-post-termsofuse.md)   | [termsOfUseContainer](../resources/-termsofusecontainer.md) | Create a new termsOfUseContainer object.                                   |
| [Get termsOfUse](../api/identitygovernance-get-termsofuse.md)       | [termsOfUseContainer](../resources/-termsofusecontainer.md) | Read the properties and relationships of a termsOfUseContainer object.     |
| [Update termsOfUse](../api/identitygovernance-update-termsofuse.md) | [termsOfUseContainer](../resources/-termsofusecontainer.md) | Update the properties of a termsOfUseContainer object.                     |
| [Delete termsOfUse](../api/identitygovernance-delete-termsofuse.md) |                                                             | Delete a termsOfUseContainer object.                                       |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship | Type                                                       | Description |
| :----------- | :--------------------------------------------------------- | :---------- |
| termsOfUse   | [termsOfUseContainer](../resources/termsofusecontainer.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.identityGovernance",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.identityGovernance",
}
```
