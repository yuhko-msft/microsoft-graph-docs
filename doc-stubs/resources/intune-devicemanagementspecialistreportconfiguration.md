---
title: "deviceManagementSpecialistReportConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSpecialistReportConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementSpecialistReportConfigurations](../api/intune-devicemanagementspecialistreportconfiguration-list.md)|[deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md) collection|Get a list of the [deviceManagementSpecialistReportConfiguration](../resources/devicemanagementspecialistreportconfiguration.md) objects and their properties.|
|[Create deviceManagementSpecialistReportConfiguration](../api/intune-devicemanagementspecialistreportconfiguration-create.md)|[deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md)|Create a new [deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md) object.|
|[Get deviceManagementSpecialistReportConfiguration](../api/intune-devicemanagementspecialistreportconfiguration-get.md)|[deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md)|Read the properties and relationships of a [deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md) object.|
|[Update deviceManagementSpecialistReportConfiguration](../api/intune-devicemanagementspecialistreportconfiguration-update.md)|[deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md)|Update the properties of a [deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md) object.|
|[Delete deviceManagementSpecialistReportConfiguration](../api/intune-devicemanagementspecialistreportconfiguration-delete.md)|None|Deletes a [deviceManagementSpecialistReportConfiguration](../resources/intune-devicemanagementspecialistreportconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|locales|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementSpecialistReportConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSpecialistReportConfiguration",
  "id": "String (identifier)",
  "locales": [
    "String"
  ]
}
```

