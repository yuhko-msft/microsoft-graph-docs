---
title: "organization resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# organization resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                                      | Return Type                                                                             | Description                                                                                                     |
| :---------------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------------------------------- |
| [List organization](../api/organization-list.md)                                                            | [organization](organization.md) collection                                              | List properties and relationships of an organization object.                                                    |
| [Create organization](../api/organization-create.md)                                                        | [organization](organization.md)                                                         | Create a new organization object.                                                                               |
| [Get organization](../api/organization-get.md)                                                              | [organization](organization.md)                                                         | Read properties and relationships of an organization object.                                                    |
| [Update organization](../api/organization-update.md)                                                        | [organization](organization.md)                                                         | Update the properties of an organization object.                                                                |
| [Delete organization](../api/organization-delete.md)                                                        |                                                                                         | Delete an organization object.                                                                                  |
| [checkMemberGroups](../api/organization-checkMemberGroups.md)                                               |                                                                                         |                                                                                                                 |
| [checkMemberObjects](../api/organization-checkMemberObjects.md)                                             |                                                                                         |                                                                                                                 |
| [getAvailableExtensionProperties](../api/organization-getAvailableExtensionProperties.md)                   |                                                                                         |                                                                                                                 |
| [getByIds](../api/organization-getByIds.md)                                                                 |                                                                                         |                                                                                                                 |
| [getMemberGroups](../api/organization-getMemberGroups.md)                                                   |                                                                                         |                                                                                                                 |
| [getMemberObjects](../api/organization-getMemberObjects.md)                                                 |                                                                                         |                                                                                                                 |
| [restore](../api/organization-restore.md)                                                                   | [directoryObject](../resources/-directoryobject.md)                                     |                                                                                                                 |
| [validateProperties](../api/organization-validateProperties.md)                                             |                                                                                         |                                                                                                                 |
| [List certificateBasedAuthConfiguration](../api/organization-list-certificatebasedauthconfiguration.md)     | [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) | Get the certificateBasedAuthConfiguration objects from a certificateBasedAuthConfiguration navigation property. |
| [Add certificateBasedAuthConfiguration](../api/organization-post-certificatebasedauthconfiguration.md)      | [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) | Add certificateBasedAuthConfiguration by posting to the certificateBasedAuthConfiguration collection.           |
| [Get certificateBasedAuthConfiguration](../api/organization-get-certificatebasedauthconfiguration.md)       | [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) | Read the properties and relationships of a certificateBasedAuthConfiguration object.                            |
| [Update certificateBasedAuthConfiguration](../api/organization-update-certificatebasedauthconfiguration.md) | [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) | Update the properties of a certificateBasedAuthConfiguration object.                                            |
| [Remove certificateBasedAuthConfiguration](../api/organization-delete-certificatebasedauthconfiguration.md) |                                                                                         | Remove a certificateBasedAuthConfiguration object.                                                              |

## Properties

| Property                             | Type                                                          | Description |
| :----------------------------------- | :------------------------------------------------------------ | :---------- |
| assignedPlans                        | [assignedPlan](../resources/assignedplan.md) collection       |             |
| businessPhones                       | String collection                                             |             |
| city                                 | String                                                        |             |
| country                              | String                                                        |             |
| countryLetterCode                    | String                                                        |             |
| createdDateTime                      | DateTimeOffset                                                |             |
| deletedDateTime                      | DateTimeOffset                                                |             |
| displayName                          | String                                                        |             |
| id                                   | String                                                        | Read-only.  |
| marketingNotificationEmails          | String collection                                             |             |
| onPremisesLastSyncDateTime           | DateTimeOffset                                                |             |
| onPremisesSyncEnabled                | Boolean                                                       |             |
| postalCode                           | String                                                        |             |
| preferredLanguage                    | String                                                        |             |
| privacyProfile                       | [privacyProfile](../resources/privacyprofile.md)              |             |
| provisionedPlans                     | [provisionedPlan](../resources/provisionedplan.md) collection |             |
| securityComplianceNotificationMails  | String collection                                             |             |
| securityComplianceNotificationPhones | String collection                                             |             |
| state                                | String                                                        |             |
| street                               | String                                                        |             |
| technicalNotificationMails           | String collection                                             |             |
| tenantType                           | String                                                        |             |
| verifiedDomains                      | [verifiedDomain](../resources/verifieddomain.md) collection   |             |

## Relationships

| Relationship                      | Type                                                                                              | Description |
| :-------------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| certificateBasedAuthConfiguration | [certificateBasedAuthConfiguration](../resources/certificatebasedauthconfiguration.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.organization",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.organization",
  "assignedPlans": [{"@odata.type": "microsoft.graph.assignedPlan"}],
  "businessPhones": ["String"],
  "city": "String",
  "country": "String",
  "countryLetterCode": "String",
  "createdDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String (identifier)",
  "marketingNotificationEmails": ["String"],
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesSyncEnabled": "Boolean",
  "postalCode": "String",
  "preferredLanguage": "String",
  "privacyProfile": {"@odata.type": "microsoft.graph.privacyProfile"},
  "provisionedPlans": [{"@odata.type": "microsoft.graph.provisionedPlan"}],
  "securityComplianceNotificationMails": ["String"],
  "securityComplianceNotificationPhones": ["String"],
  "state": "String",
  "street": "String",
  "technicalNotificationMails": ["String"],
  "tenantType": "String",
  "verifiedDomains": [{"@odata.type": "microsoft.graph.verifiedDomain"}]
}
```
