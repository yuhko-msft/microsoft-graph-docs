---
title: "hardwareConfigurationRunSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# hardwareConfigurationRunSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List hardwareConfigurationRunSummaries](../api/intune-hardwareconfigurationrunsummary-list.md)|[hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) collection|Get a list of the [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) objects and their properties.|
|[Create hardwareConfigurationRunSummary](../api/hardwareconfiguration-post-runsummary.md)|[hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md)|Create a new [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object.|
|[Get hardwareConfigurationRunSummary](../api/intune-hardwareconfigurationrunsummary-get.md)|[hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md)|Read the properties and relationships of a [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object.|
|[Update hardwareConfigurationRunSummary](../api/intune-hardwareconfigurationrunsummary-update.md)|[hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md)|Update the properties of a [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object.|
|[Delete hardwareConfigurationRunSummary](../api/intune-hardwareconfigurationrunsummary-delete.md)|None|Deletes a [hardwareConfigurationRunSummary](../resources/intune-hardwareconfigurationrunsummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|errorDeviceCount|Int32|**TODO: Add Description**|
|errorUserCount|Int32|**TODO: Add Description**|
|failedDeviceCount|Int32|**TODO: Add Description**|
|failedUserCount|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastRunDateTime|DateTimeOffset|**TODO: Add Description**|
|notApplicableDeviceCount|Int32|**TODO: Add Description**|
|notApplicableUserCount|Int32|**TODO: Add Description**|
|pendingDeviceCount|Int32|**TODO: Add Description**|
|pendingUserCount|Int32|**TODO: Add Description**|
|successfulDeviceCount|Int32|**TODO: Add Description**|
|successfulUserCount|Int32|**TODO: Add Description**|
|unknownDeviceCount|Int32|**TODO: Add Description**|
|unknownUserCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.hardwareConfigurationRunSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.hardwareConfigurationRunSummary",
  "id": "String (identifier)",
  "successfulDeviceCount": "Integer",
  "failedDeviceCount": "Integer",
  "pendingDeviceCount": "Integer",
  "errorDeviceCount": "Integer",
  "notApplicableDeviceCount": "Integer",
  "unknownDeviceCount": "Integer",
  "successfulUserCount": "Integer",
  "failedUserCount": "Integer",
  "pendingUserCount": "Integer",
  "errorUserCount": "Integer",
  "notApplicableUserCount": "Integer",
  "unknownUserCount": "Integer",
  "lastRunDateTime": "String (timestamp)"
}
```

