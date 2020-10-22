---
title: "androidDeviceComplianceLocalActionLockDeviceWithPasscode resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceComplianceLocalActionLockDeviceWithPasscode resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [androidDeviceComplianceLocalActionBase](../resources/androiddevicecompliancelocalactionbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceComplianceLocalActionLockDeviceWithPasscodes](../api/intune-androiddevicecompliancelocalactionlockdevicewithpasscode-list.md)|[androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md) collection|Get a list of the [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/androiddevicecompliancelocalactionlockdevicewithpasscode.md) objects and their properties.|
|[Create androidDeviceComplianceLocalActionLockDeviceWithPasscode](../api/intune-androiddevicecompliancelocalactionlockdevicewithpasscode-create.md)|[androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md)|Create a new [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.|
|[Get androidDeviceComplianceLocalActionLockDeviceWithPasscode](../api/intune-androiddevicecompliancelocalactionlockdevicewithpasscode-get.md)|[androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md)|Read the properties and relationships of an [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.|
|[Update androidDeviceComplianceLocalActionLockDeviceWithPasscode](../api/intune-androiddevicecompliancelocalactionlockdevicewithpasscode-update.md)|[androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md)|Update the properties of an [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.|
|[Delete androidDeviceComplianceLocalActionLockDeviceWithPasscode](../api/intune-androiddevicecompliancelocalactionlockdevicewithpasscode-delete.md)|None|Deletes an [androidDeviceComplianceLocalActionLockDeviceWithPasscode](../resources/intune-androiddevicecompliancelocalactionlockdevicewithpasscode.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|gracePeriodInMinutes|Int32|**TODO: Add Description** Inherited from [androidDeviceComplianceLocalActionBase](../resources/intune-androiddevicecompliancelocalactionbase.md)|
|passcode|String|**TODO: Add Description**|
|passcodeSignInFailureCountBeforeWipe|Int32|**TODO: Add Description**|

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
  "gracePeriodInMinutes": "Integer",
  "passcode": "String",
  "passcodeSignInFailureCountBeforeWipe": "Integer"
}
```

