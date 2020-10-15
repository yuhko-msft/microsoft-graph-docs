---
title: "deviceInstallState resource type"
description: "Contains properties for the installation state for a device."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# deviceInstallState resource type

Namespace: microsoft.graph

Contains properties for the installation state for a device.

## Methods

| Method                                                                  | Return Type                                                   | Description                                                       |
| :---------------------------------------------------------------------- | :------------------------------------------------------------ | :---------------------------------------------------------------- |
| [List deviceInstallState](../api/intune-deviceinstallstate-list.md)     | [deviceInstallState](intune-deviceInstallState.md) collection | List properties and relationships of a deviceInstallState object. |
| [Create deviceInstallState](../api/intune-deviceinstallstate-create.md) | [deviceInstallState](intune-deviceInstallState.md)            | Create a new deviceInstallState object.                           |
| [Get deviceInstallState](../api/intune-deviceinstallstate-get.md)       | [deviceInstallState](intune-deviceInstallState.md)            | Read properties and relationships of a deviceInstallState object. |
| [Update deviceInstallState](../api/intune-deviceinstallstate-update.md) | [deviceInstallState](intune-deviceInstallState.md)            | Update the properties of a deviceInstallState object.             |
| [Delete deviceInstallState](../api/intune-deviceinstallstate-delete.md) |                                                               | Delete a deviceInstallState object.                               |

## Properties

| Property         | Type           | Description                          |
| :--------------- | :------------- | :----------------------------------- |
| deviceId         | String         | Device Id.                           |
| deviceName       | String         | Device name.                         |
| errorCode        | String         | The error code for install failures. |
| id               | String         | Key of the entity. Read-only.        |
| installState     | String         | The install state of the eBook.      |
| lastSyncDateTime | DateTimeOffset | Last sync date and time.             |
| osDescription    | String         | OS Description.                      |
| osVersion        | String         | OS Version.                          |
| userName         | String         | Device User Name.                    |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceInstallState",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.deviceInstallState",
  "deviceId": "String",
  "deviceName": "String",
  "errorCode": "String",
  "id": "String (identifier)",
  "installState": "notApplicable | installed | failed | notInstalled | uninstallFailed | unknown",
  "lastSyncDateTime": "DateTimeOffset",
  "osDescription": "String",
  "osVersion": "String",
  "userName": "String"
}
```
