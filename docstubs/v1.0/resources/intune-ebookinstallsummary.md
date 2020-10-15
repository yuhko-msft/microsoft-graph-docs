---
title: "eBookInstallSummary resource type"
description: "Contains properties for the installation summary of a book for a device."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# eBookInstallSummary resource type

Namespace: microsoft.graph

Contains properties for the installation summary of a book for a device.

## Methods

| Method                                                                    | Return Type                                                     | Description                                                         |
| :------------------------------------------------------------------------ | :-------------------------------------------------------------- | :------------------------------------------------------------------ |
| [List eBookInstallSummary](../api/intune-ebookinstallsummary-list.md)     | [eBookInstallSummary](intune-eBookInstallSummary.md) collection | List properties and relationships of an eBookInstallSummary object. |
| [Create eBookInstallSummary](../api/intune-ebookinstallsummary-create.md) | [eBookInstallSummary](intune-eBookInstallSummary.md)            | Create a new eBookInstallSummary object.                            |
| [Get eBookInstallSummary](../api/intune-ebookinstallsummary-get.md)       | [eBookInstallSummary](intune-eBookInstallSummary.md)            | Read properties and relationships of an eBookInstallSummary object. |
| [Update eBookInstallSummary](../api/intune-ebookinstallsummary-update.md) | [eBookInstallSummary](intune-eBookInstallSummary.md)            | Update the properties of an eBookInstallSummary object.             |
| [Delete eBookInstallSummary](../api/intune-ebookinstallsummary-delete.md) |                                                                 | Delete an eBookInstallSummary object.                               |

## Properties

| Property                | Type   | Description                                                                  |
| :---------------------- | :----- | :--------------------------------------------------------------------------- |
| failedDeviceCount       | Int32  | Number of Devices that have failed to install this book.                     |
| failedUserCount         | Int32  | Number of Users that have 1 or more device that failed to install this book. |
| id                      | String | Key of the entity. Read-only.                                                |
| installedDeviceCount    | Int32  | Number of Devices that have successfully installed this book.                |
| installedUserCount      | Int32  | Number of Users whose devices have all succeeded to install this book.       |
| notInstalledDeviceCount | Int32  | Number of Devices that does not have this book installed.                    |
| notInstalledUserCount   | Int32  | Number of Users that did not install this book.                              |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.eBookInstallSummary",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.eBookInstallSummary",
  "failedDeviceCount": "Int32",
  "failedUserCount": "Int32",
  "id": "String (identifier)",
  "installedDeviceCount": "Int32",
  "installedUserCount": "Int32",
  "notInstalledDeviceCount": "Int32",
  "notInstalledUserCount": "Int32"
}
```
