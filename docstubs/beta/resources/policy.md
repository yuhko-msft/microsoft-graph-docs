---
title: "policy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# policy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                      | Return Type                                         | Description                                                            |
| :---------------------------------------------------------- | :-------------------------------------------------- | :--------------------------------------------------------------------- |
| [List policy](../api/policy-list.md)                        | [policy](policy.md) collection                      | List properties and relationships of a policy object.                  |
| [Create policy](../api/policy-create.md)                    | [policy](policy.md)                                 | Create a new policy object.                                            |
| [Get policy](../api/policy-get.md)                          | [policy](policy.md)                                 | Read properties and relationships of a policy object.                  |
| [Update policy](../api/policy-update.md)                    | [policy](policy.md)                                 | Update the properties of a policy object.                              |
| [Delete policy](../api/policy-delete.md)                    |                                                     | Delete a policy object.                                                |
| [checkMemberGroups](../api/policy-checkMemberGroups.md)     |                                                     |                                                                        |
| [checkMemberObjects](../api/policy-checkMemberObjects.md)   |                                                     |                                                                        |
| [getByIds](../api/policy-getByIds.md)                       |                                                     |                                                                        |
| [getMemberGroups](../api/policy-getMemberGroups.md)         |                                                     |                                                                        |
| [getMemberObjects](../api/policy-getMemberObjects.md)       |                                                     |                                                                        |
| [getUserOwnedObjects](../api/policy-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md) |                                                                        |
| [restore](../api/policy-restore.md)                         | [directoryObject](../resources/-directoryobject.md) |                                                                        |
| [validateProperties](../api/policy-validateProperties.md)   |                                                     |                                                                        |
| [List appliesTo](../api/policy-list-appliesto.md)           | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from an appliesTo navigation property. |
| [Add appliesTo](../api/policy-post-appliesto.md)            | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.      |
| [Get appliesTo](../api/policy-get-appliesto.md)             | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.     |
| [Update appliesTo](../api/policy-update-appliesto.md)       | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                     |
| [Remove appliesTo](../api/policy-delete-appliesto.md)       |                                                     | Remove a directoryObject object.                                       |

## Properties

| Property              | Type                                                      | Description |
| :-------------------- | :-------------------------------------------------------- | :---------- |
| alternativeIdentifier | String                                                    |             |
| definition            | String collection                                         |             |
| deletedDateTime       | DateTimeOffset                                            |             |
| displayName           | String                                                    |             |
| id                    | String                                                    | Read-only.  |
| isOrganizationDefault | Boolean                                                   |             |
| keyCredentials        | [keyCredential](../resources/keycredential.md) collection |             |
| type                  | String                                                    |             |

## Relationships

| Relationship | Type                                                          | Description |
| :----------- | :------------------------------------------------------------ | :---------- |
| appliesTo    | [directoryObject](../resources/directoryobject.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policy",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.policy",
  "alternativeIdentifier": "String",
  "definition": ["String"],
  "deletedDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String (identifier)",
  "isOrganizationDefault": "Boolean",
  "keyCredentials": [{"@odata.type": "microsoft.graph.keyCredential"}],
  "type": "String"
}
```
