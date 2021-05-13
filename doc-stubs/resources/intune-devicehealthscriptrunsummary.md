---
title: "deviceHealthScriptRunSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceHealthScriptRunSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceHealthScriptRunSummaries](../api/intune-devicehealthscriptrunsummary-list.md)|[deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md) collection|Get a list of the [deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md) objects and their properties.|
|[Create deviceHealthScriptRunSummary](../api/intune-devicehealthscriptrunsummary-create.md)|[deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md)|Create a new [deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md) object.|
|[Get deviceHealthScriptRunSummary](../api/intune-devicehealthscriptrunsummary-get.md)|[deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md)|Read the properties and relationships of a [deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md) object.|
|[Update deviceHealthScriptRunSummary](../api/intune-devicehealthscriptrunsummary-update.md)|[deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md)|Update the properties of a [deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md) object.|
|[Delete deviceHealthScriptRunSummary](../api/intune-devicehealthscriptrunsummary-delete.md)|None|Deletes a [deviceHealthScriptRunSummary](../resources/intune-devicehealthscriptrunsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|detectionScriptErrorDeviceCount|Int32|**TODO: Add Description**|
|detectionScriptNotApplicableDeviceCount|Int32|**TODO: Add Description**|
|detectionScriptPendingDeviceCount|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|issueDetectedDeviceCount|Int32|**TODO: Add Description**|
|issueRemediatedCumulativeDeviceCount|Int32|**TODO: Add Description**|
|issueRemediatedDeviceCount|Int32|**TODO: Add Description**|
|issueReoccurredDeviceCount|Int32|**TODO: Add Description**|
|lastScriptRunDateTime|DateTimeOffset|**TODO: Add Description**|
|noIssueDetectedDeviceCount|Int32|**TODO: Add Description**|
|remediationScriptErrorDeviceCount|Int32|**TODO: Add Description**|
|remediationSkippedDeviceCount|Int32|**TODO: Add Description**|

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
  "noIssueDetectedDeviceCount": "Integer",
  "issueDetectedDeviceCount": "Integer",
  "detectionScriptErrorDeviceCount": "Integer",
  "detectionScriptPendingDeviceCount": "Integer",
  "detectionScriptNotApplicableDeviceCount": "Integer",
  "issueRemediatedDeviceCount": "Integer",
  "remediationSkippedDeviceCount": "Integer",
  "issueReoccurredDeviceCount": "Integer",
  "remediationScriptErrorDeviceCount": "Integer",
  "lastScriptRunDateTime": "String (timestamp)",
  "issueRemediatedCumulativeDeviceCount": "Integer"
}
```

