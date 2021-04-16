---
title: "deviceConfigurationGroupAssignment resource type"
description: "Device configuration group assignment."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceConfigurationGroupAssignment resource type

Namespace: microsoft.graph



Device configuration group assignment.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceConfigurationGroupAssignments](../api/deviceconfigurationgroupassignment-list.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get a list of the [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) objects and their properties.|
|[Create deviceConfigurationGroupAssignment](../api/deviceconfigurationgroupassignment-create.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) object.|
|[Get deviceConfigurationGroupAssignment](../api/deviceconfigurationgroupassignment-get.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Read the properties and relationships of a [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) object.|
|[Update deviceConfigurationGroupAssignment](../api/deviceconfigurationgroupassignment-update.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Update the properties of a [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) object.|
|[Delete deviceConfigurationGroupAssignment](../api/deviceconfigurationgroupassignment-delete.md)|None|Deletes a [deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) object.|
|[List deviceConfiguration](../api/deviceconfigurationgroupassignment-list-deviceconfiguration.md)|[deviceConfiguration](../resources/deviceconfiguration.md) collection|Get the deviceConfiguration resources from the deviceConfiguration navigation property.|
|[Add deviceConfiguration](../api/deviceconfigurationgroupassignment-post-deviceconfiguration.md)|[deviceConfiguration](../resources/deviceconfiguration.md)|Add deviceConfiguration by posting to the deviceConfiguration collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|excludeGroup|Boolean|Indicates if this group is should be excluded. Defaults that the group should be included|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetGroupId|String|The Id of the AAD group we are targeting the device configuration to.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deviceConfiguration|[deviceConfiguration](../resources/deviceconfiguration.md)|The navigation link to the Device Configuration being targeted.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceConfigurationGroupAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceConfigurationGroupAssignment",
  "id": "String (identifier)",
  "excludeGroup": "Boolean",
  "targetGroupId": "String"
}
```

