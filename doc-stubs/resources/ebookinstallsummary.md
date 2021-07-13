---
title: "eBookInstallSummary resource type"
description: "Contains properties for the installation summary of a book for a device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# eBookInstallSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties for the installation summary of a book for a device.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List eBookInstallSummaries](../api/ebookinstallsummary-list.md)|[eBookInstallSummary](../resources/ebookinstallsummary.md) collection|Get a list of the [eBookInstallSummary](../resources/ebookinstallsummary.md) objects and their properties.|
|[Create eBookInstallSummary](../api/ebookinstallsummary-create.md)|[eBookInstallSummary](../resources/ebookinstallsummary.md)|Create a new [eBookInstallSummary](../resources/ebookinstallsummary.md) object.|
|[Get eBookInstallSummary](../api/ebookinstallsummary-get.md)|[eBookInstallSummary](../resources/ebookinstallsummary.md)|Read the properties and relationships of an [eBookInstallSummary](../resources/ebookinstallsummary.md) object.|
|[Update eBookInstallSummary](../api/ebookinstallsummary-update.md)|[eBookInstallSummary](../resources/ebookinstallsummary.md)|Update the properties of an [eBookInstallSummary](../resources/ebookinstallsummary.md) object.|
|[Delete eBookInstallSummary](../api/ebookinstallsummary-delete.md)|None|Deletes an [eBookInstallSummary](../resources/ebookinstallsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|failedDeviceCount|Int32|Number of Devices that have failed to install this book.|
|failedUserCount|Int32|Number of Users that have 1 or more device that failed to install this book.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|installedDeviceCount|Int32|Number of Devices that have successfully installed this book.|
|installedUserCount|Int32|Number of Users whose devices have all succeeded to install this book.|
|notInstalledDeviceCount|Int32|Number of Devices that does not have this book installed.|
|notInstalledUserCount|Int32|Number of Users that did not install this book.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.eBookInstallSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.eBookInstallSummary",
  "id": "String (identifier)",
  "failedDeviceCount": "Integer",
  "failedUserCount": "Integer",
  "installedDeviceCount": "Integer",
  "installedUserCount": "Integer",
  "notInstalledDeviceCount": "Integer",
  "notInstalledUserCount": "Integer"
}
```

