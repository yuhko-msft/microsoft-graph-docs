---
title: "macOsVppAppAssignmentSettings resource type"
description: "Contains properties used to assign an Mac VPP mobile app to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOsVppAppAssignmentSettings resource type

Namespace: microsoft.graph



Contains properties used to assign an Mac VPP mobile app to a group.


Inherits from [mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|uninstallOnDeviceRemoval|Boolean|Whether or not to uninstall the app when device is removed from Intune.|
|useDeviceLicensing|Boolean|Whether or not to use device licensing.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.macOsVppAppAssignmentSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOsVppAppAssignmentSettings",
  "uninstallOnDeviceRemoval": "Boolean",
  "useDeviceLicensing": "Boolean"
}
```

