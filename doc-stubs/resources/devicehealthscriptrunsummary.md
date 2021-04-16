---
title: "deviceHealthScriptRunSummary resource type"
description: "Contains properties for the run summary of a device management script."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceHealthScriptRunSummary resource type

Namespace: microsoft.graph



Contains properties for the run summary of a device management script.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceHealthScriptRunSummaries](../api/devicehealthscriptrunsummary-list.md)|[deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) collection|Get a list of the [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) objects and their properties.|
|[Create deviceHealthScriptRunSummary](../api/devicehealthscriptrunsummary-create.md)|[deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md)|Create a new [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) object.|
|[Get deviceHealthScriptRunSummary](../api/devicehealthscriptrunsummary-get.md)|[deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md)|Read the properties and relationships of a [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) object.|
|[Update deviceHealthScriptRunSummary](../api/devicehealthscriptrunsummary-update.md)|[deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md)|Update the properties of a [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) object.|
|[Delete deviceHealthScriptRunSummary](../api/devicehealthscriptrunsummary-delete.md)|None|Deletes a [deviceHealthScriptRunSummary](../resources/devicehealthscriptrunsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|detectionScriptErrorDeviceCount|Int32|Number of devices on which the detection script execution encountered an error and did not complete|
|detectionScriptPendingDeviceCount|Int32|Number of devices which have not yet run the latest version of the device health script|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|issueDetectedDeviceCount|Int32|Number of devices for which the detection script found an issue|
|issueRemediatedCumulativeDeviceCount|Int32|Number of devices that were remediated over the last 30 days|
|issueRemediatedDeviceCount|Int32|Number of devices for which the remediation script was able to resolve the detected issue|
|issueReoccurredDeviceCount|Int32|Number of devices for which the remediation script executed successfully but failed to resolve the detected issue|
|lastScriptRunDateTime|DateTimeOffset|Last run time for the script across all devices|
|noIssueDetectedDeviceCount|Int32|Number of devices for which the detection script did not find an issue and the device is healthy|
|remediationScriptErrorDeviceCount|Int32|Number of devices for which the remediation script execution encountered an error and did not complete|
|remediationSkippedDeviceCount|Int32|Number of devices for which remediation was skipped|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceHealthScriptRunSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceHealthScriptRunSummary",
  "id": "String (identifier)",
  "detectionScriptErrorDeviceCount": "Integer",
  "detectionScriptPendingDeviceCount": "Integer",
  "issueDetectedDeviceCount": "Integer",
  "issueRemediatedCumulativeDeviceCount": "Integer",
  "issueRemediatedDeviceCount": "Integer",
  "issueReoccurredDeviceCount": "Integer",
  "lastScriptRunDateTime": "String (timestamp)",
  "noIssueDetectedDeviceCount": "Integer",
  "remediationScriptErrorDeviceCount": "Integer",
  "remediationSkippedDeviceCount": "Integer"
}
```

