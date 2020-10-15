---
title: "agreementAcceptance resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# agreementAcceptance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                             | Return Type                                              | Description                                                         |
| :----------------------------------------------------------------- | :------------------------------------------------------- | :------------------------------------------------------------------ |
| [List agreementAcceptance](../api/agreementacceptance-list.md)     | [agreementAcceptance](agreementAcceptance.md) collection | List properties and relationships of an agreementAcceptance object. |
| [Create agreementAcceptance](../api/agreementacceptance-create.md) | [agreementAcceptance](agreementAcceptance.md)            | Create a new agreementAcceptance object.                            |
| [Get agreementAcceptance](../api/agreementacceptance-get.md)       | [agreementAcceptance](agreementAcceptance.md)            | Read properties and relationships of an agreementAcceptance object. |
| [Update agreementAcceptance](../api/agreementacceptance-update.md) | [agreementAcceptance](agreementAcceptance.md)            | Update the properties of an agreementAcceptance object.             |
| [Delete agreementAcceptance](../api/agreementacceptance-delete.md) |                                                          | Delete an agreementAcceptance object.                               |

## Properties

| Property           | Type           | Description |
| :----------------- | :------------- | :---------- |
| agreementFileId    | String         |             |
| agreementId        | String         |             |
| deviceDisplayName  | String         |             |
| deviceId           | String         |             |
| deviceOSType       | String         |             |
| deviceOSVersion    | String         |             |
| expirationDateTime | DateTimeOffset |             |
| id                 | String         | Read-only.  |
| recordedDateTime   | DateTimeOffset |             |
| state              | String         |             |
| userDisplayName    | String         |             |
| userEmail          | String         |             |
| userId             | String         |             |
| userPrincipalName  | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.agreementAcceptance",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.agreementAcceptance",
  "agreementFileId": "String",
  "agreementId": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "deviceOSType": "String",
  "deviceOSVersion": "String",
  "expirationDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "recordedDateTime": "DateTimeOffset",
  "state": "accepted | declined | unknownFutureValue",
  "userDisplayName": "String",
  "userEmail": "String",
  "userId": "String",
  "userPrincipalName": "String"
}
```
