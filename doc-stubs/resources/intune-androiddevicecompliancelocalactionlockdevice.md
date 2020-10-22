---
title: "androidDeviceComplianceLocalActionLockDevice resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceComplianceLocalActionLockDevice resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceComplianceLocalActionLockDevices](../api/intune-androiddevicecompliancelocalactionlockdevice-list.md)|[androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md) collection|Get a list of the [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) objects and their properties.|
|[Create androidDeviceComplianceLocalActionLockDevice](../api/intune-androiddevicecompliancelocalactionlockdevice-create.md)|[androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md)|Create a new [androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md) object.|
|[Get androidDeviceComplianceLocalActionLockDevice](../api/intune-androiddevicecompliancelocalactionlockdevice-get.md)|[androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md)|Read the properties and relationships of an [androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md) object.|
|[Update androidDeviceComplianceLocalActionLockDevice](../api/intune-androiddevicecompliancelocalactionlockdevice-update.md)|[androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md)|Update the properties of an [androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md) object.|
|[Delete androidDeviceComplianceLocalActionLockDevice](../api/intune-androiddevicecompliancelocalactionlockdevice-delete.md)|None|Deletes an [androidDeviceComplianceLocalActionLockDevice](../resources/intune-androiddevicecompliancelocalactionlockdevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|gracePeriodInMinutes|Int32|**TODO: Add Description** Inherited from [androidDeviceComplianceLocalActionBase](../resources/intune-androiddevicecompliancelocalactionbase.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidDeviceComplianceLocalActionLockDevice",
  "baseType": "microsoft.graph.androidDeviceComplianceLocalActionBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionLockDevice",
  "gracePeriodInMinutes": "Integer"
}
```

