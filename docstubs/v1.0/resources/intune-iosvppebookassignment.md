---
title: "iosVppEBookAssignment resource type"
description: "Contains properties used to assign an iOS VPP EBook to a group."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# iosVppEBookAssignment resource type

Namespace: microsoft.graph

Contains properties used to assign an iOS VPP EBook to a group.

Inherits from [managedEBookAssignment](managedebookassignment.md)

## Methods

| Method                                                                        | Return Type                                                         | Description                                                           |
| :---------------------------------------------------------------------------- | :------------------------------------------------------------------ | :-------------------------------------------------------------------- |
| [List iosVppEBookAssignment](../api/intune-iosvppebookassignment-list.md)     | [iosVppEBookAssignment](intune-iosVppEBookAssignment.md) collection | List properties and relationships of an iosVppEBookAssignment object. |
| [Create iosVppEBookAssignment](../api/intune-iosvppebookassignment-create.md) | [iosVppEBookAssignment](intune-iosVppEBookAssignment.md)            | Create a new iosVppEBookAssignment object.                            |
| [Get iosVppEBookAssignment](../api/intune-iosvppebookassignment-get.md)       | [iosVppEBookAssignment](intune-iosVppEBookAssignment.md)            | Read properties and relationships of an iosVppEBookAssignment object. |
| [Update iosVppEBookAssignment](../api/intune-iosvppebookassignment-update.md) | [iosVppEBookAssignment](intune-iosVppEBookAssignment.md)            | Update the properties of an iosVppEBookAssignment object.             |
| [Delete iosVppEBookAssignment](../api/intune-iosvppebookassignment-delete.md) |                                                                     | Delete an iosVppEBookAssignment object.                               |

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
  "@odata.type": "microsoft.graph.iosVppEBookAssignment",
  "baseType": "microsoft.graph.managedEBookAssignment",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.iosVppEBookAssignment",
  "id": "String (identifier)",
  "installIntent": "available | required | uninstall | availableWithoutEnrollment",
  "target": {"@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"}
}
```
