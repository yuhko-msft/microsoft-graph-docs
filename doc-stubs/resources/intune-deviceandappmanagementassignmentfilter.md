---
title: "deviceAndAppManagementAssignmentFilter resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAndAppManagementAssignmentFilter resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceAndAppManagementAssignmentFilters](../api/intune-deviceandappmanagementassignmentfilter-list.md)|[deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md) collection|Get a list of the [deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) objects and their properties.|
|[Create deviceAndAppManagementAssignmentFilter](../api/intune-deviceandappmanagementassignmentfilter-create.md)|[deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md)|Create a new [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md) object.|
|[Get deviceAndAppManagementAssignmentFilter](../api/intune-deviceandappmanagementassignmentfilter-get.md)|[deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md)|Read the properties and relationships of a [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md) object.|
|[Update deviceAndAppManagementAssignmentFilter](../api/intune-deviceandappmanagementassignmentfilter-update.md)|[deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md)|Update the properties of a [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md) object.|
|[Delete deviceAndAppManagementAssignmentFilter](../api/intune-deviceandappmanagementassignmentfilter-delete.md)|None|Deletes a [deviceAndAppManagementAssignmentFilter](../resources/intune-deviceandappmanagementassignmentfilter.md) object.|
|[enable](../api/intune-deviceandappmanagementassignmentfilter-enable.md)|None|**TODO: Add Description**|
|[getState](../api/intune-deviceandappmanagementassignmentfilter-getstate.md)|[assignmentFilterState](../resources/intune-assignmentfilterstate.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|platform|devicePlatformType|**TODO: Add Description**. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|roleScopeTags|String collection|**TODO: Add Description**|
|rule|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentFilter",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementAssignmentFilter",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "description": "String",
  "platform": "String",
  "rule": "String",
  "roleScopeTags": [
    "String"
  ]
}
```

