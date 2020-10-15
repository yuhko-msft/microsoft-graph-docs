---
title: "domain resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# domain resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                    | Return Type                                         | Description                                                                             |
| :---------------------------------------------------------------------------------------- | :-------------------------------------------------- | :-------------------------------------------------------------------------------------- |
| [List domain](../api/domain-list.md)                                                      | [domain](domain.md) collection                      | List properties and relationships of a domain object.                                   |
| [Create domain](../api/domain-create.md)                                                  | [domain](domain.md)                                 | Create a new domain object.                                                             |
| [Get domain](../api/domain-get.md)                                                        | [domain](domain.md)                                 | Read properties and relationships of a domain object.                                   |
| [Update domain](../api/domain-update.md)                                                  | [domain](domain.md)                                 | Update the properties of a domain object.                                               |
| [Delete domain](../api/domain-delete.md)                                                  |                                                     | Delete a domain object.                                                                 |
| [forceDelete](../api/domain-forceDelete.md)                                               |                                                     |                                                                                         |
| [verify](../api/domain-verify.md)                                                         | [domain](../resources/-domain.md)                   |                                                                                         |
| [List domainNameReferences](../api/domain-list-domainnamereferences.md)                   | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a domainNameReferences navigation property.        |
| [Add domainNameReferences](../api/domain-post-domainnamereferences.md)                    | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.                       |
| [Get domainNameReferences](../api/domain-get-domainnamereferences.md)                     | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.                      |
| [Update domainNameReferences](../api/domain-update-domainnamereferences.md)               | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                                      |
| [Remove domainNameReferences](../api/domain-delete-domainnamereferences.md)               |                                                     | Remove a directoryObject object.                                                        |
| [List serviceConfigurationRecords](../api/domain-list-serviceconfigurationrecords.md)     | [domainDnsRecord](../resources/-domaindnsrecord.md) | Get the domainDnsRecord objects from a serviceConfigurationRecords navigation property. |
| [Create serviceConfigurationRecords](../api/domain-post-serviceconfigurationrecords.md)   | [domainDnsRecord](../resources/-domaindnsrecord.md) | Create a new domainDnsRecord object.                                                    |
| [Get serviceConfigurationRecords](../api/domain-get-serviceconfigurationrecords.md)       | [domainDnsRecord](../resources/-domaindnsrecord.md) | Read the properties and relationships of a domainDnsRecord object.                      |
| [Update serviceConfigurationRecords](../api/domain-update-serviceconfigurationrecords.md) | [domainDnsRecord](../resources/-domaindnsrecord.md) | Update the properties of a domainDnsRecord object.                                      |
| [Delete serviceConfigurationRecords](../api/domain-delete-serviceconfigurationrecords.md) |                                                     | Delete a domainDnsRecord object.                                                        |
| [List verificationDnsRecords](../api/domain-list-verificationdnsrecords.md)               | [domainDnsRecord](../resources/-domaindnsrecord.md) | Get the domainDnsRecord objects from a verificationDnsRecords navigation property.      |
| [Create verificationDnsRecords](../api/domain-post-verificationdnsrecords.md)             | [domainDnsRecord](../resources/-domaindnsrecord.md) | Create a new domainDnsRecord object.                                                    |
| [Get verificationDnsRecords](../api/domain-get-verificationdnsrecords.md)                 | [domainDnsRecord](../resources/-domaindnsrecord.md) | Read the properties and relationships of a domainDnsRecord object.                      |
| [Update verificationDnsRecords](../api/domain-update-verificationdnsrecords.md)           | [domainDnsRecord](../resources/-domaindnsrecord.md) | Update the properties of a domainDnsRecord object.                                      |
| [Delete verificationDnsRecords](../api/domain-delete-verificationdnsrecords.md)           |                                                     | Delete a domainDnsRecord object.                                                        |

## Properties

| Property                         | Type                                       | Description |
| :------------------------------- | :----------------------------------------- | :---------- |
| authenticationType               | String                                     |             |
| availabilityStatus               | String                                     |             |
| id                               | String                                     | Read-only.  |
| isAdminManaged                   | Boolean                                    |             |
| isDefault                        | Boolean                                    |             |
| isInitial                        | Boolean                                    |             |
| isRoot                           | Boolean                                    |             |
| isVerified                       | Boolean                                    |             |
| passwordNotificationWindowInDays | Int32                                      |             |
| passwordValidityPeriodInDays     | Int32                                      |             |
| state                            | [domainState](../resources/domainstate.md) |             |
| supportedServices                | String collection                          |             |

## Relationships

| Relationship                | Type                                                          | Description |
| :-------------------------- | :------------------------------------------------------------ | :---------- |
| domainNameReferences        | [directoryObject](../resources/directoryobject.md) collection |             |
| serviceConfigurationRecords | [domainDnsRecord](../resources/domaindnsrecord.md) collection |             |
| verificationDnsRecords      | [domainDnsRecord](../resources/domaindnsrecord.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.domain",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.domain",
  "authenticationType": "String",
  "availabilityStatus": "String",
  "id": "String (identifier)",
  "isAdminManaged": "Boolean",
  "isDefault": "Boolean",
  "isInitial": "Boolean",
  "isRoot": "Boolean",
  "isVerified": "Boolean",
  "passwordNotificationWindowInDays": "Int32",
  "passwordValidityPeriodInDays": "Int32",
  "state": {"@odata.type": "microsoft.graph.domainState"},
  "supportedServices": ["String"]
}
```
