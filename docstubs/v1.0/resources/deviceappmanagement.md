---
title: "deviceAppManagement resource type"
description: "Singleton entity that acts as a container for all device app management functionality."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# deviceAppManagement resource type

Namespace: microsoft.graph

Singleton entity that acts as a container for all device app management functionality.

## Methods

| Method                                                                     | Return Type                                              | Description                                                            |
| :------------------------------------------------------------------------- | :------------------------------------------------------- | :--------------------------------------------------------------------- |
| [List deviceAppManagement](../api/deviceappmanagement-list.md)             | [deviceAppManagement](deviceAppManagement.md) collection | List properties and relationships of a deviceAppManagement object.     |
| [Create deviceAppManagement](../api/deviceappmanagement-create.md)         | [deviceAppManagement](deviceAppManagement.md)            | Create a new deviceAppManagement object.                               |
| [Get deviceAppManagement](../api/deviceappmanagement-get.md)               | [deviceAppManagement](deviceAppManagement.md)            | Read properties and relationships of a deviceAppManagement object.     |
| [Update deviceAppManagement](../api/deviceappmanagement-update.md)         | [deviceAppManagement](deviceAppManagement.md)            | Update the properties of a deviceAppManagement object.                 |
| [Delete deviceAppManagement](../api/deviceappmanagement-delete.md)         |                                                          | Delete a deviceAppManagement object.                                   |
| [List managedEBooks](../api/deviceappmanagement-list-managedebooks.md)     | [managedEBook](../resources/intune-managedebook.md)      | Get the managedEBook objects from a managedEBooks navigation property. |
| [Create managedEBooks](../api/deviceappmanagement-post-managedebooks.md)   | [managedEBook](../resources/intune-managedebook.md)      | Create a new managedEBook object.                                      |
| [Get managedEBooks](../api/deviceappmanagement-get-managedebooks.md)       | [managedEBook](../resources/intune-managedebook.md)      | Read the properties and relationships of a managedEBook object.        |
| [Update managedEBooks](../api/deviceappmanagement-update-managedebooks.md) | [managedEBook](../resources/intune-managedebook.md)      | Update the properties of a managedEBook object.                        |
| [Delete managedEBooks](../api/deviceappmanagement-delete-managedebooks.md) |                                                          | Delete a managedEBook object.                                          |

## Properties

| Property | Type   | Description                   |
| :------- | :----- | :---------------------------- |
| id       | String | Key of the entity. Read-only. |

## Relationships

| Relationship  | Type                                                    | Description        |
| :------------ | :------------------------------------------------------ | :----------------- |
| managedEBooks | [managedEBook](../resources/managedebook.md) collection | The Managed eBook. |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceAppManagement",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.deviceAppManagement",
  "id": "String (identifier)"
}
```
