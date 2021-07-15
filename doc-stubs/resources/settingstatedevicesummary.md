---
title: "settingStateDeviceSummary resource type"
description: "Device Compilance Policy and Configuration for a Setting State summary"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# settingStateDeviceSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Device Compilance Policy and Configuration for a Setting State summary


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List settingStateDeviceSummaries](../api/settingstatedevicesummary-list.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get a list of the [settingStateDeviceSummary](../resources/settingstatedevicesummary.md) objects and their properties.|
|[Create settingStateDeviceSummary](../api/settingstatedevicesummary-create.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new [settingStateDeviceSummary](../resources/settingstatedevicesummary.md) object.|
|[Get settingStateDeviceSummary](../api/settingstatedevicesummary-get.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Read the properties and relationships of a [settingStateDeviceSummary](../resources/settingstatedevicesummary.md) object.|
|[Update settingStateDeviceSummary](../api/settingstatedevicesummary-update.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Update the properties of a [settingStateDeviceSummary](../resources/settingstatedevicesummary.md) object.|
|[Delete settingStateDeviceSummary](../api/settingstatedevicesummary-delete.md)|None|Deletes a [settingStateDeviceSummary](../resources/settingstatedevicesummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|compliantDeviceCount|Int32|Device Compliant count for the setting|
|conflictDeviceCount|Int32|Device conflict error count for the setting|
|errorDeviceCount|Int32|Device error count for the setting|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|instancePath|String|Name of the InstancePath for the setting|
|nonCompliantDeviceCount|Int32|Device NonCompliant count for the setting|
|notApplicableDeviceCount|Int32|Device Not Applicable count for the setting|
|remediatedDeviceCount|Int32|Device Compliant count for the setting|
|settingName|String|Name of the setting|
|unknownDeviceCount|Int32|Device Unkown count for the setting|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.settingStateDeviceSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.settingStateDeviceSummary",
  "id": "String (identifier)",
  "compliantDeviceCount": "Integer",
  "conflictDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "instancePath": "String",
  "nonCompliantDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "remediatedDeviceCount": "Integer",
  "settingName": "String",
  "unknownDeviceCount": "Integer"
}
```

