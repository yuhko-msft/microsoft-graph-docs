---
title: "contactFolder resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# contactFolder resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                               | Return Type                                                                             | Description                                                                                                 |
| :--------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List contactFolder](../api/contactfolder-list.md)                                                   | [contactFolder](contactFolder.md) collection                                            | List properties and relationships of a contactFolder object.                                                |
| [Create contactFolder](../api/contactfolder-create.md)                                               | [contactFolder](contactFolder.md)                                                       | Create a new contactFolder object.                                                                          |
| [Get contactFolder](../api/contactfolder-get.md)                                                     | [contactFolder](contactFolder.md)                                                       | Read properties and relationships of a contactFolder object.                                                |
| [Update contactFolder](../api/contactfolder-update.md)                                               | [contactFolder](contactFolder.md)                                                       | Update the properties of a contactFolder object.                                                            |
| [Delete contactFolder](../api/contactfolder-delete.md)                                               |                                                                                         | Delete a contactFolder object.                                                                              |
| [delta](../api/contactfolder-delta.md)                                                               |                                                                                         |                                                                                                             |
| [List childFolders](../api/contactfolder-list-childfolders.md)                                       | [contactFolder](../resources/-contactfolder.md)                                         | Get the contactFolder objects from a childFolders navigation property.                                      |
| [Create childFolders](../api/contactfolder-post-childfolders.md)                                     | [contactFolder](../resources/-contactfolder.md)                                         | Create a new contactFolder object.                                                                          |
| [Get childFolders](../api/contactfolder-get-childfolders.md)                                         | [contactFolder](../resources/-contactfolder.md)                                         | Read the properties and relationships of a contactFolder object.                                            |
| [Update childFolders](../api/contactfolder-update-childfolders.md)                                   | [contactFolder](../resources/-contactfolder.md)                                         | Update the properties of a contactFolder object.                                                            |
| [Delete childFolders](../api/contactfolder-delete-childfolders.md)                                   |                                                                                         | Delete a contactFolder object.                                                                              |
| [List contacts](../api/contactfolder-list-contacts.md)                                               | [contact](../resources/-contact.md)                                                     | Get the contact objects from a contacts navigation property.                                                |
| [Create contacts](../api/contactfolder-post-contacts.md)                                             | [contact](../resources/-contact.md)                                                     | Create a new contact object.                                                                                |
| [Get contacts](../api/contactfolder-get-contacts.md)                                                 | [contact](../resources/-contact.md)                                                     | Read the properties and relationships of a contact object.                                                  |
| [Update contacts](../api/contactfolder-update-contacts.md)                                           | [contact](../resources/-contact.md)                                                     | Update the properties of a contact object.                                                                  |
| [Delete contacts](../api/contactfolder-delete-contacts.md)                                           |                                                                                         | Delete a contact object.                                                                                    |
| [List multiValueExtendedProperties](../api/contactfolder-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/contactfolder-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/contactfolder-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/contactfolder-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/contactfolder-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List singleValueExtendedProperties](../api/contactfolder-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/contactfolder-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/contactfolder-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/contactfolder-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/contactfolder-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |

## Properties

| Property       | Type   | Description |
| :------------- | :----- | :---------- |
| displayName    | String |             |
| id             | String | Read-only.  |
| parentFolderId | String |             |
| wellKnownName  | String |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| childFolders                  | [contactFolder](../resources/contactfolder.md) collection                                         |             |
| contacts                      | [contact](../resources/contact.md) collection                                                     |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.contactFolder",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.contactFolder",
  "displayName": "String",
  "id": "String (identifier)",
  "parentFolderId": "String",
  "wellKnownName": "String"
}
```
