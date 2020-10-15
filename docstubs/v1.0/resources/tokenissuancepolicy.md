---
title: "tokenIssuancePolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# tokenIssuancePolicy resource type

Namespace: microsoft.graph

Inherits from [stsPolicy](stspolicy.md)

## Methods

| Method                                                                                           | Return Type                                              | Description                                                        |
| :----------------------------------------------------------------------------------------------- | :------------------------------------------------------- | :----------------------------------------------------------------- |
| [List tokenIssuancePolicy](../api/tokenissuancepolicy-list.md)                                   | [tokenIssuancePolicy](tokenIssuancePolicy.md) collection | List properties and relationships of a tokenIssuancePolicy object. |
| [Create tokenIssuancePolicy](../api/tokenissuancepolicy-create.md)                               | [tokenIssuancePolicy](tokenIssuancePolicy.md)            | Create a new tokenIssuancePolicy object.                           |
| [Get tokenIssuancePolicy](../api/tokenissuancepolicy-get.md)                                     | [tokenIssuancePolicy](tokenIssuancePolicy.md)            | Read properties and relationships of a tokenIssuancePolicy object. |
| [Update tokenIssuancePolicy](../api/tokenissuancepolicy-update.md)                               | [tokenIssuancePolicy](tokenIssuancePolicy.md)            | Update the properties of a tokenIssuancePolicy object.             |
| [Delete tokenIssuancePolicy](../api/tokenissuancepolicy-delete.md)                               |                                                          | Delete a tokenIssuancePolicy object.                               |
| [checkMemberGroups](../api/tokenissuancepolicy-checkMemberGroups.md)                             |                                                          |                                                                    |
| [checkMemberObjects](../api/tokenissuancepolicy-checkMemberObjects.md)                           |                                                          |                                                                    |
| [getAvailableExtensionProperties](../api/tokenissuancepolicy-getAvailableExtensionProperties.md) |                                                          |                                                                    |
| [getByIds](../api/tokenissuancepolicy-getByIds.md)                                               |                                                          |                                                                    |
| [getMemberGroups](../api/tokenissuancepolicy-getMemberGroups.md)                                 |                                                          |                                                                    |
| [getMemberObjects](../api/tokenissuancepolicy-getMemberObjects.md)                               |                                                          |                                                                    |
| [restore](../api/tokenissuancepolicy-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)      |                                                                    |
| [validateProperties](../api/tokenissuancepolicy-validateProperties.md)                           |                                                          |                                                                    |

## Properties

| Property              | Type              | Description |
| :-------------------- | :---------------- | :---------- |
| definition            | String collection |             |
| deletedDateTime       | DateTimeOffset    |             |
| description           | String            |             |
| displayName           | String            |             |
| id                    | String            | Read-only.  |
| isOrganizationDefault | Boolean           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.tokenIssuancePolicy",
  "baseType": "microsoft.graph.stsPolicy",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.tokenIssuancePolicy",
  "definition": ["String"],
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "isOrganizationDefault": "Boolean"
}
```
