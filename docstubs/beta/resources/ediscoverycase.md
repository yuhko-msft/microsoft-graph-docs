---
title: "ediscoveryCase resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# ediscoveryCase resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                          | Return Type                                    | Description                                                      |
| :-------------------------------------------------------------- | :--------------------------------------------- | :--------------------------------------------------------------- |
| [List ediscoveryCase](../api/ediscoverycase-list.md)            | [ediscoveryCase](ediscoveryCase.md) collection | List properties and relationships of an ediscoveryCase object.   |
| [Create ediscoveryCase](../api/ediscoverycase-create.md)        | [ediscoveryCase](ediscoveryCase.md)            | Create a new ediscoveryCase object.                              |
| [Get ediscoveryCase](../api/ediscoverycase-get.md)              | [ediscoveryCase](ediscoveryCase.md)            | Read properties and relationships of an ediscoveryCase object.   |
| [Update ediscoveryCase](../api/ediscoverycase-update.md)        | [ediscoveryCase](ediscoveryCase.md)            | Update the properties of an ediscoveryCase object.               |
| [Delete ediscoveryCase](../api/ediscoverycase-delete.md)        |                                                | Delete an ediscoveryCase object.                                 |
| [close](../api/ediscoverycase-close.md)                         |                                                |                                                                  |
| [reopen](../api/ediscoverycase-reopen.md)                       |                                                |                                                                  |
| [List reviewSets](../api/ediscoverycase-list-reviewsets.md)     | [reviewSet](../resources/-reviewset.md)        | Get the reviewSet objects from a reviewSets navigation property. |
| [Create reviewSets](../api/ediscoverycase-post-reviewsets.md)   | [reviewSet](../resources/-reviewset.md)        | Create a new reviewSet object.                                   |
| [Get reviewSets](../api/ediscoverycase-get-reviewsets.md)       | [reviewSet](../resources/-reviewset.md)        | Read the properties and relationships of a reviewSet object.     |
| [Update reviewSets](../api/ediscoverycase-update-reviewsets.md) | [reviewSet](../resources/-reviewset.md)        | Update the properties of a reviewSet object.                     |
| [Delete reviewSets](../api/ediscoverycase-delete-reviewsets.md) |                                                | Delete a reviewSet object.                                       |

## Properties

| Property             | Type                                       | Description |
| :------------------- | :----------------------------------------- | :---------- |
| closedBy             | [identitySet](../resources/identityset.md) |             |
| closedDateTime       | DateTimeOffset                             |             |
| createdDateTime      | DateTimeOffset                             |             |
| description          | String                                     |             |
| displayName          | String                                     |             |
| externalId           | String                                     |             |
| id                   | String                                     | Read-only.  |
| lastModifiedBy       | [identitySet](../resources/identityset.md) |             |
| lastModifiedDateTime | DateTimeOffset                             |             |
| status               | String                                     |             |

## Relationships

| Relationship | Type                                              | Description |
| :----------- | :------------------------------------------------ | :---------- |
| reviewSets   | [reviewSet](../resources/reviewset.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscoveryCase",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.ediscoveryCase",
  "closedBy": {"@odata.type": "microsoft.graph.identitySet"},
  "closedDateTime": "DateTimeOffset",
  "createdDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "externalId": "String",
  "id": "String (identifier)",
  "lastModifiedBy": {"@odata.type": "microsoft.graph.identitySet"},
  "lastModifiedDateTime": "DateTimeOffset",
  "status": "unknown | active | pendingDelete | closing | closed | closedWithError"
}
```
