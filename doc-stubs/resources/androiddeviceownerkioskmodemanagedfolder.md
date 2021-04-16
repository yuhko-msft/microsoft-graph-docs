---
title: "androidDeviceOwnerKioskModeManagedFolder resource type"
description: "A folder containing pages of apps and weblinks on the Managed Home Screen"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceOwnerKioskModeManagedFolder resource type

Namespace: microsoft.graph



A folder containing pages of apps and weblinks on the Managed Home Screen

## Properties
|Property|Type|Description|
|:---|:---|:---|
|folderIdentifier|String|Unique identifier for the folder|
|folderName|String|Display name for the folder|
|items|[androidDeviceOwnerKioskModeFolderItem](../resources/androiddeviceownerkioskmodefolderitem.md) collection|Items to be added to managed folder. This collection can contain a maximum of 500 elements.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeManagedFolder"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerKioskModeManagedFolder",
  "folderIdentifier": "String",
  "folderName": "String",
  "items": [
    {
      "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeApp"
    }
  ]
}
```

