---
title: "contact resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# contact resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [outlookItem](outlookitem.md)

## Methods

| Method                                                                                         | Return Type                                                                             | Description                                                                                                 |
| :--------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List contact](../api/contact-list.md)                                                         | [contact](contact.md) collection                                                        | List properties and relationships of a contact object.                                                      |
| [Create contact](../api/contact-create.md)                                                     | [contact](contact.md)                                                                   | Create a new contact object.                                                                                |
| [Get contact](../api/contact-get.md)                                                           | [contact](contact.md)                                                                   | Read properties and relationships of a contact object.                                                      |
| [Update contact](../api/contact-update.md)                                                     | [contact](contact.md)                                                                   | Update the properties of a contact object.                                                                  |
| [Delete contact](../api/contact-delete.md)                                                     |                                                                                         | Delete a contact object.                                                                                    |
| [delta](../api/contact-delta.md)                                                               |                                                                                         |                                                                                                             |
| [List extensions](../api/contact-list-extensions.md)                                           | [extension](../resources/-extension.md)                                                 | Get the extension objects from an extensions navigation property.                                           |
| [Create extensions](../api/contact-post-extensions.md)                                         | [extension](../resources/-extension.md)                                                 | Create a new extension object.                                                                              |
| [Get extensions](../api/contact-get-extensions.md)                                             | [extension](../resources/-extension.md)                                                 | Read the properties and relationships of an extension object.                                               |
| [Update extensions](../api/contact-update-extensions.md)                                       | [extension](../resources/-extension.md)                                                 | Update the properties of an extension object.                                                               |
| [Delete extensions](../api/contact-delete-extensions.md)                                       |                                                                                         | Delete an extension object.                                                                                 |
| [List multiValueExtendedProperties](../api/contact-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/contact-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/contact-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/contact-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/contact-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List photo](../api/contact-list-photo.md)                                                     | [profilePhoto](../resources/-profilephoto.md)                                           | Get the profilePhoto objects from a photo navigation property.                                              |
| [Create photo](../api/contact-post-photo.md)                                                   | [profilePhoto](../resources/-profilephoto.md)                                           | Create a new profilePhoto object.                                                                           |
| [Get photo](../api/contact-get-photo.md)                                                       | [profilePhoto](../resources/-profilephoto.md)                                           | Read the properties and relationships of a profilePhoto object.                                             |
| [Update photo](../api/contact-update-photo.md)                                                 | [profilePhoto](../resources/-profilephoto.md)                                           | Update the properties of a profilePhoto object.                                                             |
| [Delete photo](../api/contact-delete-photo.md)                                                 |                                                                                         | Delete a profilePhoto object.                                                                               |
| [List singleValueExtendedProperties](../api/contact-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/contact-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/contact-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/contact-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/contact-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |

## Properties

| Property             | Type                                                              | Description |
| :------------------- | :---------------------------------------------------------------- | :---------- |
| assistantName        | String                                                            |             |
| birthday             | DateTimeOffset                                                    |             |
| categories           | String collection                                                 |             |
| changeKey            | String                                                            |             |
| children             | String collection                                                 |             |
| companyName          | String                                                            |             |
| createdDateTime      | DateTimeOffset                                                    |             |
| department           | String                                                            |             |
| displayName          | String                                                            |             |
| emailAddresses       | [typedEmailAddress](../resources/typedemailaddress.md) collection |             |
| fileAs               | String                                                            |             |
| flag                 | [followupFlag](../resources/followupflag.md)                      |             |
| gender               | String                                                            |             |
| generation           | String                                                            |             |
| givenName            | String                                                            |             |
| id                   | String                                                            | Read-only.  |
| imAddresses          | String collection                                                 |             |
| initials             | String                                                            |             |
| isFavorite           | Boolean                                                           |             |
| jobTitle             | String                                                            |             |
| lastModifiedDateTime | DateTimeOffset                                                    |             |
| manager              | String                                                            |             |
| middleName           | String                                                            |             |
| nickName             | String                                                            |             |
| officeLocation       | String                                                            |             |
| parentFolderId       | String                                                            |             |
| personalNotes        | String                                                            |             |
| phones               | [phone](../resources/phone.md) collection                         |             |
| postalAddresses      | [physicalAddress](../resources/physicaladdress.md) collection     |             |
| profession           | String                                                            |             |
| spouseName           | String                                                            |             |
| surname              | String                                                            |             |
| title                | String                                                            |             |
| websites             | [website](../resources/website.md) collection                     |             |
| weddingAnniversary   | Date                                                              |             |
| yomiCompanyName      | String                                                            |             |
| yomiGivenName        | String                                                            |             |
| yomiSurname          | String                                                            |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| extensions                    | [extension](../resources/extension.md) collection                                                 |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| photo                         | [profilePhoto](../resources/profilephoto.md)                                                      |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.contact",
  "baseType": "microsoft.graph.outlookItem",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.contact",
  "assistantName": "String",
  "birthday": "DateTimeOffset",
  "categories": ["String"],
  "changeKey": "String",
  "children": ["String"],
  "companyName": "String",
  "createdDateTime": "DateTimeOffset",
  "department": "String",
  "displayName": "String",
  "emailAddresses": [{"@odata.type": "microsoft.graph.typedEmailAddress"}],
  "fileAs": "String",
  "flag": {"@odata.type": "microsoft.graph.followupFlag"},
  "gender": "String",
  "generation": "String",
  "givenName": "String",
  "id": "String (identifier)",
  "imAddresses": ["String"],
  "initials": "String",
  "isFavorite": "Boolean",
  "jobTitle": "String",
  "lastModifiedDateTime": "DateTimeOffset",
  "manager": "String",
  "middleName": "String",
  "nickName": "String",
  "officeLocation": "String",
  "parentFolderId": "String",
  "personalNotes": "String",
  "phones": [{"@odata.type": "microsoft.graph.phone"}],
  "postalAddresses": [{"@odata.type": "microsoft.graph.physicalAddress"}],
  "profession": "String",
  "spouseName": "String",
  "surname": "String",
  "title": "String",
  "websites": [{"@odata.type": "microsoft.graph.website"}],
  "weddingAnniversary": "Date",
  "yomiCompanyName": "String",
  "yomiGivenName": "String",
  "yomiSurname": "String"
}
```
