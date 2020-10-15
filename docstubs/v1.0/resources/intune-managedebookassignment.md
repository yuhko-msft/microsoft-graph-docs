---
title: "managedEBookAssignment resource type"
description: "Contains properties used to assign a eBook to a group."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# managedEBookAssignment resource type

Namespace: microsoft.graph

Contains properties used to assign a eBook to a group.

## Methods

| Method                                                                          | Return Type                                                           | Description                                                           |
| :------------------------------------------------------------------------------ | :-------------------------------------------------------------------- | :-------------------------------------------------------------------- |
| [List managedEBookAssignment](../api/intune-managedebookassignment-list.md)     | [managedEBookAssignment](intune-managedEBookAssignment.md) collection | List properties and relationships of a managedEBookAssignment object. |
| [Create managedEBookAssignment](../api/intune-managedebookassignment-create.md) | [managedEBookAssignment](intune-managedEBookAssignment.md)            | Create a new managedEBookAssignment object.                           |
| [Get managedEBookAssignment](../api/intune-managedebookassignment-get.md)       | [managedEBookAssignment](intune-managedEBookAssignment.md)            | Read properties and relationships of a managedEBookAssignment object. |
| [Update managedEBookAssignment](../api/intune-managedebookassignment-update.md) | [managedEBookAssignment](intune-managedEBookAssignment.md)            | Update the properties of a managedEBookAssignment object.             |
| [Delete managedEBookAssignment](../api/intune-managedebookassignment-delete.md) |                                                                       | Delete a managedEBookAssignment object.                               |

## Properties

| Property      | Type                                                                                             | Description                      |
| :------------ | :----------------------------------------------------------------------------------------------- | :------------------------------- |
| id            | String                                                                                           | Key of the entity. Read-only.    |
| installIntent | String                                                                                           | The install intent for eBook.    |
| target        | [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md) | The assignment target for eBook. |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedEBookAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.managedEBookAssignment",
  "id": "String (identifier)",
  "installIntent": "available | required | uninstall | availableWithoutEnrollment",
  "target": {"@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"}
}
```
