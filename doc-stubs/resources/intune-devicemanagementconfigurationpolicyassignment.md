---
title: "deviceManagementConfigurationPolicyAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationPolicyAssignment resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationPolicyAssignments](../api/intune-devicemanagementconfigurationpolicyassignment-list.md)|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) collection|Get a list of the [deviceManagementConfigurationPolicyAssignment](../resources/devicemanagementconfigurationpolicyassignment.md) objects and their properties.|
|[Create deviceManagementConfigurationPolicyAssignment](../api/intune-devicemanagementconfigurationpolicyassignment-create.md)|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md)|Create a new [deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) object.|
|[Get deviceManagementConfigurationPolicyAssignment](../api/intune-devicemanagementconfigurationpolicyassignment-get.md)|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md)|Read the properties and relationships of a [deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) object.|
|[Update deviceManagementConfigurationPolicyAssignment](../api/intune-devicemanagementconfigurationpolicyassignment-update.md)|[deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md)|Update the properties of a [deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) object.|
|[Delete deviceManagementConfigurationPolicyAssignment](../api/intune-devicemanagementconfigurationpolicyassignment-delete.md)|None|Deletes a [deviceManagementConfigurationPolicyAssignment](../resources/intune-devicemanagementconfigurationpolicyassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|source|deviceAndAppManagementAssignmentSource|**TODO: Add Description**. Possible values are: `direct`, `policySets`.|
|sourceId|String|**TODO: Add Description**|
|target|[deviceAndAppManagementAssignmentTarget](../resources/intune-deviceandappmanagementassignmenttarget.md)|**TODO: Add Description**|

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
  },
  "source": "String",
  "sourceId": "String"
}
```

