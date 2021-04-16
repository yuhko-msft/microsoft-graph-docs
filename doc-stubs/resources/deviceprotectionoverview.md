---
title: "deviceProtectionOverview resource type"
description: "Hardware information of a given device."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceProtectionOverview resource type

Namespace: microsoft.graph



Hardware information of a given device.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|cleanDeviceCount|Int32|Clean device count.|
|criticalFailuresDeviceCount|Int32|Critical failures device count.|
|inactiveThreatAgentDeviceCount|Int32|Device with inactive threat agent count|
|pendingFullScanDeviceCount|Int32|Pending full scan device count.|
|pendingManualStepsDeviceCount|Int32|Pending manual steps device count.|
|pendingOfflineScanDeviceCount|Int32|Pending offline scan device count.|
|pendingQuickScanDeviceCount|Int32|Pending quick scan device count. Valid values -2147483648 to 2147483647|
|pendingRestartDeviceCount|Int32|Pending restart device count.|
|pendingSignatureUpdateDeviceCount|Int32|Device with old signature count.|
|totalReportedDeviceCount|Int32|Total device count.|
|unknownStateThreatAgentDeviceCount|Int32|Device with threat agent state as unknown count.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceProtectionOverview"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceProtectionOverview",
  "cleanDeviceCount": "Integer",
  "criticalFailuresDeviceCount": "Integer",
  "inactiveThreatAgentDeviceCount": "Integer",
  "pendingFullScanDeviceCount": "Integer",
  "pendingManualStepsDeviceCount": "Integer",
  "pendingOfflineScanDeviceCount": "Integer",
  "pendingQuickScanDeviceCount": "Integer",
  "pendingRestartDeviceCount": "Integer",
  "pendingSignatureUpdateDeviceCount": "Integer",
  "totalReportedDeviceCount": "Integer",
  "unknownStateThreatAgentDeviceCount": "Integer"
}
```

