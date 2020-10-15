---
title: "authenticationMethodsPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# authenticationMethodsPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                                                       | Return Type                                                                             | Description                                                                                                       |
| :--------------------------------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------------- |
| [List authenticationMethodsPolicy](../api/authenticationmethodspolicy-list.md)                                               | [authenticationMethodsPolicy](authenticationMethodsPolicy.md) collection                | List properties and relationships of an authenticationMethodsPolicy object.                                       |
| [Create authenticationMethodsPolicy](../api/authenticationmethodspolicy-create.md)                                           | [authenticationMethodsPolicy](authenticationMethodsPolicy.md)                           | Create a new authenticationMethodsPolicy object.                                                                  |
| [Get authenticationMethodsPolicy](../api/authenticationmethodspolicy-get.md)                                                 | [authenticationMethodsPolicy](authenticationMethodsPolicy.md)                           | Read properties and relationships of an authenticationMethodsPolicy object.                                       |
| [Update authenticationMethodsPolicy](../api/authenticationmethodspolicy-update.md)                                           | [authenticationMethodsPolicy](authenticationMethodsPolicy.md)                           | Update the properties of an authenticationMethodsPolicy object.                                                   |
| [Delete authenticationMethodsPolicy](../api/authenticationmethodspolicy-delete.md)                                           |                                                                                         | Delete an authenticationMethodsPolicy object.                                                                     |
| [List authenticationMethodConfigurations](../api/authenticationmethodspolicy-list-authenticationmethodconfigurations.md)     | [authenticationMethodConfiguration](../resources/-authenticationmethodconfiguration.md) | Get the authenticationMethodConfiguration objects from an authenticationMethodConfigurations navigation property. |
| [Create authenticationMethodConfigurations](../api/authenticationmethodspolicy-post-authenticationmethodconfigurations.md)   | [authenticationMethodConfiguration](../resources/-authenticationmethodconfiguration.md) | Create a new authenticationMethodConfiguration object.                                                            |
| [Get authenticationMethodConfigurations](../api/authenticationmethodspolicy-get-authenticationmethodconfigurations.md)       | [authenticationMethodConfiguration](../resources/-authenticationmethodconfiguration.md) | Read the properties and relationships of an authenticationMethodConfiguration object.                             |
| [Update authenticationMethodConfigurations](../api/authenticationmethodspolicy-update-authenticationmethodconfigurations.md) | [authenticationMethodConfiguration](../resources/-authenticationmethodconfiguration.md) | Update the properties of an authenticationMethodConfiguration object.                                             |
| [Delete authenticationMethodConfigurations](../api/authenticationmethodspolicy-delete-authenticationmethodconfigurations.md) |                                                                                         | Delete an authenticationMethodConfiguration object.                                                               |

## Properties

| Property                    | Type                                                                                | Description |
| :-------------------------- | :---------------------------------------------------------------------------------- | :---------- |
| convergedPolicyTargetGroup  | String                                                                              |             |
| description                 | String                                                                              |             |
| displayName                 | String                                                                              |             |
| id                          | String                                                                              | Read-only.  |
| lastModifiedDateTime        | DateTimeOffset                                                                      |             |
| policyVersion               | String                                                                              |             |
| reconfirmationInDays        | Int32                                                                               |             |
| registrationAndResetTargets | [registrationAndResetTarget](../resources/registrationandresettarget.md) collection |             |
| registrationEnforcement     | [registrationEnforcement](../resources/registrationenforcement.md)                  |             |

## Relationships

| Relationship                       | Type                                                                                              | Description |
| :--------------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| authenticationMethodConfigurations | [authenticationMethodConfiguration](../resources/authenticationmethodconfiguration.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationMethodsPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.authenticationMethodsPolicy",
  "convergedPolicyTargetGroup": "String",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "lastModifiedDateTime": "DateTimeOffset",
  "policyVersion": "String",
  "reconfirmationInDays": "Int32",
  "registrationAndResetTargets": [{"@odata.type": "microsoft.graph.registrationAndResetTarget"}],
  "registrationEnforcement": {"@odata.type": "microsoft.graph.registrationEnforcement"}
}
```
