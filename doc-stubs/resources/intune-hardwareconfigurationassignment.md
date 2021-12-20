---
title: "hardwareConfigurationAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# hardwareConfigurationAssignment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List hardwareConfigurationAssignments](../api/intune-hardwareconfigurationassignment-list.md)|[hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) collection|Get a list of the [hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) objects and their properties.|
|[Create hardwareConfigurationAssignment](../api/hardwareconfiguration-post-assignments.md)|[hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md)|Create a new [hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) object.|
|[Get hardwareConfigurationAssignment](../api/intune-hardwareconfigurationassignment-get.md)|[hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md)|Read the properties and relationships of a [hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) object.|
|[Update hardwareConfigurationAssignment](../api/intune-hardwareconfigurationassignment-update.md)|[hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md)|Update the properties of a [hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) object.|
|[Delete hardwareConfigurationAssignment](../api/intune-hardwareconfigurationassignment-delete.md)|None|Deletes a [hardwareConfigurationAssignment](../resources/intune-hardwareconfigurationassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|target|[deviceAndAppManagementAssignmentTarget](../resources/intune-deviceandappmanagementassignmenttarget.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.hardwareConfigurationAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.hardwareConfigurationAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

