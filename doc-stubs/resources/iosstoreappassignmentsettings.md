---
title: "iosStoreAppAssignmentSettings resource type"
description: "Contains properties used to assign an iOS Store mobile app to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosStoreAppAssignmentSettings resource type

Namespace: microsoft.graph



Contains properties used to assign an iOS Store mobile app to a group.


Inherits from [mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|isRemovable|Boolean|Whether or not the app can be removed by the user.|
|uninstallOnDeviceRemoval|Boolean|Whether or not to uninstall the app when device is removed from Intune.|
|vpnConfigurationId|String|The VPN Configuration Id to apply for this app.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosStoreAppAssignmentSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosStoreAppAssignmentSettings",
  "isRemovable": "Boolean",
  "uninstallOnDeviceRemoval": "Boolean",
  "vpnConfigurationId": "String"
}
```

