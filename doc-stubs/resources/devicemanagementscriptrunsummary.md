---
title: "deviceManagementScriptRunSummary resource type"
description: "Contains properties for the run summary of a device management script."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementScriptRunSummary resource type

Namespace: microsoft.graph



Contains properties for the run summary of a device management script.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementScriptRunSummaries](../api/devicemanagementscriptrunsummary-list.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) collection|Get a list of the [deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) objects and their properties.|
|[Create deviceManagementScriptRunSummary](../api/devicemanagementscriptrunsummary-create.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md)|Create a new [deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) object.|
|[Get deviceManagementScriptRunSummary](../api/devicemanagementscriptrunsummary-get.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md)|Read the properties and relationships of a [deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) object.|
|[Update deviceManagementScriptRunSummary](../api/devicemanagementscriptrunsummary-update.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md)|Update the properties of a [deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) object.|
|[Delete deviceManagementScriptRunSummary](../api/devicemanagementscriptrunsummary-delete.md)|None|Deletes a [deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|errorDeviceCount|Int32|Error device count.|
|errorUserCount|Int32|Error user count.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|successDeviceCount|Int32|Success device count.|
|successUserCount|Int32|Success user count.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementScriptRunSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementScriptRunSummary",
  "id": "String (identifier)",
  "errorDeviceCount": "Integer",
  "errorUserCount": "Integer",
  "successDeviceCount": "Integer",
  "successUserCount": "Integer"
}
```

