---
title: "iosVppEBook resource type"
description: "A class containing the properties for iOS Vpp eBook."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# iosVppEBook resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A class containing the properties for iOS Vpp eBook.

Inherits from [managedEBook](managedebook.md)

## Methods

| Method                                                    | Return Type                                     | Description                                                 |
| :-------------------------------------------------------- | :---------------------------------------------- | :---------------------------------------------------------- |
| [List iosVppEBook](../api/intune-iosvppebook-list.md)     | [iosVppEBook](intune-iosVppEBook.md) collection | List properties and relationships of an iosVppEBook object. |
| [Create iosVppEBook](../api/intune-iosvppebook-create.md) | [iosVppEBook](intune-iosVppEBook.md)            | Create a new iosVppEBook object.                            |
| [Get iosVppEBook](../api/intune-iosvppebook-get.md)       | [iosVppEBook](intune-iosVppEBook.md)            | Read properties and relationships of an iosVppEBook object. |
| [Update iosVppEBook](../api/intune-iosvppebook-update.md) | [iosVppEBook](intune-iosVppEBook.md)            | Update the properties of an iosVppEBook object.             |
| [Delete iosVppEBook](../api/intune-iosvppebook-delete.md) |                                                 | Delete an iosVppEBook object.                               |
| [assign](../api/intune-iosvppebook-assign.md)             |                                                 |                                                             |

## Properties

| Property              | Type                                       | Description                                         |
| :-------------------- | :----------------------------------------- | :-------------------------------------------------- |
| appleId               | String                                     | The Apple ID associated with Vpp token.             |
| createdDateTime       | DateTimeOffset                             | The date and time when the eBook file was created.  |
| description           | String                                     | Description.                                        |
| displayName           | String                                     | Name of the eBook.                                  |
| genres                | String collection                          | Genres.                                             |
| id                    | String                                     | Key of the entity. Read-only.                       |
| informationUrl        | String                                     | The more information Url.                           |
| language              | String                                     | Language.                                           |
| largeCover            | [mimeContent](../resources/mimecontent.md) | Book cover.                                         |
| lastModifiedDateTime  | DateTimeOffset                             | The date and time when the eBook was last modified. |
| privacyInformationUrl | String                                     | The privacy statement Url.                          |
| publishedDateTime     | DateTimeOffset                             | The date and time when the eBook was published.     |
| publisher             | String                                     | Publisher.                                          |
| roleScopeTagIds       | String collection                          | List of Scope Tags for this Entity instance.        |
| seller                | String                                     | Seller.                                             |
| totalLicenseCount     | Int32                                      | Total license count.                                |
| usedLicenseCount      | Int32                                      | Used license count.                                 |
| vppOrganizationName   | String                                     | The Vpp token's organization name.                  |
| vppTokenId            | Guid                                       | The Vpp token ID.                                   |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosVppEBook",
  "baseType": "microsoft.graph.managedEBook",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.iosVppEBook",
  "appleId": "String",
  "createdDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "genres": ["String"],
  "id": "String (identifier)",
  "informationUrl": "String",
  "language": "String",
  "largeCover": {"@odata.type": "microsoft.graph.mimeContent"},
  "lastModifiedDateTime": "DateTimeOffset",
  "privacyInformationUrl": "String",
  "publishedDateTime": "DateTimeOffset",
  "publisher": "String",
  "roleScopeTagIds": ["String"],
  "seller": "String",
  "totalLicenseCount": "Int32",
  "usedLicenseCount": "Int32",
  "vppOrganizationName": "String",
  "vppTokenId": "Guid"
}
```
