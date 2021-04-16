---
title: "deviceCompliancePolicyGroupAssignment resource type"
description: "Device compliance policy group assignment."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCompliancePolicyGroupAssignment resource type

Namespace: microsoft.graph



Device compliance policy group assignment.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCompliancePolicyGroupAssignments](../api/devicecompliancepolicygroupassignment-list.md)|[deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) collection|Get a list of the [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) objects and their properties.|
|[Create deviceCompliancePolicyGroupAssignment](../api/devicecompliancepolicygroupassignment-create.md)|[deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md)|Create a new [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) object.|
|[Get deviceCompliancePolicyGroupAssignment](../api/devicecompliancepolicygroupassignment-get.md)|[deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md)|Read the properties and relationships of a [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) object.|
|[Update deviceCompliancePolicyGroupAssignment](../api/devicecompliancepolicygroupassignment-update.md)|[deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md)|Update the properties of a [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) object.|
|[Delete deviceCompliancePolicyGroupAssignment](../api/devicecompliancepolicygroupassignment-delete.md)|None|Deletes a [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) object.|
|[List deviceCompliancePolicy](../api/devicecompliancepolicygroupassignment-list-devicecompliancepolicy.md)|[deviceCompliancePolicy](../resources/devicecompliancepolicy.md) collection|Get the deviceCompliancePolicy resources from the deviceCompliancePolicy navigation property.|
|[Add deviceCompliancePolicy](../api/devicecompliancepolicygroupassignment-post-devicecompliancepolicy.md)|[deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|Add deviceCompliancePolicy by posting to the deviceCompliancePolicy collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|excludeGroup|Boolean|Indicates if this group is should be excluded. Defaults that the group should be included|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetGroupId|String|The Id of the AAD group we are targeting the device compliance policy to.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deviceCompliancePolicy|[deviceCompliancePolicy](../resources/devicecompliancepolicy.md)|The navigation link to the  device compliance polic targeted.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceCompliancePolicyGroupAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyGroupAssignment",
  "id": "String (identifier)",
  "excludeGroup": "Boolean",
  "targetGroupId": "String"
}
```

