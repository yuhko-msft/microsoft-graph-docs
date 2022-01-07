---
title: "cloudPcBulkRemoteActionResult resource type"
description: "Represents cloud PC bulk remote action result."
author: "rongting"
ms.localizationpriority: medium
ms.prod: "cloud-pc"
doc_type: resourcePageType
---

# cloudPcBulkRemoteActionResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents cloud PC bulk remote action result.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|failedDeviceIds|String collection|A list of all the managedDevice DeviceID's that completed the bulk action successfully.|
|notFoundDeviceIds|String collection|A list of all the managedDevice DeviceID's that completed the bulk action with a failure.|
|notSupportedDeviceIds|String collection|A list of all the managedDevice DeviceID's that were not found when the bulk action was attempted.|
|successfulDeviceIds|String collection|A list of all the managedDevice DeviceID's that were identified as unsupported for the bulk action.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.cloudPcBulkRemoteActionResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cloudPcBulkRemoteActionResult",
  "successfulDeviceIds": [
    "String"
  ],
  "failedDeviceIds": [
    "String"
  ],
  "notFoundDeviceIds": [
    "String"
  ],
  "notSupportedDeviceIds": [
    "String"
  ]
}
```

