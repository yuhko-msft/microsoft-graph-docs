---
title: "deviceConfigurationAssignment resource type"
description: "The device configuration assignment entity assigns an AAD group to a specific device configuration."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceConfigurationAssignment resource type

Namespace: microsoft.graph



The device configuration assignment entity assigns an AAD group to a specific device configuration.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceConfigurationAssignments](../api/deviceconfigurationassignment-list.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get a list of the [deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) objects and their properties.|
|[Create deviceConfigurationAssignment](../api/deviceconfigurationassignment-create.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new [deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) object.|
|[Get deviceConfigurationAssignment](../api/deviceconfigurationassignment-get.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Read the properties and relationships of a [deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) object.|
|[Update deviceConfigurationAssignment](../api/deviceconfigurationassignment-update.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Update the properties of a [deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) object.|
|[Delete deviceConfigurationAssignment](../api/deviceconfigurationassignment-delete.md)|None|Deletes a [deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|source|deviceAndAppManagementAssignmentSource|The assignment source for the device configuration, direct or parcel/policySet. This property is read-only. Possible values are: `direct`, `policySets`.|
|sourceId|String|The identifier of the source of the assignment. This property is read-only.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for the device configuration.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceConfigurationAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceConfigurationAssignment",
  "id": "String (identifier)",
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

