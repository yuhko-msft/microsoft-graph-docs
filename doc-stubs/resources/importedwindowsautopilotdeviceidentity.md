---
title: "importedWindowsAutopilotDeviceIdentity resource type"
description: "Imported windows autopilot devices."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# importedWindowsAutopilotDeviceIdentity resource type

Namespace: microsoft.graph



Imported windows autopilot devices.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List importedWindowsAutopilotDeviceIdentities](../api/importedwindowsautopilotdeviceidentity-list.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) collection|Get a list of the [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) objects and their properties.|
|[Create importedWindowsAutopilotDeviceIdentity](../api/importedwindowsautopilotdeviceidentity-create.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md)|Create a new [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) object.|
|[Get importedWindowsAutopilotDeviceIdentity](../api/importedwindowsautopilotdeviceidentity-get.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md)|Read the properties and relationships of an [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) object.|
|[Update importedWindowsAutopilotDeviceIdentity](../api/importedwindowsautopilotdeviceidentity-update.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md)|Update the properties of an [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) object.|
|[Delete importedWindowsAutopilotDeviceIdentity](../api/importedwindowsautopilotdeviceidentity-delete.md)|None|Deletes an [importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) object.|
|[import](../api/importedwindowsautopilotdeviceidentity-import.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignedUserPrincipalName|String|UPN of the user the device will be assigned|
|groupTag|String|Group Tag of the Windows autopilot device.|
|hardwareIdentifier|Binary|Hardware Blob of the Windows autopilot device.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|importId|String|The Import Id of the Windows autopilot device.|
|productKey|String|Product Key of the Windows autopilot device.|
|serialNumber|String|Serial number of the Windows autopilot device.|
|state|[importedWindowsAutopilotDeviceIdentityState](../resources/importedwindowsautopilotdeviceidentitystate.md)|Current state of the imported device.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.importedWindowsAutopilotDeviceIdentity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.importedWindowsAutopilotDeviceIdentity",
  "id": "String (identifier)",
  "assignedUserPrincipalName": "String",
  "groupTag": "String",
  "hardwareIdentifier": "Binary",
  "importId": "String",
  "productKey": "String",
  "serialNumber": "String",
  "state": {
    "@odata.type": "microsoft.graph.importedWindowsAutopilotDeviceIdentityState"
  }
}
```

