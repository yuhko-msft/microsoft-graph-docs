---
title: "orgContact resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# orgContact resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                  | Return Type                                         | Description                                                                    |
| :-------------------------------------------------------------------------------------- | :-------------------------------------------------- | :----------------------------------------------------------------------------- |
| [List orgContact](../api/orgcontact-list.md)                                            | [orgContact](orgContact.md) collection              | List properties and relationships of an orgContact object.                     |
| [Create orgContact](../api/orgcontact-create.md)                                        | [orgContact](orgContact.md)                         | Create a new orgContact object.                                                |
| [Get orgContact](../api/orgcontact-get.md)                                              | [orgContact](orgContact.md)                         | Read properties and relationships of an orgContact object.                     |
| [Update orgContact](../api/orgcontact-update.md)                                        | [orgContact](orgContact.md)                         | Update the properties of an orgContact object.                                 |
| [Delete orgContact](../api/orgcontact-delete.md)                                        |                                                     | Delete an orgContact object.                                                   |
| [checkMemberGroups](../api/orgcontact-checkMemberGroups.md)                             |                                                     |                                                                                |
| [checkMemberObjects](../api/orgcontact-checkMemberObjects.md)                           |                                                     |                                                                                |
| [getAvailableExtensionProperties](../api/orgcontact-getAvailableExtensionProperties.md) |                                                     |                                                                                |
| [getByIds](../api/orgcontact-getByIds.md)                                               |                                                     |                                                                                |
| [getMemberGroups](../api/orgcontact-getMemberGroups.md)                                 |                                                     |                                                                                |
| [getMemberObjects](../api/orgcontact-getMemberObjects.md)                               |                                                     |                                                                                |
| [restore](../api/orgcontact-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md) |                                                                                |
| [validateProperties](../api/orgcontact-validateProperties.md)                           |                                                     |                                                                                |
| [delta](../api/orgcontact-delta.md)                                                     |                                                     |                                                                                |
| [List directReports](../api/orgcontact-list-directreports.md)                           | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a directReports navigation property.      |
| [Add directReports](../api/orgcontact-post-directreports.md)                            | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.              |
| [Get directReports](../api/orgcontact-get-directreports.md)                             | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.             |
| [Update directReports](../api/orgcontact-update-directreports.md)                       | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                             |
| [Remove directReports](../api/orgcontact-delete-directreports.md)                       |                                                     | Remove a directoryObject object.                                               |
| [List manager](../api/orgcontact-list-manager.md)                                       | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a manager navigation property.            |
| [Add manager](../api/orgcontact-post-manager.md)                                        | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.              |
| [Get manager](../api/orgcontact-get-manager.md)                                         | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.             |
| [Update manager](../api/orgcontact-update-manager.md)                                   | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                             |
| [Remove manager](../api/orgcontact-delete-manager.md)                                   |                                                     | Remove a directoryObject object.                                               |
| [List memberOf](../api/orgcontact-list-memberof.md)                                     | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a memberOf navigation property.           |
| [Add memberOf](../api/orgcontact-post-memberof.md)                                      | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.              |
| [Get memberOf](../api/orgcontact-get-memberof.md)                                       | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.             |
| [Update memberOf](../api/orgcontact-update-memberof.md)                                 | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                             |
| [Remove memberOf](../api/orgcontact-delete-memberof.md)                                 |                                                     | Remove a directoryObject object.                                               |
| [List transitiveMemberOf](../api/orgcontact-list-transitivememberof.md)                 | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a transitiveMemberOf navigation property. |
| [Add transitiveMemberOf](../api/orgcontact-post-transitivememberof.md)                  | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.              |
| [Get transitiveMemberOf](../api/orgcontact-get-transitivememberof.md)                   | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.             |
| [Update transitiveMemberOf](../api/orgcontact-update-transitivememberof.md)             | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                             |
| [Remove transitiveMemberOf](../api/orgcontact-delete-transitivememberof.md)             |                                                     | Remove a directoryObject object.                                               |

## Properties

| Property                     | Type                                                                                  | Description |
| :--------------------------- | :------------------------------------------------------------------------------------ | :---------- |
| addresses                    | [physicalOfficeAddress](../resources/physicalofficeaddress.md) collection             |             |
| companyName                  | String                                                                                |             |
| deletedDateTime              | DateTimeOffset                                                                        |             |
| department                   | String                                                                                |             |
| displayName                  | String                                                                                |             |
| givenName                    | String                                                                                |             |
| id                           | String                                                                                | Read-only.  |
| jobTitle                     | String                                                                                |             |
| mail                         | String                                                                                |             |
| mailNickname                 | String                                                                                |             |
| onPremisesLastSyncDateTime   | DateTimeOffset                                                                        |             |
| onPremisesProvisioningErrors | [onPremisesProvisioningError](../resources/onpremisesprovisioningerror.md) collection |             |
| onPremisesSyncEnabled        | Boolean                                                                               |             |
| phones                       | [phone](../resources/phone.md) collection                                             |             |
| proxyAddresses               | String collection                                                                     |             |
| surname                      | String                                                                                |             |

## Relationships

| Relationship       | Type                                                          | Description |
| :----------------- | :------------------------------------------------------------ | :---------- |
| directReports      | [directoryObject](../resources/directoryobject.md) collection |             |
| manager            | [directoryObject](../resources/directoryobject.md)            |             |
| memberOf           | [directoryObject](../resources/directoryobject.md) collection |             |
| transitiveMemberOf | [directoryObject](../resources/directoryobject.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.orgContact",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.orgContact",
  "addresses": [{"@odata.type": "microsoft.graph.physicalOfficeAddress"}],
  "companyName": "String",
  "deletedDateTime": "DateTimeOffset",
  "department": "String",
  "displayName": "String",
  "givenName": "String",
  "id": "String (identifier)",
  "jobTitle": "String",
  "mail": "String",
  "mailNickname": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesProvisioningErrors": [{"@odata.type": "microsoft.graph.onPremisesProvisioningError"}],
  "onPremisesSyncEnabled": "Boolean",
  "phones": [{"@odata.type": "microsoft.graph.phone"}],
  "proxyAddresses": ["String"],
  "surname": "String"
}
```
