---
title: "device resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# device resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                              | Return Type                                         | Description                                                                    |
| :---------------------------------------------------------------------------------- | :-------------------------------------------------- | :----------------------------------------------------------------------------- |
| [List device](../api/device-list.md)                                                | [device](device.md) collection                      | List properties and relationships of a device object.                          |
| [Create device](../api/device-create.md)                                            | [device](device.md)                                 | Create a new device object.                                                    |
| [Get device](../api/device-get.md)                                                  | [device](device.md)                                 | Read properties and relationships of a device object.                          |
| [Update device](../api/device-update.md)                                            | [device](device.md)                                 | Update the properties of a device object.                                      |
| [Delete device](../api/device-delete.md)                                            |                                                     | Delete a device object.                                                        |
| [checkMemberGroups](../api/device-checkMemberGroups.md)                             |                                                     |                                                                                |
| [checkMemberObjects](../api/device-checkMemberObjects.md)                           |                                                     |                                                                                |
| [getAvailableExtensionProperties](../api/device-getAvailableExtensionProperties.md) |                                                     |                                                                                |
| [getByIds](../api/device-getByIds.md)                                               |                                                     |                                                                                |
| [getMemberGroups](../api/device-getMemberGroups.md)                                 |                                                     |                                                                                |
| [getMemberObjects](../api/device-getMemberObjects.md)                               |                                                     |                                                                                |
| [restore](../api/device-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md) |                                                                                |
| [validateProperties](../api/device-validateProperties.md)                           |                                                     |                                                                                |
| [List memberOf](../api/device-list-memberof.md)                                     | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a memberOf navigation property.           |
| [Add memberOf](../api/device-post-memberof.md)                                      | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.              |
| [Get memberOf](../api/device-get-memberof.md)                                       | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.             |
| [Update memberOf](../api/device-update-memberof.md)                                 | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                             |
| [Remove memberOf](../api/device-delete-memberof.md)                                 |                                                     | Remove a directoryObject object.                                               |
| [List registeredOwners](../api/device-list-registeredowners.md)                     | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a registeredOwners navigation property.   |
| [Add registeredOwners](../api/device-post-registeredowners.md)                      | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.              |
| [Get registeredOwners](../api/device-get-registeredowners.md)                       | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.             |
| [Update registeredOwners](../api/device-update-registeredowners.md)                 | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                             |
| [Remove registeredOwners](../api/device-delete-registeredowners.md)                 |                                                     | Remove a directoryObject object.                                               |
| [List registeredUsers](../api/device-list-registeredusers.md)                       | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a registeredUsers navigation property.    |
| [Add registeredUsers](../api/device-post-registeredusers.md)                        | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.              |
| [Get registeredUsers](../api/device-get-registeredusers.md)                         | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.             |
| [Update registeredUsers](../api/device-update-registeredusers.md)                   | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                             |
| [Remove registeredUsers](../api/device-delete-registeredusers.md)                   |                                                     | Remove a directoryObject object.                                               |
| [List transitiveMemberOf](../api/device-list-transitivememberof.md)                 | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from a transitiveMemberOf navigation property. |
| [Add transitiveMemberOf](../api/device-post-transitivememberof.md)                  | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.              |
| [Get transitiveMemberOf](../api/device-get-transitivememberof.md)                   | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.             |
| [Update transitiveMemberOf](../api/device-update-transitivememberof.md)             | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                             |
| [Remove transitiveMemberOf](../api/device-delete-transitivememberof.md)             |                                                     | Remove a directoryObject object.                                               |

## Properties

| Property                      | Type                                                                      | Description |
| :---------------------------- | :------------------------------------------------------------------------ | :---------- |
| accountEnabled                | Boolean                                                                   |             |
| alternativeSecurityIds        | [alternativeSecurityId](../resources/alternativesecurityid.md) collection |             |
| approximateLastSignInDateTime | DateTimeOffset                                                            |             |
| complianceExpirationDateTime  | DateTimeOffset                                                            |             |
| deletedDateTime               | DateTimeOffset                                                            |             |
| deviceId                      | String                                                                    |             |
| deviceMetadata                | String                                                                    |             |
| deviceVersion                 | Int32                                                                     |             |
| displayName                   | String                                                                    |             |
| id                            | String                                                                    | Read-only.  |
| isCompliant                   | Boolean                                                                   |             |
| isManaged                     | Boolean                                                                   |             |
| mdmAppId                      | String                                                                    |             |
| onPremisesLastSyncDateTime    | DateTimeOffset                                                            |             |
| onPremisesSyncEnabled         | Boolean                                                                   |             |
| operatingSystem               | String                                                                    |             |
| operatingSystemVersion        | String                                                                    |             |
| physicalIds                   | String collection                                                         |             |
| profileType                   | String                                                                    |             |
| systemLabels                  | String collection                                                         |             |
| trustType                     | String                                                                    |             |

## Relationships

| Relationship       | Type                                                          | Description |
| :----------------- | :------------------------------------------------------------ | :---------- |
| memberOf           | [directoryObject](../resources/directoryobject.md) collection |             |
| registeredOwners   | [directoryObject](../resources/directoryobject.md) collection |             |
| registeredUsers    | [directoryObject](../resources/directoryobject.md) collection |             |
| transitiveMemberOf | [directoryObject](../resources/directoryobject.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.device",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.device",
  "accountEnabled": "Boolean",
  "alternativeSecurityIds": [{"@odata.type": "microsoft.graph.alternativeSecurityId"}],
  "approximateLastSignInDateTime": "DateTimeOffset",
  "complianceExpirationDateTime": "DateTimeOffset",
  "deletedDateTime": "DateTimeOffset",
  "deviceId": "String",
  "deviceMetadata": "String",
  "deviceVersion": "Int32",
  "displayName": "String",
  "id": "String (identifier)",
  "isCompliant": "Boolean",
  "isManaged": "Boolean",
  "mdmAppId": "String",
  "onPremisesLastSyncDateTime": "DateTimeOffset",
  "onPremisesSyncEnabled": "Boolean",
  "operatingSystem": "String",
  "operatingSystemVersion": "String",
  "physicalIds": ["String"],
  "profileType": "String",
  "systemLabels": ["String"],
  "trustType": "String"
}
```
