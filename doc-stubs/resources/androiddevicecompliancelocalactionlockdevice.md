---
title: "androidDeviceComplianceLocalActionLockDevice resource type"
description: "Local Action Lock Device Only Configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceComplianceLocalActionLockDevice resource type

Namespace: microsoft.graph



Local Action Lock Device Only Configuration


Inherits from [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceComplianceLocalActionLockDevices](../api/androiddevicecompliancelocalactionlockdevice-list.md)|[androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) collection|Get a list of the [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) objects and their properties.|
|[Create androidDeviceComplianceLocalActionLockDevice](../api/androiddevicecompliancelocalactionlockdevice-create.md)|[androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md)|Create a new [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) object.|
|[Get androidDeviceComplianceLocalActionLockDevice](../api/androiddevicecompliancelocalactionlockdevice-get.md)|[androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md)|Read the properties and relationships of an [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) object.|
|[Update androidDeviceComplianceLocalActionLockDevice](../api/androiddevicecompliancelocalactionlockdevice-update.md)|[androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md)|Update the properties of an [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) object.|
|[Delete androidDeviceComplianceLocalActionLockDevice](../api/androiddevicecompliancelocalactionlockdevice-delete.md)|None|Deletes an [androidDeviceComplianceLocalActionLockDevice](../resources/androiddevicecompliancelocalactionlockdevice.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|gracePeriodInMinutes|Int32|Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647 Inherited from [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

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
  "id": "String (identifier)",
  "gracePeriodInMinutes": "Integer"
}
```

