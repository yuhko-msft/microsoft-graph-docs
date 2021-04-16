---
title: "androidDeviceComplianceLocalActionLockDeviceWithPasscode resource type"
description: "Local Action Lock Device with Passcode Configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceComplianceLocalActionLockDeviceWithPasscode resource type

Namespace: microsoft.graph



Local Action Lock Device with Passcode Configuration


Inherits from [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceComplianceLocalActionLockDeviceWithPasscodes](../api/androiddevicecompliancelocalactionlockdevicewithpasscode-list.md)|[androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) collection|Get a list of the [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) objects and their properties.|
|[Create androidDeviceComplianceLocalActionLockDeviceWithPasscode](../api/androiddevicecompliancelocalactionlockdevicewithpasscode-create.md)|[androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md)|Create a new [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.|
|[Get androidDeviceComplianceLocalActionLockDeviceWithPasscode](../api/androiddevicecompliancelocalactionlockdevicewithpasscode-get.md)|[androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md)|Read the properties and relationships of an [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.|
|[Update androidDeviceComplianceLocalActionLockDeviceWithPasscode](../api/androiddevicecompliancelocalactionlockdevicewithpasscode-update.md)|[androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md)|Update the properties of an [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.|
|[Delete androidDeviceComplianceLocalActionLockDeviceWithPasscode](../api/androiddevicecompliancelocalactionlockdevicewithpasscode-delete.md)|None|Deletes an [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|gracePeriodInMinutes|Int32|Number of minutes to wait till a local action is enforced. Valid values 0 to 2147483647 Inherited from [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|passcode|String|Passcode to reset to Android device. This property is read-only.|
|passcodeSignInFailureCountBeforeWipe|Int32|Number of sign in failures before wiping device, the value can be 4-11. Valid values 4 to 11|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode",
  "baseType": "microsoft.graph.androidDeviceComplianceLocalActionBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceComplianceLocalActionLockDeviceWithPasscode",
  "id": "String (identifier)",
  "gracePeriodInMinutes": "Integer",
  "passcode": "String",
  "passcodeSignInFailureCountBeforeWipe": "Integer"
}
```

