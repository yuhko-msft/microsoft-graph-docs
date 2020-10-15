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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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
| [getByIds](../api/organization-getByIds.md)                                                                 |                                                                                         |                                                                                                                 |
| [getMemberGroups](../api/organization-getMemberGroups.md)                                                   |                                                                                         |                                                                                                                 |
| [getMemberObjects](../api/organization-getMemberObjects.md)                                                 |                                                                                         |                                                                                                                 |
| [getUserOwnedObjects](../api/organization-getUserOwnedObjects.md)                                           | [directoryObject](../resources/-directoryobject.md)                                     |                                                                                                                 |
| [restore](../api/organization-restore.md)                                                                   | [directoryObject](../resources/-directoryobject.md)                                     |                                                                                                                 |
| [validateProperties](../api/organization-validateProperties.md)                                             |                                                                                         |                                                                                                                 |
| [List branding](../api/organization-list-branding.md)                                                       | [organizationalBranding](../resources/-organizationalbranding.md)                       | Get the organizationalBranding objects from a branding navigation property.                                     |
| [Create branding](../api/organization-post-branding.md)                                                     | [organizationalBranding](../resources/-organizationalbranding.md)                       | Create a new organizationalBranding object.                                                                     |
| [Get branding](../api/organization-get-branding.md)                                                         | [organizationalBranding](../resources/-organizationalbranding.md)                       | Read the properties and relationships of an organizationalBranding object.                                      |
| [Update branding](../api/organization-update-branding.md)                                                   | [organizationalBranding](../resources/-organizationalbranding.md)                       | Update the properties of an organizationalBranding object.                                                      |
| [Delete branding](../api/organization-delete-branding.md)                                                   |                                                                                         | Delete an organizationalBranding object.                                                                        |
| [List certificateBasedAuthConfiguration](../api/organization-list-certificatebasedauthconfiguration.md)     | [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) | Get the certificateBasedAuthConfiguration objects from a certificateBasedAuthConfiguration navigation property. |
| [Add certificateBasedAuthConfiguration](../api/organization-post-certificatebasedauthconfiguration.md)      | [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) | Add certificateBasedAuthConfiguration by posting to the certificateBasedAuthConfiguration collection.           |
| [Get certificateBasedAuthConfiguration](../api/organization-get-certificatebasedauthconfiguration.md)       | [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) | Read the properties and relationships of a certificateBasedAuthConfiguration object.                            |
| [Update certificateBasedAuthConfiguration](../api/organization-update-certificatebasedauthconfiguration.md) | [certificateBasedAuthConfiguration](../resources/-certificatebasedauthconfiguration.md) | Update the properties of a certificateBasedAuthConfiguration object.                                            |
| [Remove certificateBasedAuthConfiguration](../api/organization-delete-certificatebasedauthconfiguration.md) |                                                                                         | Remove a certificateBasedAuthConfiguration object.                                                              |

## Properties

| Property                                  | Type                                                          | Description |
| :---------------------------------------- | :------------------------------------------------------------ | :---------- |
| assignedPlans                             | [assignedPlan](../resources/assignedplan.md) collection       |             |
| businessPhones                            | String collection                                             |             |
| city                                      | String                                                        |             |
| country                                   | String                                                        |             |
| countryLetterCode                         | String                                                        |             |
| createdDateTime                           | DateTimeOffset                                                |             |
| deletedDateTime                           | DateTimeOffset                                                |             |
| directorySizeQuota                        | [directorySizeQuota](../resources/directorysizequota.md)      |             |
| displayName                               | String                                                        |             |
| id                                        | String                                                        | Read-only.  |
| isMultipleDataLocationsForServicesEnabled | Boolean                                                       |             |
| marketingNotificationEmails               | String collection                                             |             |
| onPremisesLastSyncDateTime                | DateTimeOffset                                                |             |
| onPremisesSyncEnabled                     | Boolean                                                       |             |
| postalCode                                | String                                                        |             |
| preferredLanguage                         | String                                                        |             |
| privacyProfile                            | [privacyProfile](../resources/privacyprofile.md)              |             |
| provisionedPlans                          | [provisionedPlan](../resources/provisionedplan.md) collection |             |
| securityComplianceNotificationMails       | String collection                                             |             |
| securityComplianceNotificationPhones      | String collection                                             |             |
| state                                     | String                                                        |             |
| street                                    | String                                                        |             |
| technicalNotificationMails                | String collection                                             |             |
| verifiedDomains                           | [verifiedDomain](../resources/verifieddomain.md) collection   |             |

## Relationships

| Relationship                      | Type                                                                                              | Description |
| :-------------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| branding                          | [organizationalBranding](../resources/organizationalbranding.md)                                  |             |
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
  "directorySizeQuota": {"@odata.type": "microsoft.graph.directorySizeQuota"},
  "displayName": "String",
  "id": "String (identifier)",
  "isMultipleDataLocationsForServicesEnabled": "Boolean",
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
  "verifiedDomains": [{"@odata.type": "microsoft.graph.verifiedDomain"}]
}
```
