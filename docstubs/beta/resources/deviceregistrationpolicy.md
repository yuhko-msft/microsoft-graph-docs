---
title: "deviceRegistrationPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# deviceRegistrationPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                       | Return Type                                                        | Description                                                             |
| :--------------------------------------------------------------------------- | :----------------------------------------------------------------- | :---------------------------------------------------------------------- |
| [List deviceRegistrationPolicy](../api/deviceregistrationpolicy-list.md)     | [deviceRegistrationPolicy](deviceRegistrationPolicy.md) collection | List properties and relationships of a deviceRegistrationPolicy object. |
| [Create deviceRegistrationPolicy](../api/deviceregistrationpolicy-create.md) | [deviceRegistrationPolicy](deviceRegistrationPolicy.md)            | Create a new deviceRegistrationPolicy object.                           |
| [Get deviceRegistrationPolicy](../api/deviceregistrationpolicy-get.md)       | [deviceRegistrationPolicy](deviceRegistrationPolicy.md)            | Read properties and relationships of a deviceRegistrationPolicy object. |
| [Update deviceRegistrationPolicy](../api/deviceregistrationpolicy-update.md) | [deviceRegistrationPolicy](deviceRegistrationPolicy.md)            | Update the properties of a deviceRegistrationPolicy object.             |
| [Delete deviceRegistrationPolicy](../api/deviceregistrationpolicy-delete.md) |                                                                    | Delete a deviceRegistrationPolicy object.                               |

## Properties

| Property                     | Type                                                                   | Description |
| :--------------------------- | :--------------------------------------------------------------------- | :---------- |
| azureADJoin                  | [azureAdJoinPolicy](../resources/azureadjoinpolicy.md)                 |             |
| azureADRegistration          | [azureADRegistrationPolicy](../resources/azureadregistrationpolicy.md) |             |
| description                  | String                                                                 |             |
| displayName                  | String                                                                 |             |
| id                           | String                                                                 | Read-only.  |
| multiFactorAuthConfiguration | String                                                                 |             |
| userDeviceQuota              | Int32                                                                  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceRegistrationPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.deviceRegistrationPolicy",
  "azureADJoin": {"@odata.type": "microsoft.graph.azureAdJoinPolicy"},
  "azureADRegistration": {"@odata.type": "microsoft.graph.azureADRegistrationPolicy"},
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "multiFactorAuthConfiguration": "notRequired | required | unknownFutureValue",
  "userDeviceQuota": "Int32"
}
```
