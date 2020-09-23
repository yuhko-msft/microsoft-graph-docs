---
title: "iosVppAppAssignmentSettings resource type"
description: "Contains properties used to assign an iOS VPP mobile app to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppAppAssignmentSettings resource type

Namespace: microsoft.graph

Contains properties used to assign an iOS VPP mobile app to a group.


Inherits from [mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|type|String|**TODO: Add Description** Inherited from [mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md)|
|uninstallOnDeviceRemoval|Boolean|Whether or not to uninstall the app when device is removed from Intune.|
|useDeviceLicensing|Boolean|Whether or not to use device licensing.|
|vpnConfigurationId|String|The VPN Configuration Id to apply for this app.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosVppAppAssignmentSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVppAppAssignmentSettings",
  "type": "String",
  "useDeviceLicensing": "Boolean",
  "vpnConfigurationId": "String",
  "uninstallOnDeviceRemoval": "Boolean"
}
```

