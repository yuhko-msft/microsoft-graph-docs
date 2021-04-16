---
title: "androidDeviceOwnerKioskModeManagedFolderReference resource type"
description: "A reference to folder containing apps and weblinks on the Managed Home Screen"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceOwnerKioskModeManagedFolderReference resource type

Namespace: microsoft.graph



A reference to folder containing apps and weblinks on the Managed Home Screen


Inherits from [androidDeviceOwnerKioskModeHomeScreenItem](../resources/androiddeviceownerkioskmodehomescreenitem.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|folderIdentifier|String|Unique identifier for the folder|
|folderName|String|Name of the folder|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeManagedFolderReference"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerKioskModeManagedFolderReference",
  "folderIdentifier": "String",
  "folderName": "String"
}
```

