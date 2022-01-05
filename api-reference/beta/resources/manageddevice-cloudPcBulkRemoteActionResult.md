---
title: "cloudPcBulkRemoteActionResult resource type"
description: "Represents cloud PC bulk remote action result."
author: "rongting"
ms.localizationpriority: medium
ms.prod: "cloud-pc"
doc_type: resourcePageType
---

# cloudPcDevice resource type

Namespace: microsoft.graph.managedDevice

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents cloud PC bulk remote action result.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Bulk restore cloudPC](../api/manageddevice-bulkrestorecloudpc.md)|[microsoft.graph.managedDevice.cloudPcBulkRemoteActionResult](../resources/manageddevice-cloudPcBulkRemoteActionResult.md)|Read the properties and relationships of a [cloudPcBulkRemoteActionResult](../resources/manageddevice-cloudPcBulkRemoteActionResult.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|successfulDeviceIds|Collection(String)|A list of all the managedDevice DeviceID's that completed the bulk action successfully.|
|failedDeviceIds|Collection(String)|A list of all the managedDevice DeviceID's that completed the bulk action with a failure.|
|notFoundDeviceIds|Collection(String)|A list of all the managedDevice DeviceID's that were not found when the bulk action was attempted.|
|notSupportedDeviceIds|Collection(String)|A list of all the managedDevice DeviceID's that were identified as unsupported for the bulk action.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedDevice.cloudPcBulkRemoteActionResult",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDevice.cloudPcBulkRemoteActionResult",
  "successfulDeviceIds": "Collection(String)",
  "failedDeviceIds": "Collection(String)",
  "notFoundDeviceIds": "Collection(String)",
  "notSupportedDeviceIds": "Collection(String)"
}
```
