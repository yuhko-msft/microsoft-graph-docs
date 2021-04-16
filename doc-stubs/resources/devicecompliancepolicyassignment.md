---
title: "deviceCompliancePolicyAssignment resource type"
description: "Device compliance policy assignment."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCompliancePolicyAssignment resource type

Namespace: microsoft.graph



Device compliance policy assignment.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCompliancePolicyAssignments](../api/devicecompliancepolicyassignment-list.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) collection|Get a list of the [deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) objects and their properties.|
|[Create deviceCompliancePolicyAssignment](../api/devicecompliancepolicyassignment-create.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md)|Create a new [deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) object.|
|[Get deviceCompliancePolicyAssignment](../api/devicecompliancepolicyassignment-get.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md)|Read the properties and relationships of a [deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) object.|
|[Update deviceCompliancePolicyAssignment](../api/devicecompliancepolicyassignment-update.md)|[deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md)|Update the properties of a [deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) object.|
|[Delete deviceCompliancePolicyAssignment](../api/devicecompliancepolicyassignment-delete.md)|None|Deletes a [deviceCompliancePolicyAssignment](../resources/devicecompliancepolicyassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|source|deviceAndAppManagementAssignmentSource|The assignment source for the device compliance policy, direct or parcel/policySet. Possible values are: `direct`, `policySets`.|
|sourceId|String|The identifier of the source of the assignment.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|Target for the compliance policy assignment.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceCompliancePolicyAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyAssignment",
  "id": "String (identifier)",
  "source": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

