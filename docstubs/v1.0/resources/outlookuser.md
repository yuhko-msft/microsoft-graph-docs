---
title: "outlookUser resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# outlookUser resource type

Namespace: microsoft.graph

## Methods

| Method                                                                   | Return Type                                         | Description                                                                  |
| :----------------------------------------------------------------------- | :-------------------------------------------------- | :--------------------------------------------------------------------------- |
| [List outlookUser](../api/outlookuser-list.md)                           | [outlookUser](outlookUser.md) collection            | List properties and relationships of an outlookUser object.                  |
| [Create outlookUser](../api/outlookuser-create.md)                       | [outlookUser](outlookUser.md)                       | Create a new outlookUser object.                                             |
| [Get outlookUser](../api/outlookuser-get.md)                             | [outlookUser](outlookUser.md)                       | Read properties and relationships of an outlookUser object.                  |
| [Update outlookUser](../api/outlookuser-update.md)                       | [outlookUser](outlookUser.md)                       | Update the properties of an outlookUser object.                              |
| [Delete outlookUser](../api/outlookuser-delete.md)                       |                                                     | Delete an outlookUser object.                                                |
| [supportedLanguages](../api/outlookuser-supportedLanguages.md)           |                                                     |                                                                              |
| [supportedTimeZones](../api/outlookuser-supportedTimeZones.md)           |                                                     |                                                                              |
| [List masterCategories](../api/outlookuser-list-mastercategories.md)     | [outlookCategory](../resources/-outlookcategory.md) | Get the outlookCategory objects from a masterCategories navigation property. |
| [Create masterCategories](../api/outlookuser-post-mastercategories.md)   | [outlookCategory](../resources/-outlookcategory.md) | Create a new outlookCategory object.                                         |
| [Get masterCategories](../api/outlookuser-get-mastercategories.md)       | [outlookCategory](../resources/-outlookcategory.md) | Read the properties and relationships of an outlookCategory object.          |
| [Update masterCategories](../api/outlookuser-update-mastercategories.md) | [outlookCategory](../resources/-outlookcategory.md) | Update the properties of an outlookCategory object.                          |
| [Delete masterCategories](../api/outlookuser-delete-mastercategories.md) |                                                     | Delete an outlookCategory object.                                            |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship     | Type                                                          | Description |
| :--------------- | :------------------------------------------------------------ | :---------- |
| masterCategories | [outlookCategory](../resources/outlookcategory.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookUser",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.outlookUser",
  "id": "String (identifier)"
}
```
