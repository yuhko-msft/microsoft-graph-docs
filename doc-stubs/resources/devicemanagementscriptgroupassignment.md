---
title: "deviceManagementScriptGroupAssignment resource type"
description: "Contains properties used to assign a device management script to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementScriptGroupAssignment resource type

Namespace: microsoft.graph



Contains properties used to assign a device management script to a group.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementScriptGroupAssignments](../api/devicemanagementscriptgroupassignment-list.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) collection|Get a list of the [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) objects and their properties.|
|[Create deviceManagementScriptGroupAssignment](../api/devicemanagementscriptgroupassignment-create.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md)|Create a new [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object.|
|[Get deviceManagementScriptGroupAssignment](../api/devicemanagementscriptgroupassignment-get.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md)|Read the properties and relationships of a [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object.|
|[Update deviceManagementScriptGroupAssignment](../api/devicemanagementscriptgroupassignment-update.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md)|Update the properties of a [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object.|
|[Delete deviceManagementScriptGroupAssignment](../api/devicemanagementscriptgroupassignment-delete.md)|None|Deletes a [deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetGroupId|String|The Id of the Azure Active Directory group we are targeting the script to.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementScriptGroupAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementScriptGroupAssignment",
  "id": "String (identifier)",
  "targetGroupId": "String"
}
```

