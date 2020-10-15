---
title: "userInstallStateSummary resource type"
description: "Contains properties for the installation state summary for a user."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userInstallStateSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties for the installation state summary for a user.

## Methods

| Method                                                                              | Return Type                                                             | Description                                                                 |
| :---------------------------------------------------------------------------------- | :---------------------------------------------------------------------- | :-------------------------------------------------------------------------- |
| [List userInstallStateSummary](../api/intune-userinstallstatesummary-list.md)       | [userInstallStateSummary](intune-userInstallStateSummary.md) collection | List properties and relationships of a userInstallStateSummary object.      |
| [Create userInstallStateSummary](../api/intune-userinstallstatesummary-create.md)   | [userInstallStateSummary](intune-userInstallStateSummary.md)            | Create a new userInstallStateSummary object.                                |
| [Get userInstallStateSummary](../api/intune-userinstallstatesummary-get.md)         | [userInstallStateSummary](intune-userInstallStateSummary.md)            | Read properties and relationships of a userInstallStateSummary object.      |
| [Update userInstallStateSummary](../api/intune-userinstallstatesummary-update.md)   | [userInstallStateSummary](intune-userInstallStateSummary.md)            | Update the properties of a userInstallStateSummary object.                  |
| [Delete userInstallStateSummary](../api/intune-userinstallstatesummary-delete.md)   |                                                                         | Delete a userInstallStateSummary object.                                    |
| [List deviceStates](../api/intune-userinstallstatesummary-list-devicestates.md)     | [deviceInstallState](../resources/intune-deviceinstallstate.md)         | Get the deviceInstallState objects from a deviceStates navigation property. |
| [Create deviceStates](../api/intune-userinstallstatesummary-post-devicestates.md)   | [deviceInstallState](../resources/intune-deviceinstallstate.md)         | Create a new deviceInstallState object.                                     |
| [Get deviceStates](../api/intune-userinstallstatesummary-get-devicestates.md)       | [deviceInstallState](../resources/intune-deviceinstallstate.md)         | Read the properties and relationships of a deviceInstallState object.       |
| [Update deviceStates](../api/intune-userinstallstatesummary-update-devicestates.md) | [deviceInstallState](../resources/intune-deviceinstallstate.md)         | Update the properties of a deviceInstallState object.                       |
| [Delete deviceStates](../api/intune-userinstallstatesummary-delete-devicestates.md) |                                                                         | Delete a deviceInstallState object.                                         |

## Properties

| Property                | Type   | Description                   |
| :---------------------- | :----- | :---------------------------- |
| failedDeviceCount       | Int32  | Failed Device Count.          |
| id                      | String | Key of the entity. Read-only. |
| installedDeviceCount    | Int32  | Installed Device Count.       |
| notInstalledDeviceCount | Int32  | Not installed device count.   |
| userName                | String | User name.                    |

## Relationships

| Relationship | Type                                                                | Description                     |
| :----------- | :------------------------------------------------------------------ | :------------------------------ |
| deviceStates | [deviceInstallState](../resources/deviceinstallstate.md) collection | The install state of the eBook. |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userInstallStateSummary",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userInstallStateSummary",
  "failedDeviceCount": "Int32",
  "id": "String (identifier)",
  "installedDeviceCount": "Int32",
  "notInstalledDeviceCount": "Int32",
  "userName": "String"
}
```
