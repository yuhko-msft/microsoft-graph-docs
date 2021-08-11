---
title: "deviceComplianceScriptRunSummary resource type"
description: "Contains properties for the run summary of a device management script."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceScriptRunSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties for the run summary of a device management script.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceScriptRunSummaries](../api/devicecompliancescriptrunsummary-list.md)|[deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) collection|Get a list of the [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) objects and their properties.|
|[Create deviceComplianceScriptRunSummary](../api/devicecompliancescriptrunsummary-create.md)|[deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md)|Create a new [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) object.|
|[Get deviceComplianceScriptRunSummary](../api/devicecompliancescriptrunsummary-get.md)|[deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md)|Read the properties and relationships of a [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) object.|
|[Update deviceComplianceScriptRunSummary](../api/devicecompliancescriptrunsummary-update.md)|[deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md)|Update the properties of a [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) object.|
|[Delete deviceComplianceScriptRunSummary](../api/devicecompliancescriptrunsummary-delete.md)|None|Deletes a [deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|detectionScriptErrorDeviceCount|Int32|Number of devices on which the detection script execution encountered an error and did not complete. Valid values -2147483648 to 2147483647|
|detectionScriptPendingDeviceCount|Int32|Number of devices which have not yet run the latest version of the device compliance script. Valid values -2147483648 to 2147483647|
|id|String|Key of the device compliance script run summary entity. This property is read-only.|
|issueDetectedDeviceCount|Int32|Number of devices for which the detection script found an issue. Valid values -2147483648 to 2147483647|
|lastScriptRunDateTime|DateTimeOffset|Last run time for the script across all devices|
|noIssueDetectedDeviceCount|Int32|Number of devices for which the detection script did not find an issue and the device is healthy. Valid values -2147483648 to 2147483647|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComplianceScriptRunSummary",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceScriptRunSummary",
  "id": "String (identifier)",
  "noIssueDetectedDeviceCount": "Integer",
  "issueDetectedDeviceCount": "Integer",
  "detectionScriptErrorDeviceCount": "Integer",
  "detectionScriptPendingDeviceCount": "Integer",
  "lastScriptRunDateTime": "String (timestamp)"
}
```

