---
title: "deviceManagementConfigurationPolicyAssignment resource type"
description: "The DeviceManagementConfigurationPolicyAssignment entity assigns a specific DeviceManagementConfigurationPolicy to an AAD group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationPolicyAssignment resource type

Namespace: microsoft.graph



The DeviceManagementConfigurationPolicyAssignment entity assigns a specific DeviceManagementConfigurationPolicy to an AAD group.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationPolicyAssignments](../api/devicemanagementconfigurationpolicyassignment-list.md)|[deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) collection|Get a list of the [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) objects and their properties.|
|[Create deviceManagementConfigurationPolicyAssignment](../api/devicemanagementconfigurationpolicyassignment-create.md)|[deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md)|Create a new [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) object.|
|[Get deviceManagementConfigurationPolicyAssignment](../api/devicemanagementconfigurationpolicyassignment-get.md)|[deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md)|Read the properties and relationships of a [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) object.|
|[Update deviceManagementConfigurationPolicyAssignment](../api/devicemanagementconfigurationpolicyassignment-update.md)|[deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md)|Update the properties of a [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) object.|
|[Delete deviceManagementConfigurationPolicyAssignment](../api/devicemanagementconfigurationpolicyassignment-delete.md)|None|Deletes a [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for the DeviceManagementConfigurationPolicy.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicyAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

