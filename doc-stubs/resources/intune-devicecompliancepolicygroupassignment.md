---
title: "deviceCompliancePolicyGroupAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCompliancePolicyGroupAssignment resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCompliancePolicyGroupAssignments](../api/intune-devicecompliancepolicygroupassignment-list.md)|[deviceCompliancePolicyGroupAssignment](../resources/intune-devicecompliancepolicygroupassignment.md) collection|Get a list of the [deviceCompliancePolicyGroupAssignment](../resources/devicecompliancepolicygroupassignment.md) objects and their properties.|
|[Create deviceCompliancePolicyGroupAssignment](../api/intune-devicecompliancepolicygroupassignment-create.md)|[deviceCompliancePolicyGroupAssignment](../resources/intune-devicecompliancepolicygroupassignment.md)|Create a new [deviceCompliancePolicyGroupAssignment](../resources/intune-devicecompliancepolicygroupassignment.md) object.|
|[Get deviceCompliancePolicyGroupAssignment](../api/intune-devicecompliancepolicygroupassignment-get.md)|[deviceCompliancePolicyGroupAssignment](../resources/intune-devicecompliancepolicygroupassignment.md)|Read the properties and relationships of a [deviceCompliancePolicyGroupAssignment](../resources/intune-devicecompliancepolicygroupassignment.md) object.|
|[Update deviceCompliancePolicyGroupAssignment](../api/intune-devicecompliancepolicygroupassignment-update.md)|[deviceCompliancePolicyGroupAssignment](../resources/intune-devicecompliancepolicygroupassignment.md)|Update the properties of a [deviceCompliancePolicyGroupAssignment](../resources/intune-devicecompliancepolicygroupassignment.md) object.|
|[Delete deviceCompliancePolicyGroupAssignment](../api/intune-devicecompliancepolicygroupassignment-delete.md)|None|Deletes a [deviceCompliancePolicyGroupAssignment](../resources/intune-devicecompliancepolicygroupassignment.md) object.|
|[List deviceCompliancePolicy](../api/intune-devicecompliancepolicygroupassignment-list-devicecompliancepolicy.md)|[deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md) collection|Get the deviceCompliancePolicy resources from the deviceCompliancePolicy navigation property.|
|[Add deviceCompliancePolicy](../api/intune-devicecompliancepolicygroupassignment-post-devicecompliancepolicy.md)|[deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|Add deviceCompliancePolicy by posting to the deviceCompliancePolicy collection.|
|[Remove deviceCompliancePolicy](../api/intune-devicecompliancepolicygroupassignment-delete-devicecompliancepolicy.md)|None|Remove a [deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|excludeGroup|Boolean|**TODO: Add Description**|
|targetGroupId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deviceCompliancePolicy|[deviceCompliancePolicy](../resources/intune-devicecompliancepolicy.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceCompliancePolicyGroupAssignment",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceCompliancePolicyGroupAssignment",
  "targetGroupId": "String",
  "excludeGroup": "Boolean"
}
```

