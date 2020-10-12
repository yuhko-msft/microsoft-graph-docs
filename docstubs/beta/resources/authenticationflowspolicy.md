---
title: "authenticationFlowsPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# authenticationFlowsPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                         | Return Type                                                          | Description                                                               |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :------------------------------------------------------------------------ |
| [List authenticationFlowsPolicy](../api/authenticationflowspolicy-list.md)     | [authenticationFlowsPolicy](authenticationFlowsPolicy.md) collection | List properties and relationships of an authenticationFlowsPolicy object. |
| [Create authenticationFlowsPolicy](../api/authenticationflowspolicy-create.md) | [authenticationFlowsPolicy](authenticationFlowsPolicy.md)            | Create a new authenticationFlowsPolicy object.                            |
| [Get authenticationFlowsPolicy](../api/authenticationflowspolicy-get.md)       | [authenticationFlowsPolicy](authenticationFlowsPolicy.md)            | Read properties and relationships of an authenticationFlowsPolicy object. |
| [Update authenticationFlowsPolicy](../api/authenticationflowspolicy-update.md) | [authenticationFlowsPolicy](authenticationFlowsPolicy.md)            | Update the properties of an authenticationFlowsPolicy object.             |
| [Delete authenticationFlowsPolicy](../api/authenticationflowspolicy-delete.md) |                                                                      | Delete an authenticationFlowsPolicy object.                               |

## Properties

| Property          | Type                                                                                                                 | Description |
| :---------------- | :------------------------------------------------------------------------------------------------------------------- | :---------- |
| description       | String                                                                                                               |             |
| displayName       | String                                                                                                               |             |
| id                | String                                                                                                               | Read-only.  |
| selfServiceSignUp | [selfServiceSignUpAuthenticationFlowConfiguration](../resources/selfservicesignupauthenticationflowconfiguration.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationFlowsPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.authenticationFlowsPolicy",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "selfServiceSignUp": {"@odata.type": "microsoft.graph.selfServiceSignUpAuthenticationFlowConfiguration"}
}
```
