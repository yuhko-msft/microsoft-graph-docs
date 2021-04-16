---
title: "configManagerPolicySummary resource type"
description: "A ConfigManager policy summary."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# configManagerPolicySummary resource type

Namespace: microsoft.graph



A ConfigManager policy summary.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|compliantDeviceCount|Int32|The number of devices evaluated to be compliant by the policy.|
|enforcedDeviceCount|Int32|The number of devices that have have been remediated by the policy.|
|failedDeviceCount|Int32|The number of devices that failed to be evaluated by the policy.|
|nonCompliantDeviceCount|Int32|The number of devices evaluated to be noncompliant by the policy.|
|pendingDeviceCount|Int32|The number of devices that have acknowledged the policy but are pending evaluation.|
|targetedDeviceCount|Int32|The number of devices targeted by the policy.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.configManagerPolicySummary"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.configManagerPolicySummary",
  "compliantDeviceCount": "Integer",
  "enforcedDeviceCount": "Integer",
  "failedDeviceCount": "Integer",
  "nonCompliantDeviceCount": "Integer",
  "pendingDeviceCount": "Integer",
  "targetedDeviceCount": "Integer"
}
```

