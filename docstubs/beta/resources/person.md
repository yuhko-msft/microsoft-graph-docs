---
title: "person resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# person resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                   | Return Type                    | Description                                           |
| :--------------------------------------- | :----------------------------- | :---------------------------------------------------- |
| [List person](../api/person-list.md)     | [person](person.md) collection | List properties and relationships of a person object. |
| [Create person](../api/person-create.md) | [person](person.md)            | Create a new person object.                           |
| [Get person](../api/person-get.md)       | [person](person.md)            | Read properties and relationships of a person object. |
| [Update person](../api/person-update.md) | [person](person.md)            | Update the properties of a person object.             |
| [Delete person](../api/person-delete.md) |                                | Delete a person object.                               |

## Properties

| Property          | Type                                                                | Description |
| :---------------- | :------------------------------------------------------------------ | :---------- |
| birthday          | String                                                              |             |
| companyName       | String                                                              |             |
| department        | String                                                              |             |
| displayName       | String                                                              |             |
| emailAddresses    | [rankedEmailAddress](../resources/rankedemailaddress.md) collection |             |
| givenName         | String                                                              |             |
| id                | String                                                              | Read-only.  |
| isFavorite        | Boolean                                                             |             |
| mailboxType       | String                                                              |             |
| officeLocation    | String                                                              |             |
| personNotes       | String                                                              |             |
| personType        | String                                                              |             |
| phones            | [phone](../resources/phone.md) collection                           |             |
| postalAddresses   | [location](../resources/location.md) collection                     |             |
| profession        | String                                                              |             |
| sources           | [personDataSource](../resources/persondatasource.md) collection     |             |
| surname           | String                                                              |             |
| title             | String                                                              |             |
| userPrincipalName | String                                                              |             |
| websites          | [website](../resources/website.md) collection                       |             |
| yomiCompany       | String                                                              |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.person",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.person",
  "birthday": "String",
  "companyName": "String",
  "department": "String",
  "displayName": "String",
  "emailAddresses": [{"@odata.type": "microsoft.graph.rankedEmailAddress"}],
  "givenName": "String",
  "id": "String (identifier)",
  "isFavorite": "Boolean",
  "mailboxType": "String",
  "officeLocation": "String",
  "personNotes": "String",
  "personType": "String",
  "phones": [{"@odata.type": "microsoft.graph.phone"}],
  "postalAddresses": [{"@odata.type": "microsoft.graph.location"}],
  "profession": "String",
  "sources": [{"@odata.type": "microsoft.graph.personDataSource"}],
  "surname": "String",
  "title": "String",
  "userPrincipalName": "String",
  "websites": [{"@odata.type": "microsoft.graph.website"}],
  "yomiCompany": "String"
}
```
