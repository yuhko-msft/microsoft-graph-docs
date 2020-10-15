---
title: "permissionGrantConditionSet resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# permissionGrantConditionSet resource type

Namespace: microsoft.graph

## Methods

| Method                                                                             | Return Type                                                              | Description                                                                |
| :--------------------------------------------------------------------------------- | :----------------------------------------------------------------------- | :------------------------------------------------------------------------- |
| [List permissionGrantConditionSet](../api/permissiongrantconditionset-list.md)     | [permissionGrantConditionSet](permissionGrantConditionSet.md) collection | List properties and relationships of a permissionGrantConditionSet object. |
| [Create permissionGrantConditionSet](../api/permissiongrantconditionset-create.md) | [permissionGrantConditionSet](permissionGrantConditionSet.md)            | Create a new permissionGrantConditionSet object.                           |
| [Get permissionGrantConditionSet](../api/permissiongrantconditionset-get.md)       | [permissionGrantConditionSet](permissionGrantConditionSet.md)            | Read properties and relationships of a permissionGrantConditionSet object. |
| [Update permissionGrantConditionSet](../api/permissiongrantconditionset-update.md) | [permissionGrantConditionSet](permissionGrantConditionSet.md)            | Update the properties of a permissionGrantConditionSet object.             |
| [Delete permissionGrantConditionSet](../api/permissiongrantconditionset-delete.md) |                                                                          | Delete a permissionGrantConditionSet object.                               |

## Properties

| Property                                    | Type              | Description |
| :------------------------------------------ | :---------------- | :---------- |
| clientApplicationIds                        | String collection |             |
| clientApplicationPublisherIds               | String collection |             |
| clientApplicationTenantIds                  | String collection |             |
| clientApplicationsFromVerifiedPublisherOnly | Boolean           |             |
| id                                          | String            | Read-only.  |
| permissionClassification                    | String            |             |
| permissionType                              | String            |             |
| permissions                                 | String collection |             |
| resourceApplication                         | String            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.permissionGrantConditionSet",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.permissionGrantConditionSet",
  "clientApplicationIds": ["String"],
  "clientApplicationPublisherIds": ["String"],
  "clientApplicationTenantIds": ["String"],
  "clientApplicationsFromVerifiedPublisherOnly": "Boolean",
  "id": "String (identifier)",
  "permissionClassification": "String",
  "permissionType": "delegatedUserConsentable | delegated | application",
  "permissions": ["String"],
  "resourceApplication": "String"
}
```
