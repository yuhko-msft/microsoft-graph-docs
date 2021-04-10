---
title: "windowsAutopilotDeviceIdentity resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsAutopilotDeviceIdentity resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsAutopilotDeviceIdentities](../api/intune-windowsautopilotdeviceidentity-list.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) collection|Get a list of the [windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) objects and their properties.|
|[Create windowsAutopilotDeviceIdentity](../api/intune-windowsautopilotdeviceidentity-create.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Create a new [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[Get windowsAutopilotDeviceIdentity](../api/intune-windowsautopilotdeviceidentity-get.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Read the properties and relationships of a [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[Update windowsAutopilotDeviceIdentity](../api/intune-windowsautopilotdeviceidentity-update.md)|[windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md)|Update the properties of a [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[Delete windowsAutopilotDeviceIdentity](../api/intune-windowsautopilotdeviceidentity-delete.md)|None|Deletes a [windowsAutopilotDeviceIdentity](../resources/intune-windowsautopilotdeviceidentity.md) object.|
|[assignUserToDevice](../api/intune-windowsautopilotdeviceidentity-assignusertodevice.md)|None|**TODO: Add Description**|
|[unassignUserFromDevice](../api/intune-windowsautopilotdeviceidentity-unassignuserfromdevice.md)|None|**TODO: Add Description**|
|[updateDeviceProperties](../api/intune-windowsautopilotdeviceidentity-updatedeviceproperties.md)|None|**TODO: Add Description**|
|[deleteDevices](../api/intune-windowsautopilotdeviceidentity-deletedevices.md)|[deletedWindowsAutopilotDeviceState](../resources/intune-deletedwindowsautopilotdevicestate.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|addressableUserName|String|**TODO: Add Description**|
|azureActiveDirectoryDeviceId|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|enrollmentState|enrollmentState|**TODO: Add Description**. Possible values are: `unknown`, `enrolled`, `pendingReset`, `failed`, `notContacted`.|
|groupTag|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastContactedDateTime|DateTimeOffset|**TODO: Add Description**|
|managedDeviceId|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|productKey|String|**TODO: Add Description**|
|purchaseOrderIdentifier|String|**TODO: Add Description**|
|resourceName|String|**TODO: Add Description**|
|serialNumber|String|**TODO: Add Description**|
|skuNumber|String|**TODO: Add Description**|
|systemFamily|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsAutopilotDeviceIdentity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsAutopilotDeviceIdentity",
  "id": "String (identifier)",
  "groupTag": "String",
  "purchaseOrderIdentifier": "String",
  "serialNumber": "String",
  "productKey": "String",
  "manufacturer": "String",
  "model": "String",
  "enrollmentState": "String",
  "lastContactedDateTime": "String (timestamp)",
  "addressableUserName": "String",
  "userPrincipalName": "String",
  "resourceName": "String",
  "skuNumber": "String",
  "systemFamily": "String",
  "azureActiveDirectoryDeviceId": "String",
  "managedDeviceId": "String",
  "displayName": "String"
}
```

